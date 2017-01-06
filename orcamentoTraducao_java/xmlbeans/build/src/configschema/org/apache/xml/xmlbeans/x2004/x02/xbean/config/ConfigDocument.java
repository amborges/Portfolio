/*
 * An XML document type.
 * Localname: config
 * Namespace: http://xml.apache.org/xmlbeans/2004/02/xbean/config
 * Java type: org.apache.xml.xmlbeans.x2004.x02.xbean.config.ConfigDocument
 *
 * Automatically generated - do not modify.
 */
package org.apache.xml.xmlbeans.x2004.x02.xbean.config;


/**
 * A document containing one config(@http://xml.apache.org/xmlbeans/2004/02/xbean/config) element.
 *
 * This is a complex type.
 */
public interface ConfigDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)schema.system.sXMLCONFIG.TypeSystemHolder.typeSystem.resolveHandle("config4185doctype");
    
    /**
     * Gets the "config" element
     */
    org.apache.xml.xmlbeans.x2004.x02.xbean.config.ConfigDocument.Config getConfig();
    
    /**
     * Sets the "config" element
     */
    void setConfig(org.apache.xml.xmlbeans.x2004.x02.xbean.config.ConfigDocument.Config config);
    
    /**
     * Appends and returns a new empty "config" element
     */
    org.apache.xml.xmlbeans.x2004.x02.xbean.config.ConfigDocument.Config addNewConfig();
    
    /**
     * An XML config(@http://xml.apache.org/xmlbeans/2004/02/xbean/config).
     *
     * This is a complex type.
     */
    public interface Config extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)schema.system.sXMLCONFIG.TypeSystemHolder.typeSystem.resolveHandle("configf467elemtype");
        
        /**
         * Gets array of all "namespace" elements
         */
        org.apache.xml.xmlbeans.x2004.x02.xbean.config.Nsconfig[] getNamespaceArray();
        
        /**
         * Gets ith "namespace" element
         */
        org.apache.xml.xmlbeans.x2004.x02.xbean.config.Nsconfig getNamespaceArray(int i);
        
        /**
         * Returns number of "namespace" element
         */
        int sizeOfNamespaceArray();
        
        /**
         * Sets array of all "namespace" element
         */
        void setNamespaceArray(org.apache.xml.xmlbeans.x2004.x02.xbean.config.Nsconfig[] namespaceArray);
        
        /**
         * Sets ith "namespace" element
         */
        void setNamespaceArray(int i, org.apache.xml.xmlbeans.x2004.x02.xbean.config.Nsconfig namespace);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "namespace" element
         */
        org.apache.xml.xmlbeans.x2004.x02.xbean.config.Nsconfig insertNewNamespace(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "namespace" element
         */
        org.apache.xml.xmlbeans.x2004.x02.xbean.config.Nsconfig addNewNamespace();
        
        /**
         * Removes the ith "namespace" element
         */
        void removeNamespace(int i);
        
        /**
         * Gets array of all "qname" elements
         */
        org.apache.xml.xmlbeans.x2004.x02.xbean.config.Qnameconfig[] getQnameArray();
        
        /**
         * Gets ith "qname" element
         */
        org.apache.xml.xmlbeans.x2004.x02.xbean.config.Qnameconfig getQnameArray(int i);
        
        /**
         * Returns number of "qname" element
         */
        int sizeOfQnameArray();
        
        /**
         * Sets array of all "qname" element
         */
        void setQnameArray(org.apache.xml.xmlbeans.x2004.x02.xbean.config.Qnameconfig[] qnameArray);
        
        /**
         * Sets ith "qname" element
         */
        void setQnameArray(int i, org.apache.xml.xmlbeans.x2004.x02.xbean.config.Qnameconfig qname);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "qname" element
         */
        org.apache.xml.xmlbeans.x2004.x02.xbean.config.Qnameconfig insertNewQname(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "qname" element
         */
        org.apache.xml.xmlbeans.x2004.x02.xbean.config.Qnameconfig addNewQname();
        
        /**
         * Removes the ith "qname" element
         */
        void removeQname(int i);
        
        /**
         * Gets array of all "extension" elements
         */
        org.apache.xml.xmlbeans.x2004.x02.xbean.config.Extensionconfig[] getExtensionArray();
        
        /**
         * Gets ith "extension" element
         */
        org.apache.xml.xmlbeans.x2004.x02.xbean.config.Extensionconfig getExtensionArray(int i);
        
        /**
         * Returns number of "extension" element
         */
        int sizeOfExtensionArray();
        
        /**
         * Sets array of all "extension" element
         */
        void setExtensionArray(org.apache.xml.xmlbeans.x2004.x02.xbean.config.Extensionconfig[] extensionArray);
        
        /**
         * Sets ith "extension" element
         */
        void setExtensionArray(int i, org.apache.xml.xmlbeans.x2004.x02.xbean.config.Extensionconfig extension);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "extension" element
         */
        org.apache.xml.xmlbeans.x2004.x02.xbean.config.Extensionconfig insertNewExtension(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "extension" element
         */
        org.apache.xml.xmlbeans.x2004.x02.xbean.config.Extensionconfig addNewExtension();
        
        /**
         * Removes the ith "extension" element
         */
        void removeExtension(int i);
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static org.apache.xml.xmlbeans.x2004.x02.xbean.config.ConfigDocument.Config newInstance() {
              return (org.apache.xml.xmlbeans.x2004.x02.xbean.config.ConfigDocument.Config) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static org.apache.xml.xmlbeans.x2004.x02.xbean.config.ConfigDocument.Config newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (org.apache.xml.xmlbeans.x2004.x02.xbean.config.ConfigDocument.Config) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static org.apache.xml.xmlbeans.x2004.x02.xbean.config.ConfigDocument newInstance() {
          return (org.apache.xml.xmlbeans.x2004.x02.xbean.config.ConfigDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static org.apache.xml.xmlbeans.x2004.x02.xbean.config.ConfigDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (org.apache.xml.xmlbeans.x2004.x02.xbean.config.ConfigDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        public static org.apache.xml.xmlbeans.x2004.x02.xbean.config.ConfigDocument parse(java.lang.String s) throws org.apache.xmlbeans.XmlException {
          return (org.apache.xml.xmlbeans.x2004.x02.xbean.config.ConfigDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( s, type, null ); }
        
        public static org.apache.xml.xmlbeans.x2004.x02.xbean.config.ConfigDocument parse(java.lang.String s, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.apache.xml.xmlbeans.x2004.x02.xbean.config.ConfigDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( s, type, options ); }
        
        public static org.apache.xml.xmlbeans.x2004.x02.xbean.config.ConfigDocument parse(java.io.File f) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.apache.xml.xmlbeans.x2004.x02.xbean.config.ConfigDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( f, type, null ); }
        
        public static org.apache.xml.xmlbeans.x2004.x02.xbean.config.ConfigDocument parse(java.io.File f, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.apache.xml.xmlbeans.x2004.x02.xbean.config.ConfigDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( f, type, options ); }
        
        public static org.apache.xml.xmlbeans.x2004.x02.xbean.config.ConfigDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.apache.xml.xmlbeans.x2004.x02.xbean.config.ConfigDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static org.apache.xml.xmlbeans.x2004.x02.xbean.config.ConfigDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.apache.xml.xmlbeans.x2004.x02.xbean.config.ConfigDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static org.apache.xml.xmlbeans.x2004.x02.xbean.config.ConfigDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.apache.xml.xmlbeans.x2004.x02.xbean.config.ConfigDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static org.apache.xml.xmlbeans.x2004.x02.xbean.config.ConfigDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.apache.xml.xmlbeans.x2004.x02.xbean.config.ConfigDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static org.apache.xml.xmlbeans.x2004.x02.xbean.config.ConfigDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.apache.xml.xmlbeans.x2004.x02.xbean.config.ConfigDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static org.apache.xml.xmlbeans.x2004.x02.xbean.config.ConfigDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.apache.xml.xmlbeans.x2004.x02.xbean.config.ConfigDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static org.apache.xml.xmlbeans.x2004.x02.xbean.config.ConfigDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (org.apache.xml.xmlbeans.x2004.x02.xbean.config.ConfigDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static org.apache.xml.xmlbeans.x2004.x02.xbean.config.ConfigDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.apache.xml.xmlbeans.x2004.x02.xbean.config.ConfigDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        public static org.apache.xml.xmlbeans.x2004.x02.xbean.config.ConfigDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.apache.xml.xmlbeans.x2004.x02.xbean.config.ConfigDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        public static org.apache.xml.xmlbeans.x2004.x02.xbean.config.ConfigDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.apache.xml.xmlbeans.x2004.x02.xbean.config.ConfigDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
