/*
 * XML Type:  TImport
 * Namespace: http://www.apache.org/internal/xmlbeans/wsdlsubst
 * Java type: org.apache.internal.xmlbeans.wsdlsubst.TImport
 *
 * Automatically generated - do not modify.
 */
package org.apache.internal.xmlbeans.wsdlsubst;


/**
 * An XML TImport(@http://www.apache.org/internal/xmlbeans/wsdlsubst).
 *
 * This is a complex type.
 */
public interface TImport extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)schema.system.sXMLTOOLS.TypeSystemHolder.typeSystem.resolveHandle("timport22datype");
    
    /**
     * Gets the "namespace" attribute
     */
    java.lang.String getNamespace();
    
    /**
     * Gets (as xml) the "namespace" attribute
     */
    org.apache.xmlbeans.XmlAnyURI xgetNamespace();
    
    /**
     * Sets the "namespace" attribute
     */
    void setNamespace(java.lang.String namespace);
    
    /**
     * Sets (as xml) the "namespace" attribute
     */
    void xsetNamespace(org.apache.xmlbeans.XmlAnyURI namespace);
    
    /**
     * Gets the "location" attribute
     */
    java.lang.String getLocation();
    
    /**
     * Gets (as xml) the "location" attribute
     */
    org.apache.xmlbeans.XmlAnyURI xgetLocation();
    
    /**
     * Sets the "location" attribute
     */
    void setLocation(java.lang.String location);
    
    /**
     * Sets (as xml) the "location" attribute
     */
    void xsetLocation(org.apache.xmlbeans.XmlAnyURI location);
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static org.apache.internal.xmlbeans.wsdlsubst.TImport newInstance() {
          return (org.apache.internal.xmlbeans.wsdlsubst.TImport) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static org.apache.internal.xmlbeans.wsdlsubst.TImport newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (org.apache.internal.xmlbeans.wsdlsubst.TImport) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        public static org.apache.internal.xmlbeans.wsdlsubst.TImport parse(java.lang.String s) throws org.apache.xmlbeans.XmlException {
          return (org.apache.internal.xmlbeans.wsdlsubst.TImport) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( s, type, null ); }
        
        public static org.apache.internal.xmlbeans.wsdlsubst.TImport parse(java.lang.String s, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.apache.internal.xmlbeans.wsdlsubst.TImport) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( s, type, options ); }
        
        public static org.apache.internal.xmlbeans.wsdlsubst.TImport parse(java.io.File f) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.apache.internal.xmlbeans.wsdlsubst.TImport) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( f, type, null ); }
        
        public static org.apache.internal.xmlbeans.wsdlsubst.TImport parse(java.io.File f, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.apache.internal.xmlbeans.wsdlsubst.TImport) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( f, type, options ); }
        
        public static org.apache.internal.xmlbeans.wsdlsubst.TImport parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.apache.internal.xmlbeans.wsdlsubst.TImport) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static org.apache.internal.xmlbeans.wsdlsubst.TImport parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.apache.internal.xmlbeans.wsdlsubst.TImport) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static org.apache.internal.xmlbeans.wsdlsubst.TImport parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.apache.internal.xmlbeans.wsdlsubst.TImport) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static org.apache.internal.xmlbeans.wsdlsubst.TImport parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.apache.internal.xmlbeans.wsdlsubst.TImport) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static org.apache.internal.xmlbeans.wsdlsubst.TImport parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.apache.internal.xmlbeans.wsdlsubst.TImport) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static org.apache.internal.xmlbeans.wsdlsubst.TImport parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.apache.internal.xmlbeans.wsdlsubst.TImport) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static org.apache.internal.xmlbeans.wsdlsubst.TImport parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (org.apache.internal.xmlbeans.wsdlsubst.TImport) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static org.apache.internal.xmlbeans.wsdlsubst.TImport parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.apache.internal.xmlbeans.wsdlsubst.TImport) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        public static org.apache.internal.xmlbeans.wsdlsubst.TImport parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.apache.internal.xmlbeans.wsdlsubst.TImport) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        public static org.apache.internal.xmlbeans.wsdlsubst.TImport parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.apache.internal.xmlbeans.wsdlsubst.TImport) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
