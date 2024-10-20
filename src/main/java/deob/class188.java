package deob;

@ObfuscatedName("gn")
public class class188 implements class201 {

    @ObfuscatedName("gn.i")
    public int field2115;

    @ObfuscatedName("gn.w")
    public int field2118;

    @ObfuscatedName("gn.s")
    public int field2117;

    @ObfuscatedName("gn.a")
    public int field2116;

    @ObfuscatedName("gn.o")
    public int field2119;

    @ObfuscatedName("gn.g")
    public int field2131;

    @ObfuscatedName("gn.e")
    public int field2121;

    @ObfuscatedName("gn.p")
    public int field2124;

    @ObfuscatedName("gn.j")
    public int field2123;

    @ObfuscatedName("gn.b")
    public int field2120;

    @ObfuscatedName("gn.x")
    public int field2125;

    @ObfuscatedName("gn.y")
    public int field2126;

    @ObfuscatedName("gn.k")
    public int field2122;

    @ObfuscatedName("gn.t")
    public int field2128;

    @ObfuscatedName("gn.i(Lfb;I)V")
    public void method3240(class181 arg0) {
        if (arg0.field2046 > this.field2119) {
            arg0.field2046 = this.field2119;
        }
        if (arg0.field2047 < this.field2119) {
            arg0.field2047 = this.field2119;
        }
        if (arg0.field2048 > this.field2131) {
            arg0.field2048 = this.field2131;
        }
        if (arg0.field2052 < this.field2131) {
            arg0.field2052 = this.field2131;
        }
    }

    @ObfuscatedName("gn.w(IIII)Z")
    public boolean method3241(int arg0, int arg1, int arg2) {
        if (arg0 >= this.field2115 && arg0 < this.field2118 + this.field2115) {
            return arg1 >= (this.field2121 << 3) + (this.field2117 << 6) && arg1 <= (this.field2123 << 3) + (this.field2117 << 6) + 7 && arg2 >= (this.field2124 << 3) + (this.field2116 << 6) && arg2 <= (this.field2120 << 3) + (this.field2116 << 6) + 7;
        } else {
            return false;
        }
    }

    @ObfuscatedName("gn.s(III)Z")
    public boolean method3242(int arg0, int arg1) {
        return arg0 >= (this.field2125 << 3) + (this.field2119 << 6) && arg0 <= (this.field2122 << 3) + (this.field2119 << 6) + 7 && arg1 >= (this.field2131 << 6) + (this.field2126 << 3) && arg1 <= (this.field2131 << 6) + (this.field2128 << 3) + 7;
    }

    @ObfuscatedName("gn.a(IIIB)[I")
    public int[] method3243(int arg0, int arg1, int arg2) {
        return this.method3241(arg0, arg1, arg2) ? new int[] { this.field2125 * 8 - this.field2121 * 8 + this.field2119 * 64 - this.field2117 * 64 + arg1, this.field2126 * 8 - this.field2124 * 8 + this.field2131 * 64 - this.field2116 * 64 + arg2 } : null;
    }

    @ObfuscatedName("gn.o(III)Lie;")
    public class258 method3262(int arg0, int arg1) {
        if (this.method3242(arg0, arg1)) {
            int var3 = this.field2121 * 8 - this.field2125 * 8 + this.field2117 * 64 - this.field2119 * 64 + arg0;
            int var4 = this.field2124 * 8 - this.field2126 * 8 + this.field2116 * 64 - this.field2131 * 64 + arg1;
            return new class258(this.field2115, var3, var4);
        } else {
            return null;
        }
    }

    @ObfuscatedName("gn.g(Lop;I)V")
    public void method3245(class401 arg0) {
        this.field2115 = arg0.method6240();
        this.field2118 = arg0.method6240();
        this.field2117 = arg0.method6242();
        this.field2121 = arg0.method6240();
        this.field2123 = arg0.method6240();
        this.field2116 = arg0.method6242();
        this.field2124 = arg0.method6240();
        this.field2120 = arg0.method6240();
        this.field2119 = arg0.method6242();
        this.field2125 = arg0.method6240();
        this.field2122 = arg0.method6240();
        this.field2131 = arg0.method6242();
        this.field2126 = arg0.method6240();
        this.field2128 = arg0.method6240();
        this.method3530();
    }

    @ObfuscatedName("gn.e(I)V")
    public void method3530() {
    }
}
