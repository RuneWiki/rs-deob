package deob;

@ObfuscatedName("hk")
public class class221 {

    @ObfuscatedName("hk.f")
    public int field2591;

    @ObfuscatedName("hk.o")
    public int field2586;

    @ObfuscatedName("hk.u")
    public int field2588;

    public class221(int arg0, int arg1, int arg2) {
        this.field2591 = arg0;
        this.field2586 = arg1;
        this.field2588 = arg2;
    }

    public class221(class221 arg0) {
        this.field2591 = arg0.field2591;
        this.field2586 = arg0.field2586;
        this.field2588 = arg0.field2588;
    }

    public class221(int arg0) {
        if (arg0 == -1) {
            this.field2591 = -1;
        } else {
            this.field2591 = arg0 >> 28 & 0x3;
            this.field2586 = arg0 >> 14 & 0x3FFF;
            this.field2588 = arg0 & 0x3FFF;
        }
    }

    @ObfuscatedName("hk.f(I)I")
    public int method3676() {
        return this.field2591 << 28 | this.field2586 << 14 | this.field2588;
    }

    public boolean equals(Object arg0) {
        if (this == arg0) {
            return true;
        } else if ((arg0 instanceof class221)) {
            return this.method3667((class221) arg0);
        } else {
            return false;
        }
    }

    @ObfuscatedName("hk.o(Lhk;I)Z")
    public boolean method3667(class221 arg0) {
        if (this.field2591 != arg0.field2591) {
            return false;
        } else if (this.field2586 == arg0.field2586) {
            return this.field2588 == arg0.field2588;
        } else {
            return false;
        }
    }

    public int hashCode() {
        return this.method3676();
    }

    public String toString() {
        return this.method3670(",");
    }

    @ObfuscatedName("hk.u(Ljava/lang/String;B)Ljava/lang/String;")
    public String method3670(String arg0) {
        return this.field2591 + arg0 + (this.field2586 >> 6) + arg0 + (this.field2588 >> 6) + arg0 + (this.field2586 & 0x3F) + arg0 + (this.field2588 & 0x3F);
    }
}
