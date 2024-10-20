package deob;

@ObfuscatedName("ae")
public class class31 implements class44 {

    @ObfuscatedName("ae.t")
    public int field411;

    @ObfuscatedName("ae.q")
    public int field405;

    @ObfuscatedName("ae.i")
    public int field413;

    @ObfuscatedName("ae.a")
    public int field407;

    @ObfuscatedName("ae.l")
    public int field408;

    @ObfuscatedName("ae.b")
    public int field409;

    @ObfuscatedName("ae.e")
    public int field410;

    @ObfuscatedName("ae.x")
    public int field414;

    @ObfuscatedName("ae.p")
    public int field412;

    @ObfuscatedName("ae.g")
    public int field406;

    @ObfuscatedName("ae.t(Laz;I)V")
    public void method190(class33 arg0) {
        if (arg0.field430 > this.field410) {
            arg0.field430 = this.field410;
        }
        if (arg0.field429 < this.field412) {
            arg0.field429 = this.field412;
        }
        if (arg0.field423 > this.field414) {
            arg0.field423 = this.field414;
        }
        if (arg0.field431 < this.field406) {
            arg0.field431 = this.field406;
        }
    }

    @ObfuscatedName("ae.q(IIIB)Z")
    public boolean method189(int arg0, int arg1, int arg2) {
        if (arg0 >= this.field411 && arg0 < this.field411 + this.field405) {
            return arg1 >> 6 >= this.field413 && arg1 >> 6 <= this.field408 && arg2 >> 6 >= this.field407 && arg2 >> 6 <= this.field409;
        } else {
            return false;
        }
    }

    @ObfuscatedName("ae.i(IIB)Z")
    public boolean method212(int arg0, int arg1) {
        return arg0 >> 6 >= this.field410 && arg0 >> 6 <= this.field412 && arg1 >> 6 >= this.field414 && arg1 >> 6 <= this.field406;
    }

    @ObfuscatedName("ae.a(IIII)[I")
    public int[] method192(int arg0, int arg1, int arg2) {
        return this.method189(arg0, arg1, arg2) ? new int[] { this.field410 * 64 - this.field413 * 64 + arg1, this.field414 * 64 - this.field407 * 64 + arg2 } : null;
    }

    @ObfuscatedName("ae.l(III)Lik;")
    public class239 method211(int arg0, int arg1) {
        if (this.method212(arg0, arg1)) {
            int var3 = this.field413 * 64 - this.field410 * 64 + arg0;
            int var4 = this.field407 * 64 - this.field414 * 64 + arg1;
            return new class239(this.field411, var3, var4);
        } else {
            return null;
        }
    }

    @ObfuscatedName("ae.b(Lgb;I)V")
    public void method194(class195 arg0) {
        this.field411 = arg0.method3236();
        this.field405 = arg0.method3236();
        this.field413 = arg0.method3238();
        this.field407 = arg0.method3238();
        this.field408 = arg0.method3238();
        this.field409 = arg0.method3238();
        this.field410 = arg0.method3238();
        this.field414 = arg0.method3238();
        this.field412 = arg0.method3238();
        this.field406 = arg0.method3238();
        this.method242();
    }

    @ObfuscatedName("ae.e(I)V")
    public void method242() {
    }
}
