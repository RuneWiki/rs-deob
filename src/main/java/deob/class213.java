package deob;

@ObfuscatedName("hh")
public class class213 {

    @ObfuscatedName("hh.e")
    public int field2596;

    @ObfuscatedName("hh.o")
    public int field2595;

    @ObfuscatedName("hh.m")
    public int field2597;

    public class213() {
        this.field2596 = -1;
    }

    public class213(int arg0, int arg1, int arg2) {
        this.field2596 = arg0;
        this.field2595 = arg1;
        this.field2597 = arg2;
    }

    public class213(class213 arg0) {
        this.field2596 = arg0.field2596;
        this.field2595 = arg0.field2595;
        this.field2597 = arg0.field2597;
    }

    public class213(int arg0) {
        if (arg0 == -1) {
            this.field2596 = -1;
        } else {
            this.field2596 = arg0 >> 28 & 0x3;
            this.field2595 = arg0 >> 14 & 0x3FFF;
            this.field2597 = arg0 & 0x3FFF;
        }
    }

    @ObfuscatedName("hh.e(IIIB)V")
    public void method3599(int arg0, int arg1, int arg2) {
        this.field2596 = arg0;
        this.field2595 = arg1;
        this.field2597 = arg2;
    }

    @ObfuscatedName("hh.o(B)I")
    public int method3594() {
        return this.field2596 << 28 | this.field2595 << 14 | this.field2597;
    }

    public boolean equals(Object arg0) {
        if (this == arg0) {
            return true;
        } else if ((arg0 instanceof class213)) {
            return this.method3596((class213) arg0);
        } else {
            return false;
        }
    }

    @ObfuscatedName("hh.m(Lhh;I)Z")
    public boolean method3596(class213 arg0) {
        if (this.field2596 != arg0.field2596) {
            return false;
        } else if (this.field2595 == arg0.field2595) {
            return this.field2597 == arg0.field2597;
        } else {
            return false;
        }
    }

    public int hashCode() {
        return this.method3594();
    }

    public String toString() {
        return this.field2596 + "," + (this.field2595 >> 6) + "," + (this.field2597 >> 6) + "," + (this.field2595 & 0x3F) + "," + (this.field2597 & 0x3F);
    }
}
