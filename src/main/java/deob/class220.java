package deob;

@ObfuscatedName("hp")
public class class220 {

    @ObfuscatedName("hp.d")
    public int field2690;

    @ObfuscatedName("hp.x")
    public int field2692;

    @ObfuscatedName("hp.k")
    public int field2691;

    public class220() {
        this.field2690 = -1;
    }

    public class220(int arg0, int arg1, int arg2) {
        this.field2690 = arg0;
        this.field2691 = arg1;
        this.field2692 = arg2;
    }

    public class220(class220 arg0) {
        this.field2690 = arg0.field2690;
        this.field2691 = arg0.field2691;
        this.field2692 = arg0.field2692;
    }

    public class220(int arg0) {
        if (arg0 == -1) {
            this.field2690 = -1;
        } else {
            this.field2690 = arg0 >> 28 & 0x3;
            this.field2691 = arg0 >> 14 & 0x3FFF;
            this.field2692 = arg0 & 0x3FFF;
        }
    }

    @ObfuscatedName("hp.d(IIII)V")
    public void method3797(int arg0, int arg1, int arg2) {
        this.field2690 = arg0;
        this.field2691 = arg1;
        this.field2692 = arg2;
    }

    @ObfuscatedName("hp.x(I)I")
    public int method3799() {
        return this.field2690 << 28 | this.field2691 << 14 | this.field2692;
    }

    public boolean equals(Object arg0) {
        if (this == arg0) {
            return true;
        } else if ((arg0 instanceof class220)) {
            return this.method3801((class220) arg0);
        } else {
            return false;
        }
    }

    @ObfuscatedName("hp.k(Lhp;I)Z")
    public boolean method3801(class220 arg0) {
        if (this.field2690 != arg0.field2690) {
            return false;
        } else if (this.field2691 == arg0.field2691) {
            return this.field2692 == arg0.field2692;
        } else {
            return false;
        }
    }

    public int hashCode() {
        return this.method3799();
    }

    public String toString() {
        return this.field2690 + "," + (this.field2691 >> 6) + "," + (this.field2692 >> 6) + "," + (this.field2691 & 0x3F) + "," + (this.field2692 & 0x3F);
    }
}
