package deob;

@ObfuscatedName("ie")
public class class258 {

    @ObfuscatedName("ie.i")
    public int field3018;

    @ObfuscatedName("ie.w")
    public int field3017;

    @ObfuscatedName("ie.s")
    public int field3016;

    public class258(int arg0, int arg1, int arg2) {
        this.field3018 = arg0;
        this.field3017 = arg1;
        this.field3016 = arg2;
    }

    public class258(class258 arg0) {
        this.field3018 = arg0.field3018;
        this.field3017 = arg0.field3017;
        this.field3016 = arg0.field3016;
    }

    public class258(int arg0) {
        if (arg0 == -1) {
            this.field3018 = -1;
        } else {
            this.field3018 = arg0 >> 28 & 0x3;
            this.field3017 = arg0 >> 14 & 0x3FFF;
            this.field3016 = arg0 & 0x3FFF;
        }
    }

    @ObfuscatedName("ie.i(I)I")
    public int method4479() {
        int var1 = this.field3018;
        int var2 = this.field3017;
        int var3 = this.field3016;
        return var1 << 28 | var2 << 14 | var3;
    }

    public boolean equals(Object arg0) {
        if (this == arg0) {
            return true;
        } else if ((arg0 instanceof class258)) {
            return this.method4480((class258) arg0);
        } else {
            return false;
        }
    }

    @ObfuscatedName("ie.w(Lie;I)Z")
    public boolean method4480(class258 arg0) {
        if (this.field3018 != arg0.field3018) {
            return false;
        } else if (this.field3017 == arg0.field3017) {
            return this.field3016 == arg0.field3016;
        } else {
            return false;
        }
    }

    public int hashCode() {
        return this.method4479();
    }

    public String toString() {
        return this.method4478(",");
    }

    @ObfuscatedName("ie.s(Ljava/lang/String;I)Ljava/lang/String;")
    public String method4478(String arg0) {
        return this.field3018 + arg0 + (this.field3017 >> 6) + arg0 + (this.field3016 >> 6) + arg0 + (this.field3017 & 0x3F) + arg0 + (this.field3016 & 0x3F);
    }
}
