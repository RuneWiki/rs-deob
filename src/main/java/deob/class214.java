package deob;

@ObfuscatedName("hs")
public class class214 {

    @ObfuscatedName("hs.i")
    public int field2618;

    @ObfuscatedName("hs.j")
    public int field2617;

    @ObfuscatedName("hs.a")
    public int field2619;

    public class214() {
        this.field2618 = -1;
    }

    public class214(int arg0, int arg1, int arg2) {
        this.field2618 = arg0;
        this.field2617 = arg1;
        this.field2619 = arg2;
    }

    public class214(class214 arg0) {
        this.field2618 = arg0.field2618;
        this.field2617 = arg0.field2617;
        this.field2619 = arg0.field2619;
    }

    public class214(int arg0) {
        if (arg0 == -1) {
            this.field2618 = -1;
        } else {
            this.field2618 = arg0 >> 28 & 0x3;
            this.field2617 = arg0 >> 14 & 0x3FFF;
            this.field2619 = arg0 & 0x3FFF;
        }
    }

    @ObfuscatedName("hs.i(IIII)V")
    public void method3681(int arg0, int arg1, int arg2) {
        this.field2618 = arg0;
        this.field2617 = arg1;
        this.field2619 = arg2;
    }

    @ObfuscatedName("hs.j(I)I")
    public int method3679() {
        return this.field2618 << 28 | this.field2617 << 14 | this.field2619;
    }

    public boolean equals(Object arg0) {
        if (this == arg0) {
            return true;
        } else if ((arg0 instanceof class214)) {
            return this.method3684((class214) arg0);
        } else {
            return false;
        }
    }

    @ObfuscatedName("hs.a(Lhs;B)Z")
    public boolean method3684(class214 arg0) {
        if (this.field2618 != arg0.field2618) {
            return false;
        } else if (this.field2617 == arg0.field2617) {
            return this.field2619 == arg0.field2619;
        } else {
            return false;
        }
    }

    public int hashCode() {
        return this.method3679();
    }

    public String toString() {
        return this.field2618 + "," + (this.field2617 >> 6) + "," + (this.field2619 >> 6) + "," + (this.field2617 & 0x3F) + "," + (this.field2619 & 0x3F);
    }
}
