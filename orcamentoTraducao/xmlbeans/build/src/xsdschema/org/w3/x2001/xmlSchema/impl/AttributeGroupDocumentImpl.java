/*
 * An XML document type.
 * Localname: attributeGroup
 * Namespace: http://www.w3.org/2001/XMLSchema
 * Java type: org.w3.x2001.xmlSchema.AttributeGroupDocument
 *
 * Automatically generated - do not modify.
 */
package org.w3.x2001.xmlSchema.impl;
/**
 * A document containing one attributeGroup(@http://www.w3.org/2001/XMLSchema) element.
 *
 * This is a complex type.
 */
public class AttributeGroupDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.w3.x2001.xmlSchema.AttributeGroupDocument
{
    
    public AttributeGroupDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ATTRIBUTEGROUP$0 = 
        new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "attributeGroup");
    
    
    /**
     * Gets the "attributeGroup" element
     */
    public org.w3.x2001.xmlSchema.NamedAttributeGroup getAttributeGroup()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.x2001.xmlSchema.NamedAttributeGroup target = null;
            target = (org.w3.x2001.xmlSchema.NamedAttributeGroup)get_store().find_element_user(ATTRIBUTEGROUP$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "attributeGroup" element
     */
    public void setAttributeGroup(org.w3.x2001.xmlSchema.NamedAttributeGroup attributeGroup)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.x2001.xmlSchema.NamedAttributeGroup target = null;
            target = (org.w3.x2001.xmlSchema.NamedAttributeGroup)get_store().find_element_user(ATTRIBUTEGROUP$0, 0);
            if (target == null)
            {
                target = (org.w3.x2001.xmlSchema.NamedAttributeGroup)get_store().add_element_user(ATTRIBUTEGROUP$0);
            }
            target.set(attributeGroup);
        }
    }
    
    /**
     * Appends and returns a new empty "attributeGroup" element
     */
    public org.w3.x2001.xmlSchema.NamedAttributeGroup addNewAttributeGroup()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.x2001.xmlSchema.NamedAttributeGroup target = null;
            target = (org.w3.x2001.xmlSchema.NamedAttributeGroup)get_store().add_element_user(ATTRIBUTEGROUP$0);
            return target;
        }
    }
}
