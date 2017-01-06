/*
 * XML Type:  elementInAll
 * Namespace: http://www.w3.org/2001/XMLSchema
 * Java type: org.w3.x2001.xmlSchema.ElementInAll
 *
 * Automatically generated - do not modify.
 */
package org.w3.x2001.xmlSchema;


/**
 * An XML elementInAll(@http://www.w3.org/2001/XMLSchema).
 *
 * This is a complex type.
 */
public interface ElementInAll extends org.w3.x2001.xmlSchema.LocalElement
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)schema.system.sXMLSCHEMA.TypeSystemHolder.typeSystem.resolveHandle("elementinall3f33type");
    
    /**
     * An XML minOccurs(@).
     *
     * This is an atomic type that is a restriction of org.apache.xmlbeans.XmlNonNegativeInteger.
     */
    public interface MinOccurs extends org.apache.xmlbeans.XmlNonNegativeInteger
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)schema.system.sXMLSCHEMA.TypeSystemHolder.typeSystem.resolveHandle("minoccursc794attrtype");
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static org.w3.x2001.xmlSchema.ElementInAll.MinOccurs newValue(java.lang.Object obj) {
              return (org.w3.x2001.xmlSchema.ElementInAll.MinOccurs) type.newValue( obj ); }
            
            public static org.w3.x2001.xmlSchema.ElementInAll.MinOccurs newInstance() {
              return (org.w3.x2001.xmlSchema.ElementInAll.MinOccurs) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static org.w3.x2001.xmlSchema.ElementInAll.MinOccurs newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (org.w3.x2001.xmlSchema.ElementInAll.MinOccurs) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * An XML maxOccurs(@).
     *
     * This is a union type. Instances are of one of the following types:
     *     org.apache.xmlbeans.XmlNonNegativeInteger
     *     org.w3.x2001.xmlSchema.AllNNI$Member
     */
    public interface MaxOccurs extends org.w3.x2001.xmlSchema.AllNNI
    {
        java.lang.Object getObjectValue();
        void setObjectValue(java.lang.Object val);
        /** @deprecated */
        java.lang.Object objectValue();
        /** @deprecated */
        void objectSet(java.lang.Object val);
        org.apache.xmlbeans.SchemaType instanceType();
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)schema.system.sXMLSCHEMA.TypeSystemHolder.typeSystem.resolveHandle("maxoccurs8526attrtype");
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static org.w3.x2001.xmlSchema.ElementInAll.MaxOccurs newValue(java.lang.Object obj) {
              return (org.w3.x2001.xmlSchema.ElementInAll.MaxOccurs) type.newValue( obj ); }
            
            public static org.w3.x2001.xmlSchema.ElementInAll.MaxOccurs newInstance() {
              return (org.w3.x2001.xmlSchema.ElementInAll.MaxOccurs) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static org.w3.x2001.xmlSchema.ElementInAll.MaxOccurs newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (org.w3.x2001.xmlSchema.ElementInAll.MaxOccurs) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static org.w3.x2001.xmlSchema.ElementInAll newInstance() {
          return (org.w3.x2001.xmlSchema.ElementInAll) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static org.w3.x2001.xmlSchema.ElementInAll newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (org.w3.x2001.xmlSchema.ElementInAll) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        public static org.w3.x2001.xmlSchema.ElementInAll parse(java.lang.String s) throws org.apache.xmlbeans.XmlException {
          return (org.w3.x2001.xmlSchema.ElementInAll) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( s, type, null ); }
        
        public static org.w3.x2001.xmlSchema.ElementInAll parse(java.lang.String s, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.w3.x2001.xmlSchema.ElementInAll) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( s, type, options ); }
        
        public static org.w3.x2001.xmlSchema.ElementInAll parse(java.io.File f) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.w3.x2001.xmlSchema.ElementInAll) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( f, type, null ); }
        
        public static org.w3.x2001.xmlSchema.ElementInAll parse(java.io.File f, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.w3.x2001.xmlSchema.ElementInAll) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( f, type, options ); }
        
        public static org.w3.x2001.xmlSchema.ElementInAll parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.w3.x2001.xmlSchema.ElementInAll) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static org.w3.x2001.xmlSchema.ElementInAll parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.w3.x2001.xmlSchema.ElementInAll) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static org.w3.x2001.xmlSchema.ElementInAll parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.w3.x2001.xmlSchema.ElementInAll) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static org.w3.x2001.xmlSchema.ElementInAll parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.w3.x2001.xmlSchema.ElementInAll) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static org.w3.x2001.xmlSchema.ElementInAll parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.w3.x2001.xmlSchema.ElementInAll) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static org.w3.x2001.xmlSchema.ElementInAll parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.w3.x2001.xmlSchema.ElementInAll) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static org.w3.x2001.xmlSchema.ElementInAll parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (org.w3.x2001.xmlSchema.ElementInAll) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static org.w3.x2001.xmlSchema.ElementInAll parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.w3.x2001.xmlSchema.ElementInAll) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        public static org.w3.x2001.xmlSchema.ElementInAll parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.w3.x2001.xmlSchema.ElementInAll) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        public static org.w3.x2001.xmlSchema.ElementInAll parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.w3.x2001.xmlSchema.ElementInAll) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
