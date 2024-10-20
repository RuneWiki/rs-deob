package deob;

@ObfuscatedName("gd")
public class class185 implements class201 {

    @ObfuscatedName("gd.i")
    public int field2094;

    @ObfuscatedName("gd.w")
    public int field2100;

    @ObfuscatedName("gd.s")
    public int field2103;

    @ObfuscatedName("gd.a")
    public int field2095;

    @ObfuscatedName("gd.o")
    public int field2096;

    @ObfuscatedName("gd.g")
    public int field2097;

    @ObfuscatedName("gd.e")
    public int field2093;

    @ObfuscatedName("gd.p")
    public int field2099;

    @ObfuscatedName("gd.j")
    public int field2092;

    @ObfuscatedName("gd.b")
    public int field2101;

    @ObfuscatedName("gd.i(Lfb;I)V")
    public void method3240(class181 arg0) {
        if (arg0.field2046 > this.field2096) {
            arg0.field2046 = this.field2096;
        }
        if (arg0.field2047 < this.field2096) {
            arg0.field2047 = this.field2096;
        }
        if (arg0.field2048 > this.field2097) {
            arg0.field2048 = this.field2097;
        }
        if (arg0.field2052 < this.field2097) {
            arg0.field2052 = this.field2097;
        }
    }

    @ObfuscatedName("gd.w(IIII)Z")
    public boolean method3241(int arg0, int arg1, int arg2) {
        if (arg0 >= this.field2094 && arg0 < this.field2100 + this.field2094) {
            return arg1 >= (this.field2103 << 6) + (this.field2093 << 3) && arg1 <= (this.field2103 << 6) + (this.field2093 << 3) + 7 && arg2 >= (this.field2099 << 3) + (this.field2095 << 6) && arg2 <= (this.field2099 << 3) + (this.field2095 << 6) + 7;
        } else {
            return false;
        }
    }

    @ObfuscatedName("gd.s(III)Z")
    public boolean method3242(int arg0, int arg1) {
        return arg0 >= (this.field2096 << 6) + (this.field2092 << 3) && arg0 <= (this.field2096 << 6) + (this.field2092 << 3) + 7 && arg1 >= (this.field2101 << 3) + (this.field2097 << 6) && arg1 <= (this.field2101 << 3) + (this.field2097 << 6) + 7;
    }

    @ObfuscatedName("gd.a(IIIB)[I")
    public int[] method3243(int arg0, int arg1, int arg2) {
        return this.method3241(arg0, arg1, arg2) ? new int[] { this.field2092 * 8 - this.field2093 * 8 + this.field2096 * 64 - this.field2103 * 64 + arg1, this.field2101 * 8 - this.field2099 * 8 + this.field2097 * 64 - this.field2095 * 64 + arg2 } : null;
    }

    @ObfuscatedName("gd.o(III)Lie;")
    public class258 method3262(int arg0, int arg1) {
        if (this.method3242(arg0, arg1)) {
            int var3 = this.field2093 * 8 - this.field2092 * 8 + this.field2103 * 64 - this.field2096 * 64 + arg0;
            int var4 = this.field2099 * 8 - this.field2101 * 8 + this.field2095 * 64 - this.field2097 * 64 + arg1;
            return new class258(this.field2094, var3, var4);
        } else {
            return null;
        }
    }

    @ObfuscatedName("gd.g(Lop;I)V")
    public void method3245(class401 arg0) {
        this.field2094 = arg0.method6240();
        this.field2100 = arg0.method6240();
        this.field2103 = arg0.method6242();
        this.field2093 = arg0.method6240();
        this.field2095 = arg0.method6242();
        this.field2099 = arg0.method6240();
        this.field2096 = arg0.method6242();
        this.field2092 = arg0.method6240();
        this.field2097 = arg0.method6242();
        this.field2101 = arg0.method6240();
        this.method3520();
    }

    @ObfuscatedName("gd.e(I)V")
    public void method3520() {
    }
}
