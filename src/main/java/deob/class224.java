package deob;

@ObfuscatedName("hv")
public class class224 {

    @ObfuscatedName("hv.s")
    public int field2717;

    @ObfuscatedName("hv.g")
    public int field2718;

    @ObfuscatedName("hv.m")
    public int field2716;

    public class224() {
        this.field2717 = -1;
    }

    public class224(int arg0, int arg1, int arg2) {
        this.field2717 = arg0;
        this.field2718 = arg1;
        this.field2716 = arg2;
    }

    public class224(class224 arg0) {
        this.field2717 = arg0.field2717;
        this.field2718 = arg0.field2718;
        this.field2716 = arg0.field2716;
    }

    public class224(int arg0) {
        if (arg0 == -1) {
            this.field2717 = -1;
        } else {
            this.field2717 = arg0 >> 28 & 0x3;
            this.field2718 = arg0 >> 14 & 0x3FFF;
            this.field2716 = arg0 & 0x3FFF;
        }
    }

    @ObfuscatedName("hv.s(IIII)V")
    public void method4064(int arg0, int arg1, int arg2) {
        this.field2717 = arg0;
        this.field2718 = arg1;
        this.field2716 = arg2;
    }

    @ObfuscatedName("hv.g(B)I")
    public int method4048() {
        return this.field2717 << 28 | this.field2718 << 14 | this.field2716;
    }

    public boolean equals(Object arg0) {
        if (this == arg0) {
            return true;
        } else if ((arg0 instanceof class224)) {
            return this.method4063((class224) arg0);
        } else {
            return false;
        }
    }

    @ObfuscatedName("hv.m(Lhv;I)Z")
    public boolean method4063(class224 arg0) {
        if (this.field2717 != arg0.field2717) {
            return false;
        } else if (this.field2718 == arg0.field2718) {
            return this.field2716 == arg0.field2716;
        } else {
            return false;
        }
    }

    public int hashCode() {
        return this.method4048();
    }

    public String toString() {
        return this.field2717 + "," + (this.field2718 >> 6) + "," + (this.field2716 >> 6) + "," + (this.field2718 & 0x3F) + "," + (this.field2716 & 0x3F);
    }
}
