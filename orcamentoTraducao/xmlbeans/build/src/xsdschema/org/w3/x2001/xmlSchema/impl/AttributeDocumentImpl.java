/*
 * An XML document type.
 * Localname: attribute
 * Namespace: http://www.w3.org/2001/XMLSchema
 * Java type: org.w3.x2001.xmlSchema.AttributeDocument
 *
 * Automatically generated - do not modify.
 */
package org.w3.x2001.xmlSchema.impl;
/**
 * A document containing one attribute(@http://www.w3.org/2001/XMLSchema) element.
 *
 * This is a complex type.
 */
public class AttributeDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.w3.x2001.xmlSchema.AttributeDocument
{
    
    public AttributeDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ATTRIBUTE$0 = 
        new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "attribute");
    
    
    /**
     * Gets the "attribute" element
     */
    public org.w3.x2001.xmlSchema.TopLevelAttribute getAttribute()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.x2001.xmlSchema.TopLevelAttribute target = null;
            target = (org.w3.x2001.xmlSchema.TopLevelAttribute)get_store().find_element_user(ATTRIBUTE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "attribute" element
     */
    public void setAttribute(org.w3.x2001.xmlSchema.TopLevelAttribute attribute)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.x2001.xmlSchema.TopLevelAttribute target = null;
            target = (org.w3.x2001.xmlSchema.TopLevelAttribute)get_store().find_element_user(ATTRIBUTE$0, 0);
            if (target == null)
            {
                target = (org.w3.x2001.xmlSchema.TopLevelAttribute)get_store().add_element_user(ATTRIBUTE$0);
            }
            target.set(attribute);
        }
    }
    
    /**
     * Appends and returns a new empty "attribute" element
     */
    public org.w3.x2001.xmlSchema.TopLevelAttribute addNewAttribute()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.x2001.xmlSchema.TopLevelAttribute target = null;
            target = (org.w3.x2001.xmlSchema.TopLevelAttribute)get_store().add_element_user(ATTRIBUTE$0);
            return target;
        }
    }
}
