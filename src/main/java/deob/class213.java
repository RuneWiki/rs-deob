package deob;

@ObfuscatedName("hd")
public class class213 {

    @ObfuscatedName("hd.a")
    public int field2616;

    @ObfuscatedName("hd.j")
    public int field2615;

    @ObfuscatedName("hd.n")
    public int field2618;

    public class213() {
        this.field2616 = -1;
    }

    public class213(int arg0, int arg1, int arg2) {
        this.field2616 = arg0;
        this.field2615 = arg1;
        this.field2618 = arg2;
    }

    public class213(class213 arg0) {
        this.field2616 = arg0.field2616;
        this.field2615 = arg0.field2615;
        this.field2618 = arg0.field2618;
    }

    public class213(int arg0) {
        if (arg0 == -1) {
            this.field2616 = -1;
        } else {
            this.field2616 = arg0 >> 28 & 0x3;
            this.field2615 = arg0 >> 14 & 0x3FFF;
            this.field2618 = arg0 & 0x3FFF;
        }
    }

    @ObfuscatedName("hd.a(IIII)V")
    public void method3618(int arg0, int arg1, int arg2) {
        this.field2616 = arg0;
        this.field2615 = arg1;
        this.field2618 = arg2;
    }

    @ObfuscatedName("hd.j(I)I")
    public int method3605() {
        return this.field2616 << 28 | this.field2615 << 14 | this.field2618;
    }

    public boolean equals(Object arg0) {
        if (this == arg0) {
            return true;
        } else if ((arg0 instanceof class213)) {
            return this.method3607((class213) arg0);
        } else {
            return false;
        }
    }

    @ObfuscatedName("hd.n(Lhd;B)Z")
    public boolean method3607(class213 arg0) {
        if (this.field2616 != arg0.field2616) {
            return false;
        } else if (this.field2615 == arg0.field2615) {
            return this.field2618 == arg0.field2618;
        } else {
            return false;
        }
    }

    public int hashCode() {
        return this.method3605();
    }

    public String toString() {
        return this.field2616 + "," + (this.field2615 >> 6) + "," + (this.field2618 >> 6) + "," + (this.field2615 & 0x3F) + "," + (this.field2618 & 0x3F);
    }
}
