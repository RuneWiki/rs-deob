package deob;

@ObfuscatedName("ai")
public class class40 implements class44 {

    @ObfuscatedName("ai.t")
    public int field505;

    @ObfuscatedName("ai.q")
    public int field500;

    @ObfuscatedName("ai.i")
    public int field502;

    @ObfuscatedName("ai.a")
    public int field504;

    @ObfuscatedName("ai.l")
    public int field499;

    @ObfuscatedName("ai.b")
    public int field501;

    @ObfuscatedName("ai.t(Laz;I)V")
    public void method190(class33 arg0) {
        if (arg0.field430 > this.field499) {
            arg0.field430 = this.field499;
        }
        if (arg0.field429 < this.field499) {
            arg0.field429 = this.field499;
        }
        if (arg0.field423 > this.field501) {
            arg0.field423 = this.field501;
        }
        if (arg0.field431 < this.field501) {
            arg0.field431 = this.field501;
        }
    }

    @ObfuscatedName("ai.q(IIIB)Z")
    public boolean method189(int arg0, int arg1, int arg2) {
        if (arg0 >= this.field505 && arg0 < this.field505 + this.field500) {
            return arg1 >> 6 == this.field502 && arg2 >> 6 == this.field504;
        } else {
            return false;
        }
    }

    @ObfuscatedName("ai.i(IIB)Z")
    public boolean method212(int arg0, int arg1) {
        return arg0 >> 6 == this.field499 && arg1 >> 6 == this.field501;
    }

    @ObfuscatedName("ai.a(IIII)[I")
    public int[] method192(int arg0, int arg1, int arg2) {
        return this.method189(arg0, arg1, arg2) ? new int[] { this.field499 * 64 - this.field502 * 64 + arg1, this.field501 * 64 - this.field504 * 64 + arg2 } : null;
    }

    @ObfuscatedName("ai.l(III)Lik;")
    public class239 method211(int arg0, int arg1) {
        if (this.method212(arg0, arg1)) {
            int var3 = this.field502 * 64 - this.field499 * 64 + arg0;
            int var4 = this.field504 * 64 - this.field501 * 64 + arg1;
            return new class239(this.field505, var3, var4);
        } else {
            return null;
        }
    }

    @ObfuscatedName("ai.b(Lgb;I)V")
    public void method194(class195 arg0) {
        this.field505 = arg0.method3236();
        this.field500 = arg0.method3236();
        this.field502 = arg0.method3238();
        this.field504 = arg0.method3238();
        this.field499 = arg0.method3238();
        this.field501 = arg0.method3238();
        this.method513();
    }

    @ObfuscatedName("ai.e(B)V")
    public void method513() {
    }
}
