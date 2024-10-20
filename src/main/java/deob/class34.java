package deob;

@ObfuscatedName("av")
public class class34 implements class38 {

    @ObfuscatedName("av.a")
    public int field280;

    @ObfuscatedName("av.t")
    public int field273;

    @ObfuscatedName("av.n")
    public int field274;

    @ObfuscatedName("av.q")
    public int field272;

    @ObfuscatedName("av.v")
    public int field276;

    @ObfuscatedName("av.l")
    public int field277;

    @ObfuscatedName("av.a(Laa;B)V")
    public void method248(class27 arg0) {
        if (arg0.field209 > this.field276) {
            arg0.field209 = this.field276;
        }
        if (arg0.field208 < this.field276) {
            arg0.field208 = this.field276;
        }
        if (arg0.field211 > this.field277) {
            arg0.field211 = this.field277;
        }
        if (arg0.field210 < this.field277) {
            arg0.field210 = this.field277;
        }
    }

    @ObfuscatedName("av.t(IIII)Z")
    public boolean method225(int arg0, int arg1, int arg2) {
        if (arg0 >= this.field280 && arg0 < this.field280 + this.field273) {
            return arg1 >> 6 == this.field274 && arg2 >> 6 == this.field272;
        } else {
            return false;
        }
    }

    @ObfuscatedName("av.n(III)Z")
    public boolean method226(int arg0, int arg1) {
        return arg0 >> 6 == this.field276 && arg1 >> 6 == this.field277;
    }

    @ObfuscatedName("av.q(IIII)[I")
    public int[] method233(int arg0, int arg1, int arg2) {
        return this.method225(arg0, arg1, arg2) ? new int[] { this.field276 * 64 - this.field274 * 64 + arg1, this.field277 * 64 - this.field272 * 64 + arg2 } : null;
    }

    @ObfuscatedName("av.v(IIS)Lhf;")
    public class214 method227(int arg0, int arg1) {
        if (this.method226(arg0, arg1)) {
            int var3 = this.field274 * 64 - this.field276 * 64 + arg0;
            int var4 = this.field272 * 64 - this.field277 * 64 + arg1;
            return new class214(this.field280, var3, var4);
        } else {
            return null;
        }
    }

    @ObfuscatedName("av.l(Lkc;I)V")
    public void method229(class300 arg0) {
        this.field280 = arg0.method5123();
        this.field273 = arg0.method5123();
        this.field274 = arg0.method5166();
        this.field272 = arg0.method5166();
        this.field276 = arg0.method5166();
        this.field277 = arg0.method5166();
        this.method541();
    }

    @ObfuscatedName("av.c(B)V")
    public void method541() {
    }
}
