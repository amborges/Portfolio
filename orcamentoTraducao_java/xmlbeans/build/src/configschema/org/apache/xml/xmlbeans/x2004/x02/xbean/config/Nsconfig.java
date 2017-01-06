/*
 * XML Type:  nsconfig
 * Namespace: http://xml.apache.org/xmlbeans/2004/02/xbean/config
 * Java type: org.apache.xml.xmlbeans.x2004.x02.xbean.config.Nsconfig
 *
 * Automatically generated - do not modify.
 */
package org.apache.xml.xmlbeans.x2004.x02.xbean.config;


/**
 * An XML nsconfig(@http://xml.apache.org/xmlbeans/2004/02/xbean/config).
 *
 * This is a complex type.
 */
public interface Nsconfig extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)schema.system.sXMLCONFIG.TypeSystemHolder.typeSystem.resolveHandle("nsconfigaebatype");
    
    /**
     * Gets the "package" element
     */
    java.lang.String getPackage();
    
    /**
     * Gets (as xml) the "package" element
     */
    org.apache.xmlbeans.XmlString xgetPackage();
    
    /**
     * True if has "package" element
     */
    boolean isSetPackage();
    
    /**
     * Sets the "package" element
     */
    void setPackage(java.lang.String xpackage);
    
    /**
     * Sets (as xml) the "package" element
     */
    void xsetPackage(org.apache.xmlbeans.XmlString xpackage);
    
    /**
     * Unsets the "package" element
     */
    void unsetPackage();
    
    /**
     * Gets the "prefix" element
     */
    java.lang.String getPrefix();
    
    /**
     * Gets (as xml) the "prefix" element
     */
    org.apache.xmlbeans.XmlString xgetPrefix();
    
    /**
     * True if has "prefix" element
     */
    boolean isSetPrefix();
    
    /**
     * Sets the "prefix" element
     */
    void setPrefix(java.lang.String prefix);
    
    /**
     * Sets (as xml) the "prefix" element
     */
    void xsetPrefix(org.apache.xmlbeans.XmlString prefix);
    
    /**
     * Unsets the "prefix" element
     */
    void unsetPrefix();
    
    /**
     * Gets the "suffix" element
     */
    java.lang.String getSuffix();
    
    /**
     * Gets (as xml) the "suffix" element
     */
    org.apache.xmlbeans.XmlString xgetSuffix();
    
    /**
     * True if has "suffix" element
     */
    boolean isSetSuffix();
    
    /**
     * Sets the "suffix" element
     */
    void setSuffix(java.lang.String suffix);
    
    /**
     * Sets (as xml) the "suffix" element
     */
    void xsetSuffix(org.apache.xmlbeans.XmlString suffix);
    
    /**
     * Unsets the "suffix" element
     */
    void unsetSuffix();
    
    /**
     * Gets the "uri" attribute
     */
    java.lang.Object getUri();
    
    /**
     * Gets (as xml) the "uri" attribute
     */
    org.apache.xml.xmlbeans.x2004.x02.xbean.config.NamespaceList xgetUri();
    
    /**
     * True if has "uri" attribute
     */
    boolean isSetUri();
    
    /**
     * Sets the "uri" attribute
     */
    void setUri(java.lang.Object uri);
    
    /**
     * Sets (as xml) the "uri" attribute
     */
    void xsetUri(org.apache.xml.xmlbeans.x2004.x02.xbean.config.NamespaceList uri);
    
    /**
     * Unsets the "uri" attribute
     */
    void unsetUri();
    
    /**
     * Gets the "uriprefix" attribute
     */
    java.util.List getUriprefix();
    
    /**
     * Gets (as xml) the "uriprefix" attribute
     */
    org.apache.xml.xmlbeans.x2004.x02.xbean.config.NamespacePrefixList xgetUriprefix();
    
    /**
     * True if has "uriprefix" attribute
     */
    boolean isSetUriprefix();
    
    /**
     * Sets the "uriprefix" attribute
     */
    void setUriprefix(java.util.List uriprefix);
    
    /**
     * Sets (as xml) the "uriprefix" attribute
     */
    void xsetUriprefix(org.apache.xml.xmlbeans.x2004.x02.xbean.config.NamespacePrefixList uriprefix);
    
    /**
     * Unsets the "uriprefix" attribute
     */
    void unsetUriprefix();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static org.apache.xml.xmlbeans.x2004.x02.xbean.config.Nsconfig newInstance() {
          return (org.apache.xml.xmlbeans.x2004.x02.xbean.config.Nsconfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static org.apache.xml.xmlbeans.x2004.x02.xbean.config.Nsconfig newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (org.apache.xml.xmlbeans.x2004.x02.xbean.config.Nsconfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        public static org.apache.xml.xmlbeans.x2004.x02.xbean.config.Nsconfig parse(java.lang.String s) throws org.apache.xmlbeans.XmlException {
          return (org.apache.xml.xmlbeans.x2004.x02.xbean.config.Nsconfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( s, type, null ); }
        
        public static org.apache.xml.xmlbeans.x2004.x02.xbean.config.Nsconfig parse(java.lang.String s, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.apache.xml.xmlbeans.x2004.x02.xbean.config.Nsconfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( s, type, options ); }
        
        public static org.apache.xml.xmlbeans.x2004.x02.xbean.config.Nsconfig parse(java.io.File f) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.apache.xml.xmlbeans.x2004.x02.xbean.config.Nsconfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( f, type, null ); }
        
        public static org.apache.xml.xmlbeans.x2004.x02.xbean.config.Nsconfig parse(java.io.File f, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.apache.xml.xmlbeans.x2004.x02.xbean.config.Nsconfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( f, type, options ); }
        
        public static org.apache.xml.xmlbeans.x2004.x02.xbean.config.Nsconfig parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.apache.xml.xmlbeans.x2004.x02.xbean.config.Nsconfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static org.apache.xml.xmlbeans.x2004.x02.xbean.config.Nsconfig parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.apache.xml.xmlbeans.x2004.x02.xbean.config.Nsconfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static org.apache.xml.xmlbeans.x2004.x02.xbean.config.Nsconfig parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.apache.xml.xmlbeans.x2004.x02.xbean.config.Nsconfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static org.apache.xml.xmlbeans.x2004.x02.xbean.config.Nsconfig parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.apache.xml.xmlbeans.x2004.x02.xbean.config.Nsconfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static org.apache.xml.xmlbeans.x2004.x02.xbean.config.Nsconfig parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.apache.xml.xmlbeans.x2004.x02.xbean.config.Nsconfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static org.apache.xml.xmlbeans.x2004.x02.xbean.config.Nsconfig parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.apache.xml.xmlbeans.x2004.x02.xbean.config.Nsconfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static org.apache.xml.xmlbeans.x2004.x02.xbean.config.Nsconfig parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (org.apache.xml.xmlbeans.x2004.x02.xbean.config.Nsconfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static org.apache.xml.xmlbeans.x2004.x02.xbean.config.Nsconfig parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.apache.xml.xmlbeans.x2004.x02.xbean.config.Nsconfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        public static org.apache.xml.xmlbeans.x2004.x02.xbean.config.Nsconfig parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.apache.xml.xmlbeans.x2004.x02.xbean.config.Nsconfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        public static org.apache.xml.xmlbeans.x2004.x02.xbean.config.Nsconfig parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.apache.xml.xmlbeans.x2004.x02.xbean.config.Nsconfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
