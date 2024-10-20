package deob;

@ObfuscatedName("ho")
public class class213 {

    @ObfuscatedName("ho.i")
    public int field2604;

    @ObfuscatedName("ho.h")
    public int field2601;

    @ObfuscatedName("ho.u")
    public int field2602;

    public class213() {
        this.field2604 = -1;
    }

    public class213(int arg0, int arg1, int arg2) {
        this.field2604 = arg0;
        this.field2601 = arg1;
        this.field2602 = arg2;
    }

    public class213(class213 arg0) {
        this.field2604 = arg0.field2604;
        this.field2601 = arg0.field2601;
        this.field2602 = arg0.field2602;
    }

    public class213(int arg0) {
        if (arg0 == -1) {
            this.field2604 = -1;
        } else {
            this.field2604 = arg0 >> 28 & 0x3;
            this.field2601 = arg0 >> 14 & 0x3FFF;
            this.field2602 = arg0 & 0x3FFF;
        }
    }

    @ObfuscatedName("ho.i(IIII)V")
    public void method3674(int arg0, int arg1, int arg2) {
        this.field2604 = arg0;
        this.field2601 = arg1;
        this.field2602 = arg2;
    }

    @ObfuscatedName("ho.h(I)I")
    public int method3673() {
        return this.field2604 << 28 | this.field2601 << 14 | this.field2602;
    }

    public boolean equals(Object arg0) {
        if (this == arg0) {
            return true;
        } else if ((arg0 instanceof class213)) {
            return this.method3676((class213) arg0);
        } else {
            return false;
        }
    }

    @ObfuscatedName("ho.u(Lho;B)Z")
    public boolean method3676(class213 arg0) {
        if (this.field2604 != arg0.field2604) {
            return false;
        } else if (this.field2601 == arg0.field2601) {
            return this.field2602 == arg0.field2602;
        } else {
            return false;
        }
    }

    public int hashCode() {
        return this.method3673();
    }

    public String toString() {
        return this.field2604 + "," + (this.field2601 >> 6) + "," + (this.field2602 >> 6) + "," + (this.field2601 & 0x3F) + "," + (this.field2602 & 0x3F);
    }
}
