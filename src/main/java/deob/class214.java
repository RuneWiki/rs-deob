package deob;

@ObfuscatedName("hv")
public class class214 {

    @ObfuscatedName("hv.q")
    public int field2532;

    @ObfuscatedName("hv.w")
    public int field2531;

    @ObfuscatedName("hv.e")
    public int field2529;

    public class214(int arg0, int arg1, int arg2) {
        this.field2532 = arg0;
        this.field2531 = arg1;
        this.field2529 = arg2;
    }

    public class214(class214 arg0) {
        this.field2532 = arg0.field2532;
        this.field2531 = arg0.field2531;
        this.field2529 = arg0.field2529;
    }

    public class214(int arg0) {
        if (arg0 == -1) {
            this.field2532 = -1;
        } else {
            this.field2532 = arg0 >> 28 & 0x3;
            this.field2531 = arg0 >> 14 & 0x3FFF;
            this.field2529 = arg0 & 0x3FFF;
        }
    }

    @ObfuscatedName("hv.q(I)I")
    public int method3608() {
        return this.field2532 << 28 | this.field2531 << 14 | this.field2529;
    }

    public boolean equals(Object arg0) {
        if (this == arg0) {
            return true;
        } else if ((arg0 instanceof class214)) {
            return this.method3610((class214) arg0);
        } else {
            return false;
        }
    }

    @ObfuscatedName("hv.w(Lhv;I)Z")
    public boolean method3610(class214 arg0) {
        if (this.field2532 != arg0.field2532) {
            return false;
        } else if (this.field2531 == arg0.field2531) {
            return this.field2529 == arg0.field2529;
        } else {
            return false;
        }
    }

    public int hashCode() {
        return this.method3608();
    }

    public String toString() {
        return this.method3612(",");
    }

    @ObfuscatedName("hv.e(Ljava/lang/String;I)Ljava/lang/String;")
    public String method3612(String arg0) {
        return this.field2532 + arg0 + (this.field2531 >> 6) + arg0 + (this.field2529 >> 6) + arg0 + (this.field2531 & 0x3F) + arg0 + (this.field2529 & 0x3F);
    }
}
