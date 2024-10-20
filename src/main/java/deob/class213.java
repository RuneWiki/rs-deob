package deob;

@ObfuscatedName("hl")
public class class213 {

    @ObfuscatedName("hl.d")
    public int field2626;

    @ObfuscatedName("hl.k")
    public int field2628;

    @ObfuscatedName("hl.e")
    public int field2625;

    public class213() {
        this.field2626 = -1;
    }

    public class213(int arg0, int arg1, int arg2) {
        this.field2626 = arg0;
        this.field2628 = arg1;
        this.field2625 = arg2;
    }

    public class213(class213 arg0) {
        this.field2626 = arg0.field2626;
        this.field2628 = arg0.field2628;
        this.field2625 = arg0.field2625;
    }

    public class213(int arg0) {
        if (arg0 == -1) {
            this.field2626 = -1;
        } else {
            this.field2626 = arg0 >> 28 & 0x3;
            this.field2628 = arg0 >> 14 & 0x3FFF;
            this.field2625 = arg0 & 0x3FFF;
        }
    }

    @ObfuscatedName("hl.d(IIIS)V")
    public void method3717(int arg0, int arg1, int arg2) {
        this.field2626 = arg0;
        this.field2628 = arg1;
        this.field2625 = arg2;
    }

    @ObfuscatedName("hl.k(B)I")
    public int method3725() {
        return this.field2626 << 28 | this.field2628 << 14 | this.field2625;
    }

    public boolean equals(Object arg0) {
        if (this == arg0) {
            return true;
        } else if ((arg0 instanceof class213)) {
            return this.method3720((class213) arg0);
        } else {
            return false;
        }
    }

    @ObfuscatedName("hl.e(Lhl;B)Z")
    public boolean method3720(class213 arg0) {
        if (this.field2626 != arg0.field2626) {
            return false;
        } else if (this.field2628 == arg0.field2628) {
            return this.field2625 == arg0.field2625;
        } else {
            return false;
        }
    }

    public int hashCode() {
        return this.method3725();
    }

    public String toString() {
        return this.field2626 + "," + (this.field2628 >> 6) + "," + (this.field2625 >> 6) + "," + (this.field2628 & 0x3F) + "," + (this.field2625 & 0x3F);
    }
}
