package deob;

@ObfuscatedName("at")
public class class34 implements class38 {

    @ObfuscatedName("at.s")
    public int field279;

    @ObfuscatedName("at.j")
    public int field273;

    @ObfuscatedName("at.i")
    public int field272;

    @ObfuscatedName("at.k")
    public int field281;

    @ObfuscatedName("at.u")
    public int field274;

    @ObfuscatedName("at.n")
    public int field275;

    @ObfuscatedName("at.s(Lav;I)V")
    public void method210(class27 arg0) {
        if (arg0.field207 > this.field274) {
            arg0.field207 = this.field274;
        }
        if (arg0.field209 < this.field274) {
            arg0.field209 = this.field274;
        }
        if (arg0.field211 > this.field275) {
            arg0.field211 = this.field275;
        }
        if (arg0.field212 < this.field275) {
            arg0.field212 = this.field275;
        }
    }

    @ObfuscatedName("at.j(IIII)Z")
    public boolean method187(int arg0, int arg1, int arg2) {
        if (arg0 >= this.field279 && arg0 < this.field279 + this.field273) {
            return arg1 >> 6 == this.field272 && arg2 >> 6 == this.field281;
        } else {
            return false;
        }
    }

    @ObfuscatedName("at.i(III)Z")
    public boolean method208(int arg0, int arg1) {
        return arg0 >> 6 == this.field274 && arg1 >> 6 == this.field275;
    }

    @ObfuscatedName("at.k(IIII)[I")
    public int[] method189(int arg0, int arg1, int arg2) {
        return this.method187(arg0, arg1, arg2) ? new int[] { this.field274 * 64 - this.field272 * 64 + arg1, this.field275 * 64 - this.field281 * 64 + arg2 } : null;
    }

    @ObfuscatedName("at.u(III)Lhd;")
    public class214 method185(int arg0, int arg1) {
        if (this.method208(arg0, arg1)) {
            int var3 = this.field272 * 64 - this.field274 * 64 + arg0;
            int var4 = this.field281 * 64 - this.field275 * 64 + arg1;
            return new class214(this.field279, var3, var4);
        } else {
            return null;
        }
    }

    @ObfuscatedName("at.n(Lky;I)V")
    public void method191(class300 arg0) {
        this.field279 = arg0.method5179();
        this.field273 = arg0.method5179();
        this.field272 = arg0.method5054();
        this.field281 = arg0.method5054();
        this.field274 = arg0.method5054();
        this.field275 = arg0.method5054();
        this.method487();
    }

    @ObfuscatedName("at.t(B)V")
    public void method487() {
    }
}
