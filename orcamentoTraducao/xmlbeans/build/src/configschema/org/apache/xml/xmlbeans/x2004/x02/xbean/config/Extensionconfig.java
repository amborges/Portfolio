/*
 * XML Type:  extensionconfig
 * Namespace: http://xml.apache.org/xmlbeans/2004/02/xbean/config
 * Java type: org.apache.xml.xmlbeans.x2004.x02.xbean.config.Extensionconfig
 *
 * Automatically generated - do not modify.
 */
package org.apache.xml.xmlbeans.x2004.x02.xbean.config;


/**
 * An XML extensionconfig(@http://xml.apache.org/xmlbeans/2004/02/xbean/config).
 *
 * This is a complex type.
 */
public interface Extensionconfig extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)schema.system.sXMLCONFIG.TypeSystemHolder.typeSystem.resolveHandle("extensionconfig2ac2type");
    
    /**
     * Gets array of all "interface" elements
     */
    org.apache.xml.xmlbeans.x2004.x02.xbean.config.Extensionconfig.Interface[] getInterfaceArray();
    
    /**
     * Gets ith "interface" element
     */
    org.apache.xml.xmlbeans.x2004.x02.xbean.config.Extensionconfig.Interface getInterfaceArray(int i);
    
    /**
     * Returns number of "interface" element
     */
    int sizeOfInterfaceArray();
    
    /**
     * Sets array of all "interface" element
     */
    void setInterfaceArray(org.apache.xml.xmlbeans.x2004.x02.xbean.config.Extensionconfig.Interface[] xinterfaceArray);
    
    /**
     * Sets ith "interface" element
     */
    void setInterfaceArray(int i, org.apache.xml.xmlbeans.x2004.x02.xbean.config.Extensionconfig.Interface xinterface);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "interface" element
     */
    org.apache.xml.xmlbeans.x2004.x02.xbean.config.Extensionconfig.Interface insertNewInterface(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "interface" element
     */
    org.apache.xml.xmlbeans.x2004.x02.xbean.config.Extensionconfig.Interface addNewInterface();
    
    /**
     * Removes the ith "interface" element
     */
    void removeInterface(int i);
    
    /**
     * Gets the "prePostSet" element
     */
    org.apache.xml.xmlbeans.x2004.x02.xbean.config.Extensionconfig.PrePostSet getPrePostSet();
    
    /**
     * True if has "prePostSet" element
     */
    boolean isSetPrePostSet();
    
    /**
     * Sets the "prePostSet" element
     */
    void setPrePostSet(org.apache.xml.xmlbeans.x2004.x02.xbean.config.Extensionconfig.PrePostSet prePostSet);
    
    /**
     * Appends and returns a new empty "prePostSet" element
     */
    org.apache.xml.xmlbeans.x2004.x02.xbean.config.Extensionconfig.PrePostSet addNewPrePostSet();
    
    /**
     * Unsets the "prePostSet" element
     */
    void unsetPrePostSet();
    
    /**
     * Gets the "for" attribute
     */
    java.lang.Object getFor();
    
    /**
     * Gets (as xml) the "for" attribute
     */
    org.apache.xml.xmlbeans.x2004.x02.xbean.config.JavaNameList xgetFor();
    
    /**
     * True if has "for" attribute
     */
    boolean isSetFor();
    
    /**
     * Sets the "for" attribute
     */
    void setFor(java.lang.Object xfor);
    
    /**
     * Sets (as xml) the "for" attribute
     */
    void xsetFor(org.apache.xml.xmlbeans.x2004.x02.xbean.config.JavaNameList xfor);
    
    /**
     * Unsets the "for" attribute
     */
    void unsetFor();
    
    /**
     * An XML interface(@http://xml.apache.org/xmlbeans/2004/02/xbean/config).
     *
     * This is a complex type.
     */
    public interface Interface extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)schema.system.sXMLCONFIG.TypeSystemHolder.typeSystem.resolveHandle("interface02a7elemtype");
        
        /**
         * Gets the "staticHandler" element
         */
        java.lang.String getStaticHandler();
        
        /**
         * Gets (as xml) the "staticHandler" element
         */
        org.apache.xmlbeans.XmlString xgetStaticHandler();
        
        /**
         * Sets the "staticHandler" element
         */
        void setStaticHandler(java.lang.String staticHandler);
        
        /**
         * Sets (as xml) the "staticHandler" element
         */
        void xsetStaticHandler(org.apache.xmlbeans.XmlString staticHandler);
        
        /**
         * Gets the "name" attribute
         */
        java.lang.String getName();
        
        /**
         * Gets (as xml) the "name" attribute
         */
        org.apache.xmlbeans.XmlString xgetName();
        
        /**
         * True if has "name" attribute
         */
        boolean isSetName();
        
        /**
         * Sets the "name" attribute
         */
        void setName(java.lang.String name);
        
        /**
         * Sets (as xml) the "name" attribute
         */
        void xsetName(org.apache.xmlbeans.XmlString name);
        
        /**
         * Unsets the "name" attribute
         */
        void unsetName();
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static org.apache.xml.xmlbeans.x2004.x02.xbean.config.Extensionconfig.Interface newInstance() {
              return (org.apache.xml.xmlbeans.x2004.x02.xbean.config.Extensionconfig.Interface) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static org.apache.xml.xmlbeans.x2004.x02.xbean.config.Extensionconfig.Interface newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (org.apache.xml.xmlbeans.x2004.x02.xbean.config.Extensionconfig.Interface) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * An XML prePostSet(@http://xml.apache.org/xmlbeans/2004/02/xbean/config).
     *
     * This is a complex type.
     */
    public interface PrePostSet extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)schema.system.sXMLCONFIG.TypeSystemHolder.typeSystem.resolveHandle("prepostset5c9delemtype");
        
        /**
         * Gets the "staticHandler" element
         */
        java.lang.String getStaticHandler();
        
        /**
         * Gets (as xml) the "staticHandler" element
         */
        org.apache.xmlbeans.XmlString xgetStaticHandler();
        
        /**
         * Sets the "staticHandler" element
         */
        void setStaticHandler(java.lang.String staticHandler);
        
        /**
         * Sets (as xml) the "staticHandler" element
         */
        void xsetStaticHandler(org.apache.xmlbeans.XmlString staticHandler);
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static org.apache.xml.xmlbeans.x2004.x02.xbean.config.Extensionconfig.PrePostSet newInstance() {
              return (org.apache.xml.xmlbeans.x2004.x02.xbean.config.Extensionconfig.PrePostSet) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static org.apache.xml.xmlbeans.x2004.x02.xbean.config.Extensionconfig.PrePostSet newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (org.apache.xml.xmlbeans.x2004.x02.xbean.config.Extensionconfig.PrePostSet) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static org.apache.xml.xmlbeans.x2004.x02.xbean.config.Extensionconfig newInstance() {
          return (org.apache.xml.xmlbeans.x2004.x02.xbean.config.Extensionconfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static org.apache.xml.xmlbeans.x2004.x02.xbean.config.Extensionconfig newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (org.apache.xml.xmlbeans.x2004.x02.xbean.config.Extensionconfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        public static org.apache.xml.xmlbeans.x2004.x02.xbean.config.Extensionconfig parse(java.lang.String s) throws org.apache.xmlbeans.XmlException {
          return (org.apache.xml.xmlbeans.x2004.x02.xbean.config.Extensionconfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( s, type, null ); }
        
        public static org.apache.xml.xmlbeans.x2004.x02.xbean.config.Extensionconfig parse(java.lang.String s, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.apache.xml.xmlbeans.x2004.x02.xbean.config.Extensionconfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( s, type, options ); }
        
        public static org.apache.xml.xmlbeans.x2004.x02.xbean.config.Extensionconfig parse(java.io.File f) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.apache.xml.xmlbeans.x2004.x02.xbean.config.Extensionconfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( f, type, null ); }
        
        public static org.apache.xml.xmlbeans.x2004.x02.xbean.config.Extensionconfig parse(java.io.File f, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.apache.xml.xmlbeans.x2004.x02.xbean.config.Extensionconfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( f, type, options ); }
        
        public static org.apache.xml.xmlbeans.x2004.x02.xbean.config.Extensionconfig parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.apache.xml.xmlbeans.x2004.x02.xbean.config.Extensionconfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static org.apache.xml.xmlbeans.x2004.x02.xbean.config.Extensionconfig parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.apache.xml.xmlbeans.x2004.x02.xbean.config.Extensionconfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static org.apache.xml.xmlbeans.x2004.x02.xbean.config.Extensionconfig parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.apache.xml.xmlbeans.x2004.x02.xbean.config.Extensionconfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static org.apache.xml.xmlbeans.x2004.x02.xbean.config.Extensionconfig parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.apache.xml.xmlbeans.x2004.x02.xbean.config.Extensionconfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static org.apache.xml.xmlbeans.x2004.x02.xbean.config.Extensionconfig parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.apache.xml.xmlbeans.x2004.x02.xbean.config.Extensionconfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static org.apache.xml.xmlbeans.x2004.x02.xbean.config.Extensionconfig parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.apache.xml.xmlbeans.x2004.x02.xbean.config.Extensionconfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static org.apache.xml.xmlbeans.x2004.x02.xbean.config.Extensionconfig parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (org.apache.xml.xmlbeans.x2004.x02.xbean.config.Extensionconfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static org.apache.xml.xmlbeans.x2004.x02.xbean.config.Extensionconfig parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.apache.xml.xmlbeans.x2004.x02.xbean.config.Extensionconfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        public static org.apache.xml.xmlbeans.x2004.x02.xbean.config.Extensionconfig parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.apache.xml.xmlbeans.x2004.x02.xbean.config.Extensionconfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        public static org.apache.xml.xmlbeans.x2004.x02.xbean.config.Extensionconfig parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.apache.xml.xmlbeans.x2004.x02.xbean.config.Extensionconfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
