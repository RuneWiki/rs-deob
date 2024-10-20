package deob;

@ObfuscatedName("ix")
public class class239 {

    @ObfuscatedName("ix.o")
    public int field2784;

    @ObfuscatedName("ix.k")
    public int field2787;

    @ObfuscatedName("ix.t")
    public int field2785;

    public class239() {
        this.field2784 = -1;
    }

    public class239(int arg0, int arg1, int arg2) {
        this.field2784 = arg0;
        this.field2787 = arg1;
        this.field2785 = arg2;
    }

    public class239(class239 arg0) {
        this.field2784 = arg0.field2784;
        this.field2787 = arg0.field2787;
        this.field2785 = arg0.field2785;
    }

    public class239(int arg0) {
        if (arg0 == -1) {
            this.field2784 = -1;
        } else {
            this.field2784 = arg0 >> 28 & 0x3;
            this.field2787 = arg0 >> 14 & 0x3FFF;
            this.field2785 = arg0 & 0x3FFF;
        }
    }

    @ObfuscatedName("ix.o(IIII)V")
    public void method4006(int arg0, int arg1, int arg2) {
        this.field2784 = arg0;
        this.field2787 = arg1;
        this.field2785 = arg2;
    }

    @ObfuscatedName("ix.k(I)I")
    public int method3997() {
        return this.field2784 << 28 | this.field2787 << 14 | this.field2785;
    }

    public boolean equals(Object arg0) {
        if (this == arg0) {
            return true;
        } else if ((arg0 instanceof class239)) {
            return this.method3998((class239) arg0);
        } else {
            return false;
        }
    }

    @ObfuscatedName("ix.t(Lix;I)Z")
    public boolean method3998(class239 arg0) {
        if (this.field2784 != arg0.field2784) {
            return false;
        } else if (this.field2787 == arg0.field2787) {
            return this.field2785 == arg0.field2785;
        } else {
            return false;
        }
    }

    public int hashCode() {
        return this.method3997();
    }

    public String toString() {
        return this.method3999(",");
    }

    @ObfuscatedName("ix.d(Ljava/lang/String;I)Ljava/lang/String;")
    public String method3999(String arg0) {
        return this.field2784 + arg0 + (this.field2787 >> 6) + arg0 + (this.field2785 >> 6) + arg0 + (this.field2787 & 0x3F) + arg0 + (this.field2785 & 0x3F);
    }
}
