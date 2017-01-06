/*
 * An XML document type.
 * Localname: field
 * Namespace: http://www.w3.org/2001/XMLSchema
 * Java type: org.w3.x2001.xmlSchema.FieldDocument
 *
 * Automatically generated - do not modify.
 */
package org.w3.x2001.xmlSchema;


/**
 * A document containing one field(@http://www.w3.org/2001/XMLSchema) element.
 *
 * This is a complex type.
 */
public interface FieldDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)schema.system.sXMLSCHEMA.TypeSystemHolder.typeSystem.resolveHandle("field3f9bdoctype");
    
    /**
     * Gets the "field" element
     */
    org.w3.x2001.xmlSchema.FieldDocument.Field getField();
    
    /**
     * Sets the "field" element
     */
    void setField(org.w3.x2001.xmlSchema.FieldDocument.Field field);
    
    /**
     * Appends and returns a new empty "field" element
     */
    org.w3.x2001.xmlSchema.FieldDocument.Field addNewField();
    
    /**
     * An XML field(@http://www.w3.org/2001/XMLSchema).
     *
     * This is a complex type.
     */
    public interface Field extends org.w3.x2001.xmlSchema.Annotated
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)schema.system.sXMLSCHEMA.TypeSystemHolder.typeSystem.resolveHandle("field12f5elemtype");
        
        /**
         * Gets the "xpath" attribute
         */
        java.lang.String getXpath();
        
        /**
         * Gets (as xml) the "xpath" attribute
         */
        org.w3.x2001.xmlSchema.FieldDocument.Field.Xpath xgetXpath();
        
        /**
         * Sets the "xpath" attribute
         */
        void setXpath(java.lang.String xpath);
        
        /**
         * Sets (as xml) the "xpath" attribute
         */
        void xsetXpath(org.w3.x2001.xmlSchema.FieldDocument.Field.Xpath xpath);
        
        /**
         * An XML xpath(@).
         *
         * This is an atomic type that is a restriction of org.apache.xmlbeans.XmlToken.
         */
        public interface Xpath extends org.apache.xmlbeans.XmlToken
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)schema.system.sXMLSCHEMA.TypeSystemHolder.typeSystem.resolveHandle("xpath7f90attrtype");
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static org.w3.x2001.xmlSchema.FieldDocument.Field.Xpath newValue(java.lang.Object obj) {
                  return (org.w3.x2001.xmlSchema.FieldDocument.Field.Xpath) type.newValue( obj ); }
                
                public static org.w3.x2001.xmlSchema.FieldDocument.Field.Xpath newInstance() {
                  return (org.w3.x2001.xmlSchema.FieldDocument.Field.Xpath) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static org.w3.x2001.xmlSchema.FieldDocument.Field.Xpath newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (org.w3.x2001.xmlSchema.FieldDocument.Field.Xpath) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static org.w3.x2001.xmlSchema.FieldDocument.Field newInstance() {
              return (org.w3.x2001.xmlSchema.FieldDocument.Field) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static org.w3.x2001.xmlSchema.FieldDocument.Field newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (org.w3.x2001.xmlSchema.FieldDocument.Field) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static org.w3.x2001.xmlSchema.FieldDocument newInstance() {
          return (org.w3.x2001.xmlSchema.FieldDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static org.w3.x2001.xmlSchema.FieldDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (org.w3.x2001.xmlSchema.FieldDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        public static org.w3.x2001.xmlSchema.FieldDocument parse(java.lang.String s) throws org.apache.xmlbeans.XmlException {
          return (org.w3.x2001.xmlSchema.FieldDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( s, type, null ); }
        
        public static org.w3.x2001.xmlSchema.FieldDocument parse(java.lang.String s, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.w3.x2001.xmlSchema.FieldDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( s, type, options ); }
        
        public static org.w3.x2001.xmlSchema.FieldDocument parse(java.io.File f) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.w3.x2001.xmlSchema.FieldDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( f, type, null ); }
        
        public static org.w3.x2001.xmlSchema.FieldDocument parse(java.io.File f, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.w3.x2001.xmlSchema.FieldDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( f, type, options ); }
        
        public static org.w3.x2001.xmlSchema.FieldDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.w3.x2001.xmlSchema.FieldDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static org.w3.x2001.xmlSchema.FieldDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.w3.x2001.xmlSchema.FieldDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static org.w3.x2001.xmlSchema.FieldDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.w3.x2001.xmlSchema.FieldDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static org.w3.x2001.xmlSchema.FieldDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.w3.x2001.xmlSchema.FieldDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static org.w3.x2001.xmlSchema.FieldDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.w3.x2001.xmlSchema.FieldDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static org.w3.x2001.xmlSchema.FieldDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.w3.x2001.xmlSchema.FieldDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static org.w3.x2001.xmlSchema.FieldDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (org.w3.x2001.xmlSchema.FieldDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static org.w3.x2001.xmlSchema.FieldDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.w3.x2001.xmlSchema.FieldDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        public static org.w3.x2001.xmlSchema.FieldDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.w3.x2001.xmlSchema.FieldDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        public static org.w3.x2001.xmlSchema.FieldDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.w3.x2001.xmlSchema.FieldDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
