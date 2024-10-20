package deob;

@ObfuscatedName("hb")
public class class213 {

    @ObfuscatedName("hb.i")
    public int field2617;

    @ObfuscatedName("hb.w")
    public int field2616;

    @ObfuscatedName("hb.a")
    public int field2618;

    public class213() {
        this.field2617 = -1;
    }

    public class213(int arg0, int arg1, int arg2) {
        this.field2617 = arg0;
        this.field2616 = arg1;
        this.field2618 = arg2;
    }

    public class213(class213 arg0) {
        this.field2617 = arg0.field2617;
        this.field2616 = arg0.field2616;
        this.field2618 = arg0.field2618;
    }

    public class213(int arg0) {
        if (arg0 == -1) {
            this.field2617 = -1;
        } else {
            this.field2617 = arg0 >> 28 & 0x3;
            this.field2616 = arg0 >> 14 & 0x3FFF;
            this.field2618 = arg0 & 0x3FFF;
        }
    }

    @ObfuscatedName("hb.i(IIIB)V")
    public void method3591(int arg0, int arg1, int arg2) {
        this.field2617 = arg0;
        this.field2616 = arg1;
        this.field2618 = arg2;
    }

    @ObfuscatedName("hb.w(B)I")
    public int method3592() {
        return this.field2617 << 28 | this.field2616 << 14 | this.field2618;
    }

    public boolean equals(Object arg0) {
        if (this == arg0) {
            return true;
        } else if ((arg0 instanceof class213)) {
            return this.method3593((class213) arg0);
        } else {
            return false;
        }
    }

    @ObfuscatedName("hb.a(Lhb;I)Z")
    public boolean method3593(class213 arg0) {
        if (this.field2617 != arg0.field2617) {
            return false;
        } else if (this.field2616 == arg0.field2616) {
            return this.field2618 == arg0.field2618;
        } else {
            return false;
        }
    }

    public int hashCode() {
        return this.method3592();
    }

    public String toString() {
        return this.field2617 + "," + (this.field2616 >> 6) + "," + (this.field2618 >> 6) + "," + (this.field2616 & 0x3F) + "," + (this.field2618 & 0x3F);
    }
}
