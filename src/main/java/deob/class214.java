package deob;

@ObfuscatedName("hh")
public class class214 {

    @ObfuscatedName("hh.j")
    public int field2610;

    @ObfuscatedName("hh.h")
    public int field2609;

    @ObfuscatedName("hh.f")
    public int field2611;

    public class214() {
        this.field2610 = -1;
    }

    public class214(int arg0, int arg1, int arg2) {
        this.field2610 = arg0;
        this.field2609 = arg1;
        this.field2611 = arg2;
    }

    public class214(class214 arg0) {
        this.field2610 = arg0.field2610;
        this.field2609 = arg0.field2609;
        this.field2611 = arg0.field2611;
    }

    public class214(int arg0) {
        if (arg0 == -1) {
            this.field2610 = -1;
        } else {
            this.field2610 = arg0 >> 28 & 0x3;
            this.field2609 = arg0 >> 14 & 0x3FFF;
            this.field2611 = arg0 & 0x3FFF;
        }
    }

    @ObfuscatedName("hh.j(IIIB)V")
    public void method3620(int arg0, int arg1, int arg2) {
        this.field2610 = arg0;
        this.field2609 = arg1;
        this.field2611 = arg2;
    }

    @ObfuscatedName("hh.h(I)I")
    public int method3621() {
        return this.field2610 << 28 | this.field2609 << 14 | this.field2611;
    }

    public boolean equals(Object arg0) {
        if (this == arg0) {
            return true;
        } else if ((arg0 instanceof class214)) {
            return this.method3623((class214) arg0);
        } else {
            return false;
        }
    }

    @ObfuscatedName("hh.f(Lhh;I)Z")
    public boolean method3623(class214 arg0) {
        if (this.field2610 != arg0.field2610) {
            return false;
        } else if (this.field2609 == arg0.field2609) {
            return this.field2611 == arg0.field2611;
        } else {
            return false;
        }
    }

    public int hashCode() {
        return this.method3621();
    }

    public String toString() {
        return this.field2610 + "," + (this.field2609 >> 6) + "," + (this.field2611 >> 6) + "," + (this.field2609 & 0x3F) + "," + (this.field2611 & 0x3F);
    }
}
