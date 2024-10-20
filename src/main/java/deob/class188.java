package deob;

@ObfuscatedName("gj")
public class class188 implements class201 {

    @ObfuscatedName("gj.n")
    public int field2120;

    @ObfuscatedName("gj.c")
    public int field2109;

    @ObfuscatedName("gj.m")
    public int field2113;

    @ObfuscatedName("gj.k")
    public int field2111;

    @ObfuscatedName("gj.o")
    public int field2112;

    @ObfuscatedName("gj.g")
    public int field2116;

    @ObfuscatedName("gj.z")
    public int field2114;

    @ObfuscatedName("gj.a")
    public int field2115;

    @ObfuscatedName("gj.u")
    public int field2108;

    @ObfuscatedName("gj.e")
    public int field2117;

    @ObfuscatedName("gj.l")
    public int field2118;

    @ObfuscatedName("gj.y")
    public int field2122;

    @ObfuscatedName("gj.v")
    public int field2119;

    @ObfuscatedName("gj.f")
    public int field2121;

    @ObfuscatedName("gj.n(Lfr;I)V")
    public void method3162(class181 arg0) {
        if (arg0.field2040 > this.field2112) {
            arg0.field2040 = this.field2112;
        }
        if (arg0.field2041 < this.field2112) {
            arg0.field2041 = this.field2112;
        }
        if (arg0.field2035 > this.field2116) {
            arg0.field2035 = this.field2116;
        }
        if (arg0.field2042 < this.field2116) {
            arg0.field2042 = this.field2116;
        }
    }

    @ObfuscatedName("gj.c(IIII)Z")
    public boolean method3174(int arg0, int arg1, int arg2) {
        if (arg0 >= this.field2120 && arg0 < this.field2120 + this.field2109) {
            return arg1 >= (this.field2114 << 3) + (this.field2113 << 6) && arg1 <= (this.field2113 << 6) + (this.field2108 << 3) + 7 && arg2 >= (this.field2115 << 3) + (this.field2111 << 6) && arg2 <= (this.field2117 << 3) + (this.field2111 << 6) + 7;
        } else {
            return false;
        }
    }

    @ObfuscatedName("gj.m(III)Z")
    public boolean method3180(int arg0, int arg1) {
        return arg0 >= (this.field2118 << 3) + (this.field2112 << 6) && arg0 <= (this.field2119 << 3) + (this.field2112 << 6) + 7 && arg1 >= (this.field2122 << 3) + (this.field2116 << 6) && arg1 <= (this.field2121 << 3) + (this.field2116 << 6) + 7;
    }

    @ObfuscatedName("gj.k(IIII)[I")
    public int[] method3175(int arg0, int arg1, int arg2) {
        return this.method3174(arg0, arg1, arg2) ? new int[] { this.field2118 * 8 - this.field2114 * 8 + this.field2112 * 64 - this.field2113 * 64 + arg1, this.field2122 * 8 - this.field2115 * 8 + this.field2116 * 64 - this.field2111 * 64 + arg2 } : null;
    }

    @ObfuscatedName("gj.o(III)Liy;")
    public class258 method3166(int arg0, int arg1) {
        if (this.method3180(arg0, arg1)) {
            int var3 = this.field2114 * 8 - this.field2118 * 8 + this.field2113 * 64 - this.field2112 * 64 + arg0;
            int var4 = this.field2115 * 8 - this.field2122 * 8 + this.field2111 * 64 - this.field2116 * 64 + arg1;
            return new class258(this.field2120, var3, var4);
        } else {
            return null;
        }
    }

    @ObfuscatedName("gj.g(Lot;I)V")
    public void method3179(class400 arg0) {
        this.field2120 = arg0.method6217();
        this.field2109 = arg0.method6217();
        this.field2113 = arg0.method6219();
        this.field2114 = arg0.method6217();
        this.field2108 = arg0.method6217();
        this.field2111 = arg0.method6219();
        this.field2115 = arg0.method6217();
        this.field2117 = arg0.method6217();
        this.field2112 = arg0.method6219();
        this.field2118 = arg0.method6217();
        this.field2119 = arg0.method6217();
        this.field2116 = arg0.method6219();
        this.field2122 = arg0.method6217();
        this.field2121 = arg0.method6217();
        this.method3467();
    }

    @ObfuscatedName("gj.z(I)V")
    public void method3467() {
    }
}
