<!DOCTYPE html>
<!--
    Developer: Alex Borges
    Data: novembro de 2016
    Projeto-proposta de freela
    LINK: https://www.99freelas.com.br/project/buscar-cnpj-30006
    OBJ: ler arquivo em loop, buscar dados json de um site e armazenar em csv
    
-->

<?php
    $fileOfCNPJ = fopen("listaCNPJ.txt", "r") or die("Arquivo origem dos CNPJ falhou em abrir.");
    $errors = "";
    
    while(!feof($fileOfCNPJ)) { //pra cada linha
        $line = fgets($fileOfCNPJ);
        if(strlen($line) == 0){
            continue; //Previne erro em linhas em branco
        }
        
        $CNPJ = substr($line, 0, 14); //Evita caracteres \n
        $URL = "https://www.receitaws.com.br/v1/cnpj/$CNPJ";
    
        $page = file_get_contents($URL); //Obtem os dados do site
        $jsonArray = json_decode($page, true); //reinterpreta o json -> array
        
        if(array_key_exists("message", $jsonArray)){ //Caso houver alguma falha com o CNPJ
            $theError = $jsonArray['message'];
            $errors .= "O CNPJ <a href='$URL'>$CNPJ</a> retornou erro: $theError <br>";
            continue;
        }
        
        $errors .= "CNPJ <a href='$URL'>$CNPJ</a>: OK <br>";
        
        $csvFile = fopen('output.csv', 'a') or die("Falha ao abrir arquivo de saida");
        fputcsv($csvFile, array("Dados do CNPJ $CNPJ"), ";");

        while ($ja = current($jsonArray)) { //pra cada item retornado da busca
            $key = key($jsonArray);

            if($key == "atividade_principal"){ //campo com subarrays
                $textAP[] = "";
                $codeAP[] = "";
                $textAP[] = "text";
                $codeAP[] = "code";
                foreach ($ja as $subja){
                    $textAP[] = $subja["text"];
                    $codeAP[] = $subja["code"];
                }
                fputcsv($csvFile, array("atividade_principal", ""), ";");
                fputcsv($csvFile, $textAP, ";");
                fputcsv($csvFile, $codeAP, ";");
            }
            elseif($key == "atividades_secundarias"){ //campo com subarrays
                $textAS[] = "";
                $codeAS[] = "";
                $textAS[] = "text";
                $codeAS[] = "code";
                foreach ($ja as $subja){
                    $textAS[] = $subja["text"];
                    $codeAS[] = $subja["code"];
                }
                fputcsv($csvFile, array("atividades_secundarias", ""), ";");
                fputcsv($csvFile, $textAS, ";");
                fputcsv($csvFile, $codeAS, ";");
            }
            elseif ($key == "qsa"){ //campo com subarrays
                $qualQSA[] = "";
                $nomeQSA[] = "";
                $qualQSA[] = "qual";
                $nomeQSA[] = "nome";
                foreach ($ja as $subja){
                    $qualQSA[] = $subja["qual"];
                    $nomeQSA[] = $subja["nome"];
                }
                fputcsv($csvFile, array("qsa", ""), ";");
                fputcsv($csvFile, $qualQSA, ";");
                fputcsv($csvFile, $nomeQSA, ";");
            }
            else{
                fputcsv($csvFile, array($key, $ja), ";");
            }
            next($jsonArray); //passa para o prócimo index do array
        }
        fputcsv($csvFile, array(""), ";"); //linha em branco
        fclose($csvFile);
    }
    fclose($fileOfCNPJ);
?>

<html>
    <head>
        <meta charset="UTF-8">
        <title></title>
    </head>
    <body>
        <?php echo $errors; /* Mostra os avisos de cada CNPJ*/ ?>
    </body>
</html>
