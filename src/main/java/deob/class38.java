package deob;

@ObfuscatedName("at")
public class class38 implements class32 {

    @ObfuscatedName("at.g")
    public int field362;

    @ObfuscatedName("at.r")
    public int field361;

    @ObfuscatedName("at.e")
    public int field355;

    @ObfuscatedName("at.q")
    public int field356;

    @ObfuscatedName("at.c")
    public int field357;

    @ObfuscatedName("at.l")
    public int field354;

    @ObfuscatedName("at.b")
    public int field359;

    @ObfuscatedName("at.w")
    public int field358;

    @ObfuscatedName("at.n")
    public int field360;

    @ObfuscatedName("at.i")
    public int field365;

    @ObfuscatedName("at.g(Lk;B)V")
    public void method147(class21 arg0) {
        if (arg0.field199 > this.field357) {
            arg0.field199 = this.field357;
        }
        if (arg0.field200 < this.field357) {
            arg0.field200 = this.field357;
        }
        if (arg0.field195 > this.field354) {
            arg0.field195 = this.field354;
        }
        if (arg0.field204 < this.field354) {
            arg0.field204 = this.field354;
        }
    }

    @ObfuscatedName("at.r(IIIB)Z")
    public boolean method148(int arg0, int arg1, int arg2) {
        if (arg0 >= this.field362 && arg0 < this.field362 + this.field361) {
            return arg1 >= (this.field359 << 3) + (this.field355 << 6) && arg1 <= (this.field359 << 3) + (this.field355 << 6) + 7 && arg2 >= (this.field358 << 3) + (this.field356 << 6) && arg2 <= (this.field358 << 3) + (this.field356 << 6) + 7;
        } else {
            return false;
        }
    }

    @ObfuscatedName("at.e(IIB)Z")
    public boolean method149(int arg0, int arg1) {
        return arg0 >= (this.field360 << 3) + (this.field357 << 6) && arg0 <= (this.field360 << 3) + (this.field357 << 6) + 7 && arg1 >= (this.field365 << 3) + (this.field354 << 6) && arg1 <= (this.field365 << 3) + (this.field354 << 6) + 7;
    }

    @ObfuscatedName("at.q(IIII)[I")
    public int[] method150(int arg0, int arg1, int arg2) {
        return this.method148(arg0, arg1, arg2) ? new int[] { this.field360 * 8 - this.field359 * 8 + this.field357 * 64 - this.field355 * 64 + arg1, this.field365 * 8 - this.field358 * 8 + this.field354 * 64 - this.field356 * 64 + arg2 } : null;
    }

    @ObfuscatedName("at.c(IIB)Lhz;")
    public class229 method153(int arg0, int arg1) {
        if (this.method149(arg0, arg1)) {
            int var3 = this.field359 * 8 - this.field360 * 8 + this.field355 * 64 - this.field357 * 64 + arg0;
            int var4 = this.field358 * 8 - this.field365 * 8 + this.field356 * 64 - this.field354 * 64 + arg1;
            return new class229(this.field362, var3, var4);
        } else {
            return null;
        }
    }

    @ObfuscatedName("at.i(Lgl;I)V")
    public void method151(class185 arg0) {
        this.field362 = arg0.method3679();
        this.field361 = arg0.method3679();
        this.field355 = arg0.method3467();
        this.field359 = arg0.method3679();
        this.field356 = arg0.method3467();
        this.field358 = arg0.method3679();
        this.field357 = arg0.method3467();
        this.field360 = arg0.method3679();
        this.field354 = arg0.method3467();
        this.field365 = arg0.method3679();
        this.method636();
    }

    @ObfuscatedName("at.p(I)V")
    public void method636() {
    }
}
