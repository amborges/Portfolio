/*
 * An XML document type.
 * Localname: definitions
 * Namespace: http://www.apache.org/internal/xmlbeans/wsdlsubst
 * Java type: org.apache.internal.xmlbeans.wsdlsubst.DefinitionsDocument
 *
 * Automatically generated - do not modify.
 */
package org.apache.internal.xmlbeans.wsdlsubst;


/**
 * A document containing one definitions(@http://www.apache.org/internal/xmlbeans/wsdlsubst) element.
 *
 * This is a complex type.
 */
public interface DefinitionsDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)schema.system.sXMLTOOLS.TypeSystemHolder.typeSystem.resolveHandle("definitionsc7f1doctype");
    
    /**
     * Gets the "definitions" element
     */
    org.apache.internal.xmlbeans.wsdlsubst.DefinitionsDocument.Definitions getDefinitions();
    
    /**
     * Sets the "definitions" element
     */
    void setDefinitions(org.apache.internal.xmlbeans.wsdlsubst.DefinitionsDocument.Definitions definitions);
    
    /**
     * Appends and returns a new empty "definitions" element
     */
    org.apache.internal.xmlbeans.wsdlsubst.DefinitionsDocument.Definitions addNewDefinitions();
    
    /**
     * An XML definitions(@http://www.apache.org/internal/xmlbeans/wsdlsubst).
     *
     * This is a complex type.
     */
    public interface Definitions extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)schema.system.sXMLTOOLS.TypeSystemHolder.typeSystem.resolveHandle("definitions05ddelemtype");
        
        /**
         * Gets array of all "import" elements
         */
        org.apache.internal.xmlbeans.wsdlsubst.TImport[] getImportArray();
        
        /**
         * Gets ith "import" element
         */
        org.apache.internal.xmlbeans.wsdlsubst.TImport getImportArray(int i);
        
        /**
         * Returns number of "import" element
         */
        int sizeOfImportArray();
        
        /**
         * Sets array of all "import" element
         */
        void setImportArray(org.apache.internal.xmlbeans.wsdlsubst.TImport[] ximportArray);
        
        /**
         * Sets ith "import" element
         */
        void setImportArray(int i, org.apache.internal.xmlbeans.wsdlsubst.TImport ximport);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "import" element
         */
        org.apache.internal.xmlbeans.wsdlsubst.TImport insertNewImport(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "import" element
         */
        org.apache.internal.xmlbeans.wsdlsubst.TImport addNewImport();
        
        /**
         * Removes the ith "import" element
         */
        void removeImport(int i);
        
        /**
         * Gets array of all "types" elements
         */
        org.apache.xmlbeans.XmlObject[] getTypesArray();
        
        /**
         * Gets ith "types" element
         */
        org.apache.xmlbeans.XmlObject getTypesArray(int i);
        
        /**
         * Returns number of "types" element
         */
        int sizeOfTypesArray();
        
        /**
         * Sets array of all "types" element
         */
        void setTypesArray(org.apache.xmlbeans.XmlObject[] typesArray);
        
        /**
         * Sets ith "types" element
         */
        void setTypesArray(int i, org.apache.xmlbeans.XmlObject types);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "types" element
         */
        org.apache.xmlbeans.XmlObject insertNewTypes(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "types" element
         */
        org.apache.xmlbeans.XmlObject addNewTypes();
        
        /**
         * Removes the ith "types" element
         */
        void removeTypes(int i);
        
        /**
         * Gets array of all "message" elements
         */
        org.apache.xmlbeans.XmlObject[] getMessageArray();
        
        /**
         * Gets ith "message" element
         */
        org.apache.xmlbeans.XmlObject getMessageArray(int i);
        
        /**
         * Returns number of "message" element
         */
        int sizeOfMessageArray();
        
        /**
         * Sets array of all "message" element
         */
        void setMessageArray(org.apache.xmlbeans.XmlObject[] messageArray);
        
        /**
         * Sets ith "message" element
         */
        void setMessageArray(int i, org.apache.xmlbeans.XmlObject message);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "message" element
         */
        org.apache.xmlbeans.XmlObject insertNewMessage(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "message" element
         */
        org.apache.xmlbeans.XmlObject addNewMessage();
        
        /**
         * Removes the ith "message" element
         */
        void removeMessage(int i);
        
        /**
         * Gets array of all "binding" elements
         */
        org.apache.xmlbeans.XmlObject[] getBindingArray();
        
        /**
         * Gets ith "binding" element
         */
        org.apache.xmlbeans.XmlObject getBindingArray(int i);
        
        /**
         * Returns number of "binding" element
         */
        int sizeOfBindingArray();
        
        /**
         * Sets array of all "binding" element
         */
        void setBindingArray(org.apache.xmlbeans.XmlObject[] bindingArray);
        
        /**
         * Sets ith "binding" element
         */
        void setBindingArray(int i, org.apache.xmlbeans.XmlObject binding);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "binding" element
         */
        org.apache.xmlbeans.XmlObject insertNewBinding(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "binding" element
         */
        org.apache.xmlbeans.XmlObject addNewBinding();
        
        /**
         * Removes the ith "binding" element
         */
        void removeBinding(int i);
        
        /**
         * Gets array of all "portType" elements
         */
        org.apache.xmlbeans.XmlObject[] getPortTypeArray();
        
        /**
         * Gets ith "portType" element
         */
        org.apache.xmlbeans.XmlObject getPortTypeArray(int i);
        
        /**
         * Returns number of "portType" element
         */
        int sizeOfPortTypeArray();
        
        /**
         * Sets array of all "portType" element
         */
        void setPortTypeArray(org.apache.xmlbeans.XmlObject[] portTypeArray);
        
        /**
         * Sets ith "portType" element
         */
        void setPortTypeArray(int i, org.apache.xmlbeans.XmlObject portType);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "portType" element
         */
        org.apache.xmlbeans.XmlObject insertNewPortType(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "portType" element
         */
        org.apache.xmlbeans.XmlObject addNewPortType();
        
        /**
         * Removes the ith "portType" element
         */
        void removePortType(int i);
        
        /**
         * Gets array of all "service" elements
         */
        org.apache.xmlbeans.XmlObject[] getServiceArray();
        
        /**
         * Gets ith "service" element
         */
        org.apache.xmlbeans.XmlObject getServiceArray(int i);
        
        /**
         * Returns number of "service" element
         */
        int sizeOfServiceArray();
        
        /**
         * Sets array of all "service" element
         */
        void setServiceArray(org.apache.xmlbeans.XmlObject[] serviceArray);
        
        /**
         * Sets ith "service" element
         */
        void setServiceArray(int i, org.apache.xmlbeans.XmlObject service);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "service" element
         */
        org.apache.xmlbeans.XmlObject insertNewService(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "service" element
         */
        org.apache.xmlbeans.XmlObject addNewService();
        
        /**
         * Removes the ith "service" element
         */
        void removeService(int i);
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static org.apache.internal.xmlbeans.wsdlsubst.DefinitionsDocument.Definitions newInstance() {
              return (org.apache.internal.xmlbeans.wsdlsubst.DefinitionsDocument.Definitions) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static org.apache.internal.xmlbeans.wsdlsubst.DefinitionsDocument.Definitions newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (org.apache.internal.xmlbeans.wsdlsubst.DefinitionsDocument.Definitions) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static org.apache.internal.xmlbeans.wsdlsubst.DefinitionsDocument newInstance() {
          return (org.apache.internal.xmlbeans.wsdlsubst.DefinitionsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static org.apache.internal.xmlbeans.wsdlsubst.DefinitionsDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (org.apache.internal.xmlbeans.wsdlsubst.DefinitionsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        public static org.apache.internal.xmlbeans.wsdlsubst.DefinitionsDocument parse(java.lang.String s) throws org.apache.xmlbeans.XmlException {
          return (org.apache.internal.xmlbeans.wsdlsubst.DefinitionsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( s, type, null ); }
        
        public static org.apache.internal.xmlbeans.wsdlsubst.DefinitionsDocument parse(java.lang.String s, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.apache.internal.xmlbeans.wsdlsubst.DefinitionsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( s, type, options ); }
        
        public static org.apache.internal.xmlbeans.wsdlsubst.DefinitionsDocument parse(java.io.File f) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.apache.internal.xmlbeans.wsdlsubst.DefinitionsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( f, type, null ); }
        
        public static org.apache.internal.xmlbeans.wsdlsubst.DefinitionsDocument parse(java.io.File f, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.apache.internal.xmlbeans.wsdlsubst.DefinitionsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( f, type, options ); }
        
        public static org.apache.internal.xmlbeans.wsdlsubst.DefinitionsDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.apache.internal.xmlbeans.wsdlsubst.DefinitionsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static org.apache.internal.xmlbeans.wsdlsubst.DefinitionsDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.apache.internal.xmlbeans.wsdlsubst.DefinitionsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static org.apache.internal.xmlbeans.wsdlsubst.DefinitionsDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.apache.internal.xmlbeans.wsdlsubst.DefinitionsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static org.apache.internal.xmlbeans.wsdlsubst.DefinitionsDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.apache.internal.xmlbeans.wsdlsubst.DefinitionsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static org.apache.internal.xmlbeans.wsdlsubst.DefinitionsDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.apache.internal.xmlbeans.wsdlsubst.DefinitionsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static org.apache.internal.xmlbeans.wsdlsubst.DefinitionsDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.apache.internal.xmlbeans.wsdlsubst.DefinitionsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static org.apache.internal.xmlbeans.wsdlsubst.DefinitionsDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (org.apache.internal.xmlbeans.wsdlsubst.DefinitionsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static org.apache.internal.xmlbeans.wsdlsubst.DefinitionsDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.apache.internal.xmlbeans.wsdlsubst.DefinitionsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        public static org.apache.internal.xmlbeans.wsdlsubst.DefinitionsDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.apache.internal.xmlbeans.wsdlsubst.DefinitionsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        public static org.apache.internal.xmlbeans.wsdlsubst.DefinitionsDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.apache.internal.xmlbeans.wsdlsubst.DefinitionsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
