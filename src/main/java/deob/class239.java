package deob;

@ObfuscatedName("ik")
public class class239 {

    @ObfuscatedName("ik.t")
    public int field2778;

    @ObfuscatedName("ik.q")
    public int field2777;

    @ObfuscatedName("ik.i")
    public int field2776;

    public class239() {
        this.field2778 = -1;
    }

    public class239(int arg0, int arg1, int arg2) {
        this.field2778 = arg0;
        this.field2777 = arg1;
        this.field2776 = arg2;
    }

    public class239(class239 arg0) {
        this.field2778 = arg0.field2778;
        this.field2777 = arg0.field2777;
        this.field2776 = arg0.field2776;
    }

    public class239(int arg0) {
        if (arg0 == -1) {
            this.field2778 = -1;
        } else {
            this.field2778 = arg0 >> 28 & 0x3;
            this.field2777 = arg0 >> 14 & 0x3FFF;
            this.field2776 = arg0 & 0x3FFF;
        }
    }

    @ObfuscatedName("ik.t(IIII)V")
    public void method4047(int arg0, int arg1, int arg2) {
        this.field2778 = arg0;
        this.field2777 = arg1;
        this.field2776 = arg2;
    }

    @ObfuscatedName("ik.q(B)I")
    public int method4038() {
        return this.field2778 << 28 | this.field2777 << 14 | this.field2776;
    }

    public boolean equals(Object arg0) {
        if (this == arg0) {
            return true;
        } else if ((arg0 instanceof class239)) {
            return this.method4040((class239) arg0);
        } else {
            return false;
        }
    }

    @ObfuscatedName("ik.i(Lik;I)Z")
    public boolean method4040(class239 arg0) {
        if (this.field2778 != arg0.field2778) {
            return false;
        } else if (this.field2777 == arg0.field2777) {
            return this.field2776 == arg0.field2776;
        } else {
            return false;
        }
    }

    public int hashCode() {
        return this.method4038();
    }

    public String toString() {
        return this.method4037(",");
    }

    @ObfuscatedName("ik.a(Ljava/lang/String;B)Ljava/lang/String;")
    public String method4037(String arg0) {
        return this.field2778 + arg0 + (this.field2777 >> 6) + arg0 + (this.field2776 >> 6) + arg0 + (this.field2777 & 0x3F) + arg0 + (this.field2776 & 0x3F);
    }
}
