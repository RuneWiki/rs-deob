package deob;

@ObfuscatedName("hc")
public class class224 {

    @ObfuscatedName("hc.a")
    public int field2728;

    @ObfuscatedName("hc.w")
    public int field2725;

    @ObfuscatedName("hc.e")
    public int field2726;

    public class224() {
        this.field2728 = -1;
    }

    public class224(int arg0, int arg1, int arg2) {
        this.field2728 = arg0;
        this.field2725 = arg1;
        this.field2726 = arg2;
    }

    public class224(class224 arg0) {
        this.field2728 = arg0.field2728;
        this.field2725 = arg0.field2725;
        this.field2726 = arg0.field2726;
    }

    public class224(int arg0) {
        if (arg0 == -1) {
            this.field2728 = -1;
        } else {
            this.field2728 = arg0 >> 28 & 0x3;
            this.field2725 = arg0 >> 14 & 0x3FFF;
            this.field2726 = arg0 & 0x3FFF;
        }
    }

    @ObfuscatedName("hc.a(IIII)V")
    public void method3741(int arg0, int arg1, int arg2) {
        this.field2728 = arg0;
        this.field2725 = arg1;
        this.field2726 = arg2;
    }

    @ObfuscatedName("hc.w(I)I")
    public int method3742() {
        return this.field2728 << 28 | this.field2725 << 14 | this.field2726;
    }

    public boolean equals(Object arg0) {
        if (this == arg0) {
            return true;
        } else if ((arg0 instanceof class224)) {
            return this.method3743((class224) arg0);
        } else {
            return false;
        }
    }

    @ObfuscatedName("hc.e(Lhc;I)Z")
    public boolean method3743(class224 arg0) {
        if (this.field2728 != arg0.field2728) {
            return false;
        } else if (this.field2725 == arg0.field2725) {
            return this.field2726 == arg0.field2726;
        } else {
            return false;
        }
    }

    public int hashCode() {
        return this.method3742();
    }

    public String toString() {
        return this.field2728 + "," + (this.field2725 >> 6) + "," + (this.field2726 >> 6) + "," + (this.field2725 & 0x3F) + "," + (this.field2726 & 0x3F);
    }
}
