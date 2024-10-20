package deob;

@ObfuscatedName("gk")
public class class184 implements class187 {

    @ObfuscatedName("gk.f")
    public int field2120;

    @ObfuscatedName("gk.e")
    public int field2117;

    @ObfuscatedName("gk.v")
    public int field2118;

    @ObfuscatedName("gk.y")
    public int field2116;

    @ObfuscatedName("gk.j")
    public int field2119;

    @ObfuscatedName("gk.o")
    public int field2121;

    @ObfuscatedName("gk.f(Lfa;B)V")
    public void method2991(class167 arg0) {
        if (arg0.field1973 > this.field2119) {
            arg0.field1973 = this.field2119;
        }
        if (arg0.field1980 < this.field2119) {
            arg0.field1980 = this.field2119;
        }
        if (arg0.field1976 > this.field2121) {
            arg0.field1976 = this.field2121;
        }
        if (arg0.field1968 < this.field2121) {
            arg0.field1968 = this.field2121;
        }
    }

    @ObfuscatedName("gk.e(IIII)Z")
    public boolean method3004(int arg0, int arg1, int arg2) {
        if (arg0 >= this.field2120 && arg0 < this.field2120 + this.field2117) {
            return arg1 >> 6 == this.field2118 && arg2 >> 6 == this.field2116;
        } else {
            return false;
        }
    }

    @ObfuscatedName("gk.v(III)Z")
    public boolean method3017(int arg0, int arg1) {
        return arg0 >> 6 == this.field2119 && arg1 >> 6 == this.field2121;
    }

    @ObfuscatedName("gk.y(IIII)[I")
    public int[] method2993(int arg0, int arg1, int arg2) {
        return this.method3004(arg0, arg1, arg2) ? new int[] { this.field2119 * 64 - this.field2118 * 64 + arg1, this.field2121 * 64 - this.field2116 * 64 + arg2 } : null;
    }

    @ObfuscatedName("gk.j(IIB)Liw;")
    public class244 method2994(int arg0, int arg1) {
        if (this.method3017(arg0, arg1)) {
            int var3 = this.field2118 * 64 - this.field2119 * 64 + arg0;
            int var4 = this.field2116 * 64 - this.field2121 * 64 + arg1;
            return new class244(this.field2120, var3, var4);
        } else {
            return null;
        }
    }

    @ObfuscatedName("gk.o(Lnt;I)V")
    public void method2995(class384 arg0) {
        this.field2120 = arg0.method5902();
        this.field2117 = arg0.method5902();
        this.field2118 = arg0.method5899();
        this.field2116 = arg0.method5899();
        this.field2119 = arg0.method5899();
        this.field2121 = arg0.method5899();
        this.method3330();
    }

    @ObfuscatedName("gk.m(I)V")
    public void method3330() {
    }
}
