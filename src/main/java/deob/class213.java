package deob;

@ObfuscatedName("hh")
public class class213 {

    @ObfuscatedName("hh.i")
    public int field2616;

    @ObfuscatedName("hh.c")
    public int field2617;

    @ObfuscatedName("hh.e")
    public int field2615;

    public class213() {
        this.field2616 = -1;
    }

    public class213(int arg0, int arg1, int arg2) {
        this.field2616 = arg0;
        this.field2617 = arg1;
        this.field2615 = arg2;
    }

    public class213(class213 arg0) {
        this.field2616 = arg0.field2616;
        this.field2617 = arg0.field2617;
        this.field2615 = arg0.field2615;
    }

    public class213(int arg0) {
        if (arg0 == -1) {
            this.field2616 = -1;
        } else {
            this.field2616 = arg0 >> 28 & 0x3;
            this.field2617 = arg0 >> 14 & 0x3FFF;
            this.field2615 = arg0 & 0x3FFF;
        }
    }

    @ObfuscatedName("hh.i(IIII)V")
    public void method3585(int arg0, int arg1, int arg2) {
        this.field2616 = arg0;
        this.field2617 = arg1;
        this.field2615 = arg2;
    }

    @ObfuscatedName("hh.c(B)I")
    public int method3588() {
        return this.field2616 << 28 | this.field2617 << 14 | this.field2615;
    }

    public boolean equals(Object arg0) {
        if (this == arg0) {
            return true;
        } else if ((arg0 instanceof class213)) {
            return this.method3599((class213) arg0);
        } else {
            return false;
        }
    }

    @ObfuscatedName("hh.e(Lhh;I)Z")
    public boolean method3599(class213 arg0) {
        if (this.field2616 != arg0.field2616) {
            return false;
        } else if (this.field2617 == arg0.field2617) {
            return this.field2615 == arg0.field2615;
        } else {
            return false;
        }
    }

    public int hashCode() {
        return this.method3588();
    }

    public String toString() {
        return this.field2616 + "," + (this.field2617 >> 6) + "," + (this.field2615 >> 6) + "," + (this.field2617 & 0x3F) + "," + (this.field2615 & 0x3F);
    }
}
