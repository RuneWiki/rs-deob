package deob;

@ObfuscatedName("ae")
public class class43 implements class38 {

    @ObfuscatedName("ae.f")
    public int field356;

    @ObfuscatedName("ae.i")
    public int field351;

    @ObfuscatedName("ae.y")
    public int field350;

    @ObfuscatedName("ae.w")
    public int field359;

    @ObfuscatedName("ae.p")
    public int field352;

    @ObfuscatedName("ae.b")
    public int field353;

    @ObfuscatedName("ae.e")
    public int field349;

    @ObfuscatedName("ae.x")
    public int field355;

    @ObfuscatedName("ae.a")
    public int field348;

    @ObfuscatedName("ae.d")
    public int field357;

    @ObfuscatedName("ae.f(Laa;I)V")
    public void method185(class27 arg0) {
        if (arg0.field208 > this.field352) {
            arg0.field208 = this.field352;
        }
        if (arg0.field209 < this.field352) {
            arg0.field209 = this.field352;
        }
        if (arg0.field210 > this.field353) {
            arg0.field210 = this.field353;
        }
        if (arg0.field202 < this.field353) {
            arg0.field202 = this.field353;
        }
    }

    @ObfuscatedName("ae.i(IIII)Z")
    public boolean method191(int arg0, int arg1, int arg2) {
        if (arg0 >= this.field356 && arg0 < this.field356 + this.field351) {
            return arg1 >= (this.field350 << 6) + (this.field349 << 3) && arg1 <= (this.field350 << 6) + (this.field349 << 3) + 7 && arg2 >= (this.field359 << 6) + (this.field355 << 3) && arg2 <= (this.field359 << 6) + (this.field355 << 3) + 7;
        } else {
            return false;
        }
    }

    @ObfuscatedName("ae.y(IIB)Z")
    public boolean method187(int arg0, int arg1) {
        return arg0 >= (this.field352 << 6) + (this.field348 << 3) && arg0 <= (this.field352 << 6) + (this.field348 << 3) + 7 && arg1 >= (this.field357 << 3) + (this.field353 << 6) && arg1 <= (this.field357 << 3) + (this.field353 << 6) + 7;
    }

    @ObfuscatedName("ae.w(IIII)[I")
    public int[] method188(int arg0, int arg1, int arg2) {
        return this.method191(arg0, arg1, arg2) ? new int[] { this.field348 * 8 - this.field349 * 8 + this.field352 * 64 - this.field350 * 64 + arg1, this.field357 * 8 - this.field355 * 8 + this.field353 * 64 - this.field359 * 64 + arg2 } : null;
    }

    @ObfuscatedName("ae.p(IIB)Lht;")
    public class214 method189(int arg0, int arg1) {
        if (this.method187(arg0, arg1)) {
            int var3 = this.field349 * 8 - this.field348 * 8 + this.field350 * 64 - this.field352 * 64 + arg0;
            int var4 = this.field355 * 8 - this.field357 * 8 + this.field359 * 64 - this.field353 * 64 + arg1;
            return new class214(this.field356, var3, var4);
        } else {
            return null;
        }
    }

    @ObfuscatedName("ae.b(Lkq;B)V")
    public void method207(class300 arg0) {
        this.field356 = arg0.method5110();
        this.field351 = arg0.method5110();
        this.field350 = arg0.method5112();
        this.field349 = arg0.method5110();
        this.field359 = arg0.method5112();
        this.field355 = arg0.method5110();
        this.field352 = arg0.method5112();
        this.field348 = arg0.method5110();
        this.field353 = arg0.method5112();
        this.field357 = arg0.method5110();
        this.method644();
    }

    @ObfuscatedName("ae.e(I)V")
    public void method644() {
    }
}
