/*
 * An XML document type.
 * Localname: tests
 * Namespace: http://xml.apache.org/xmlbeans/2004/02/xmlbean/ltgfmt
 * Java type: org.apache.xml.xmlbeans.x2004.x02.xmlbean.ltgfmt.TestsDocument
 *
 * Automatically generated - do not modify.
 */
package org.apache.xml.xmlbeans.x2004.x02.xmlbean.ltgfmt;


/**
 * A document containing one tests(@http://xml.apache.org/xmlbeans/2004/02/xmlbean/ltgfmt) element.
 *
 * This is a complex type.
 */
public interface TestsDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)schema.system.sXMLTOOLS.TypeSystemHolder.typeSystem.resolveHandle("testsbf1fdoctype");
    
    /**
     * Gets the "tests" element
     */
    org.apache.xml.xmlbeans.x2004.x02.xmlbean.ltgfmt.TestsDocument.Tests getTests();
    
    /**
     * Sets the "tests" element
     */
    void setTests(org.apache.xml.xmlbeans.x2004.x02.xmlbean.ltgfmt.TestsDocument.Tests tests);
    
    /**
     * Appends and returns a new empty "tests" element
     */
    org.apache.xml.xmlbeans.x2004.x02.xmlbean.ltgfmt.TestsDocument.Tests addNewTests();
    
    /**
     * An XML tests(@http://xml.apache.org/xmlbeans/2004/02/xmlbean/ltgfmt).
     *
     * This is a complex type.
     */
    public interface Tests extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)schema.system.sXMLTOOLS.TypeSystemHolder.typeSystem.resolveHandle("tests7aecelemtype");
        
        /**
         * Gets array of all "test" elements
         */
        org.apache.xml.xmlbeans.x2004.x02.xmlbean.ltgfmt.TestCase[] getTestArray();
        
        /**
         * Gets ith "test" element
         */
        org.apache.xml.xmlbeans.x2004.x02.xmlbean.ltgfmt.TestCase getTestArray(int i);
        
        /**
         * Returns number of "test" element
         */
        int sizeOfTestArray();
        
        /**
         * Sets array of all "test" element
         */
        void setTestArray(org.apache.xml.xmlbeans.x2004.x02.xmlbean.ltgfmt.TestCase[] testArray);
        
        /**
         * Sets ith "test" element
         */
        void setTestArray(int i, org.apache.xml.xmlbeans.x2004.x02.xmlbean.ltgfmt.TestCase test);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "test" element
         */
        org.apache.xml.xmlbeans.x2004.x02.xmlbean.ltgfmt.TestCase insertNewTest(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "test" element
         */
        org.apache.xml.xmlbeans.x2004.x02.xmlbean.ltgfmt.TestCase addNewTest();
        
        /**
         * Removes the ith "test" element
         */
        void removeTest(int i);
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static org.apache.xml.xmlbeans.x2004.x02.xmlbean.ltgfmt.TestsDocument.Tests newInstance() {
              return (org.apache.xml.xmlbeans.x2004.x02.xmlbean.ltgfmt.TestsDocument.Tests) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static org.apache.xml.xmlbeans.x2004.x02.xmlbean.ltgfmt.TestsDocument.Tests newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (org.apache.xml.xmlbeans.x2004.x02.xmlbean.ltgfmt.TestsDocument.Tests) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static org.apache.xml.xmlbeans.x2004.x02.xmlbean.ltgfmt.TestsDocument newInstance() {
          return (org.apache.xml.xmlbeans.x2004.x02.xmlbean.ltgfmt.TestsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static org.apache.xml.xmlbeans.x2004.x02.xmlbean.ltgfmt.TestsDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (org.apache.xml.xmlbeans.x2004.x02.xmlbean.ltgfmt.TestsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        public static org.apache.xml.xmlbeans.x2004.x02.xmlbean.ltgfmt.TestsDocument parse(java.lang.String s) throws org.apache.xmlbeans.XmlException {
          return (org.apache.xml.xmlbeans.x2004.x02.xmlbean.ltgfmt.TestsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( s, type, null ); }
        
        public static org.apache.xml.xmlbeans.x2004.x02.xmlbean.ltgfmt.TestsDocument parse(java.lang.String s, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.apache.xml.xmlbeans.x2004.x02.xmlbean.ltgfmt.TestsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( s, type, options ); }
        
        public static org.apache.xml.xmlbeans.x2004.x02.xmlbean.ltgfmt.TestsDocument parse(java.io.File f) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.apache.xml.xmlbeans.x2004.x02.xmlbean.ltgfmt.TestsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( f, type, null ); }
        
        public static org.apache.xml.xmlbeans.x2004.x02.xmlbean.ltgfmt.TestsDocument parse(java.io.File f, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.apache.xml.xmlbeans.x2004.x02.xmlbean.ltgfmt.TestsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( f, type, options ); }
        
        public static org.apache.xml.xmlbeans.x2004.x02.xmlbean.ltgfmt.TestsDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.apache.xml.xmlbeans.x2004.x02.xmlbean.ltgfmt.TestsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static org.apache.xml.xmlbeans.x2004.x02.xmlbean.ltgfmt.TestsDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.apache.xml.xmlbeans.x2004.x02.xmlbean.ltgfmt.TestsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static org.apache.xml.xmlbeans.x2004.x02.xmlbean.ltgfmt.TestsDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.apache.xml.xmlbeans.x2004.x02.xmlbean.ltgfmt.TestsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static org.apache.xml.xmlbeans.x2004.x02.xmlbean.ltgfmt.TestsDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.apache.xml.xmlbeans.x2004.x02.xmlbean.ltgfmt.TestsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static org.apache.xml.xmlbeans.x2004.x02.xmlbean.ltgfmt.TestsDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.apache.xml.xmlbeans.x2004.x02.xmlbean.ltgfmt.TestsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static org.apache.xml.xmlbeans.x2004.x02.xmlbean.ltgfmt.TestsDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.apache.xml.xmlbeans.x2004.x02.xmlbean.ltgfmt.TestsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static org.apache.xml.xmlbeans.x2004.x02.xmlbean.ltgfmt.TestsDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (org.apache.xml.xmlbeans.x2004.x02.xmlbean.ltgfmt.TestsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static org.apache.xml.xmlbeans.x2004.x02.xmlbean.ltgfmt.TestsDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.apache.xml.xmlbeans.x2004.x02.xmlbean.ltgfmt.TestsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        public static org.apache.xml.xmlbeans.x2004.x02.xmlbean.ltgfmt.TestsDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.apache.xml.xmlbeans.x2004.x02.xmlbean.ltgfmt.TestsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        public static org.apache.xml.xmlbeans.x2004.x02.xmlbean.ltgfmt.TestsDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.apache.xml.xmlbeans.x2004.x02.xmlbean.ltgfmt.TestsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
