package deob;

@ObfuscatedName("ad")
public class class27 implements class43 {

    @ObfuscatedName("ad.e")
    public int field377;

    @ObfuscatedName("ad.o")
    public int field372;

    @ObfuscatedName("ad.m")
    public int field373;

    @ObfuscatedName("ad.g")
    public int field374;

    @ObfuscatedName("ad.d")
    public int field375;

    @ObfuscatedName("ad.b")
    public int field379;

    @ObfuscatedName("ad.k")
    public int field387;

    @ObfuscatedName("ad.f")
    public int field386;

    @ObfuscatedName("ad.j")
    public int field390;

    @ObfuscatedName("ad.q")
    public int field376;

    @ObfuscatedName("ad.h")
    public int field381;

    @ObfuscatedName("ad.i")
    public int field382;

    @ObfuscatedName("ad.s")
    public int field383;

    @ObfuscatedName("ad.n")
    public int field384;

    @ObfuscatedName("ad.e(Lai;I)V")
    public void method175(class33 arg0) {
        if (arg0.field459 > this.field375) {
            arg0.field459 = this.field375;
        }
        if (arg0.field460 < this.field375) {
            arg0.field460 = this.field375;
        }
        if (arg0.field461 > this.field379) {
            arg0.field461 = this.field379;
        }
        if (arg0.field453 < this.field379) {
            arg0.field453 = this.field379;
        }
    }

    @ObfuscatedName("ad.o(IIIB)Z")
    public boolean method168(int arg0, int arg1, int arg2) {
        if (arg0 >= this.field377 && arg0 < this.field377 + this.field372) {
            return arg1 >= (this.field387 << 3) + (this.field373 << 6) && arg1 <= (this.field390 << 3) + (this.field373 << 6) + 7 && arg2 >= (this.field386 << 3) + (this.field374 << 6) && arg2 <= (this.field376 << 3) + (this.field374 << 6) + 7;
        } else {
            return false;
        }
    }

    @ObfuscatedName("ad.m(IIS)Z")
    public boolean method186(int arg0, int arg1) {
        return arg0 >= (this.field381 << 3) + (this.field375 << 6) && arg0 <= (this.field383 << 3) + (this.field375 << 6) + 7 && arg1 >= (this.field382 << 3) + (this.field379 << 6) && arg1 <= (this.field384 << 3) + (this.field379 << 6) + 7;
    }

    @ObfuscatedName("ad.g(IIII)[I")
    public int[] method163(int arg0, int arg1, int arg2) {
        return this.method168(arg0, arg1, arg2) ? new int[] { this.field381 * 8 - this.field387 * 8 + this.field375 * 64 - this.field373 * 64 + arg1, this.field382 * 8 - this.field386 * 8 + this.field379 * 64 - this.field374 * 64 + arg2 } : null;
    }

    @ObfuscatedName("ad.d(III)Lhh;")
    public class213 method164(int arg0, int arg1) {
        if (this.method186(arg0, arg1)) {
            int var3 = this.field387 * 8 - this.field381 * 8 + this.field373 * 64 - this.field375 * 64 + arg0;
            int var4 = this.field386 * 8 - this.field382 * 8 + this.field374 * 64 - this.field379 * 64 + arg1;
            return new class213(this.field377, var3, var4);
        } else {
            return null;
        }
    }

    @ObfuscatedName("ad.b(Lfw;I)V")
    public void method162(class174 arg0) {
        this.field377 = arg0.method2891();
        this.field372 = arg0.method2891();
        this.field373 = arg0.method2930();
        this.field387 = arg0.method2891();
        this.field390 = arg0.method2891();
        this.field374 = arg0.method2930();
        this.field386 = arg0.method2891();
        this.field376 = arg0.method2891();
        this.field375 = arg0.method2930();
        this.field381 = arg0.method2891();
        this.field383 = arg0.method2891();
        this.field379 = arg0.method2930();
        this.field382 = arg0.method2891();
        this.field384 = arg0.method2891();
        this.method185();
    }

    @ObfuscatedName("ad.k(I)V")
    public void method185() {
    }
}
