/*
 * XML Type:  test-case
 * Namespace: http://xml.apache.org/xmlbeans/2004/02/xmlbean/ltgfmt
 * Java type: org.apache.xml.xmlbeans.x2004.x02.xmlbean.ltgfmt.TestCase
 *
 * Automatically generated - do not modify.
 */
package org.apache.xml.xmlbeans.x2004.x02.xmlbean.ltgfmt;


/**
 * An XML test-case(@http://xml.apache.org/xmlbeans/2004/02/xmlbean/ltgfmt).
 *
 * This is a complex type.
 */
public interface TestCase extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)schema.system.sXMLTOOLS.TypeSystemHolder.typeSystem.resolveHandle("testcase9599type");
    
    /**
     * Gets the "description" element
     */
    java.lang.String getDescription();
    
    /**
     * Gets (as xml) the "description" element
     */
    org.apache.xmlbeans.XmlString xgetDescription();
    
    /**
     * True if has "description" element
     */
    boolean isSetDescription();
    
    /**
     * Sets the "description" element
     */
    void setDescription(java.lang.String description);
    
    /**
     * Sets (as xml) the "description" element
     */
    void xsetDescription(org.apache.xmlbeans.XmlString description);
    
    /**
     * Unsets the "description" element
     */
    void unsetDescription();
    
    /**
     * Gets the "files" element
     */
    org.apache.xml.xmlbeans.x2004.x02.xmlbean.ltgfmt.TestCase.Files getFiles();
    
    /**
     * Sets the "files" element
     */
    void setFiles(org.apache.xml.xmlbeans.x2004.x02.xmlbean.ltgfmt.TestCase.Files files);
    
    /**
     * Appends and returns a new empty "files" element
     */
    org.apache.xml.xmlbeans.x2004.x02.xmlbean.ltgfmt.TestCase.Files addNewFiles();
    
    /**
     * Gets the "id" attribute
     */
    java.lang.String getId();
    
    /**
     * Gets (as xml) the "id" attribute
     */
    org.apache.xmlbeans.XmlID xgetId();
    
    /**
     * True if has "id" attribute
     */
    boolean isSetId();
    
    /**
     * Sets the "id" attribute
     */
    void setId(java.lang.String id);
    
    /**
     * Sets (as xml) the "id" attribute
     */
    void xsetId(org.apache.xmlbeans.XmlID id);
    
    /**
     * Unsets the "id" attribute
     */
    void unsetId();
    
    /**
     * Gets the "origin" attribute
     */
    java.lang.String getOrigin();
    
    /**
     * Gets (as xml) the "origin" attribute
     */
    org.apache.xmlbeans.XmlToken xgetOrigin();
    
    /**
     * True if has "origin" attribute
     */
    boolean isSetOrigin();
    
    /**
     * Sets the "origin" attribute
     */
    void setOrigin(java.lang.String origin);
    
    /**
     * Sets (as xml) the "origin" attribute
     */
    void xsetOrigin(org.apache.xmlbeans.XmlToken origin);
    
    /**
     * Unsets the "origin" attribute
     */
    void unsetOrigin();
    
    /**
     * Gets the "modified" attribute
     */
    boolean getModified();
    
    /**
     * Gets (as xml) the "modified" attribute
     */
    org.apache.xmlbeans.XmlBoolean xgetModified();
    
    /**
     * True if has "modified" attribute
     */
    boolean isSetModified();
    
    /**
     * Sets the "modified" attribute
     */
    void setModified(boolean modified);
    
    /**
     * Sets (as xml) the "modified" attribute
     */
    void xsetModified(org.apache.xmlbeans.XmlBoolean modified);
    
    /**
     * Unsets the "modified" attribute
     */
    void unsetModified();
    
    /**
     * An XML files(@http://xml.apache.org/xmlbeans/2004/02/xmlbean/ltgfmt).
     *
     * This is a complex type.
     */
    public interface Files extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)schema.system.sXMLTOOLS.TypeSystemHolder.typeSystem.resolveHandle("filesa1bcelemtype");
        
        /**
         * Gets array of all "file" elements
         */
        org.apache.xml.xmlbeans.x2004.x02.xmlbean.ltgfmt.FileDesc[] getFileArray();
        
        /**
         * Gets ith "file" element
         */
        org.apache.xml.xmlbeans.x2004.x02.xmlbean.ltgfmt.FileDesc getFileArray(int i);
        
        /**
         * Returns number of "file" element
         */
        int sizeOfFileArray();
        
        /**
         * Sets array of all "file" element
         */
        void setFileArray(org.apache.xml.xmlbeans.x2004.x02.xmlbean.ltgfmt.FileDesc[] fileArray);
        
        /**
         * Sets ith "file" element
         */
        void setFileArray(int i, org.apache.xml.xmlbeans.x2004.x02.xmlbean.ltgfmt.FileDesc file);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "file" element
         */
        org.apache.xml.xmlbeans.x2004.x02.xmlbean.ltgfmt.FileDesc insertNewFile(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "file" element
         */
        org.apache.xml.xmlbeans.x2004.x02.xmlbean.ltgfmt.FileDesc addNewFile();
        
        /**
         * Removes the ith "file" element
         */
        void removeFile(int i);
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static org.apache.xml.xmlbeans.x2004.x02.xmlbean.ltgfmt.TestCase.Files newInstance() {
              return (org.apache.xml.xmlbeans.x2004.x02.xmlbean.ltgfmt.TestCase.Files) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static org.apache.xml.xmlbeans.x2004.x02.xmlbean.ltgfmt.TestCase.Files newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (org.apache.xml.xmlbeans.x2004.x02.xmlbean.ltgfmt.TestCase.Files) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static org.apache.xml.xmlbeans.x2004.x02.xmlbean.ltgfmt.TestCase newInstance() {
          return (org.apache.xml.xmlbeans.x2004.x02.xmlbean.ltgfmt.TestCase) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static org.apache.xml.xmlbeans.x2004.x02.xmlbean.ltgfmt.TestCase newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (org.apache.xml.xmlbeans.x2004.x02.xmlbean.ltgfmt.TestCase) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        public static org.apache.xml.xmlbeans.x2004.x02.xmlbean.ltgfmt.TestCase parse(java.lang.String s) throws org.apache.xmlbeans.XmlException {
          return (org.apache.xml.xmlbeans.x2004.x02.xmlbean.ltgfmt.TestCase) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( s, type, null ); }
        
        public static org.apache.xml.xmlbeans.x2004.x02.xmlbean.ltgfmt.TestCase parse(java.lang.String s, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.apache.xml.xmlbeans.x2004.x02.xmlbean.ltgfmt.TestCase) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( s, type, options ); }
        
        public static org.apache.xml.xmlbeans.x2004.x02.xmlbean.ltgfmt.TestCase parse(java.io.File f) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.apache.xml.xmlbeans.x2004.x02.xmlbean.ltgfmt.TestCase) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( f, type, null ); }
        
        public static org.apache.xml.xmlbeans.x2004.x02.xmlbean.ltgfmt.TestCase parse(java.io.File f, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.apache.xml.xmlbeans.x2004.x02.xmlbean.ltgfmt.TestCase) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( f, type, options ); }
        
        public static org.apache.xml.xmlbeans.x2004.x02.xmlbean.ltgfmt.TestCase parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.apache.xml.xmlbeans.x2004.x02.xmlbean.ltgfmt.TestCase) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static org.apache.xml.xmlbeans.x2004.x02.xmlbean.ltgfmt.TestCase parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.apache.xml.xmlbeans.x2004.x02.xmlbean.ltgfmt.TestCase) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static org.apache.xml.xmlbeans.x2004.x02.xmlbean.ltgfmt.TestCase parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.apache.xml.xmlbeans.x2004.x02.xmlbean.ltgfmt.TestCase) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static org.apache.xml.xmlbeans.x2004.x02.xmlbean.ltgfmt.TestCase parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.apache.xml.xmlbeans.x2004.x02.xmlbean.ltgfmt.TestCase) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static org.apache.xml.xmlbeans.x2004.x02.xmlbean.ltgfmt.TestCase parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.apache.xml.xmlbeans.x2004.x02.xmlbean.ltgfmt.TestCase) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static org.apache.xml.xmlbeans.x2004.x02.xmlbean.ltgfmt.TestCase parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.apache.xml.xmlbeans.x2004.x02.xmlbean.ltgfmt.TestCase) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static org.apache.xml.xmlbeans.x2004.x02.xmlbean.ltgfmt.TestCase parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (org.apache.xml.xmlbeans.x2004.x02.xmlbean.ltgfmt.TestCase) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static org.apache.xml.xmlbeans.x2004.x02.xmlbean.ltgfmt.TestCase parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.apache.xml.xmlbeans.x2004.x02.xmlbean.ltgfmt.TestCase) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        public static org.apache.xml.xmlbeans.x2004.x02.xmlbean.ltgfmt.TestCase parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.apache.xml.xmlbeans.x2004.x02.xmlbean.ltgfmt.TestCase) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        public static org.apache.xml.xmlbeans.x2004.x02.xmlbean.ltgfmt.TestCase parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.apache.xml.xmlbeans.x2004.x02.xmlbean.ltgfmt.TestCase) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
