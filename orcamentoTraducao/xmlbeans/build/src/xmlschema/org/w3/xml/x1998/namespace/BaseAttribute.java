/*
 * An XML attribute type.
 * Localname: base
 * Namespace: http://www.w3.org/XML/1998/namespace
 * Java type: org.w3.xml.x1998.namespace.BaseAttribute
 *
 * Automatically generated - do not modify.
 */
package org.w3.xml.x1998.namespace;


/**
 * A document containing one base(@http://www.w3.org/XML/1998/namespace) attribute.
 *
 * This is a complex type.
 */
public interface BaseAttribute extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)schema.system.sXMLLANG.TypeSystemHolder.typeSystem.resolveHandle("basece23attrtypetype");
    
    /**
     * Gets the "base" attribute
     */
    java.lang.String getBase();
    
    /**
     * Gets (as xml) the "base" attribute
     */
    org.apache.xmlbeans.XmlAnyURI xgetBase();
    
    /**
     * True if has "base" attribute
     */
    boolean isSetBase();
    
    /**
     * Sets the "base" attribute
     */
    void setBase(java.lang.String base);
    
    /**
     * Sets (as xml) the "base" attribute
     */
    void xsetBase(org.apache.xmlbeans.XmlAnyURI base);
    
    /**
     * Unsets the "base" attribute
     */
    void unsetBase();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static org.w3.xml.x1998.namespace.BaseAttribute newInstance() {
          return (org.w3.xml.x1998.namespace.BaseAttribute) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static org.w3.xml.x1998.namespace.BaseAttribute newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (org.w3.xml.x1998.namespace.BaseAttribute) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        public static org.w3.xml.x1998.namespace.BaseAttribute parse(java.lang.String s) throws org.apache.xmlbeans.XmlException {
          return (org.w3.xml.x1998.namespace.BaseAttribute) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( s, type, null ); }
        
        public static org.w3.xml.x1998.namespace.BaseAttribute parse(java.lang.String s, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.w3.xml.x1998.namespace.BaseAttribute) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( s, type, options ); }
        
        public static org.w3.xml.x1998.namespace.BaseAttribute parse(java.io.File f) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.w3.xml.x1998.namespace.BaseAttribute) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( f, type, null ); }
        
        public static org.w3.xml.x1998.namespace.BaseAttribute parse(java.io.File f, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.w3.xml.x1998.namespace.BaseAttribute) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( f, type, options ); }
        
        public static org.w3.xml.x1998.namespace.BaseAttribute parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.w3.xml.x1998.namespace.BaseAttribute) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static org.w3.xml.x1998.namespace.BaseAttribute parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.w3.xml.x1998.namespace.BaseAttribute) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static org.w3.xml.x1998.namespace.BaseAttribute parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.w3.xml.x1998.namespace.BaseAttribute) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static org.w3.xml.x1998.namespace.BaseAttribute parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.w3.xml.x1998.namespace.BaseAttribute) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static org.w3.xml.x1998.namespace.BaseAttribute parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.w3.xml.x1998.namespace.BaseAttribute) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static org.w3.xml.x1998.namespace.BaseAttribute parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.w3.xml.x1998.namespace.BaseAttribute) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static org.w3.xml.x1998.namespace.BaseAttribute parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (org.w3.xml.x1998.namespace.BaseAttribute) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static org.w3.xml.x1998.namespace.BaseAttribute parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.w3.xml.x1998.namespace.BaseAttribute) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        public static org.w3.xml.x1998.namespace.BaseAttribute parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.w3.xml.x1998.namespace.BaseAttribute) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        public static org.w3.xml.x1998.namespace.BaseAttribute parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.w3.xml.x1998.namespace.BaseAttribute) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
