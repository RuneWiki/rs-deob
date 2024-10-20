package deob;

@ObfuscatedName("ag")
public class class31 implements class43 {

    @ObfuscatedName("ag.d")
    public int field413;

    @ObfuscatedName("ag.q")
    public int field404;

    @ObfuscatedName("ag.x")
    public int field405;

    @ObfuscatedName("ag.y")
    public int field414;

    @ObfuscatedName("ag.e")
    public int field406;

    @ObfuscatedName("ag.f")
    public int field409;

    @ObfuscatedName("ag.v")
    public int field403;

    @ObfuscatedName("ag.t")
    public int field410;

    @ObfuscatedName("ag.i")
    public int field411;

    @ObfuscatedName("ag.r")
    public int field412;

    @ObfuscatedName("ag.d(Lae;B)V")
    public void method167(class33 arg0) {
        if (arg0.field430 > this.field403) {
            arg0.field430 = this.field403;
        }
        if (arg0.field431 < this.field411) {
            arg0.field431 = this.field411;
        }
        if (arg0.field432 > this.field410) {
            arg0.field432 = this.field410;
        }
        if (arg0.field433 < this.field412) {
            arg0.field433 = this.field412;
        }
    }

    @ObfuscatedName("ag.q(IIIS)Z")
    public boolean method191(int arg0, int arg1, int arg2) {
        if (arg0 >= this.field413 && arg0 < this.field413 + this.field404) {
            return arg1 >> 6 >= this.field405 && arg1 >> 6 <= this.field406 && arg2 >> 6 >= this.field414 && arg2 >> 6 <= this.field409;
        } else {
            return false;
        }
    }

    @ObfuscatedName("ag.x(III)Z")
    public boolean method169(int arg0, int arg1) {
        return arg0 >> 6 >= this.field403 && arg0 >> 6 <= this.field411 && arg1 >> 6 >= this.field410 && arg1 >> 6 <= this.field412;
    }

    @ObfuscatedName("ag.y(IIIB)[I")
    public int[] method170(int arg0, int arg1, int arg2) {
        return this.method191(arg0, arg1, arg2) ? new int[] { this.field403 * 64 - this.field405 * 64 + arg1, this.field410 * 64 - this.field414 * 64 + arg2 } : null;
    }

    @ObfuscatedName("ag.e(IIB)Lhy;")
    public class213 method177(int arg0, int arg1) {
        if (this.method169(arg0, arg1)) {
            int var3 = this.field405 * 64 - this.field403 * 64 + arg0;
            int var4 = this.field414 * 64 - this.field410 * 64 + arg1;
            return new class213(this.field413, var3, var4);
        } else {
            return null;
        }
    }

    @ObfuscatedName("ag.f(Lfw;I)V")
    public void method194(class174 arg0) {
        this.field413 = arg0.method2921();
        this.field404 = arg0.method2921();
        this.field405 = arg0.method2916();
        this.field414 = arg0.method2916();
        this.field406 = arg0.method2916();
        this.field409 = arg0.method2916();
        this.field403 = arg0.method2916();
        this.field410 = arg0.method2916();
        this.field411 = arg0.method2916();
        this.field412 = arg0.method2916();
        this.method227();
    }

    @ObfuscatedName("ag.v(I)V")
    public void method227() {
    }
}
