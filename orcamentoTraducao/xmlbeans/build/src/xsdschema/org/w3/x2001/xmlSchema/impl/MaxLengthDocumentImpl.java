/*
 * An XML document type.
 * Localname: maxLength
 * Namespace: http://www.w3.org/2001/XMLSchema
 * Java type: org.w3.x2001.xmlSchema.MaxLengthDocument
 *
 * Automatically generated - do not modify.
 */
package org.w3.x2001.xmlSchema.impl;
/**
 * A document containing one maxLength(@http://www.w3.org/2001/XMLSchema) element.
 *
 * This is a complex type.
 */
public class MaxLengthDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.w3.x2001.xmlSchema.MaxLengthDocument
{
    
    public MaxLengthDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName MAXLENGTH$0 = 
        new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "maxLength");
    
    
    /**
     * Gets the "maxLength" element
     */
    public org.w3.x2001.xmlSchema.NumFacet getMaxLength()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.x2001.xmlSchema.NumFacet target = null;
            target = (org.w3.x2001.xmlSchema.NumFacet)get_store().find_element_user(MAXLENGTH$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "maxLength" element
     */
    public void setMaxLength(org.w3.x2001.xmlSchema.NumFacet maxLength)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.x2001.xmlSchema.NumFacet target = null;
            target = (org.w3.x2001.xmlSchema.NumFacet)get_store().find_element_user(MAXLENGTH$0, 0);
            if (target == null)
            {
                target = (org.w3.x2001.xmlSchema.NumFacet)get_store().add_element_user(MAXLENGTH$0);
            }
            target.set(maxLength);
        }
    }
    
    /**
     * Appends and returns a new empty "maxLength" element
     */
    public org.w3.x2001.xmlSchema.NumFacet addNewMaxLength()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.x2001.xmlSchema.NumFacet target = null;
            target = (org.w3.x2001.xmlSchema.NumFacet)get_store().add_element_user(MAXLENGTH$0);
            return target;
        }
    }
}
