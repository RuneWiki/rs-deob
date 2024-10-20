package deob;

@ObfuscatedName("hh")
public class class227 {

    @ObfuscatedName("hh.w")
    public int field2588;

    @ObfuscatedName("hh.m")
    public int field2582;

    @ObfuscatedName("hh.q")
    public int field2584;

    public class227() {
        this.field2588 = -1;
    }

    public class227(int arg0, int arg1, int arg2) {
        this.field2588 = arg0;
        this.field2582 = arg1;
        this.field2584 = arg2;
    }

    public class227(class227 arg0) {
        this.field2588 = arg0.field2588;
        this.field2582 = arg0.field2582;
        this.field2584 = arg0.field2584;
    }

    public class227(int arg0) {
        if (arg0 == -1) {
            this.field2588 = -1;
        } else {
            this.field2588 = arg0 >> 28 & 0x3;
            this.field2582 = arg0 >> 14 & 0x3FFF;
            this.field2584 = arg0 & 0x3FFF;
        }
    }

    @ObfuscatedName("hh.w(IIIB)V")
    public void method4098(int arg0, int arg1, int arg2) {
        this.field2588 = arg0;
        this.field2582 = arg1;
        this.field2584 = arg2;
    }

    @ObfuscatedName("hh.m(B)I")
    public int method4099() {
        return this.field2588 << 28 | this.field2582 << 14 | this.field2584;
    }

    public boolean equals(Object arg0) {
        if (this == arg0) {
            return true;
        } else if ((arg0 instanceof class227)) {
            return this.method4100((class227) arg0);
        } else {
            return false;
        }
    }

    @ObfuscatedName("hh.q(Lhh;I)Z")
    public boolean method4100(class227 arg0) {
        if (this.field2588 != arg0.field2588) {
            return false;
        } else if (this.field2582 == arg0.field2582) {
            return this.field2584 == arg0.field2584;
        } else {
            return false;
        }
    }

    public int hashCode() {
        return this.method4099();
    }

    public String toString() {
        return this.method4102(",");
    }

    @ObfuscatedName("hh.x(Ljava/lang/String;B)Ljava/lang/String;")
    public String method4102(String arg0) {
        return this.field2588 + arg0 + (this.field2582 >> 6) + arg0 + (this.field2584 >> 6) + arg0 + (this.field2582 & 0x3F) + arg0 + (this.field2584 & 0x3F);
    }
}
