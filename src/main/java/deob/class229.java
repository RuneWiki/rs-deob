package deob;

@ObfuscatedName("hz")
public class class229 {

    @ObfuscatedName("hz.g")
    public int field2635;

    @ObfuscatedName("hz.r")
    public int field2633;

    @ObfuscatedName("hz.e")
    public int field2634;

    public class229() {
        this.field2635 = -1;
    }

    public class229(int arg0, int arg1, int arg2) {
        this.field2635 = arg0;
        this.field2633 = arg1;
        this.field2634 = arg2;
    }

    public class229(class229 arg0) {
        this.field2635 = arg0.field2635;
        this.field2633 = arg0.field2633;
        this.field2634 = arg0.field2634;
    }

    public class229(int arg0) {
        if (arg0 == -1) {
            this.field2635 = -1;
        } else {
            this.field2635 = arg0 >> 28 & 0x3;
            this.field2633 = arg0 >> 14 & 0x3FFF;
            this.field2634 = arg0 & 0x3FFF;
        }
    }

    @ObfuscatedName("hz.g(IIIB)V")
    public void method4275(int arg0, int arg1, int arg2) {
        this.field2635 = arg0;
        this.field2633 = arg1;
        this.field2634 = arg2;
    }

    @ObfuscatedName("hz.r(I)I")
    public int method4277() {
        return this.field2635 << 28 | this.field2633 << 14 | this.field2634;
    }

    public boolean equals(Object arg0) {
        if (this == arg0) {
            return true;
        } else if ((arg0 instanceof class229)) {
            return this.method4290((class229) arg0);
        } else {
            return false;
        }
    }

    @ObfuscatedName("hz.e(Lhz;I)Z")
    public boolean method4290(class229 arg0) {
        if (this.field2635 != arg0.field2635) {
            return false;
        } else if (this.field2633 == arg0.field2633) {
            return this.field2634 == arg0.field2634;
        } else {
            return false;
        }
    }

    public int hashCode() {
        return this.method4277();
    }

    public String toString() {
        return this.method4287(",");
    }

    @ObfuscatedName("hz.q(Ljava/lang/String;I)Ljava/lang/String;")
    public String method4287(String arg0) {
        return this.field2635 + arg0 + (this.field2633 >> 6) + arg0 + (this.field2634 >> 6) + arg0 + (this.field2633 & 0x3F) + arg0 + (this.field2634 & 0x3F);
    }
}
