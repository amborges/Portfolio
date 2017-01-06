/*
 * XML Type:  groupRef
 * Namespace: http://www.w3.org/2001/XMLSchema
 * Java type: org.w3.x2001.xmlSchema.GroupRef
 *
 * Automatically generated - do not modify.
 */
package org.w3.x2001.xmlSchema;


/**
 * An XML groupRef(@http://www.w3.org/2001/XMLSchema).
 *
 * This is a complex type.
 */
public interface GroupRef extends org.w3.x2001.xmlSchema.RealGroup
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)schema.system.sXMLSCHEMA.TypeSystemHolder.typeSystem.resolveHandle("groupref303ftype");
    
    /**
     * Gets the "ref" attribute
     */
    javax.xml.namespace.QName getRef();
    
    /**
     * Gets (as xml) the "ref" attribute
     */
    org.apache.xmlbeans.XmlQName xgetRef();
    
    /**
     * True if has "ref" attribute
     */
    boolean isSetRef();
    
    /**
     * Sets the "ref" attribute
     */
    void setRef(javax.xml.namespace.QName ref);
    
    /**
     * Sets (as xml) the "ref" attribute
     */
    void xsetRef(org.apache.xmlbeans.XmlQName ref);
    
    /**
     * Unsets the "ref" attribute
     */
    void unsetRef();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static org.w3.x2001.xmlSchema.GroupRef newInstance() {
          return (org.w3.x2001.xmlSchema.GroupRef) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static org.w3.x2001.xmlSchema.GroupRef newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (org.w3.x2001.xmlSchema.GroupRef) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        public static org.w3.x2001.xmlSchema.GroupRef parse(java.lang.String s) throws org.apache.xmlbeans.XmlException {
          return (org.w3.x2001.xmlSchema.GroupRef) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( s, type, null ); }
        
        public static org.w3.x2001.xmlSchema.GroupRef parse(java.lang.String s, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.w3.x2001.xmlSchema.GroupRef) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( s, type, options ); }
        
        public static org.w3.x2001.xmlSchema.GroupRef parse(java.io.File f) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.w3.x2001.xmlSchema.GroupRef) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( f, type, null ); }
        
        public static org.w3.x2001.xmlSchema.GroupRef parse(java.io.File f, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.w3.x2001.xmlSchema.GroupRef) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( f, type, options ); }
        
        public static org.w3.x2001.xmlSchema.GroupRef parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.w3.x2001.xmlSchema.GroupRef) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static org.w3.x2001.xmlSchema.GroupRef parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.w3.x2001.xmlSchema.GroupRef) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static org.w3.x2001.xmlSchema.GroupRef parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.w3.x2001.xmlSchema.GroupRef) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static org.w3.x2001.xmlSchema.GroupRef parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.w3.x2001.xmlSchema.GroupRef) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static org.w3.x2001.xmlSchema.GroupRef parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.w3.x2001.xmlSchema.GroupRef) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static org.w3.x2001.xmlSchema.GroupRef parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.w3.x2001.xmlSchema.GroupRef) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static org.w3.x2001.xmlSchema.GroupRef parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (org.w3.x2001.xmlSchema.GroupRef) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static org.w3.x2001.xmlSchema.GroupRef parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.w3.x2001.xmlSchema.GroupRef) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        public static org.w3.x2001.xmlSchema.GroupRef parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.w3.x2001.xmlSchema.GroupRef) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        public static org.w3.x2001.xmlSchema.GroupRef parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.w3.x2001.xmlSchema.GroupRef) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
