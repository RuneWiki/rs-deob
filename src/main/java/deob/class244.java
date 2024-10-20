package deob;

@ObfuscatedName("iw")
public class class244 {

    @ObfuscatedName("iw.f")
    public int field2929;

    @ObfuscatedName("iw.e")
    public int field2927;

    @ObfuscatedName("iw.v")
    public int field2928;

    public class244(int arg0, int arg1, int arg2) {
        this.field2929 = arg0;
        this.field2927 = arg1;
        this.field2928 = arg2;
    }

    public class244(class244 arg0) {
        this.field2929 = arg0.field2929;
        this.field2927 = arg0.field2927;
        this.field2928 = arg0.field2928;
    }

    public class244(int arg0) {
        if (arg0 == -1) {
            this.field2929 = -1;
        } else {
            this.field2929 = arg0 >> 28 & 0x3;
            this.field2927 = arg0 >> 14 & 0x3FFF;
            this.field2928 = arg0 & 0x3FFF;
        }
    }

    @ObfuscatedName("iw.f(I)I")
    public int method4256() {
        return this.field2929 << 28 | this.field2927 << 14 | this.field2928;
    }

    public boolean equals(Object arg0) {
        if (this == arg0) {
            return true;
        } else if ((arg0 instanceof class244)) {
            return this.method4258((class244) arg0);
        } else {
            return false;
        }
    }

    @ObfuscatedName("iw.e(Liw;I)Z")
    public boolean method4258(class244 arg0) {
        if (this.field2929 != arg0.field2929) {
            return false;
        } else if (this.field2927 == arg0.field2927) {
            return this.field2928 == arg0.field2928;
        } else {
            return false;
        }
    }

    public int hashCode() {
        return this.method4256();
    }

    public String toString() {
        return this.method4260(",");
    }

    @ObfuscatedName("iw.v(Ljava/lang/String;B)Ljava/lang/String;")
    public String method4260(String arg0) {
        return this.field2929 + arg0 + (this.field2927 >> 6) + arg0 + (this.field2928 >> 6) + arg0 + (this.field2927 & 0x3F) + arg0 + (this.field2928 & 0x3F);
    }
}
