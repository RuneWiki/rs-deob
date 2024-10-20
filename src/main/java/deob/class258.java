package deob;

@ObfuscatedName("iy")
public class class258 {

    @ObfuscatedName("iy.n")
    public int field3006;

    @ObfuscatedName("iy.c")
    public int field3007;

    @ObfuscatedName("iy.m")
    public int field3008;

    public class258(int arg0, int arg1, int arg2) {
        this.field3006 = arg0;
        this.field3007 = arg1;
        this.field3008 = arg2;
    }

    public class258(class258 arg0) {
        this.field3006 = arg0.field3006;
        this.field3007 = arg0.field3007;
        this.field3008 = arg0.field3008;
    }

    public class258(int arg0) {
        if (arg0 == -1) {
            this.field3006 = -1;
        } else {
            this.field3006 = arg0 >> 28 & 0x3;
            this.field3007 = arg0 >> 14 & 0x3FFF;
            this.field3008 = arg0 & 0x3FFF;
        }
    }

    @ObfuscatedName("iy.n(I)I")
    public int method4467() {
        return Statics.method5987(this.field3006, this.field3007, this.field3008);
    }

    public boolean equals(Object arg0) {
        if (this == arg0) {
            return true;
        } else if ((arg0 instanceof class258)) {
            return this.method4453((class258) arg0);
        } else {
            return false;
        }
    }

    @ObfuscatedName("iy.m(Liy;I)Z")
    public boolean method4453(class258 arg0) {
        if (this.field3006 != arg0.field3006) {
            return false;
        } else if (this.field3007 == arg0.field3007) {
            return this.field3008 == arg0.field3008;
        } else {
            return false;
        }
    }

    public int hashCode() {
        return this.method4467();
    }

    public String toString() {
        return this.method4455(",");
    }

    @ObfuscatedName("iy.k(Ljava/lang/String;I)Ljava/lang/String;")
    public String method4455(String arg0) {
        return this.field3006 + arg0 + (this.field3007 >> 6) + arg0 + (this.field3008 >> 6) + arg0 + (this.field3007 & 0x3F) + arg0 + (this.field3008 & 0x3F);
    }
}
