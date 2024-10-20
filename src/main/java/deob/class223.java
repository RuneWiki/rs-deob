package deob;

@ObfuscatedName("hj")
public class class223 {

    @ObfuscatedName("hj.x")
    public int field2530;

    @ObfuscatedName("hj.m")
    public int field2529;

    @ObfuscatedName("hj.k")
    public int field2533;

    public class223(int arg0, int arg1, int arg2) {
        this.field2529 = arg0;
        this.field2533 = arg1;
        this.field2530 = arg2;
    }

    public class223(class223 arg0) {
        this.field2529 = arg0.field2529;
        this.field2533 = arg0.field2533;
        this.field2530 = arg0.field2530;
    }

    public class223(int arg0) {
        if (arg0 == -1) {
            this.field2529 = -1;
        } else {
            this.field2529 = arg0 >> 28 & 0x3;
            this.field2533 = arg0 >> 14 & 0x3FFF;
            this.field2530 = arg0 & 0x3FFF;
        }
    }

    @ObfuscatedName("hj.x(I)I")
    public int method3697() {
        return this.field2529 << 28 | this.field2533 << 14 | this.field2530;
    }

    public boolean equals(Object arg0) {
        if (this == arg0) {
            return true;
        } else if ((arg0 instanceof class223)) {
            return this.method3696((class223) arg0);
        } else {
            return false;
        }
    }

    @ObfuscatedName("hj.m(Lhj;I)Z")
    public boolean method3696(class223 arg0) {
        if (this.field2529 != arg0.field2529) {
            return false;
        } else if (this.field2533 == arg0.field2533) {
            return this.field2530 == arg0.field2530;
        } else {
            return false;
        }
    }

    public int hashCode() {
        return this.method3697();
    }

    public String toString() {
        return this.method3701(",");
    }

    @ObfuscatedName("hj.k(Ljava/lang/String;I)Ljava/lang/String;")
    public String method3701(String arg0) {
        return this.field2529 + arg0 + (this.field2533 >> 6) + arg0 + (this.field2530 >> 6) + arg0 + (this.field2533 & 0x3F) + arg0 + (this.field2530 & 0x3F);
    }
}
