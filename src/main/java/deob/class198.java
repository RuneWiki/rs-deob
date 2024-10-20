package deob;

@ObfuscatedName("gf")
public class class198 implements class201 {

    @ObfuscatedName("gf.i")
    public int field2195;

    @ObfuscatedName("gf.w")
    public int field2203;

    @ObfuscatedName("gf.s")
    public int field2199;

    @ObfuscatedName("gf.a")
    public int field2197;

    @ObfuscatedName("gf.o")
    public int field2194;

    @ObfuscatedName("gf.g")
    public int field2198;

    @ObfuscatedName("gf.i(Lfb;I)V")
    public void method3240(class181 arg0) {
        if (arg0.field2046 > this.field2194) {
            arg0.field2046 = this.field2194;
        }
        if (arg0.field2047 < this.field2194) {
            arg0.field2047 = this.field2194;
        }
        if (arg0.field2048 > this.field2198) {
            arg0.field2048 = this.field2198;
        }
        if (arg0.field2052 < this.field2198) {
            arg0.field2052 = this.field2198;
        }
    }

    @ObfuscatedName("gf.w(IIII)Z")
    public boolean method3241(int arg0, int arg1, int arg2) {
        if (arg0 >= this.field2195 && arg0 < this.field2203 + this.field2195) {
            return arg1 >> 6 == this.field2199 && arg2 >> 6 == this.field2197;
        } else {
            return false;
        }
    }

    @ObfuscatedName("gf.s(III)Z")
    public boolean method3242(int arg0, int arg1) {
        return arg0 >> 6 == this.field2194 && arg1 >> 6 == this.field2198;
    }

    @ObfuscatedName("gf.a(IIIB)[I")
    public int[] method3243(int arg0, int arg1, int arg2) {
        return this.method3241(arg0, arg1, arg2) ? new int[] { this.field2194 * 64 - this.field2199 * 64 + arg1, this.field2198 * 64 - this.field2197 * 64 + arg2 } : null;
    }

    @ObfuscatedName("gf.o(III)Lie;")
    public class258 method3262(int arg0, int arg1) {
        if (this.method3242(arg0, arg1)) {
            int var3 = this.field2199 * 64 - this.field2194 * 64 + arg0;
            int var4 = this.field2197 * 64 - this.field2198 * 64 + arg1;
            return new class258(this.field2195, var3, var4);
        } else {
            return null;
        }
    }

    @ObfuscatedName("gf.g(Lop;I)V")
    public void method3245(class401 arg0) {
        this.field2195 = arg0.method6240();
        this.field2203 = arg0.method6240();
        this.field2199 = arg0.method6242();
        this.field2197 = arg0.method6242();
        this.field2194 = arg0.method6242();
        this.field2198 = arg0.method6242();
        this.method3582();
    }

    @ObfuscatedName("gf.e(B)V")
    public void method3582() {
    }
}
