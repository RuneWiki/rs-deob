package deob;

@ObfuscatedName("hq")
public class class220 {

    @ObfuscatedName("hq.m")
    public int field2695;

    @ObfuscatedName("hq.p")
    public int field2692;

    @ObfuscatedName("hq.i")
    public int field2691;

    public class220() {
        this.field2695 = -1;
    }

    public class220(int arg0, int arg1, int arg2) {
        this.field2695 = arg0;
        this.field2692 = arg1;
        this.field2691 = arg2;
    }

    public class220(class220 arg0) {
        this.field2695 = arg0.field2695;
        this.field2692 = arg0.field2692;
        this.field2691 = arg0.field2691;
    }

    public class220(int arg0) {
        if (arg0 == -1) {
            this.field2695 = -1;
        } else {
            this.field2695 = arg0 >> 28 & 0x3;
            this.field2692 = arg0 >> 14 & 0x3FFF;
            this.field2691 = arg0 & 0x3FFF;
        }
    }

    @ObfuscatedName("hq.m(IIII)V")
    public void method3768(int arg0, int arg1, int arg2) {
        this.field2695 = arg0;
        this.field2692 = arg1;
        this.field2691 = arg2;
    }

    @ObfuscatedName("hq.p(B)I")
    public int method3769() {
        return this.field2695 << 28 | this.field2692 << 14 | this.field2691;
    }

    public boolean equals(Object arg0) {
        if (this == arg0) {
            return true;
        } else if ((arg0 instanceof class220)) {
            return this.method3770((class220) arg0);
        } else {
            return false;
        }
    }

    @ObfuscatedName("hq.i(Lhq;I)Z")
    public boolean method3770(class220 arg0) {
        if (this.field2695 != arg0.field2695) {
            return false;
        } else if (this.field2692 == arg0.field2692) {
            return this.field2691 == arg0.field2691;
        } else {
            return false;
        }
    }

    public int hashCode() {
        return this.method3769();
    }

    public String toString() {
        return this.field2695 + "," + (this.field2692 >> 6) + "," + (this.field2691 >> 6) + "," + (this.field2692 & 0x3F) + "," + (this.field2691 & 0x3F);
    }
}
