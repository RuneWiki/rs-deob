package deob;

@ObfuscatedName("aw")
public class class49 implements class43 {

    @ObfuscatedName("aw.d")
    public int field574;

    @ObfuscatedName("aw.q")
    public int field573;

    @ObfuscatedName("aw.x")
    public int field575;

    @ObfuscatedName("aw.y")
    public int field576;

    @ObfuscatedName("aw.e")
    public int field577;

    @ObfuscatedName("aw.f")
    public int field585;

    @ObfuscatedName("aw.v")
    public int field579;

    @ObfuscatedName("aw.t")
    public int field580;

    @ObfuscatedName("aw.i")
    public int field581;

    @ObfuscatedName("aw.r")
    public int field582;

    @ObfuscatedName("aw.d(Lae;B)V")
    public void method167(class33 arg0) {
        if (arg0.field430 > this.field577) {
            arg0.field430 = this.field577;
        }
        if (arg0.field431 < this.field577) {
            arg0.field431 = this.field577;
        }
        if (arg0.field432 > this.field585) {
            arg0.field432 = this.field585;
        }
        if (arg0.field433 < this.field585) {
            arg0.field433 = this.field585;
        }
    }

    @ObfuscatedName("aw.q(IIIS)Z")
    public boolean method191(int arg0, int arg1, int arg2) {
        if (arg0 >= this.field574 && arg0 < this.field574 + this.field573) {
            return arg1 >= (this.field579 << 3) + (this.field575 << 6) && arg1 <= (this.field579 << 3) + (this.field575 << 6) + 7 && arg2 >= (this.field580 << 3) + (this.field576 << 6) && arg2 <= (this.field580 << 3) + (this.field576 << 6) + 7;
        } else {
            return false;
        }
    }

    @ObfuscatedName("aw.x(III)Z")
    public boolean method169(int arg0, int arg1) {
        return arg0 >= (this.field581 << 3) + (this.field577 << 6) && arg0 <= (this.field581 << 3) + (this.field577 << 6) + 7 && arg1 >= (this.field585 << 6) + (this.field582 << 3) && arg1 <= (this.field585 << 6) + (this.field582 << 3) + 7;
    }

    @ObfuscatedName("aw.y(IIIB)[I")
    public int[] method170(int arg0, int arg1, int arg2) {
        return this.method191(arg0, arg1, arg2) ? new int[] { this.field581 * 8 - this.field579 * 8 + this.field577 * 64 - this.field575 * 64 + arg1, this.field582 * 8 - this.field580 * 8 + this.field585 * 64 - this.field576 * 64 + arg2 } : null;
    }

    @ObfuscatedName("aw.e(IIB)Lhy;")
    public class213 method177(int arg0, int arg1) {
        if (this.method169(arg0, arg1)) {
            int var3 = this.field579 * 8 - this.field581 * 8 + this.field575 * 64 - this.field577 * 64 + arg0;
            int var4 = this.field580 * 8 - this.field582 * 8 + this.field576 * 64 - this.field585 * 64 + arg1;
            return new class213(this.field574, var3, var4);
        } else {
            return null;
        }
    }

    @ObfuscatedName("aw.f(Lfw;I)V")
    public void method194(class174 arg0) {
        this.field574 = arg0.method2921();
        this.field573 = arg0.method2921();
        this.field575 = arg0.method2916();
        this.field579 = arg0.method2921();
        this.field576 = arg0.method2916();
        this.field580 = arg0.method2921();
        this.field577 = arg0.method2916();
        this.field581 = arg0.method2921();
        this.field585 = arg0.method2916();
        this.field582 = arg0.method2921();
        this.method623();
    }

    @ObfuscatedName("aw.v(I)V")
    public void method623() {
    }
}
