package deob;

@ObfuscatedName("hs")
public class class213 {

    @ObfuscatedName("hs.c")
    public int field2580;

    @ObfuscatedName("hs.o")
    public int field2579;

    @ObfuscatedName("hs.i")
    public int field2578;

    public class213() {
        this.field2580 = -1;
    }

    public class213(int arg0, int arg1, int arg2) {
        this.field2580 = arg0;
        this.field2579 = arg1;
        this.field2578 = arg2;
    }

    public class213(class213 arg0) {
        this.field2580 = arg0.field2580;
        this.field2579 = arg0.field2579;
        this.field2578 = arg0.field2578;
    }

    public class213(int arg0) {
        if (arg0 == -1) {
            this.field2580 = -1;
        } else {
            this.field2580 = arg0 >> 28 & 0x3;
            this.field2579 = arg0 >> 14 & 0x3FFF;
            this.field2578 = arg0 & 0x3FFF;
        }
    }

    @ObfuscatedName("hs.c(IIII)V")
    public void method3595(int arg0, int arg1, int arg2) {
        this.field2580 = arg0;
        this.field2579 = arg1;
        this.field2578 = arg2;
    }

    @ObfuscatedName("hs.o(I)I")
    public int method3587() {
        return this.field2580 << 28 | this.field2579 << 14 | this.field2578;
    }

    public boolean equals(Object arg0) {
        if (this == arg0) {
            return true;
        } else if ((arg0 instanceof class213)) {
            return this.method3584((class213) arg0);
        } else {
            return false;
        }
    }

    @ObfuscatedName("hs.i(Lhs;I)Z")
    public boolean method3584(class213 arg0) {
        if (this.field2580 != arg0.field2580) {
            return false;
        } else if (this.field2579 == arg0.field2579) {
            return this.field2578 == arg0.field2578;
        } else {
            return false;
        }
    }

    public int hashCode() {
        return this.method3587();
    }

    public String toString() {
        return this.field2580 + "," + (this.field2579 >> 6) + "," + (this.field2578 >> 6) + "," + (this.field2579 & 0x3F) + "," + (this.field2578 & 0x3F);
    }
}
