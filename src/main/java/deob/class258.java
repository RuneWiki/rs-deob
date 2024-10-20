package deob;

@ObfuscatedName("ic")
public class class258 {

    @ObfuscatedName("ic.l")
    public int field3015;

    @ObfuscatedName("ic.q")
    public int field3012;

    @ObfuscatedName("ic.f")
    public int field3013;

    public class258(int arg0, int arg1, int arg2) {
        this.field3015 = arg0;
        this.field3012 = arg1;
        this.field3013 = arg2;
    }

    public class258(class258 arg0) {
        this.field3015 = arg0.field3015;
        this.field3012 = arg0.field3012;
        this.field3013 = arg0.field3013;
    }

    public class258(int arg0) {
        if (arg0 == -1) {
            this.field3015 = -1;
        } else {
            this.field3015 = arg0 >> 28 & 0x3;
            this.field3012 = arg0 >> 14 & 0x3FFF;
            this.field3013 = arg0 & 0x3FFF;
        }
    }

    @ObfuscatedName("ic.l(I)I")
    public int method4493() {
        int var1 = this.field3015;
        int var2 = this.field3012;
        int var3 = this.field3013;
        return var1 << 28 | var2 << 14 | var3;
    }

    public boolean equals(Object arg0) {
        if (this == arg0) {
            return true;
        } else if ((arg0 instanceof class258)) {
            return this.method4494((class258) arg0);
        } else {
            return false;
        }
    }

    @ObfuscatedName("ic.q(Lic;I)Z")
    public boolean method4494(class258 arg0) {
        if (this.field3015 != arg0.field3015) {
            return false;
        } else if (this.field3012 == arg0.field3012) {
            return this.field3013 == arg0.field3013;
        } else {
            return false;
        }
    }

    public int hashCode() {
        return this.method4493();
    }

    public String toString() {
        return this.method4495(",");
    }

    @ObfuscatedName("ic.f(Ljava/lang/String;I)Ljava/lang/String;")
    public String method4495(String arg0) {
        return this.field3015 + arg0 + (this.field3012 >> 6) + arg0 + (this.field3013 >> 6) + arg0 + (this.field3012 & 0x3F) + arg0 + (this.field3013 & 0x3F);
    }
}
