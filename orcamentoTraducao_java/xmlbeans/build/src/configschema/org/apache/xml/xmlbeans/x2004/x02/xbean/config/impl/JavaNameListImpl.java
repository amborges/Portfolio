/*
 * XML Type:  javaNameList
 * Namespace: http://xml.apache.org/xmlbeans/2004/02/xbean/config
 * Java type: org.apache.xml.xmlbeans.x2004.x02.xbean.config.JavaNameList
 *
 * Automatically generated - do not modify.
 */
package org.apache.xml.xmlbeans.x2004.x02.xbean.config.impl;
/**
 * An XML javaNameList(@http://xml.apache.org/xmlbeans/2004/02/xbean/config).
 *
 * This is a union type. Instances are of one of the following types:
 *     org.apache.xml.xmlbeans.x2004.x02.xbean.config.JavaNameList$Member
 *     org.apache.xml.xmlbeans.x2004.x02.xbean.config.JavaNameList$Member2
 */
public class JavaNameListImpl extends org.apache.xmlbeans.impl.values.XmlUnionImpl implements org.apache.xml.xmlbeans.x2004.x02.xbean.config.JavaNameList, org.apache.xml.xmlbeans.x2004.x02.xbean.config.JavaNameList.Member, org.apache.xml.xmlbeans.x2004.x02.xbean.config.JavaNameList.Member2
{
    
    public JavaNameListImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType, false);
    }
    
    protected JavaNameListImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
    {
        super(sType, b);
    }
    /**
     * An anonymous inner XML type.
     *
     * This is an atomic type that is a restriction of org.apache.xmlbeans.XmlToken.
     */
    public static class MemberImpl extends org.apache.xmlbeans.impl.values.JavaStringEnumerationHolderEx implements org.apache.xml.xmlbeans.x2004.x02.xbean.config.JavaNameList.Member
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
     * This is a list type whose items are org.apache.xml.xmlbeans.x2004.x02.xbean.config.JavaName.
     */
    public static class MemberImpl2 extends org.apache.xmlbeans.impl.values.XmlListImpl implements org.apache.xml.xmlbeans.x2004.x02.xbean.config.JavaNameList.Member2
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
