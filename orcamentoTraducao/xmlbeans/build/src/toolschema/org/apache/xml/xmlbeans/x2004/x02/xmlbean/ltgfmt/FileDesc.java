/*
 * XML Type:  file-desc
 * Namespace: http://xml.apache.org/xmlbeans/2004/02/xmlbean/ltgfmt
 * Java type: org.apache.xml.xmlbeans.x2004.x02.xmlbean.ltgfmt.FileDesc
 *
 * Automatically generated - do not modify.
 */
package org.apache.xml.xmlbeans.x2004.x02.xmlbean.ltgfmt;


/**
 * An XML file-desc(@http://xml.apache.org/xmlbeans/2004/02/xmlbean/ltgfmt).
 *
 * This is a complex type.
 */
public interface FileDesc extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)schema.system.sXMLTOOLS.TypeSystemHolder.typeSystem.resolveHandle("filedesc5b10type");
    
    /**
     * Gets the "tsDir" attribute
     */
    java.lang.String getTsDir();
    
    /**
     * Gets (as xml) the "tsDir" attribute
     */
    org.apache.xmlbeans.XmlToken xgetTsDir();
    
    /**
     * True if has "tsDir" attribute
     */
    boolean isSetTsDir();
    
    /**
     * Sets the "tsDir" attribute
     */
    void setTsDir(java.lang.String tsDir);
    
    /**
     * Sets (as xml) the "tsDir" attribute
     */
    void xsetTsDir(org.apache.xmlbeans.XmlToken tsDir);
    
    /**
     * Unsets the "tsDir" attribute
     */
    void unsetTsDir();
    
    /**
     * Gets the "folder" attribute
     */
    java.lang.String getFolder();
    
    /**
     * Gets (as xml) the "folder" attribute
     */
    org.apache.xmlbeans.XmlToken xgetFolder();
    
    /**
     * True if has "folder" attribute
     */
    boolean isSetFolder();
    
    /**
     * Sets the "folder" attribute
     */
    void setFolder(java.lang.String folder);
    
    /**
     * Sets (as xml) the "folder" attribute
     */
    void xsetFolder(org.apache.xmlbeans.XmlToken folder);
    
    /**
     * Unsets the "folder" attribute
     */
    void unsetFolder();
    
    /**
     * Gets the "fileName" attribute
     */
    java.lang.String getFileName();
    
    /**
     * Gets (as xml) the "fileName" attribute
     */
    org.apache.xmlbeans.XmlToken xgetFileName();
    
    /**
     * True if has "fileName" attribute
     */
    boolean isSetFileName();
    
    /**
     * Sets the "fileName" attribute
     */
    void setFileName(java.lang.String fileName);
    
    /**
     * Sets (as xml) the "fileName" attribute
     */
    void xsetFileName(org.apache.xmlbeans.XmlToken fileName);
    
    /**
     * Unsets the "fileName" attribute
     */
    void unsetFileName();
    
    /**
     * Gets the "role" attribute
     */
    org.apache.xml.xmlbeans.x2004.x02.xmlbean.ltgfmt.FileDesc.Role.Enum getRole();
    
    /**
     * Gets (as xml) the "role" attribute
     */
    org.apache.xml.xmlbeans.x2004.x02.xmlbean.ltgfmt.FileDesc.Role xgetRole();
    
    /**
     * True if has "role" attribute
     */
    boolean isSetRole();
    
    /**
     * Sets the "role" attribute
     */
    void setRole(org.apache.xml.xmlbeans.x2004.x02.xmlbean.ltgfmt.FileDesc.Role.Enum role);
    
    /**
     * Sets (as xml) the "role" attribute
     */
    void xsetRole(org.apache.xml.xmlbeans.x2004.x02.xmlbean.ltgfmt.FileDesc.Role role);
    
    /**
     * Unsets the "role" attribute
     */
    void unsetRole();
    
    /**
     * Gets the "validity" attribute
     */
    boolean getValidity();
    
    /**
     * Gets (as xml) the "validity" attribute
     */
    org.apache.xmlbeans.XmlBoolean xgetValidity();
    
    /**
     * True if has "validity" attribute
     */
    boolean isSetValidity();
    
    /**
     * Sets the "validity" attribute
     */
    void setValidity(boolean validity);
    
    /**
     * Sets (as xml) the "validity" attribute
     */
    void xsetValidity(org.apache.xmlbeans.XmlBoolean validity);
    
    /**
     * Unsets the "validity" attribute
     */
    void unsetValidity();
    
    /**
     * An XML role(@).
     *
     * This is an atomic type that is a restriction of org.apache.xmlbeans.XmlToken.
     */
    public interface Role extends org.apache.xmlbeans.XmlToken
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)schema.system.sXMLTOOLS.TypeSystemHolder.typeSystem.resolveHandle("role7826attrtype");
        
        org.apache.xmlbeans.StringEnumAbstractBase enumValue();
        void set(org.apache.xmlbeans.StringEnumAbstractBase e);
        
        static final Enum SCHEMA = Enum.forString("schema");
        static final Enum INSTANCE = Enum.forString("instance");
        static final Enum RESOURCE = Enum.forString("resource");
        
        static final int INT_SCHEMA = Enum.INT_SCHEMA;
        static final int INT_INSTANCE = Enum.INT_INSTANCE;
        static final int INT_RESOURCE = Enum.INT_RESOURCE;
        
        /**
         * Enumeration value class for org.apache.xml.xmlbeans.x2004.x02.xmlbean.ltgfmt.FileDesc$Role.
         * These enum values can be used as follows:
         * <pre>
         * enum.toString(); // returns the string value of the enum
         * enum.intValue(); // returns an int value, useful for switches
         * // e.g., case Enum.INT_SCHEMA
         * Enum.forString(s); // returns the enum value for a string
         * Enum.forInt(i); // returns the enum value for an int
         * </pre>
         * Enumeration objects are immutable singleton objects that
         * can be compared using == object equality. They have no
         * public constructor. See the constants defined within this
         * class for all the valid values.
         */
        static final class Enum extends org.apache.xmlbeans.StringEnumAbstractBase
        {
            /**
             * Returns the enum value for a string, or null if none.
             */
            public static Enum forString(java.lang.String s)
                { return (Enum)table.forString(s); }
            /**
             * Returns the enum value corresponding to an int, or null if none.
             */
            public static Enum forInt(int i)
                { return (Enum)table.forInt(i); }
            
            private Enum(java.lang.String s, int i)
                { super(s, i); }
            
            static final int INT_SCHEMA = 1;
            static final int INT_INSTANCE = 2;
            static final int INT_RESOURCE = 3;
            
            public static final org.apache.xmlbeans.StringEnumAbstractBase.Table table =
                new org.apache.xmlbeans.StringEnumAbstractBase.Table
            (
                new Enum[]
                {
                    new Enum("schema", INT_SCHEMA),
                    new Enum("instance", INT_INSTANCE),
                    new Enum("resource", INT_RESOURCE),
                }
            );
            private static final long serialVersionUID = 1L;
            private java.lang.Object readResolve() { return forInt(intValue()); } 
        }
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static org.apache.xml.xmlbeans.x2004.x02.xmlbean.ltgfmt.FileDesc.Role newValue(java.lang.Object obj) {
              return (org.apache.xml.xmlbeans.x2004.x02.xmlbean.ltgfmt.FileDesc.Role) type.newValue( obj ); }
            
            public static org.apache.xml.xmlbeans.x2004.x02.xmlbean.ltgfmt.FileDesc.Role newInstance() {
              return (org.apache.xml.xmlbeans.x2004.x02.xmlbean.ltgfmt.FileDesc.Role) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static org.apache.xml.xmlbeans.x2004.x02.xmlbean.ltgfmt.FileDesc.Role newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (org.apache.xml.xmlbeans.x2004.x02.xmlbean.ltgfmt.FileDesc.Role) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static org.apache.xml.xmlbeans.x2004.x02.xmlbean.ltgfmt.FileDesc newInstance() {
          return (org.apache.xml.xmlbeans.x2004.x02.xmlbean.ltgfmt.FileDesc) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static org.apache.xml.xmlbeans.x2004.x02.xmlbean.ltgfmt.FileDesc newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (org.apache.xml.xmlbeans.x2004.x02.xmlbean.ltgfmt.FileDesc) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        public static org.apache.xml.xmlbeans.x2004.x02.xmlbean.ltgfmt.FileDesc parse(java.lang.String s) throws org.apache.xmlbeans.XmlException {
          return (org.apache.xml.xmlbeans.x2004.x02.xmlbean.ltgfmt.FileDesc) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( s, type, null ); }
        
        public static org.apache.xml.xmlbeans.x2004.x02.xmlbean.ltgfmt.FileDesc parse(java.lang.String s, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.apache.xml.xmlbeans.x2004.x02.xmlbean.ltgfmt.FileDesc) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( s, type, options ); }
        
        public static org.apache.xml.xmlbeans.x2004.x02.xmlbean.ltgfmt.FileDesc parse(java.io.File f) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.apache.xml.xmlbeans.x2004.x02.xmlbean.ltgfmt.FileDesc) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( f, type, null ); }
        
        public static org.apache.xml.xmlbeans.x2004.x02.xmlbean.ltgfmt.FileDesc parse(java.io.File f, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.apache.xml.xmlbeans.x2004.x02.xmlbean.ltgfmt.FileDesc) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( f, type, options ); }
        
        public static org.apache.xml.xmlbeans.x2004.x02.xmlbean.ltgfmt.FileDesc parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.apache.xml.xmlbeans.x2004.x02.xmlbean.ltgfmt.FileDesc) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static org.apache.xml.xmlbeans.x2004.x02.xmlbean.ltgfmt.FileDesc parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.apache.xml.xmlbeans.x2004.x02.xmlbean.ltgfmt.FileDesc) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static org.apache.xml.xmlbeans.x2004.x02.xmlbean.ltgfmt.FileDesc parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.apache.xml.xmlbeans.x2004.x02.xmlbean.ltgfmt.FileDesc) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static org.apache.xml.xmlbeans.x2004.x02.xmlbean.ltgfmt.FileDesc parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.apache.xml.xmlbeans.x2004.x02.xmlbean.ltgfmt.FileDesc) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static org.apache.xml.xmlbeans.x2004.x02.xmlbean.ltgfmt.FileDesc parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.apache.xml.xmlbeans.x2004.x02.xmlbean.ltgfmt.FileDesc) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static org.apache.xml.xmlbeans.x2004.x02.xmlbean.ltgfmt.FileDesc parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.apache.xml.xmlbeans.x2004.x02.xmlbean.ltgfmt.FileDesc) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static org.apache.xml.xmlbeans.x2004.x02.xmlbean.ltgfmt.FileDesc parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (org.apache.xml.xmlbeans.x2004.x02.xmlbean.ltgfmt.FileDesc) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static org.apache.xml.xmlbeans.x2004.x02.xmlbean.ltgfmt.FileDesc parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.apache.xml.xmlbeans.x2004.x02.xmlbean.ltgfmt.FileDesc) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        public static org.apache.xml.xmlbeans.x2004.x02.xmlbean.ltgfmt.FileDesc parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.apache.xml.xmlbeans.x2004.x02.xmlbean.ltgfmt.FileDesc) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        public static org.apache.xml.xmlbeans.x2004.x02.xmlbean.ltgfmt.FileDesc parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.apache.xml.xmlbeans.x2004.x02.xmlbean.ltgfmt.FileDesc) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
