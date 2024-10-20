package deob;

@ObfuscatedName("fr")
public class class174 implements class187 {

    @ObfuscatedName("fr.f")
    public int field2044;

    @ObfuscatedName("fr.e")
    public int field2034;

    @ObfuscatedName("fr.v")
    public int field2035;

    @ObfuscatedName("fr.y")
    public int field2047;

    @ObfuscatedName("fr.j")
    public int field2037;

    @ObfuscatedName("fr.o")
    public int field2038;

    @ObfuscatedName("fr.m")
    public int field2050;

    @ObfuscatedName("fr.r")
    public int field2040;

    @ObfuscatedName("fr.h")
    public int field2041;

    @ObfuscatedName("fr.d")
    public int field2042;

    @ObfuscatedName("fr.z")
    public int field2043;

    @ObfuscatedName("fr.b")
    public int field2036;

    @ObfuscatedName("fr.i")
    public int field2045;

    @ObfuscatedName("fr.k")
    public int field2046;

    @ObfuscatedName("fr.f(Lfa;B)V")
    public void method2991(class167 arg0) {
        if (arg0.field1973 > this.field2037) {
            arg0.field1973 = this.field2037;
        }
        if (arg0.field1980 < this.field2037) {
            arg0.field1980 = this.field2037;
        }
        if (arg0.field1976 > this.field2038) {
            arg0.field1976 = this.field2038;
        }
        if (arg0.field1968 < this.field2038) {
            arg0.field1968 = this.field2038;
        }
    }

    @ObfuscatedName("fr.e(IIII)Z")
    public boolean method3004(int arg0, int arg1, int arg2) {
        if (arg0 >= this.field2044 && arg0 < this.field2044 + this.field2034) {
            return arg1 >= (this.field2050 << 3) + (this.field2035 << 6) && arg1 <= (this.field2041 << 3) + (this.field2035 << 6) + 7 && arg2 >= (this.field2047 << 6) + (this.field2040 << 3) && arg2 <= (this.field2047 << 6) + (this.field2042 << 3) + 7;
        } else {
            return false;
        }
    }

    @ObfuscatedName("fr.v(III)Z")
    public boolean method3017(int arg0, int arg1) {
        return arg0 >= (this.field2043 << 3) + (this.field2037 << 6) && arg0 <= (this.field2045 << 3) + (this.field2037 << 6) + 7 && arg1 >= (this.field2038 << 6) + (this.field2036 << 3) && arg1 <= (this.field2046 << 3) + (this.field2038 << 6) + 7;
    }

    @ObfuscatedName("fr.y(IIII)[I")
    public int[] method2993(int arg0, int arg1, int arg2) {
        return this.method3004(arg0, arg1, arg2) ? new int[] { this.field2043 * 8 - this.field2050 * 8 + this.field2037 * 64 - this.field2035 * 64 + arg1, this.field2036 * 8 - this.field2040 * 8 + this.field2038 * 64 - this.field2047 * 64 + arg2 } : null;
    }

    @ObfuscatedName("fr.j(IIB)Liw;")
    public class244 method2994(int arg0, int arg1) {
        if (this.method3017(arg0, arg1)) {
            int var3 = this.field2050 * 8 - this.field2043 * 8 + this.field2035 * 64 - this.field2037 * 64 + arg0;
            int var4 = this.field2040 * 8 - this.field2036 * 8 + this.field2047 * 64 - this.field2038 * 64 + arg1;
            return new class244(this.field2044, var3, var4);
        } else {
            return null;
        }
    }

    @ObfuscatedName("fr.o(Lnt;I)V")
    public void method2995(class384 arg0) {
        this.field2044 = arg0.method5902();
        this.field2034 = arg0.method5902();
        this.field2035 = arg0.method5899();
        this.field2050 = arg0.method5902();
        this.field2041 = arg0.method5902();
        this.field2047 = arg0.method5899();
        this.field2040 = arg0.method5902();
        this.field2042 = arg0.method5902();
        this.field2037 = arg0.method5899();
        this.field2043 = arg0.method5902();
        this.field2045 = arg0.method5902();
        this.field2038 = arg0.method5899();
        this.field2036 = arg0.method5902();
        this.field2046 = arg0.method5902();
        this.method3278();
    }

    @ObfuscatedName("fr.m(I)V")
    public void method3278() {
    }
}
