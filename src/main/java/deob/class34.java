package deob;

@ObfuscatedName("ax")
public class class34 implements class38 {

    @ObfuscatedName("ax.z")
    public int field272;

    @ObfuscatedName("ax.n")
    public int field269;

    @ObfuscatedName("ax.v")
    public int field268;

    @ObfuscatedName("ax.u")
    public int field270;

    @ObfuscatedName("ax.r")
    public int field271;

    @ObfuscatedName("ax.p")
    public int field273;

    @ObfuscatedName("ax.z(Lac;I)V")
    public void method210(class27 arg0) {
        if (arg0.field209 > this.field271) {
            arg0.field209 = this.field271;
        }
        if (arg0.field213 < this.field271) {
            arg0.field213 = this.field271;
        }
        if (arg0.field214 > this.field273) {
            arg0.field214 = this.field273;
        }
        if (arg0.field206 < this.field273) {
            arg0.field206 = this.field273;
        }
    }

    @ObfuscatedName("ax.n(IIII)Z")
    public boolean method211(int arg0, int arg1, int arg2) {
        if (arg0 >= this.field272 && arg0 < this.field272 + this.field269) {
            return arg1 >> 6 == this.field268 && arg2 >> 6 == this.field270;
        } else {
            return false;
        }
    }

    @ObfuscatedName("ax.v(III)Z")
    public boolean method212(int arg0, int arg1) {
        return arg0 >> 6 == this.field271 && arg1 >> 6 == this.field273;
    }

    @ObfuscatedName("ax.u(IIII)[I")
    public int[] method223(int arg0, int arg1, int arg2) {
        return this.method211(arg0, arg1, arg2) ? new int[] { this.field271 * 64 - this.field268 * 64 + arg1, this.field273 * 64 - this.field270 * 64 + arg2 } : null;
    }

    @ObfuscatedName("ax.r(III)Lhb;")
    public class214 method214(int arg0, int arg1) {
        if (this.method212(arg0, arg1)) {
            int var3 = this.field268 * 64 - this.field271 * 64 + arg0;
            int var4 = this.field270 * 64 - this.field273 * 64 + arg1;
            return new class214(this.field272, var3, var4);
        } else {
            return null;
        }
    }

    @ObfuscatedName("ax.p(Lkl;B)V")
    public void method215(class300 arg0) {
        this.field272 = arg0.method4990();
        this.field269 = arg0.method4990();
        this.field268 = arg0.method4992();
        this.field270 = arg0.method4992();
        this.field271 = arg0.method4992();
        this.field273 = arg0.method4992();
        this.method516();
    }

    @ObfuscatedName("ax.q(I)V")
    public void method516() {
    }
}
