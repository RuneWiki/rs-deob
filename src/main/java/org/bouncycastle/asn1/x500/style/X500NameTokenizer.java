package org.bouncycastle.asn1.x500.style;

public class X500NameTokenizer {

    public StringBuffer buf;

    public String value;

    public int index;

    public char separator;

    public String nextToken() {
        if (this.index == this.value.length()) {
            return null;
        }
        int var1 = this.index + 1;
        boolean var2 = false;
        boolean var3 = false;
        this.buf.setLength(0);
        while (var1 != this.value.length()) {
            char var4 = this.value.charAt(var1);
            if (var4 == '"') {
                if (!var3) {
                    var2 = !var2;
                }
                this.buf.append(var4);
                var3 = false;
            } else if (var3 || var2) {
                this.buf.append(var4);
                var3 = false;
            } else if (var4 == '\\') {
                this.buf.append(var4);
                var3 = true;
            } else {
                if (this.separator == var4) {
                    break;
                }
                this.buf.append(var4);
            }
            var1++;
        }
        this.index = var1;
        return this.buf.toString();
    }

    public X500NameTokenizer(String arg0) {
        this(arg0, ',');
    }

    public X500NameTokenizer(String arg0, char arg1) {
        this.buf = new StringBuffer();
        this.value = arg0;
        this.index = -1;
        this.separator = arg1;
    }

    public boolean hasMoreTokens() {
        return this.index != this.value.length();
    }
}
