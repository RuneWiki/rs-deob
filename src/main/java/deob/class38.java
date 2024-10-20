package deob;

@ObfuscatedName("ad")
public class class38 implements class32 {

    @ObfuscatedName("ad.f")
    public int field353;

    @ObfuscatedName("ad.l")
    public int field358;

    @ObfuscatedName("ad.w")
    public int field348;

    @ObfuscatedName("ad.s")
    public int field349;

    @ObfuscatedName("ad.e")
    public int field354;

    @ObfuscatedName("ad.a")
    public int field351;

    @ObfuscatedName("ad.c")
    public int field352;

    @ObfuscatedName("ad.p")
    public int field355;

    @ObfuscatedName("ad.r")
    public int field346;

    @ObfuscatedName("ad.m")
    public int field350;

    @ObfuscatedName("ad.f(Lh;B)V")
    public void method121(class21 arg0) {
        if (arg0.field191 > this.field354) {
            arg0.field191 = this.field354;
        }
        if (arg0.field192 < this.field354) {
            arg0.field192 = this.field354;
        }
        if (arg0.field187 > this.field351) {
            arg0.field187 = this.field351;
        }
        if (arg0.field194 < this.field351) {
            arg0.field194 = this.field351;
        }
    }

    @ObfuscatedName("ad.l(IIIB)Z")
    public boolean method122(int arg0, int arg1, int arg2) {
        if (arg0 >= this.field353 && arg0 < this.field358 + this.field353) {
            return arg1 >= (this.field352 << 3) + (this.field348 << 6) && arg1 <= (this.field352 << 3) + (this.field348 << 6) + 7 && arg2 >= (this.field355 << 3) + (this.field349 << 6) && arg2 <= (this.field355 << 3) + (this.field349 << 6) + 7;
        } else {
            return false;
        }
    }

    @ObfuscatedName("ad.w(IIB)Z")
    public boolean method131(int arg0, int arg1) {
        return arg0 >= (this.field354 << 6) + (this.field346 << 3) && arg0 <= (this.field354 << 6) + (this.field346 << 3) + 7 && arg1 >= (this.field351 << 6) + (this.field350 << 3) && arg1 <= (this.field351 << 6) + (this.field350 << 3) + 7;
    }

    @ObfuscatedName("ad.s(IIII)[I")
    public int[] method124(int arg0, int arg1, int arg2) {
        return this.method122(arg0, arg1, arg2) ? new int[] { this.field346 * 8 - this.field352 * 8 + this.field354 * 64 - this.field348 * 64 + arg1, this.field350 * 8 - this.field355 * 8 + this.field351 * 64 - this.field349 * 64 + arg2 } : null;
    }

    @ObfuscatedName("ad.e(IIB)Lhx;")
    public class229 method125(int arg0, int arg1) {
        if (this.method131(arg0, arg1)) {
            int var3 = this.field352 * 8 - this.field346 * 8 + this.field348 * 64 - this.field354 * 64 + arg0;
            int var4 = this.field355 * 8 - this.field350 * 8 + this.field349 * 64 - this.field351 * 64 + arg1;
            return new class229(this.field353, var3, var4);
        } else {
            return null;
        }
    }

    @ObfuscatedName("ad.c(Lgm;I)V")
    public void method126(class185 arg0) {
        this.field353 = arg0.method3344();
        this.field358 = arg0.method3344();
        this.field348 = arg0.method3346();
        this.field352 = arg0.method3344();
        this.field349 = arg0.method3346();
        this.field355 = arg0.method3344();
        this.field354 = arg0.method3346();
        this.field346 = arg0.method3344();
        this.field351 = arg0.method3346();
        this.field350 = arg0.method3344();
        this.method611();
    }

    @ObfuscatedName("ad.p(I)V")
    public void method611() {
    }
}
