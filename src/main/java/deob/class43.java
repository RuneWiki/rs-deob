package deob;

@ObfuscatedName("ah")
public class class43 implements class38 {

    @ObfuscatedName("ah.a")
    public int field359;

    @ObfuscatedName("ah.t")
    public int field350;

    @ObfuscatedName("ah.n")
    public int field352;

    @ObfuscatedName("ah.q")
    public int field358;

    @ObfuscatedName("ah.v")
    public int field354;

    @ObfuscatedName("ah.l")
    public int field355;

    @ObfuscatedName("ah.c")
    public int field356;

    @ObfuscatedName("ah.o")
    public int field351;

    @ObfuscatedName("ah.i")
    public int field360;

    @ObfuscatedName("ah.d")
    public int field353;

    @ObfuscatedName("ah.a(Laa;B)V")
    public void method248(class27 arg0) {
        if (arg0.field209 > this.field354) {
            arg0.field209 = this.field354;
        }
        if (arg0.field208 < this.field354) {
            arg0.field208 = this.field354;
        }
        if (arg0.field211 > this.field355) {
            arg0.field211 = this.field355;
        }
        if (arg0.field210 < this.field355) {
            arg0.field210 = this.field355;
        }
    }

    @ObfuscatedName("ah.t(IIII)Z")
    public boolean method225(int arg0, int arg1, int arg2) {
        if (arg0 >= this.field359 && arg0 < this.field359 + this.field350) {
            return arg1 >= (this.field356 << 3) + (this.field352 << 6) && arg1 <= (this.field356 << 3) + (this.field352 << 6) + 7 && arg2 >= (this.field358 << 6) + (this.field351 << 3) && arg2 <= (this.field358 << 6) + (this.field351 << 3) + 7;
        } else {
            return false;
        }
    }

    @ObfuscatedName("ah.n(III)Z")
    public boolean method226(int arg0, int arg1) {
        return arg0 >= (this.field360 << 3) + (this.field354 << 6) && arg0 <= (this.field360 << 3) + (this.field354 << 6) + 7 && arg1 >= (this.field355 << 6) + (this.field353 << 3) && arg1 <= (this.field355 << 6) + (this.field353 << 3) + 7;
    }

    @ObfuscatedName("ah.q(IIII)[I")
    public int[] method233(int arg0, int arg1, int arg2) {
        return this.method225(arg0, arg1, arg2) ? new int[] { this.field360 * 8 - this.field356 * 8 + this.field354 * 64 - this.field352 * 64 + arg1, this.field353 * 8 - this.field351 * 8 + this.field355 * 64 - this.field358 * 64 + arg2 } : null;
    }

    @ObfuscatedName("ah.v(IIS)Lhf;")
    public class214 method227(int arg0, int arg1) {
        if (this.method226(arg0, arg1)) {
            int var3 = this.field356 * 8 - this.field360 * 8 + this.field352 * 64 - this.field354 * 64 + arg0;
            int var4 = this.field351 * 8 - this.field353 * 8 + this.field358 * 64 - this.field355 * 64 + arg1;
            return new class214(this.field359, var3, var4);
        } else {
            return null;
        }
    }

    @ObfuscatedName("ah.l(Lkc;I)V")
    public void method229(class300 arg0) {
        this.field359 = arg0.method5123();
        this.field350 = arg0.method5123();
        this.field352 = arg0.method5166();
        this.field356 = arg0.method5123();
        this.field358 = arg0.method5166();
        this.field351 = arg0.method5123();
        this.field354 = arg0.method5166();
        this.field360 = arg0.method5123();
        this.field355 = arg0.method5166();
        this.field353 = arg0.method5123();
        this.method695();
    }

    @ObfuscatedName("ah.c(B)V")
    public void method695() {
    }
}
