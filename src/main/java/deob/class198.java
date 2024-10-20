package deob;

@ObfuscatedName("gy")
public class class198 implements class201 {

    @ObfuscatedName("gy.l")
    public int field2204;

    @ObfuscatedName("gy.q")
    public int field2202;

    @ObfuscatedName("gy.f")
    public int field2206;

    @ObfuscatedName("gy.j")
    public int field2205;

    @ObfuscatedName("gy.m")
    public int field2203;

    @ObfuscatedName("gy.k")
    public int field2207;

    @ObfuscatedName("gy.l(Lfr;I)V")
    public void method3212(class181 arg0) {
        if (arg0.field2042 > this.field2203) {
            arg0.field2042 = this.field2203;
        }
        if (arg0.field2048 < this.field2203) {
            arg0.field2048 = this.field2203;
        }
        if (arg0.field2050 > this.field2207) {
            arg0.field2050 = this.field2207;
        }
        if (arg0.field2051 < this.field2207) {
            arg0.field2051 = this.field2207;
        }
    }

    @ObfuscatedName("gy.q(IIII)Z")
    public boolean method3214(int arg0, int arg1, int arg2) {
        if (arg0 >= this.field2204 && arg0 < this.field2204 + this.field2202) {
            return arg1 >> 6 == this.field2206 && arg2 >> 6 == this.field2205;
        } else {
            return false;
        }
    }

    @ObfuscatedName("gy.f(III)Z")
    public boolean method3219(int arg0, int arg1) {
        return arg0 >> 6 == this.field2203 && arg1 >> 6 == this.field2207;
    }

    @ObfuscatedName("gy.j(IIIB)[I")
    public int[] method3225(int arg0, int arg1, int arg2) {
        return this.method3214(arg0, arg1, arg2) ? new int[] { this.field2203 * 64 - this.field2206 * 64 + arg1, this.field2207 * 64 - this.field2205 * 64 + arg2 } : null;
    }

    @ObfuscatedName("gy.m(III)Lic;")
    public class258 method3216(int arg0, int arg1) {
        if (this.method3219(arg0, arg1)) {
            int var3 = this.field2206 * 64 - this.field2203 * 64 + arg0;
            int var4 = this.field2205 * 64 - this.field2207 * 64 + arg1;
            return new class258(this.field2204, var3, var4);
        } else {
            return null;
        }
    }

    @ObfuscatedName("gy.k(Lot;B)V")
    public void method3217(class401 arg0) {
        this.field2204 = arg0.method6272();
        this.field2202 = arg0.method6272();
        this.field2206 = arg0.method6284();
        this.field2205 = arg0.method6284();
        this.field2203 = arg0.method6284();
        this.field2207 = arg0.method6284();
        this.method3569();
    }

    @ObfuscatedName("gy.t(B)V")
    public void method3569() {
    }
}
