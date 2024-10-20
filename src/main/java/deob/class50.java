package deob;

@ObfuscatedName("ab")
public class class50 implements class44 {

    @ObfuscatedName("ab.t")
    public int field580;

    @ObfuscatedName("ab.q")
    public int field587;

    @ObfuscatedName("ab.i")
    public int field579;

    @ObfuscatedName("ab.a")
    public int field586;

    @ObfuscatedName("ab.l")
    public int field589;

    @ObfuscatedName("ab.b")
    public int field578;

    @ObfuscatedName("ab.e")
    public int field583;

    @ObfuscatedName("ab.x")
    public int field584;

    @ObfuscatedName("ab.p")
    public int field585;

    @ObfuscatedName("ab.g")
    public int field581;

    @ObfuscatedName("ab.t(Laz;I)V")
    public void method190(class33 arg0) {
        if (arg0.field430 > this.field589) {
            arg0.field430 = this.field589;
        }
        if (arg0.field429 < this.field589) {
            arg0.field429 = this.field589;
        }
        if (arg0.field423 > this.field578) {
            arg0.field423 = this.field578;
        }
        if (arg0.field431 < this.field578) {
            arg0.field431 = this.field578;
        }
    }

    @ObfuscatedName("ab.q(IIIB)Z")
    public boolean method189(int arg0, int arg1, int arg2) {
        if (arg0 >= this.field580 && arg0 < this.field587 + this.field580) {
            return arg1 >= (this.field583 << 3) + (this.field579 << 6) && arg1 <= (this.field583 << 3) + (this.field579 << 6) + 7 && arg2 >= (this.field586 << 6) + (this.field584 << 3) && arg2 <= (this.field586 << 6) + (this.field584 << 3) + 7;
        } else {
            return false;
        }
    }

    @ObfuscatedName("ab.i(IIB)Z")
    public boolean method212(int arg0, int arg1) {
        return arg0 >= (this.field589 << 6) + (this.field585 << 3) && arg0 <= (this.field589 << 6) + (this.field585 << 3) + 7 && arg1 >= (this.field581 << 3) + (this.field578 << 6) && arg1 <= (this.field581 << 3) + (this.field578 << 6) + 7;
    }

    @ObfuscatedName("ab.a(IIII)[I")
    public int[] method192(int arg0, int arg1, int arg2) {
        return this.method189(arg0, arg1, arg2) ? new int[] { this.field585 * 8 - this.field583 * 8 + this.field589 * 64 - this.field579 * 64 + arg1, this.field581 * 8 - this.field584 * 8 + this.field578 * 64 - this.field586 * 64 + arg2 } : null;
    }

    @ObfuscatedName("ab.l(III)Lik;")
    public class239 method211(int arg0, int arg1) {
        if (this.method212(arg0, arg1)) {
            int var3 = this.field583 * 8 - this.field585 * 8 + this.field579 * 64 - this.field589 * 64 + arg0;
            int var4 = this.field584 * 8 - this.field581 * 8 + this.field586 * 64 - this.field578 * 64 + arg1;
            return new class239(this.field580, var3, var4);
        } else {
            return null;
        }
    }

    @ObfuscatedName("ab.b(Lgb;I)V")
    public void method194(class195 arg0) {
        this.field580 = arg0.method3236();
        this.field587 = arg0.method3236();
        this.field579 = arg0.method3238();
        this.field583 = arg0.method3236();
        this.field586 = arg0.method3238();
        this.field584 = arg0.method3236();
        this.field589 = arg0.method3238();
        this.field585 = arg0.method3236();
        this.field578 = arg0.method3238();
        this.field581 = arg0.method3236();
        this.method674();
    }

    @ObfuscatedName("ab.e(I)V")
    public void method674() {
    }
}
