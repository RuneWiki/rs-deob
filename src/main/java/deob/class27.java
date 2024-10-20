package deob;

@ObfuscatedName("ay")
public class class27 implements class43 {

    @ObfuscatedName("ay.i")
    public int field388;

    @ObfuscatedName("ay.h")
    public int field378;

    @ObfuscatedName("ay.u")
    public int field379;

    @ObfuscatedName("ay.q")
    public int field384;

    @ObfuscatedName("ay.g")
    public int field381;

    @ObfuscatedName("ay.v")
    public int field382;

    @ObfuscatedName("ay.t")
    public int field383;

    @ObfuscatedName("ay.p")
    public int field386;

    @ObfuscatedName("ay.l")
    public int field377;

    @ObfuscatedName("ay.a")
    public int field380;

    @ObfuscatedName("ay.k")
    public int field387;

    @ObfuscatedName("ay.r")
    public int field385;

    @ObfuscatedName("ay.b")
    public int field389;

    @ObfuscatedName("ay.x")
    public int field390;

    @ObfuscatedName("ay.i(Laj;I)V")
    public void method196(class33 arg0) {
        if (arg0.field454 > this.field381) {
            arg0.field454 = this.field381;
        }
        if (arg0.field455 < this.field381) {
            arg0.field455 = this.field381;
        }
        if (arg0.field464 > this.field382) {
            arg0.field464 = this.field382;
        }
        if (arg0.field457 < this.field382) {
            arg0.field457 = this.field382;
        }
    }

    @ObfuscatedName("ay.h(IIIB)Z")
    public boolean method174(int arg0, int arg1, int arg2) {
        if (arg0 >= this.field388 && arg0 < this.field388 + this.field378) {
            return arg1 >= (this.field383 << 3) + (this.field379 << 6) && arg1 <= (this.field379 << 6) + (this.field377 << 3) + 7 && arg2 >= (this.field386 << 3) + (this.field384 << 6) && arg2 <= (this.field384 << 6) + (this.field380 << 3) + 7;
        } else {
            return false;
        }
    }

    @ObfuscatedName("ay.u(III)Z")
    public boolean method175(int arg0, int arg1) {
        return arg0 >= (this.field387 << 3) + (this.field381 << 6) && arg0 <= (this.field389 << 3) + (this.field381 << 6) + 7 && arg1 >= (this.field385 << 3) + (this.field382 << 6) && arg1 <= (this.field390 << 3) + (this.field382 << 6) + 7;
    }

    @ObfuscatedName("ay.q(IIII)[I")
    public int[] method176(int arg0, int arg1, int arg2) {
        return this.method174(arg0, arg1, arg2) ? new int[] { this.field387 * 8 - this.field383 * 8 + this.field381 * 64 - this.field379 * 64 + arg1, this.field385 * 8 - this.field386 * 8 + this.field382 * 64 - this.field384 * 64 + arg2 } : null;
    }

    @ObfuscatedName("ay.g(III)Lho;")
    public class213 method191(int arg0, int arg1) {
        if (this.method175(arg0, arg1)) {
            int var3 = this.field383 * 8 - this.field387 * 8 + this.field379 * 64 - this.field381 * 64 + arg0;
            int var4 = this.field386 * 8 - this.field385 * 8 + this.field384 * 64 - this.field382 * 64 + arg1;
            return new class213(this.field388, var3, var4);
        } else {
            return null;
        }
    }

    @ObfuscatedName("ay.v(Lfv;I)V")
    public void method195(class174 arg0) {
        this.field388 = arg0.method2930();
        this.field378 = arg0.method2930();
        this.field379 = arg0.method2932();
        this.field383 = arg0.method2930();
        this.field377 = arg0.method2930();
        this.field384 = arg0.method2932();
        this.field386 = arg0.method2930();
        this.field380 = arg0.method2930();
        this.field381 = arg0.method2932();
        this.field387 = arg0.method2930();
        this.field389 = arg0.method2930();
        this.field382 = arg0.method2932();
        this.field385 = arg0.method2930();
        this.field390 = arg0.method2930();
        this.method173();
    }

    @ObfuscatedName("ay.t(I)V")
    public void method173() {
    }
}
