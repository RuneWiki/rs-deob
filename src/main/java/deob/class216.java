package deob;

@ObfuscatedName("hp")
public class class216 {

    @ObfuscatedName("hp.w")
    public int field2621;

    @ObfuscatedName("hp.o")
    public int field2622;

    @ObfuscatedName("hp.x")
    public int field2620;

    public class216() {
        this.field2621 = -1;
    }

    public class216(int arg0, int arg1, int arg2) {
        this.field2621 = arg0;
        this.field2622 = arg1;
        this.field2620 = arg2;
    }

    public class216(class216 arg0) {
        this.field2621 = arg0.field2621;
        this.field2622 = arg0.field2622;
        this.field2620 = arg0.field2620;
    }

    public class216(int arg0) {
        if (arg0 == -1) {
            this.field2621 = -1;
        } else {
            this.field2621 = arg0 >> 28 & 0x3;
            this.field2622 = arg0 >> 14 & 0x3FFF;
            this.field2620 = arg0 & 0x3FFF;
        }
    }

    @ObfuscatedName("hp.w(IIIB)V")
    public void method3602(int arg0, int arg1, int arg2) {
        this.field2621 = arg0;
        this.field2622 = arg1;
        this.field2620 = arg2;
    }

    @ObfuscatedName("hp.o(I)I")
    public int method3593() {
        return this.field2621 << 28 | this.field2622 << 14 | this.field2620;
    }

    public boolean equals(Object arg0) {
        if (this == arg0) {
            return true;
        } else if ((arg0 instanceof class216)) {
            return this.method3595((class216) arg0);
        } else {
            return false;
        }
    }

    @ObfuscatedName("hp.x(Lhp;B)Z")
    public boolean method3595(class216 arg0) {
        if (this.field2621 != arg0.field2621) {
            return false;
        } else if (this.field2622 == arg0.field2622) {
            return this.field2620 == arg0.field2620;
        } else {
            return false;
        }
    }

    public int hashCode() {
        return this.method3593();
    }

    public String toString() {
        return this.field2621 + "," + (this.field2622 >> 6) + "," + (this.field2620 >> 6) + "," + (this.field2622 & 0x3F) + "," + (this.field2620 & 0x3F);
    }
}
