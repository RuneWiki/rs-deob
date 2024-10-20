package deob;

@ObfuscatedName("ap")
public class class27 implements class43 {

    @ObfuscatedName("ap.w")
    public int field397;

    @ObfuscatedName("ap.s")
    public int field388;

    @ObfuscatedName("ap.q")
    public int field386;

    @ObfuscatedName("ap.o")
    public int field389;

    @ObfuscatedName("ap.g")
    public int field390;

    @ObfuscatedName("ap.v")
    public int field391;

    @ObfuscatedName("ap.p")
    public int field392;

    @ObfuscatedName("ap.e")
    public int field393;

    @ObfuscatedName("ap.d")
    public int field394;

    @ObfuscatedName("ap.x")
    public int field395;

    @ObfuscatedName("ap.z")
    public int field396;

    @ObfuscatedName("ap.n")
    public int field403;

    @ObfuscatedName("ap.u")
    public int field398;

    @ObfuscatedName("ap.t")
    public int field399;

    @ObfuscatedName("ap.w(Lat;I)V")
    public void method180(class33 arg0) {
        if (arg0.field465 > this.field390) {
            arg0.field465 = this.field390;
        }
        if (arg0.field469 < this.field390) {
            arg0.field469 = this.field390;
        }
        if (arg0.field470 > this.field391) {
            arg0.field470 = this.field391;
        }
        if (arg0.field462 < this.field391) {
            arg0.field462 = this.field391;
        }
    }

    @ObfuscatedName("ap.s(IIII)Z")
    public boolean method181(int arg0, int arg1, int arg2) {
        if (arg0 >= this.field397 && arg0 < this.field397 + this.field388) {
            return arg1 >= (this.field392 << 3) + (this.field386 << 6) && arg1 <= (this.field394 << 3) + (this.field386 << 6) + 7 && arg2 >= (this.field393 << 3) + (this.field389 << 6) && arg2 <= (this.field395 << 3) + (this.field389 << 6) + 7;
        } else {
            return false;
        }
    }

    @ObfuscatedName("ap.q(III)Z")
    public boolean method182(int arg0, int arg1) {
        return arg0 >= (this.field396 << 3) + (this.field390 << 6) && arg0 <= (this.field398 << 3) + (this.field390 << 6) + 7 && arg1 >= (this.field403 << 3) + (this.field391 << 6) && arg1 <= (this.field399 << 3) + (this.field391 << 6) + 7;
    }

    @ObfuscatedName("ap.o(IIII)[I")
    public int[] method179(int arg0, int arg1, int arg2) {
        return this.method181(arg0, arg1, arg2) ? new int[] { this.field396 * 8 - this.field392 * 8 + this.field390 * 64 - this.field386 * 64 + arg1, this.field403 * 8 - this.field393 * 8 + this.field391 * 64 - this.field389 * 64 + arg2 } : null;
    }

    @ObfuscatedName("ap.g(III)Lhg;")
    public class213 method190(int arg0, int arg1) {
        if (this.method182(arg0, arg1)) {
            int var3 = this.field392 * 8 - this.field396 * 8 + this.field386 * 64 - this.field390 * 64 + arg0;
            int var4 = this.field393 * 8 - this.field403 * 8 + this.field389 * 64 - this.field391 * 64 + arg1;
            return new class213(this.field397, var3, var4);
        } else {
            return null;
        }
    }

    @ObfuscatedName("ap.v(Lfz;B)V")
    public void method185(class174 arg0) {
        this.field397 = arg0.method2971();
        this.field388 = arg0.method2971();
        this.field386 = arg0.method3178();
        this.field392 = arg0.method2971();
        this.field394 = arg0.method2971();
        this.field389 = arg0.method3178();
        this.field393 = arg0.method2971();
        this.field395 = arg0.method2971();
        this.field390 = arg0.method3178();
        this.field396 = arg0.method2971();
        this.field398 = arg0.method2971();
        this.field391 = arg0.method3178();
        this.field403 = arg0.method2971();
        this.field399 = arg0.method2971();
        this.method186();
    }

    @ObfuscatedName("ap.p(I)V")
    public void method186() {
    }
}
