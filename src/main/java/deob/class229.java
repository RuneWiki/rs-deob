package deob;

@ObfuscatedName("hv")
public class class229 {

    @ObfuscatedName("hv.v")
    public int field2606;

    @ObfuscatedName("hv.s")
    public int field2603;

    @ObfuscatedName("hv.o")
    public int field2605;

    public class229() {
        this.field2606 = -1;
    }

    public class229(int arg0, int arg1, int arg2) {
        this.field2606 = arg0;
        this.field2603 = arg1;
        this.field2605 = arg2;
    }

    public class229(class229 arg0) {
        this.field2606 = arg0.field2606;
        this.field2603 = arg0.field2603;
        this.field2605 = arg0.field2605;
    }

    public class229(int arg0) {
        if (arg0 == -1) {
            this.field2606 = -1;
        } else {
            this.field2606 = arg0 >> 28 & 0x3;
            this.field2603 = arg0 >> 14 & 0x3FFF;
            this.field2605 = arg0 & 0x3FFF;
        }
    }

    @ObfuscatedName("hv.v(IIII)V")
    public void method4108(int arg0, int arg1, int arg2) {
        this.field2606 = arg0;
        this.field2603 = arg1;
        this.field2605 = arg2;
    }

    @ObfuscatedName("hv.s(I)I")
    public int method4123() {
        return this.field2606 << 28 | this.field2603 << 14 | this.field2605;
    }

    public boolean equals(Object arg0) {
        if (this == arg0) {
            return true;
        } else if ((arg0 instanceof class229)) {
            return this.method4109((class229) arg0);
        } else {
            return false;
        }
    }

    @ObfuscatedName("hv.o(Lhv;I)Z")
    public boolean method4109(class229 arg0) {
        if (this.field2606 != arg0.field2606) {
            return false;
        } else if (this.field2603 == arg0.field2603) {
            return this.field2605 == arg0.field2605;
        } else {
            return false;
        }
    }

    public int hashCode() {
        return this.method4123();
    }

    public String toString() {
        return this.method4111(",");
    }

    @ObfuscatedName("hv.k(Ljava/lang/String;I)Ljava/lang/String;")
    public String method4111(String arg0) {
        return this.field2606 + arg0 + (this.field2603 >> 6) + arg0 + (this.field2605 >> 6) + arg0 + (this.field2603 & 0x3F) + arg0 + (this.field2605 & 0x3F);
    }
}
