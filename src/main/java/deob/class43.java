package deob;

@ObfuscatedName("aa")
public class class43 implements class38 {

    @ObfuscatedName("aa.s")
    public int field340;

    @ObfuscatedName("aa.j")
    public int field348;

    @ObfuscatedName("aa.i")
    public int field341;

    @ObfuscatedName("aa.k")
    public int field342;

    @ObfuscatedName("aa.u")
    public int field343;

    @ObfuscatedName("aa.n")
    public int field344;

    @ObfuscatedName("aa.t")
    public int field339;

    @ObfuscatedName("aa.q")
    public int field346;

    @ObfuscatedName("aa.x")
    public int field347;

    @ObfuscatedName("aa.d")
    public int field345;

    @ObfuscatedName("aa.s(Lav;I)V")
    public void method210(class27 arg0) {
        if (arg0.field207 > this.field343) {
            arg0.field207 = this.field343;
        }
        if (arg0.field209 < this.field343) {
            arg0.field209 = this.field343;
        }
        if (arg0.field211 > this.field344) {
            arg0.field211 = this.field344;
        }
        if (arg0.field212 < this.field344) {
            arg0.field212 = this.field344;
        }
    }

    @ObfuscatedName("aa.j(IIII)Z")
    public boolean method187(int arg0, int arg1, int arg2) {
        if (arg0 >= this.field340 && arg0 < this.field348 + this.field340) {
            return arg1 >= (this.field341 << 6) + (this.field339 << 3) && arg1 <= (this.field341 << 6) + (this.field339 << 3) + 7 && arg2 >= (this.field346 << 3) + (this.field342 << 6) && arg2 <= (this.field346 << 3) + (this.field342 << 6) + 7;
        } else {
            return false;
        }
    }

    @ObfuscatedName("aa.i(III)Z")
    public boolean method208(int arg0, int arg1) {
        return arg0 >= (this.field347 << 3) + (this.field343 << 6) && arg0 <= (this.field347 << 3) + (this.field343 << 6) + 7 && arg1 >= (this.field345 << 3) + (this.field344 << 6) && arg1 <= (this.field345 << 3) + (this.field344 << 6) + 7;
    }

    @ObfuscatedName("aa.k(IIII)[I")
    public int[] method189(int arg0, int arg1, int arg2) {
        return this.method187(arg0, arg1, arg2) ? new int[] { this.field347 * 8 - this.field339 * 8 + this.field343 * 64 - this.field341 * 64 + arg1, this.field345 * 8 - this.field346 * 8 + this.field344 * 64 - this.field342 * 64 + arg2 } : null;
    }

    @ObfuscatedName("aa.u(III)Lhd;")
    public class214 method185(int arg0, int arg1) {
        if (this.method208(arg0, arg1)) {
            int var3 = this.field339 * 8 - this.field347 * 8 + this.field341 * 64 - this.field343 * 64 + arg0;
            int var4 = this.field346 * 8 - this.field345 * 8 + this.field342 * 64 - this.field344 * 64 + arg1;
            return new class214(this.field340, var3, var4);
        } else {
            return null;
        }
    }

    @ObfuscatedName("aa.n(Lky;I)V")
    public void method191(class300 arg0) {
        this.field340 = arg0.method5179();
        this.field348 = arg0.method5179();
        this.field341 = arg0.method5054();
        this.field339 = arg0.method5179();
        this.field342 = arg0.method5054();
        this.field346 = arg0.method5179();
        this.field343 = arg0.method5054();
        this.field347 = arg0.method5179();
        this.field344 = arg0.method5054();
        this.field345 = arg0.method5179();
        this.method627();
    }

    @ObfuscatedName("aa.t(I)V")
    public void method627() {
    }
}
