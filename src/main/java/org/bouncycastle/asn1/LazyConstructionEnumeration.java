package org.bouncycastle.asn1;

import java.io.IOException;
import java.util.Enumeration;

public class LazyConstructionEnumeration implements Enumeration {

    public ASN1InputStream aIn;

    public Object nextObj;

    public Object readObject() {
        try {
            return this.aIn.readObject();
        } catch (IOException var2) {
            throw new ASN1ParsingException("malformed DER construction: " + var2, var2);
        }
    }

    public boolean hasMoreElements() {
        return this.nextObj != null;
    }

    public Object nextElement() {
        Object var1 = this.nextObj;
        this.nextObj = this.readObject();
        return var1;
    }

    public LazyConstructionEnumeration(byte[] arg0) {
        this.aIn = new ASN1InputStream(arg0, true);
        this.nextObj = this.readObject();
    }
}
