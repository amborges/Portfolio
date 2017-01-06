/*
 * XML Type:  javaNameList
 * Namespace: http://xml.apache.org/xmlbeans/2004/02/xbean/config
 * Java type: org.apache.xml.xmlbeans.x2004.x02.xbean.config.JavaNameList
 *
 * Automatically generated - do not modify.
 */
package org.apache.xml.xmlbeans.x2004.x02.xbean.config;


/**
 * An XML javaNameList(@http://xml.apache.org/xmlbeans/2004/02/xbean/config).
 *
 * This is a union type. Instances are of one of the following types:
 *     org.apache.xml.xmlbeans.x2004.x02.xbean.config.JavaNameList$Member
 *     org.apache.xml.xmlbeans.x2004.x02.xbean.config.JavaNameList$Member2
 */
public interface JavaNameList extends org.apache.xmlbeans.XmlAnySimpleType
{
    java.lang.Object getObjectValue();
    void setObjectValue(java.lang.Object val);
    /** @deprecated */
    java.lang.Object objectValue();
    /** @deprecated */
    void objectSet(java.lang.Object val);
    org.apache.xmlbeans.SchemaType instanceType();
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)schema.system.sXMLCONFIG.TypeSystemHolder.typeSystem.resolveHandle("javanamelistbcfetype");
    
    /**
     * An anonymous inner XML type.
     *
     * This is an atomic type that is a restriction of org.apache.xmlbeans.XmlToken.
     */
    public interface Member extends org.apache.xmlbeans.XmlToken
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)schema.system.sXMLCONFIG.TypeSystemHolder.typeSystem.resolveHandle("anon3e39type");
        
        org.apache.xmlbeans.StringEnumAbstractBase enumValue();
        void set(org.apache.xmlbeans.StringEnumAbstractBase e);
        
        static final Enum X = Enum.forString("*");
        
        static final int INT_X = Enum.INT_X;
        
        /**
         * Enumeration value class for org.apache.xml.xmlbeans.x2004.x02.xbean.config.JavaNameList$Member.
         * These enum values can be used as follows:
         * <pre>
         * enum.toString(); // returns the string value of the enum
         * enum.intValue(); // returns an int value, useful for switches
         * // e.g., case Enum.INT_X
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
            
            static final int INT_X = 1;
            
            public static final org.apache.xmlbeans.StringEnumAbstractBase.Table table =
                new org.apache.xmlbeans.StringEnumAbstractBase.Table
            (
                new Enum[]
                {
                    new Enum("*", INT_X),
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
            public static org.apache.xml.xmlbeans.x2004.x02.xbean.config.JavaNameList.Member newValue(java.lang.Object obj) {
              return (org.apache.xml.xmlbeans.x2004.x02.xbean.config.JavaNameList.Member) type.newValue( obj ); }
            
            public static org.apache.xml.xmlbeans.x2004.x02.xbean.config.JavaNameList.Member newInstance() {
              return (org.apache.xml.xmlbeans.x2004.x02.xbean.config.JavaNameList.Member) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static org.apache.xml.xmlbeans.x2004.x02.xbean.config.JavaNameList.Member newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (org.apache.xml.xmlbeans.x2004.x02.xbean.config.JavaNameList.Member) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * An anonymous inner XML type.
     *
     * This is a list type whose items are org.apache.xml.xmlbeans.x2004.x02.xbean.config.JavaName.
     */
    public interface Member2 extends org.apache.xmlbeans.XmlAnySimpleType
    {
        java.util.List getListValue();
        java.util.List xgetListValue();
        void setListValue(java.util.List list);
        /** @deprecated */
        java.util.List listValue();
        /** @deprecated */
        java.util.List xlistValue();
        /** @deprecated */
        void set(java.util.List list);
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)schema.system.sXMLCONFIG.TypeSystemHolder.typeSystem.resolveHandle("anon3a98type");
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static org.apache.xml.xmlbeans.x2004.x02.xbean.config.JavaNameList.Member2 newValue(java.lang.Object obj) {
              return (org.apache.xml.xmlbeans.x2004.x02.xbean.config.JavaNameList.Member2) type.newValue( obj ); }
            
            public static org.apache.xml.xmlbeans.x2004.x02.xbean.config.JavaNameList.Member2 newInstance() {
              return (org.apache.xml.xmlbeans.x2004.x02.xbean.config.JavaNameList.Member2) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static org.apache.xml.xmlbeans.x2004.x02.xbean.config.JavaNameList.Member2 newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (org.apache.xml.xmlbeans.x2004.x02.xbean.config.JavaNameList.Member2) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static org.apache.xml.xmlbeans.x2004.x02.xbean.config.JavaNameList newValue(java.lang.Object obj) {
          return (org.apache.xml.xmlbeans.x2004.x02.xbean.config.JavaNameList) type.newValue( obj ); }
        
        public static org.apache.xml.xmlbeans.x2004.x02.xbean.config.JavaNameList newInstance() {
          return (org.apache.xml.xmlbeans.x2004.x02.xbean.config.JavaNameList) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static org.apache.xml.xmlbeans.x2004.x02.xbean.config.JavaNameList newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (org.apache.xml.xmlbeans.x2004.x02.xbean.config.JavaNameList) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        public static org.apache.xml.xmlbeans.x2004.x02.xbean.config.JavaNameList parse(java.lang.String s) throws org.apache.xmlbeans.XmlException {
          return (org.apache.xml.xmlbeans.x2004.x02.xbean.config.JavaNameList) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( s, type, null ); }
        
        public static org.apache.xml.xmlbeans.x2004.x02.xbean.config.JavaNameList parse(java.lang.String s, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.apache.xml.xmlbeans.x2004.x02.xbean.config.JavaNameList) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( s, type, options ); }
        
        public static org.apache.xml.xmlbeans.x2004.x02.xbean.config.JavaNameList parse(java.io.File f) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.apache.xml.xmlbeans.x2004.x02.xbean.config.JavaNameList) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( f, type, null ); }
        
        public static org.apache.xml.xmlbeans.x2004.x02.xbean.config.JavaNameList parse(java.io.File f, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.apache.xml.xmlbeans.x2004.x02.xbean.config.JavaNameList) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( f, type, options ); }
        
        public static org.apache.xml.xmlbeans.x2004.x02.xbean.config.JavaNameList parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.apache.xml.xmlbeans.x2004.x02.xbean.config.JavaNameList) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static org.apache.xml.xmlbeans.x2004.x02.xbean.config.JavaNameList parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.apache.xml.xmlbeans.x2004.x02.xbean.config.JavaNameList) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static org.apache.xml.xmlbeans.x2004.x02.xbean.config.JavaNameList parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.apache.xml.xmlbeans.x2004.x02.xbean.config.JavaNameList) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static org.apache.xml.xmlbeans.x2004.x02.xbean.config.JavaNameList parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.apache.xml.xmlbeans.x2004.x02.xbean.config.JavaNameList) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static org.apache.xml.xmlbeans.x2004.x02.xbean.config.JavaNameList parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.apache.xml.xmlbeans.x2004.x02.xbean.config.JavaNameList) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static org.apache.xml.xmlbeans.x2004.x02.xbean.config.JavaNameList parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.apache.xml.xmlbeans.x2004.x02.xbean.config.JavaNameList) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static org.apache.xml.xmlbeans.x2004.x02.xbean.config.JavaNameList parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (org.apache.xml.xmlbeans.x2004.x02.xbean.config.JavaNameList) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static org.apache.xml.xmlbeans.x2004.x02.xbean.config.JavaNameList parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.apache.xml.xmlbeans.x2004.x02.xbean.config.JavaNameList) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        public static org.apache.xml.xmlbeans.x2004.x02.xbean.config.JavaNameList parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.apache.xml.xmlbeans.x2004.x02.xbean.config.JavaNameList) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        public static org.apache.xml.xmlbeans.x2004.x02.xbean.config.JavaNameList parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.apache.xml.xmlbeans.x2004.x02.xbean.config.JavaNameList) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
