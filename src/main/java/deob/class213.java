package deob;

@ObfuscatedName("hg")
public class class213 {

    @ObfuscatedName("hg.w")
    public int field2601;

    @ObfuscatedName("hg.s")
    public int field2602;

    @ObfuscatedName("hg.q")
    public int field2603;

    public class213() {
        this.field2601 = -1;
    }

    public class213(int arg0, int arg1, int arg2) {
        this.field2601 = arg0;
        this.field2602 = arg1;
        this.field2603 = arg2;
    }

    public class213(class213 arg0) {
        this.field2601 = arg0.field2601;
        this.field2602 = arg0.field2602;
        this.field2603 = arg0.field2603;
    }

    public class213(int arg0) {
        if (arg0 == -1) {
            this.field2601 = -1;
        } else {
            this.field2601 = arg0 >> 28 & 0x3;
            this.field2602 = arg0 >> 14 & 0x3FFF;
            this.field2603 = arg0 & 0x3FFF;
        }
    }

    @ObfuscatedName("hg.w(IIII)V")
    public void method3719(int arg0, int arg1, int arg2) {
        this.field2601 = arg0;
        this.field2602 = arg1;
        this.field2603 = arg2;
    }

    @ObfuscatedName("hg.s(I)I")
    public int method3720() {
        return this.field2601 << 28 | this.field2602 << 14 | this.field2603;
    }

    public boolean equals(Object arg0) {
        if (this == arg0) {
            return true;
        } else if ((arg0 instanceof class213)) {
            return this.method3721((class213) arg0);
        } else {
            return false;
        }
    }

    @ObfuscatedName("hg.q(Lhg;I)Z")
    public boolean method3721(class213 arg0) {
        if (this.field2601 != arg0.field2601) {
            return false;
        } else if (this.field2602 == arg0.field2602) {
            return this.field2603 == arg0.field2603;
        } else {
            return false;
        }
    }

    public int hashCode() {
        return this.method3720();
    }

    public String toString() {
        return this.field2601 + "," + (this.field2602 >> 6) + "," + (this.field2603 >> 6) + "," + (this.field2602 & 0x3F) + "," + (this.field2603 & 0x3F);
    }
}
