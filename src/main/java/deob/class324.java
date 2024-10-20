package deob;

@ObfuscatedName("mr")
public class class324 {

    @ObfuscatedName("mr.aw")
    public int field3537;

    @ObfuscatedName("mr.ay")
    public int field3536;

    @ObfuscatedName("mr.ar")
    public int field3538;

    public class324(int arg0, int arg1, int arg2) {
        this.field3537 = arg0;
        this.field3536 = arg1;
        this.field3538 = arg2;
    }

    public class324(class324 arg0) {
        this.field3537 = arg0.field3537;
        this.field3536 = arg0.field3536;
        this.field3538 = arg0.field3538;
    }

    public class324(int arg0) {
        if (arg0 == -1) {
            this.field3537 = -1;
        } else {
            this.field3537 = arg0 >> 28 & 0x3;
            this.field3536 = arg0 >> 14 & 0x3FFF;
            this.field3538 = arg0 & 0x3FFF;
        }
    }

    @ObfuscatedName("mr.aw(I)I")
    public int method5487() {
        return method8003(this.field3537, this.field3536, this.field3538);
    }

    @ObfuscatedName("sn.ay(IIII)I")
    public static int method8003(int arg0, int arg1, int arg2) {
        return arg0 << 28 | arg1 << 14 | arg2;
    }

    public boolean equals(Object arg0) {
        if (this == arg0) {
            return true;
        } else if ((arg0 instanceof class324)) {
            return this.method5500((class324) arg0);
        } else {
            return false;
        }
    }

    @ObfuscatedName("mr.ar(Lmr;I)Z")
    public boolean method5500(class324 arg0) {
        if (this.field3537 != arg0.field3537) {
            return false;
        } else if (this.field3536 == arg0.field3536) {
            return this.field3538 == arg0.field3538;
        } else {
            return false;
        }
    }

    public int hashCode() {
        return this.method5487();
    }

    public String toString() {
        return this.method5489(",");
    }

    @ObfuscatedName("mr.am(Ljava/lang/String;B)Ljava/lang/String;")
    public String method5489(String arg0) {
        return this.field3537 + arg0 + (this.field3536 >> 6) + arg0 + (this.field3538 >> 6) + arg0 + (this.field3536 & 0x3F) + arg0 + (this.field3538 & 0x3F);
    }
}
