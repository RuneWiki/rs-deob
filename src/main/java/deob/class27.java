package deob;

@ObfuscatedName("av")
public class class27 implements class43 {

    @ObfuscatedName("av.b")
    public int field359;

    @ObfuscatedName("av.q")
    public int field351;

    @ObfuscatedName("av.o")
    public int field352;

    @ObfuscatedName("av.p")
    public int field354;

    @ObfuscatedName("av.a")
    public int field361;

    @ObfuscatedName("av.h")
    public int field355;

    @ObfuscatedName("av.l")
    public int field360;

    @ObfuscatedName("av.y")
    public int field357;

    @ObfuscatedName("av.g")
    public int field358;

    @ObfuscatedName("av.c")
    public int field363;

    @ObfuscatedName("av.u")
    public int field353;

    @ObfuscatedName("av.r")
    public int field350;

    @ObfuscatedName("av.d")
    public int field362;

    @ObfuscatedName("av.v")
    public int field356;

    @ObfuscatedName("av.b(Lai;B)V")
    public void method193(class33 arg0) {
        if (arg0.field420 > this.field361) {
            arg0.field420 = this.field361;
        }
        if (arg0.field421 < this.field361) {
            arg0.field421 = this.field361;
        }
        if (arg0.field414 > this.field355) {
            arg0.field414 = this.field355;
        }
        if (arg0.field423 < this.field355) {
            arg0.field423 = this.field355;
        }
    }

    @ObfuscatedName("av.q(IIII)Z")
    public boolean method194(int arg0, int arg1, int arg2) {
        if (arg0 >= this.field359 && arg0 < this.field359 + this.field351) {
            return arg1 >= (this.field360 << 3) + (this.field352 << 6) && arg1 <= (this.field358 << 3) + (this.field352 << 6) + 7 && arg2 >= (this.field357 << 3) + (this.field354 << 6) && arg2 <= (this.field363 << 3) + (this.field354 << 6) + 7;
        } else {
            return false;
        }
    }

    @ObfuscatedName("av.o(IIB)Z")
    public boolean method195(int arg0, int arg1) {
        return arg0 >= (this.field361 << 6) + (this.field353 << 3) && arg0 <= (this.field362 << 3) + (this.field361 << 6) + 7 && arg1 >= (this.field355 << 6) + (this.field350 << 3) && arg1 <= (this.field356 << 3) + (this.field355 << 6) + 7;
    }

    @ObfuscatedName("av.p(IIII)[I")
    public int[] method214(int arg0, int arg1, int arg2) {
        return this.method194(arg0, arg1, arg2) ? new int[] { this.field353 * 8 - this.field360 * 8 + this.field361 * 64 - this.field352 * 64 + arg1, this.field350 * 8 - this.field357 * 8 + this.field355 * 64 - this.field354 * 64 + arg2 } : null;
    }

    @ObfuscatedName("av.a(III)Lhp;")
    public class233 method192(int arg0, int arg1) {
        if (this.method195(arg0, arg1)) {
            int var3 = this.field360 * 8 - this.field353 * 8 + this.field352 * 64 - this.field361 * 64 + arg0;
            int var4 = this.field357 * 8 - this.field350 * 8 + this.field354 * 64 - this.field355 * 64 + arg1;
            return new class233(this.field359, var3, var4);
        } else {
            return null;
        }
    }

    @ObfuscatedName("av.h(Lgn;I)V")
    public void method197(class194 arg0) {
        this.field359 = arg0.method3247();
        this.field351 = arg0.method3247();
        this.field352 = arg0.method3249();
        this.field360 = arg0.method3247();
        this.field358 = arg0.method3247();
        this.field354 = arg0.method3249();
        this.field357 = arg0.method3247();
        this.field363 = arg0.method3247();
        this.field361 = arg0.method3249();
        this.field353 = arg0.method3247();
        this.field362 = arg0.method3247();
        this.field355 = arg0.method3249();
        this.field350 = arg0.method3247();
        this.field356 = arg0.method3247();
        this.method210();
    }

    @ObfuscatedName("av.l(B)V")
    public void method210() {
    }
}
