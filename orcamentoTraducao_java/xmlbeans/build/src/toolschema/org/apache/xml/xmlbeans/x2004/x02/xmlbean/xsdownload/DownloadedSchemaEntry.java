/*
 * XML Type:  downloaded-schema-entry
 * Namespace: http://xml.apache.org/xmlbeans/2004/02/xmlbean/xsdownload
 * Java type: org.apache.xml.xmlbeans.x2004.x02.xmlbean.xsdownload.DownloadedSchemaEntry
 *
 * Automatically generated - do not modify.
 */
package org.apache.xml.xmlbeans.x2004.x02.xmlbean.xsdownload;


/**
 * An XML downloaded-schema-entry(@http://xml.apache.org/xmlbeans/2004/02/xmlbean/xsdownload).
 *
 * This is a complex type.
 */
public interface DownloadedSchemaEntry extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)schema.system.sXMLTOOLS.TypeSystemHolder.typeSystem.resolveHandle("downloadedschemaentry5f6ftype");
    
    /**
     * Gets the "filename" element
     */
    java.lang.String getFilename();
    
    /**
     * Gets (as xml) the "filename" element
     */
    org.apache.xmlbeans.XmlToken xgetFilename();
    
    /**
     * Sets the "filename" element
     */
    void setFilename(java.lang.String filename);
    
    /**
     * Sets (as xml) the "filename" element
     */
    void xsetFilename(org.apache.xmlbeans.XmlToken filename);
    
    /**
     * Gets the "sha1" element
     */
    java.lang.String getSha1();
    
    /**
     * Gets (as xml) the "sha1" element
     */
    org.apache.xmlbeans.XmlToken xgetSha1();
    
    /**
     * Sets the "sha1" element
     */
    void setSha1(java.lang.String sha1);
    
    /**
     * Sets (as xml) the "sha1" element
     */
    void xsetSha1(org.apache.xmlbeans.XmlToken sha1);
    
    /**
     * Gets array of all "schemaLocation" elements
     */
    java.lang.String[] getSchemaLocationArray();
    
    /**
     * Gets ith "schemaLocation" element
     */
    java.lang.String getSchemaLocationArray(int i);
    
    /**
     * Gets (as xml) array of all "schemaLocation" elements
     */
    org.apache.xmlbeans.XmlAnyURI[] xgetSchemaLocationArray();
    
    /**
     * Gets (as xml) ith "schemaLocation" element
     */
    org.apache.xmlbeans.XmlAnyURI xgetSchemaLocationArray(int i);
    
    /**
     * Returns number of "schemaLocation" element
     */
    int sizeOfSchemaLocationArray();
    
    /**
     * Sets array of all "schemaLocation" element
     */
    void setSchemaLocationArray(java.lang.String[] schemaLocationArray);
    
    /**
     * Sets ith "schemaLocation" element
     */
    void setSchemaLocationArray(int i, java.lang.String schemaLocation);
    
    /**
     * Sets (as xml) array of all "schemaLocation" element
     */
    void xsetSchemaLocationArray(org.apache.xmlbeans.XmlAnyURI[]schemaLocationArray);
    
    /**
     * Sets (as xml) ith "schemaLocation" element
     */
    void xsetSchemaLocationArray(int i, org.apache.xmlbeans.XmlAnyURI schemaLocation);
    
    /**
     * Inserts the value as the ith "schemaLocation" element
     */
    void insertSchemaLocation(int i, java.lang.String schemaLocation);
    
    /**
     * Appends the value as the last "schemaLocation" element
     */
    void addSchemaLocation(java.lang.String schemaLocation);
    
    /**
     * Removes the ith "schemaLocation" element
     */
    void removeSchemaLocation(int i);
    
    /**
     * Gets the "namespace" element
     */
    java.lang.String getNamespace();
    
    /**
     * Gets (as xml) the "namespace" element
     */
    org.apache.xmlbeans.XmlAnyURI xgetNamespace();
    
    /**
     * True if has "namespace" element
     */
    boolean isSetNamespace();
    
    /**
     * Sets the "namespace" element
     */
    void setNamespace(java.lang.String namespace);
    
    /**
     * Sets (as xml) the "namespace" element
     */
    void xsetNamespace(org.apache.xmlbeans.XmlAnyURI namespace);
    
    /**
     * Unsets the "namespace" element
     */
    void unsetNamespace();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static org.apache.xml.xmlbeans.x2004.x02.xmlbean.xsdownload.DownloadedSchemaEntry newInstance() {
          return (org.apache.xml.xmlbeans.x2004.x02.xmlbean.xsdownload.DownloadedSchemaEntry) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static org.apache.xml.xmlbeans.x2004.x02.xmlbean.xsdownload.DownloadedSchemaEntry newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (org.apache.xml.xmlbeans.x2004.x02.xmlbean.xsdownload.DownloadedSchemaEntry) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        public static org.apache.xml.xmlbeans.x2004.x02.xmlbean.xsdownload.DownloadedSchemaEntry parse(java.lang.String s) throws org.apache.xmlbeans.XmlException {
          return (org.apache.xml.xmlbeans.x2004.x02.xmlbean.xsdownload.DownloadedSchemaEntry) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( s, type, null ); }
        
        public static org.apache.xml.xmlbeans.x2004.x02.xmlbean.xsdownload.DownloadedSchemaEntry parse(java.lang.String s, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.apache.xml.xmlbeans.x2004.x02.xmlbean.xsdownload.DownloadedSchemaEntry) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( s, type, options ); }
        
        public static org.apache.xml.xmlbeans.x2004.x02.xmlbean.xsdownload.DownloadedSchemaEntry parse(java.io.File f) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.apache.xml.xmlbeans.x2004.x02.xmlbean.xsdownload.DownloadedSchemaEntry) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( f, type, null ); }
        
        public static org.apache.xml.xmlbeans.x2004.x02.xmlbean.xsdownload.DownloadedSchemaEntry parse(java.io.File f, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.apache.xml.xmlbeans.x2004.x02.xmlbean.xsdownload.DownloadedSchemaEntry) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( f, type, options ); }
        
        public static org.apache.xml.xmlbeans.x2004.x02.xmlbean.xsdownload.DownloadedSchemaEntry parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.apache.xml.xmlbeans.x2004.x02.xmlbean.xsdownload.DownloadedSchemaEntry) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static org.apache.xml.xmlbeans.x2004.x02.xmlbean.xsdownload.DownloadedSchemaEntry parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.apache.xml.xmlbeans.x2004.x02.xmlbean.xsdownload.DownloadedSchemaEntry) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static org.apache.xml.xmlbeans.x2004.x02.xmlbean.xsdownload.DownloadedSchemaEntry parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.apache.xml.xmlbeans.x2004.x02.xmlbean.xsdownload.DownloadedSchemaEntry) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static org.apache.xml.xmlbeans.x2004.x02.xmlbean.xsdownload.DownloadedSchemaEntry parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.apache.xml.xmlbeans.x2004.x02.xmlbean.xsdownload.DownloadedSchemaEntry) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static org.apache.xml.xmlbeans.x2004.x02.xmlbean.xsdownload.DownloadedSchemaEntry parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.apache.xml.xmlbeans.x2004.x02.xmlbean.xsdownload.DownloadedSchemaEntry) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static org.apache.xml.xmlbeans.x2004.x02.xmlbean.xsdownload.DownloadedSchemaEntry parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.apache.xml.xmlbeans.x2004.x02.xmlbean.xsdownload.DownloadedSchemaEntry) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static org.apache.xml.xmlbeans.x2004.x02.xmlbean.xsdownload.DownloadedSchemaEntry parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (org.apache.xml.xmlbeans.x2004.x02.xmlbean.xsdownload.DownloadedSchemaEntry) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static org.apache.xml.xmlbeans.x2004.x02.xmlbean.xsdownload.DownloadedSchemaEntry parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.apache.xml.xmlbeans.x2004.x02.xmlbean.xsdownload.DownloadedSchemaEntry) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        public static org.apache.xml.xmlbeans.x2004.x02.xmlbean.xsdownload.DownloadedSchemaEntry parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.apache.xml.xmlbeans.x2004.x02.xmlbean.xsdownload.DownloadedSchemaEntry) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        public static org.apache.xml.xmlbeans.x2004.x02.xmlbean.xsdownload.DownloadedSchemaEntry parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.apache.xml.xmlbeans.x2004.x02.xmlbean.xsdownload.DownloadedSchemaEntry) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
