package deob;

@ObfuscatedName("fx")
public class class180 implements class201 {

    @ObfuscatedName("fx.i")
    public int field2035;

    @ObfuscatedName("fx.w")
    public int field2028;

    @ObfuscatedName("fx.s")
    public int field2033;

    @ObfuscatedName("fx.a")
    public int field2030;

    @ObfuscatedName("fx.o")
    public int field2031;

    @ObfuscatedName("fx.g")
    public int field2032;

    @ObfuscatedName("fx.e")
    public int field2034;

    @ObfuscatedName("fx.p")
    public int field2029;

    @ObfuscatedName("fx.j")
    public int field2027;

    @ObfuscatedName("fx.b")
    public int field2036;

    @ObfuscatedName("fx.i(Lfb;I)V")
    public void method3240(class181 arg0) {
        if (arg0.field2046 > this.field2034) {
            arg0.field2046 = this.field2034;
        }
        if (arg0.field2047 < this.field2027) {
            arg0.field2047 = this.field2027;
        }
        if (arg0.field2048 > this.field2029) {
            arg0.field2048 = this.field2029;
        }
        if (arg0.field2052 < this.field2036) {
            arg0.field2052 = this.field2036;
        }
    }

    @ObfuscatedName("fx.w(IIII)Z")
    public boolean method3241(int arg0, int arg1, int arg2) {
        if (arg0 >= this.field2035 && arg0 < this.field2035 + this.field2028) {
            return arg1 >> 6 >= this.field2033 && arg1 >> 6 <= this.field2031 && arg2 >> 6 >= this.field2030 && arg2 >> 6 <= this.field2032;
        } else {
            return false;
        }
    }

    @ObfuscatedName("fx.s(III)Z")
    public boolean method3242(int arg0, int arg1) {
        return arg0 >> 6 >= this.field2034 && arg0 >> 6 <= this.field2027 && arg1 >> 6 >= this.field2029 && arg1 >> 6 <= this.field2036;
    }

    @ObfuscatedName("fx.a(IIIB)[I")
    public int[] method3243(int arg0, int arg1, int arg2) {
        return this.method3241(arg0, arg1, arg2) ? new int[] { this.field2034 * 64 - this.field2033 * 64 + arg1, this.field2029 * 64 - this.field2030 * 64 + arg2 } : null;
    }

    @ObfuscatedName("fx.o(III)Lie;")
    public class258 method3262(int arg0, int arg1) {
        if (this.method3242(arg0, arg1)) {
            int var3 = this.field2033 * 64 - this.field2034 * 64 + arg0;
            int var4 = this.field2030 * 64 - this.field2029 * 64 + arg1;
            return new class258(this.field2035, var3, var4);
        } else {
            return null;
        }
    }

    @ObfuscatedName("fx.g(Lop;I)V")
    public void method3245(class401 arg0) {
        this.field2035 = arg0.method6240();
        this.field2028 = arg0.method6240();
        this.field2033 = arg0.method6242();
        this.field2030 = arg0.method6242();
        this.field2031 = arg0.method6242();
        this.field2032 = arg0.method6242();
        this.field2034 = arg0.method6242();
        this.field2029 = arg0.method6242();
        this.field2027 = arg0.method6242();
        this.field2036 = arg0.method6242();
        this.method3248();
    }

    @ObfuscatedName("fx.e(I)V")
    public void method3248() {
    }
}
