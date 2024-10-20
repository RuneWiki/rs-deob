package deob;

@ObfuscatedName("ax")
public class class27 implements class43 {

    @ObfuscatedName("ax.j")
    public int field388;

    @ObfuscatedName("ax.h")
    public int field387;

    @ObfuscatedName("ax.f")
    public int field397;

    @ObfuscatedName("ax.p")
    public int field393;

    @ObfuscatedName("ax.x")
    public int field389;

    @ObfuscatedName("ax.g")
    public int field391;

    @ObfuscatedName("ax.c")
    public int field396;

    @ObfuscatedName("ax.l")
    public int field392;

    @ObfuscatedName("ax.w")
    public int field394;

    @ObfuscatedName("ax.b")
    public int field395;

    @ObfuscatedName("ax.o")
    public int field386;

    @ObfuscatedName("ax.m")
    public int field399;

    @ObfuscatedName("ax.i")
    public int field398;

    @ObfuscatedName("ax.s")
    public int field401;

    @ObfuscatedName("ax.j(Lab;I)V")
    public void method188(class33 arg0) {
        if (arg0.field465 > this.field389) {
            arg0.field465 = this.field389;
        }
        if (arg0.field466 < this.field389) {
            arg0.field466 = this.field389;
        }
        if (arg0.field461 > this.field391) {
            arg0.field461 = this.field391;
        }
        if (arg0.field468 < this.field391) {
            arg0.field468 = this.field391;
        }
    }

    @ObfuscatedName("ax.h(IIIB)Z")
    public boolean method189(int arg0, int arg1, int arg2) {
        if (arg0 >= this.field388 && arg0 < this.field388 + this.field387) {
            return arg1 >= (this.field397 << 6) + (this.field396 << 3) && arg1 <= (this.field397 << 6) + (this.field394 << 3) + 7 && arg2 >= (this.field393 << 6) + (this.field392 << 3) && arg2 <= (this.field395 << 3) + (this.field393 << 6) + 7;
        } else {
            return false;
        }
    }

    @ObfuscatedName("ax.f(IIB)Z")
    public boolean method190(int arg0, int arg1) {
        return arg0 >= (this.field389 << 6) + (this.field386 << 3) && arg0 <= (this.field398 << 3) + (this.field389 << 6) + 7 && arg1 >= (this.field399 << 3) + (this.field391 << 6) && arg1 <= (this.field401 << 3) + (this.field391 << 6) + 7;
    }

    @ObfuscatedName("ax.p(IIII)[I")
    public int[] method194(int arg0, int arg1, int arg2) {
        return this.method189(arg0, arg1, arg2) ? new int[] { this.field386 * 8 - this.field396 * 8 + this.field389 * 64 - this.field397 * 64 + arg1, this.field399 * 8 - this.field392 * 8 + this.field391 * 64 - this.field393 * 64 + arg2 } : null;
    }

    @ObfuscatedName("ax.x(IIB)Lhh;")
    public class214 method192(int arg0, int arg1) {
        if (this.method190(arg0, arg1)) {
            int var3 = this.field396 * 8 - this.field386 * 8 + this.field397 * 64 - this.field389 * 64 + arg0;
            int var4 = this.field392 * 8 - this.field399 * 8 + this.field393 * 64 - this.field391 * 64 + arg1;
            return new class214(this.field388, var3, var4);
        } else {
            return null;
        }
    }

    @ObfuscatedName("ax.g(Lfb;I)V")
    public void method187(class175 arg0) {
        this.field388 = arg0.method2903();
        this.field387 = arg0.method2903();
        this.field397 = arg0.method3023();
        this.field396 = arg0.method2903();
        this.field394 = arg0.method2903();
        this.field393 = arg0.method3023();
        this.field392 = arg0.method2903();
        this.field395 = arg0.method2903();
        this.field389 = arg0.method3023();
        this.field386 = arg0.method2903();
        this.field398 = arg0.method2903();
        this.field391 = arg0.method3023();
        this.field399 = arg0.method2903();
        this.field401 = arg0.method2903();
        this.method204();
    }

    @ObfuscatedName("ax.c(B)V")
    public void method204() {
    }
}
