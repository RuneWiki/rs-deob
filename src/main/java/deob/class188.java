package deob;

@ObfuscatedName("gs")
public class class188 implements class201 {

    @ObfuscatedName("gs.l")
    public int field2116;

    @ObfuscatedName("gs.q")
    public int field2122;

    @ObfuscatedName("gs.f")
    public int field2115;

    @ObfuscatedName("gs.j")
    public int field2114;

    @ObfuscatedName("gs.m")
    public int field2117;

    @ObfuscatedName("gs.k")
    public int field2118;

    @ObfuscatedName("gs.t")
    public int field2119;

    @ObfuscatedName("gs.a")
    public int field2128;

    @ObfuscatedName("gs.e")
    public int field2121;

    @ObfuscatedName("gs.i")
    public int field2129;

    @ObfuscatedName("gs.y")
    public int field2123;

    @ObfuscatedName("gs.w")
    public int field2124;

    @ObfuscatedName("gs.g")
    public int field2120;

    @ObfuscatedName("gs.v")
    public int field2126;

    @ObfuscatedName("gs.l(Lfr;I)V")
    public void method3212(class181 arg0) {
        if (arg0.field2042 > this.field2117) {
            arg0.field2042 = this.field2117;
        }
        if (arg0.field2048 < this.field2117) {
            arg0.field2048 = this.field2117;
        }
        if (arg0.field2050 > this.field2118) {
            arg0.field2050 = this.field2118;
        }
        if (arg0.field2051 < this.field2118) {
            arg0.field2051 = this.field2118;
        }
    }

    @ObfuscatedName("gs.q(IIII)Z")
    public boolean method3214(int arg0, int arg1, int arg2) {
        if (arg0 >= this.field2116 && arg0 < this.field2122 + this.field2116) {
            return arg1 >= (this.field2119 << 3) + (this.field2115 << 6) && arg1 <= (this.field2121 << 3) + (this.field2115 << 6) + 7 && arg2 >= (this.field2128 << 3) + (this.field2114 << 6) && arg2 <= (this.field2129 << 3) + (this.field2114 << 6) + 7;
        } else {
            return false;
        }
    }

    @ObfuscatedName("gs.f(III)Z")
    public boolean method3219(int arg0, int arg1) {
        return arg0 >= (this.field2123 << 3) + (this.field2117 << 6) && arg0 <= (this.field2120 << 3) + (this.field2117 << 6) + 7 && arg1 >= (this.field2124 << 3) + (this.field2118 << 6) && arg1 <= (this.field2126 << 3) + (this.field2118 << 6) + 7;
    }

    @ObfuscatedName("gs.j(IIIB)[I")
    public int[] method3225(int arg0, int arg1, int arg2) {
        return this.method3214(arg0, arg1, arg2) ? new int[] { this.field2123 * 8 - this.field2119 * 8 + this.field2117 * 64 - this.field2115 * 64 + arg1, this.field2124 * 8 - this.field2128 * 8 + this.field2118 * 64 - this.field2114 * 64 + arg2 } : null;
    }

    @ObfuscatedName("gs.m(III)Lic;")
    public class258 method3216(int arg0, int arg1) {
        if (this.method3219(arg0, arg1)) {
            int var3 = this.field2119 * 8 - this.field2123 * 8 + this.field2115 * 64 - this.field2117 * 64 + arg0;
            int var4 = this.field2128 * 8 - this.field2124 * 8 + this.field2114 * 64 - this.field2118 * 64 + arg1;
            return new class258(this.field2116, var3, var4);
        } else {
            return null;
        }
    }

    @ObfuscatedName("gs.k(Lot;B)V")
    public void method3217(class401 arg0) {
        this.field2116 = arg0.method6272();
        this.field2122 = arg0.method6272();
        this.field2115 = arg0.method6284();
        this.field2119 = arg0.method6272();
        this.field2121 = arg0.method6272();
        this.field2114 = arg0.method6284();
        this.field2128 = arg0.method6272();
        this.field2129 = arg0.method6272();
        this.field2117 = arg0.method6284();
        this.field2123 = arg0.method6272();
        this.field2120 = arg0.method6272();
        this.field2118 = arg0.method6284();
        this.field2124 = arg0.method6272();
        this.field2126 = arg0.method6272();
        this.method3506();
    }

    @ObfuscatedName("gs.t(I)V")
    public void method3506() {
    }
}
