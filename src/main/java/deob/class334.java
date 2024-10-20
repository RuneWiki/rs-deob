package deob;

@ObfuscatedName("mh")
public class class334 {

    @ObfuscatedName("mh.at")
    public int field3562;

    @ObfuscatedName("mh.ah")
    public int field3561;

    @ObfuscatedName("mh.ar")
    public int field3563;

    public class334(int arg0, int arg1, int arg2) {
        this.field3562 = arg0;
        this.field3561 = arg1;
        this.field3563 = arg2;
    }

    public class334(class334 arg0) {
        this.field3562 = arg0.field3562;
        this.field3561 = arg0.field3561;
        this.field3563 = arg0.field3563;
    }

    public class334(int arg0) {
        if (arg0 == -1) {
            this.field3562 = -1;
        } else {
            this.field3562 = arg0 >> 28 & 0x3;
            this.field3561 = arg0 >> 14 & 0x3FFF;
            this.field3563 = arg0 & 0x3FFF;
        }
    }

    @ObfuscatedName("mh.at(I)I")
    public int method5617() {
        return method3238(this.field3562, this.field3561, this.field3563);
    }

    @ObfuscatedName("gv.ah(IIII)I")
    public static int method3238(int arg0, int arg1, int arg2) {
        return arg0 << 28 | arg1 << 14 | arg2;
    }

    public boolean equals(Object arg0) {
        if (this == arg0) {
            return true;
        } else if ((arg0 instanceof class334)) {
            return this.method5621((class334) arg0);
        } else {
            return false;
        }
    }

    @ObfuscatedName("mh.ar(Lmh;I)Z")
    public boolean method5621(class334 arg0) {
        if (this.field3562 != arg0.field3562) {
            return false;
        } else if (this.field3561 == arg0.field3561) {
            return this.field3563 == arg0.field3563;
        } else {
            return false;
        }
    }

    public int hashCode() {
        return this.method5617();
    }

    public String toString() {
        return this.method5619(",");
    }

    @ObfuscatedName("mh.ao(Ljava/lang/String;I)Ljava/lang/String;")
    public String method5619(String arg0) {
        return this.field3562 + arg0 + (this.field3561 >> 6) + arg0 + (this.field3563 >> 6) + arg0 + (this.field3561 & 0x3F) + arg0 + (this.field3563 & 0x3F);
    }
}
