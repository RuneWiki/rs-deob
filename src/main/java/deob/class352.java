package deob;

@ObfuscatedName("nm")
public class class352 {

    @ObfuscatedName("nm.ac")
    public int field3755;

    @ObfuscatedName("nm.ae")
    public int field3754;

    @ObfuscatedName("nm.ag")
    public int field3756;

    public class352() {
        this.field3755 = -1;
    }

    public class352(int arg0, int arg1, int arg2) {
        this.field3755 = arg0;
        this.field3754 = arg1;
        this.field3756 = arg2;
    }

    public class352(class352 arg0) {
        this.field3755 = arg0.field3755;
        this.field3754 = arg0.field3754;
        this.field3756 = arg0.field3756;
    }

    public class352(int arg0) {
        if (arg0 == -1) {
            this.field3755 = -1;
        } else {
            this.field3755 = arg0 >> 28 & 0x3;
            this.field3754 = arg0 >> 14 & 0x3FFF;
            this.field3756 = arg0 & 0x3FFF;
        }
    }

    @ObfuscatedName("nm.ac(IB)V")
    public void method6078(int arg0) {
        if (arg0 == -1) {
            this.field3755 = -1;
        } else {
            this.field3755 = arg0 >> 28 & 0x3;
            this.field3754 = arg0 >> 14 & 0x3FFF;
            this.field3756 = arg0 & 0x3FFF;
        }
    }

    @ObfuscatedName("nm.ae(B)I")
    public int method6079() {
        return method6076(this.field3755, this.field3754, this.field3756);
    }

    @ObfuscatedName("nm.ag(IIIB)I")
    public static int method6076(int arg0, int arg1, int arg2) {
        return arg0 << 28 | arg1 << 14 | arg2;
    }

    @ObfuscatedName("nm.am(II)I")
    public static int method6081(int arg0) {
        return arg0 >> 28;
    }

    @ObfuscatedName("nm.aq(IB)I")
    public static int method6083(int arg0) {
        return arg0 & 0x3FFF;
    }

    @ObfuscatedName("nm.af(I)I")
    public int method6084() {
        return method6076(this.field3755, this.field3754 >> 13, this.field3756 >> 13);
    }

    @ObfuscatedName("nm.at(IIII)V")
    public void method6085(int arg0, int arg1, int arg2) {
        int var4 = arg0 >> 14 & 0xFF;
        int var5 = arg0 & 0xFF;
        this.field3755 = arg0 >> 28;
        this.field3754 = (var4 << 13) + arg1;
        this.field3756 = (var5 << 13) + arg2;
    }

    public boolean equals(Object arg0) {
        if (this == arg0) {
            return true;
        } else if ((arg0 instanceof class352)) {
            return this.method6086((class352) arg0);
        } else {
            return false;
        }
    }

    @ObfuscatedName("nm.au(Lnm;B)Z")
    public boolean method6086(class352 arg0) {
        if (this.field3755 != arg0.field3755) {
            return false;
        } else if (this.field3754 == arg0.field3754) {
            return this.field3756 == arg0.field3756;
        } else {
            return false;
        }
    }

    public int hashCode() {
        return this.method6079();
    }

    public String toString() {
        return this.method6088(",");
    }

    @ObfuscatedName("nm.ar(Ljava/lang/String;I)Ljava/lang/String;")
    public String method6088(String arg0) {
        return this.field3755 + arg0 + (this.field3754 >> 6) + arg0 + (this.field3756 >> 6) + arg0 + (this.field3754 & 0x3F) + arg0 + (this.field3756 & 0x3F);
    }

    @ObfuscatedName("nm.al(II)I")
    public static int method6089(int arg0) {
        return arg0 >> 3;
    }

    @ObfuscatedName("nm.ad(IB)I")
    public static int method6090(int arg0) {
        return arg0 << 3;
    }

    @ObfuscatedName("nm.ah(III)I")
    public static int method6091(int arg0, int arg1) {
        return (arg1 << 6) + arg0;
    }

    @ObfuscatedName("nm.ap(II)I")
    public static int method6092(int arg0) {
        return (arg0 << 7) + 64;
    }
}
