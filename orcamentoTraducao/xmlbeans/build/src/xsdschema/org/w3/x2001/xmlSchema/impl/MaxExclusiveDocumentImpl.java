/*
 * An XML document type.
 * Localname: maxExclusive
 * Namespace: http://www.w3.org/2001/XMLSchema
 * Java type: org.w3.x2001.xmlSchema.MaxExclusiveDocument
 *
 * Automatically generated - do not modify.
 */
package org.w3.x2001.xmlSchema.impl;
/**
 * A document containing one maxExclusive(@http://www.w3.org/2001/XMLSchema) element.
 *
 * This is a complex type.
 */
public class MaxExclusiveDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.w3.x2001.xmlSchema.MaxExclusiveDocument
{
    
    public MaxExclusiveDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName MAXEXCLUSIVE$0 = 
        new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "maxExclusive");
    
    
    /**
     * Gets the "maxExclusive" element
     */
    public org.w3.x2001.xmlSchema.Facet getMaxExclusive()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.x2001.xmlSchema.Facet target = null;
            target = (org.w3.x2001.xmlSchema.Facet)get_store().find_element_user(MAXEXCLUSIVE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "maxExclusive" element
     */
    public void setMaxExclusive(org.w3.x2001.xmlSchema.Facet maxExclusive)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.x2001.xmlSchema.Facet target = null;
            target = (org.w3.x2001.xmlSchema.Facet)get_store().find_element_user(MAXEXCLUSIVE$0, 0);
            if (target == null)
            {
                target = (org.w3.x2001.xmlSchema.Facet)get_store().add_element_user(MAXEXCLUSIVE$0);
            }
            target.set(maxExclusive);
        }
    }
    
    /**
     * Appends and returns a new empty "maxExclusive" element
     */
    public org.w3.x2001.xmlSchema.Facet addNewMaxExclusive()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.x2001.xmlSchema.Facet target = null;
            target = (org.w3.x2001.xmlSchema.Facet)get_store().add_element_user(MAXEXCLUSIVE$0);
            return target;
        }
    }
}
