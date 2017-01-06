/*
 * XML Type:  defaultDerivationSet
 * Namespace: http://www.w3.org/2001/XMLSchema
 * Java type: org.w3.x2001.xmlSchema.DefaultDerivationSet
 *
 * Automatically generated - do not modify.
 */
package org.w3.x2001.xmlSchema.impl;
/**
 * An XML defaultDerivationSet(@http://www.w3.org/2001/XMLSchema).
 *
 * This is a union type. Instances are of one of the following types:
 *     org.w3.x2001.xmlSchema.DefaultDerivationSet$Member
 *     org.w3.x2001.xmlSchema.DefaultDerivationSet$Member2
 */
public class DefaultDerivationSetImpl extends org.apache.xmlbeans.impl.values.XmlUnionImpl implements org.w3.x2001.xmlSchema.DefaultDerivationSet, org.w3.x2001.xmlSchema.DefaultDerivationSet.Member, org.w3.x2001.xmlSchema.DefaultDerivationSet.Member2
{
    
    public DefaultDerivationSetImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType, false);
    }
    
    protected DefaultDerivationSetImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
    {
        super(sType, b);
    }
    /**
     * An anonymous inner XML type.
     *
     * This is an atomic type that is a restriction of org.apache.xmlbeans.XmlToken.
     */
    public static class MemberImpl extends org.apache.xmlbeans.impl.values.JavaStringEnumerationHolderEx implements org.w3.x2001.xmlSchema.DefaultDerivationSet.Member
    {
        
        public MemberImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType, false);
        }
        
        protected MemberImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
        {
            super(sType, b);
        }
    }
    /**
     * An anonymous inner XML type.
     *
     * This is a list type whose items are org.w3.x2001.xmlSchema.DefaultDerivationControl.
     */
    public static class MemberImpl2 extends org.apache.xmlbeans.impl.values.XmlListImpl implements org.w3.x2001.xmlSchema.DefaultDerivationSet.Member2
    {
        
        public MemberImpl2(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType, false);
        }
        
        protected MemberImpl2(org.apache.xmlbeans.SchemaType sType, boolean b)
        {
            super(sType, b);
        }
    }
}
