package org.bouncycastle.asn1;

public class OIDTokenizer {

    public String oid;

    public int index;

    public boolean hasMoreTokens() {
        return this.index != -1;
    }

    public OIDTokenizer(String arg0) {
        this.oid = arg0;
        this.index = 0;
    }

    public String nextToken() {
        if (this.index == -1) {
            return null;
        }
        int var1 = this.oid.indexOf(46, this.index);
        if (var1 == -1) {
            String var2 = this.oid.substring(this.index);
            this.index = -1;
            return var2;
        } else {
            String var3 = this.oid.substring(this.index, var1);
            this.index = var1 + 1;
            return var3;
        }
    }
}
