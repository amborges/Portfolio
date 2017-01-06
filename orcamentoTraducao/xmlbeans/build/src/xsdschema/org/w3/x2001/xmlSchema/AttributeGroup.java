/*
 * XML Type:  attributeGroup
 * Namespace: http://www.w3.org/2001/XMLSchema
 * Java type: org.w3.x2001.xmlSchema.AttributeGroup
 *
 * Automatically generated - do not modify.
 */
package org.w3.x2001.xmlSchema;


/**
 * An XML attributeGroup(@http://www.w3.org/2001/XMLSchema).
 *
 * This is a complex type.
 */
public interface AttributeGroup extends org.w3.x2001.xmlSchema.Annotated
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)schema.system.sXMLSCHEMA.TypeSystemHolder.typeSystem.resolveHandle("attributegroupe530type");
    
    /**
     * Gets array of all "attribute" elements
     */
    org.w3.x2001.xmlSchema.Attribute[] getAttributeArray();
    
    /**
     * Gets ith "attribute" element
     */
    org.w3.x2001.xmlSchema.Attribute getAttributeArray(int i);
    
    /**
     * Returns number of "attribute" element
     */
    int sizeOfAttributeArray();
    
    /**
     * Sets array of all "attribute" element
     */
    void setAttributeArray(org.w3.x2001.xmlSchema.Attribute[] attributeArray);
    
    /**
     * Sets ith "attribute" element
     */
    void setAttributeArray(int i, org.w3.x2001.xmlSchema.Attribute attribute);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "attribute" element
     */
    org.w3.x2001.xmlSchema.Attribute insertNewAttribute(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "attribute" element
     */
    org.w3.x2001.xmlSchema.Attribute addNewAttribute();
    
    /**
     * Removes the ith "attribute" element
     */
    void removeAttribute(int i);
    
    /**
     * Gets array of all "attributeGroup" elements
     */
    org.w3.x2001.xmlSchema.AttributeGroupRef[] getAttributeGroupArray();
    
    /**
     * Gets ith "attributeGroup" element
     */
    org.w3.x2001.xmlSchema.AttributeGroupRef getAttributeGroupArray(int i);
    
    /**
     * Returns number of "attributeGroup" element
     */
    int sizeOfAttributeGroupArray();
    
    /**
     * Sets array of all "attributeGroup" element
     */
    void setAttributeGroupArray(org.w3.x2001.xmlSchema.AttributeGroupRef[] attributeGroupArray);
    
    /**
     * Sets ith "attributeGroup" element
     */
    void setAttributeGroupArray(int i, org.w3.x2001.xmlSchema.AttributeGroupRef attributeGroup);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "attributeGroup" element
     */
    org.w3.x2001.xmlSchema.AttributeGroupRef insertNewAttributeGroup(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "attributeGroup" element
     */
    org.w3.x2001.xmlSchema.AttributeGroupRef addNewAttributeGroup();
    
    /**
     * Removes the ith "attributeGroup" element
     */
    void removeAttributeGroup(int i);
    
    /**
     * Gets the "anyAttribute" element
     */
    org.w3.x2001.xmlSchema.Wildcard getAnyAttribute();
    
    /**
     * True if has "anyAttribute" element
     */
    boolean isSetAnyAttribute();
    
    /**
     * Sets the "anyAttribute" element
     */
    void setAnyAttribute(org.w3.x2001.xmlSchema.Wildcard anyAttribute);
    
    /**
     * Appends and returns a new empty "anyAttribute" element
     */
    org.w3.x2001.xmlSchema.Wildcard addNewAnyAttribute();
    
    /**
     * Unsets the "anyAttribute" element
     */
    void unsetAnyAttribute();
    
    /**
     * Gets the "name" attribute
     */
    java.lang.String getName();
    
    /**
     * Gets (as xml) the "name" attribute
     */
    org.apache.xmlbeans.XmlNCName xgetName();
    
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
    void xsetName(org.apache.xmlbeans.XmlNCName name);
    
    /**
     * Unsets the "name" attribute
     */
    void unsetName();
    
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
        public static org.w3.x2001.xmlSchema.AttributeGroup newInstance() {
          return (org.w3.x2001.xmlSchema.AttributeGroup) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static org.w3.x2001.xmlSchema.AttributeGroup newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (org.w3.x2001.xmlSchema.AttributeGroup) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        public static org.w3.x2001.xmlSchema.AttributeGroup parse(java.lang.String s) throws org.apache.xmlbeans.XmlException {
          return (org.w3.x2001.xmlSchema.AttributeGroup) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( s, type, null ); }
        
        public static org.w3.x2001.xmlSchema.AttributeGroup parse(java.lang.String s, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.w3.x2001.xmlSchema.AttributeGroup) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( s, type, options ); }
        
        public static org.w3.x2001.xmlSchema.AttributeGroup parse(java.io.File f) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.w3.x2001.xmlSchema.AttributeGroup) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( f, type, null ); }
        
        public static org.w3.x2001.xmlSchema.AttributeGroup parse(java.io.File f, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.w3.x2001.xmlSchema.AttributeGroup) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( f, type, options ); }
        
        public static org.w3.x2001.xmlSchema.AttributeGroup parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.w3.x2001.xmlSchema.AttributeGroup) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static org.w3.x2001.xmlSchema.AttributeGroup parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.w3.x2001.xmlSchema.AttributeGroup) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static org.w3.x2001.xmlSchema.AttributeGroup parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.w3.x2001.xmlSchema.AttributeGroup) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static org.w3.x2001.xmlSchema.AttributeGroup parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.w3.x2001.xmlSchema.AttributeGroup) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static org.w3.x2001.xmlSchema.AttributeGroup parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.w3.x2001.xmlSchema.AttributeGroup) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static org.w3.x2001.xmlSchema.AttributeGroup parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.w3.x2001.xmlSchema.AttributeGroup) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static org.w3.x2001.xmlSchema.AttributeGroup parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (org.w3.x2001.xmlSchema.AttributeGroup) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static org.w3.x2001.xmlSchema.AttributeGroup parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.w3.x2001.xmlSchema.AttributeGroup) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        public static org.w3.x2001.xmlSchema.AttributeGroup parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.w3.x2001.xmlSchema.AttributeGroup) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        public static org.w3.x2001.xmlSchema.AttributeGroup parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.w3.x2001.xmlSchema.AttributeGroup) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
