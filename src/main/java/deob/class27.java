package deob;

@ObfuscatedName("av")
public class class27 implements class43 {

    @ObfuscatedName("av.b")
    public int field359;

    @ObfuscatedName("av.s")
    public int field346;

    @ObfuscatedName("av.r")
    public int field348;

    @ObfuscatedName("av.g")
    public int field347;

    @ObfuscatedName("av.x")
    public int field350;

    @ObfuscatedName("av.f")
    public int field351;

    @ObfuscatedName("av.u")
    public int field352;

    @ObfuscatedName("av.t")
    public int field357;

    @ObfuscatedName("av.k")
    public int field354;

    @ObfuscatedName("av.n")
    public int field355;

    @ObfuscatedName("av.d")
    public int field356;

    @ObfuscatedName("av.o")
    public int field360;

    @ObfuscatedName("av.a")
    public int field349;

    @ObfuscatedName("av.q")
    public int field358;

    @ObfuscatedName("av.b(Lam;I)V")
    public void method184(class33 arg0) {
        if (arg0.field424 > this.field350) {
            arg0.field424 = this.field350;
        }
        if (arg0.field425 < this.field350) {
            arg0.field425 = this.field350;
        }
        if (arg0.field418 > this.field351) {
            arg0.field418 = this.field351;
        }
        if (arg0.field427 < this.field351) {
            arg0.field427 = this.field351;
        }
    }

    @ObfuscatedName("av.s(IIIB)Z")
    public boolean method172(int arg0, int arg1, int arg2) {
        if (arg0 >= this.field359 && arg0 < this.field359 + this.field346) {
            return arg1 >= (this.field352 << 3) + (this.field348 << 6) && arg1 <= (this.field354 << 3) + (this.field348 << 6) + 7 && arg2 >= (this.field357 << 3) + (this.field347 << 6) && arg2 <= (this.field355 << 3) + (this.field347 << 6) + 7;
        } else {
            return false;
        }
    }

    @ObfuscatedName("av.r(III)Z")
    public boolean method173(int arg0, int arg1) {
        return arg0 >= (this.field356 << 3) + (this.field350 << 6) && arg0 <= (this.field350 << 6) + (this.field349 << 3) + 7 && arg1 >= (this.field360 << 3) + (this.field351 << 6) && arg1 <= (this.field358 << 3) + (this.field351 << 6) + 7;
    }

    @ObfuscatedName("av.g(IIII)[I")
    public int[] method174(int arg0, int arg1, int arg2) {
        return this.method172(arg0, arg1, arg2) ? new int[] { this.field356 * 8 - this.field352 * 8 + this.field350 * 64 - this.field348 * 64 + arg1, this.field360 * 8 - this.field357 * 8 + this.field351 * 64 - this.field347 * 64 + arg2 } : null;
    }

    @ObfuscatedName("av.x(III)Lhk;")
    public class220 method175(int arg0, int arg1) {
        if (this.method173(arg0, arg1)) {
            int var3 = this.field352 * 8 - this.field356 * 8 + this.field348 * 64 - this.field350 * 64 + arg0;
            int var4 = this.field357 * 8 - this.field360 * 8 + this.field347 * 64 - this.field351 * 64 + arg1;
            return new class220(this.field359, var3, var4);
        } else {
            return null;
        }
    }

    @ObfuscatedName("av.f(Lfs;I)V")
    public void method176(class181 arg0) {
        this.field359 = arg0.method2945();
        this.field346 = arg0.method2945();
        this.field348 = arg0.method3081();
        this.field352 = arg0.method2945();
        this.field354 = arg0.method2945();
        this.field347 = arg0.method3081();
        this.field357 = arg0.method2945();
        this.field355 = arg0.method2945();
        this.field350 = arg0.method3081();
        this.field356 = arg0.method2945();
        this.field349 = arg0.method2945();
        this.field351 = arg0.method3081();
        this.field360 = arg0.method2945();
        this.field358 = arg0.method2945();
        this.method179();
    }

    @ObfuscatedName("av.u(B)V")
    public void method179() {
    }
}
