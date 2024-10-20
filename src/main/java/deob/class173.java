package deob;

@ObfuscatedName("fy")
public class class173 implements class186 {

    @ObfuscatedName("fy.v")
    public int field2043;

    @ObfuscatedName("fy.n")
    public int field2048;

    @ObfuscatedName("fy.f")
    public int field2038;

    @ObfuscatedName("fy.y")
    public int field2036;

    @ObfuscatedName("fy.p")
    public int field2037;

    @ObfuscatedName("fy.j")
    public int field2047;

    @ObfuscatedName("fy.r")
    public int field2034;

    @ObfuscatedName("fy.b")
    public int field2040;

    @ObfuscatedName("fy.d")
    public int field2041;

    @ObfuscatedName("fy.s")
    public int field2042;

    @ObfuscatedName("fy.u")
    public int field2033;

    @ObfuscatedName("fy.l")
    public int field2044;

    @ObfuscatedName("fy.o")
    public int field2045;

    @ObfuscatedName("fy.c")
    public int field2046;

    @ObfuscatedName("fy.v(Lfo;I)V")
    public void method2996(class166 arg0) {
        if (arg0.field1968 > this.field2037) {
            arg0.field1968 = this.field2037;
        }
        if (arg0.field1959 < this.field2037) {
            arg0.field1959 = this.field2037;
        }
        if (arg0.field1967 > this.field2047) {
            arg0.field1967 = this.field2047;
        }
        if (arg0.field1966 < this.field2047) {
            arg0.field1966 = this.field2047;
        }
    }

    @ObfuscatedName("fy.n(IIII)Z")
    public boolean method2995(int arg0, int arg1, int arg2) {
        if (arg0 >= this.field2043 && arg0 < this.field2048 + this.field2043) {
            return arg1 >= (this.field2038 << 6) + (this.field2034 << 3) && arg1 <= (this.field2041 << 3) + (this.field2038 << 6) + 7 && arg2 >= (this.field2040 << 3) + (this.field2036 << 6) && arg2 <= (this.field2042 << 3) + (this.field2036 << 6) + 7;
        } else {
            return false;
        }
    }

    @ObfuscatedName("fy.f(IIB)Z")
    public boolean method2998(int arg0, int arg1) {
        return arg0 >= (this.field2037 << 6) + (this.field2033 << 3) && arg0 <= (this.field2045 << 3) + (this.field2037 << 6) + 7 && arg1 >= (this.field2047 << 6) + (this.field2044 << 3) && arg1 <= (this.field2047 << 6) + (this.field2046 << 3) + 7;
    }

    @ObfuscatedName("fy.y(IIII)[I")
    public int[] method3002(int arg0, int arg1, int arg2) {
        return this.method2995(arg0, arg1, arg2) ? new int[] { this.field2033 * 8 - this.field2034 * 8 + this.field2037 * 64 - this.field2038 * 64 + arg1, this.field2044 * 8 - this.field2040 * 8 + this.field2047 * 64 - this.field2036 * 64 + arg2 } : null;
    }

    @ObfuscatedName("fy.p(III)Lii;")
    public class243 method3000(int arg0, int arg1) {
        if (this.method2998(arg0, arg1)) {
            int var3 = this.field2034 * 8 - this.field2033 * 8 + this.field2038 * 64 - this.field2037 * 64 + arg0;
            int var4 = this.field2040 * 8 - this.field2044 * 8 + this.field2036 * 64 - this.field2047 * 64 + arg1;
            return new class243(this.field2043, var3, var4);
        } else {
            return null;
        }
    }

    @ObfuscatedName("fy.j(Lnd;I)V")
    public void method3001(class383 arg0) {
        this.field2043 = arg0.method5965();
        this.field2048 = arg0.method5965();
        this.field2038 = arg0.method5967();
        this.field2034 = arg0.method5965();
        this.field2041 = arg0.method5965();
        this.field2036 = arg0.method5967();
        this.field2040 = arg0.method5965();
        this.field2042 = arg0.method5965();
        this.field2037 = arg0.method5967();
        this.field2033 = arg0.method5965();
        this.field2045 = arg0.method5965();
        this.field2047 = arg0.method5967();
        this.field2044 = arg0.method5965();
        this.field2046 = arg0.method5965();
        this.method3288();
    }

    @ObfuscatedName("fy.r(I)V")
    public void method3288() {
    }
}
