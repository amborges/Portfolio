/*
 * An XML document type.
 * Localname: downloaded-schemas
 * Namespace: http://xml.apache.org/xmlbeans/2004/02/xmlbean/xsdownload
 * Java type: org.apache.xml.xmlbeans.x2004.x02.xmlbean.xsdownload.DownloadedSchemasDocument
 *
 * Automatically generated - do not modify.
 */
package org.apache.xml.xmlbeans.x2004.x02.xmlbean.xsdownload;


/**
 * A document containing one downloaded-schemas(@http://xml.apache.org/xmlbeans/2004/02/xmlbean/xsdownload) element.
 *
 * This is a complex type.
 */
public interface DownloadedSchemasDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)schema.system.sXMLTOOLS.TypeSystemHolder.typeSystem.resolveHandle("downloadedschemas6dd1doctype");
    
    /**
     * Gets the "downloaded-schemas" element
     */
    org.apache.xml.xmlbeans.x2004.x02.xmlbean.xsdownload.DownloadedSchemasDocument.DownloadedSchemas getDownloadedSchemas();
    
    /**
     * Sets the "downloaded-schemas" element
     */
    void setDownloadedSchemas(org.apache.xml.xmlbeans.x2004.x02.xmlbean.xsdownload.DownloadedSchemasDocument.DownloadedSchemas downloadedSchemas);
    
    /**
     * Appends and returns a new empty "downloaded-schemas" element
     */
    org.apache.xml.xmlbeans.x2004.x02.xmlbean.xsdownload.DownloadedSchemasDocument.DownloadedSchemas addNewDownloadedSchemas();
    
    /**
     * An XML downloaded-schemas(@http://xml.apache.org/xmlbeans/2004/02/xmlbean/xsdownload).
     *
     * This is a complex type.
     */
    public interface DownloadedSchemas extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)schema.system.sXMLTOOLS.TypeSystemHolder.typeSystem.resolveHandle("downloadedschemas8fe9elemtype");
        
        /**
         * Gets array of all "entry" elements
         */
        org.apache.xml.xmlbeans.x2004.x02.xmlbean.xsdownload.DownloadedSchemaEntry[] getEntryArray();
        
        /**
         * Gets ith "entry" element
         */
        org.apache.xml.xmlbeans.x2004.x02.xmlbean.xsdownload.DownloadedSchemaEntry getEntryArray(int i);
        
        /**
         * Returns number of "entry" element
         */
        int sizeOfEntryArray();
        
        /**
         * Sets array of all "entry" element
         */
        void setEntryArray(org.apache.xml.xmlbeans.x2004.x02.xmlbean.xsdownload.DownloadedSchemaEntry[] entryArray);
        
        /**
         * Sets ith "entry" element
         */
        void setEntryArray(int i, org.apache.xml.xmlbeans.x2004.x02.xmlbean.xsdownload.DownloadedSchemaEntry entry);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "entry" element
         */
        org.apache.xml.xmlbeans.x2004.x02.xmlbean.xsdownload.DownloadedSchemaEntry insertNewEntry(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "entry" element
         */
        org.apache.xml.xmlbeans.x2004.x02.xmlbean.xsdownload.DownloadedSchemaEntry addNewEntry();
        
        /**
         * Removes the ith "entry" element
         */
        void removeEntry(int i);
        
        /**
         * Gets the "defaultDirectory" attribute
         */
        java.lang.String getDefaultDirectory();
        
        /**
         * Gets (as xml) the "defaultDirectory" attribute
         */
        org.apache.xmlbeans.XmlToken xgetDefaultDirectory();
        
        /**
         * True if has "defaultDirectory" attribute
         */
        boolean isSetDefaultDirectory();
        
        /**
         * Sets the "defaultDirectory" attribute
         */
        void setDefaultDirectory(java.lang.String defaultDirectory);
        
        /**
         * Sets (as xml) the "defaultDirectory" attribute
         */
        void xsetDefaultDirectory(org.apache.xmlbeans.XmlToken defaultDirectory);
        
        /**
         * Unsets the "defaultDirectory" attribute
         */
        void unsetDefaultDirectory();
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static org.apache.xml.xmlbeans.x2004.x02.xmlbean.xsdownload.DownloadedSchemasDocument.DownloadedSchemas newInstance() {
              return (org.apache.xml.xmlbeans.x2004.x02.xmlbean.xsdownload.DownloadedSchemasDocument.DownloadedSchemas) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static org.apache.xml.xmlbeans.x2004.x02.xmlbean.xsdownload.DownloadedSchemasDocument.DownloadedSchemas newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (org.apache.xml.xmlbeans.x2004.x02.xmlbean.xsdownload.DownloadedSchemasDocument.DownloadedSchemas) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static org.apache.xml.xmlbeans.x2004.x02.xmlbean.xsdownload.DownloadedSchemasDocument newInstance() {
          return (org.apache.xml.xmlbeans.x2004.x02.xmlbean.xsdownload.DownloadedSchemasDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static org.apache.xml.xmlbeans.x2004.x02.xmlbean.xsdownload.DownloadedSchemasDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (org.apache.xml.xmlbeans.x2004.x02.xmlbean.xsdownload.DownloadedSchemasDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        public static org.apache.xml.xmlbeans.x2004.x02.xmlbean.xsdownload.DownloadedSchemasDocument parse(java.lang.String s) throws org.apache.xmlbeans.XmlException {
          return (org.apache.xml.xmlbeans.x2004.x02.xmlbean.xsdownload.DownloadedSchemasDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( s, type, null ); }
        
        public static org.apache.xml.xmlbeans.x2004.x02.xmlbean.xsdownload.DownloadedSchemasDocument parse(java.lang.String s, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.apache.xml.xmlbeans.x2004.x02.xmlbean.xsdownload.DownloadedSchemasDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( s, type, options ); }
        
        public static org.apache.xml.xmlbeans.x2004.x02.xmlbean.xsdownload.DownloadedSchemasDocument parse(java.io.File f) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.apache.xml.xmlbeans.x2004.x02.xmlbean.xsdownload.DownloadedSchemasDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( f, type, null ); }
        
        public static org.apache.xml.xmlbeans.x2004.x02.xmlbean.xsdownload.DownloadedSchemasDocument parse(java.io.File f, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.apache.xml.xmlbeans.x2004.x02.xmlbean.xsdownload.DownloadedSchemasDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( f, type, options ); }
        
        public static org.apache.xml.xmlbeans.x2004.x02.xmlbean.xsdownload.DownloadedSchemasDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.apache.xml.xmlbeans.x2004.x02.xmlbean.xsdownload.DownloadedSchemasDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static org.apache.xml.xmlbeans.x2004.x02.xmlbean.xsdownload.DownloadedSchemasDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.apache.xml.xmlbeans.x2004.x02.xmlbean.xsdownload.DownloadedSchemasDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static org.apache.xml.xmlbeans.x2004.x02.xmlbean.xsdownload.DownloadedSchemasDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.apache.xml.xmlbeans.x2004.x02.xmlbean.xsdownload.DownloadedSchemasDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static org.apache.xml.xmlbeans.x2004.x02.xmlbean.xsdownload.DownloadedSchemasDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.apache.xml.xmlbeans.x2004.x02.xmlbean.xsdownload.DownloadedSchemasDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static org.apache.xml.xmlbeans.x2004.x02.xmlbean.xsdownload.DownloadedSchemasDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.apache.xml.xmlbeans.x2004.x02.xmlbean.xsdownload.DownloadedSchemasDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static org.apache.xml.xmlbeans.x2004.x02.xmlbean.xsdownload.DownloadedSchemasDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.apache.xml.xmlbeans.x2004.x02.xmlbean.xsdownload.DownloadedSchemasDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static org.apache.xml.xmlbeans.x2004.x02.xmlbean.xsdownload.DownloadedSchemasDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (org.apache.xml.xmlbeans.x2004.x02.xmlbean.xsdownload.DownloadedSchemasDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static org.apache.xml.xmlbeans.x2004.x02.xmlbean.xsdownload.DownloadedSchemasDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.apache.xml.xmlbeans.x2004.x02.xmlbean.xsdownload.DownloadedSchemasDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        public static org.apache.xml.xmlbeans.x2004.x02.xmlbean.xsdownload.DownloadedSchemasDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.apache.xml.xmlbeans.x2004.x02.xmlbean.xsdownload.DownloadedSchemasDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        public static org.apache.xml.xmlbeans.x2004.x02.xmlbean.xsdownload.DownloadedSchemasDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.apache.xml.xmlbeans.x2004.x02.xmlbean.xsdownload.DownloadedSchemasDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
