package deob;

@ObfuscatedName("av")
public class class39 implements class43 {

    @ObfuscatedName("av.d")
    public int field492;

    @ObfuscatedName("av.q")
    public int field493;

    @ObfuscatedName("av.x")
    public int field494;

    @ObfuscatedName("av.y")
    public int field495;

    @ObfuscatedName("av.e")
    public int field496;

    @ObfuscatedName("av.f")
    public int field497;

    @ObfuscatedName("av.d(Lae;B)V")
    public void method167(class33 arg0) {
        if (arg0.field430 > this.field496) {
            arg0.field430 = this.field496;
        }
        if (arg0.field431 < this.field496) {
            arg0.field431 = this.field496;
        }
        if (arg0.field432 > this.field497) {
            arg0.field432 = this.field497;
        }
        if (arg0.field433 < this.field497) {
            arg0.field433 = this.field497;
        }
    }

    @ObfuscatedName("av.q(IIIS)Z")
    public boolean method191(int arg0, int arg1, int arg2) {
        if (arg0 >= this.field492 && arg0 < this.field493 + this.field492) {
            return arg1 >> 6 == this.field494 && arg2 >> 6 == this.field495;
        } else {
            return false;
        }
    }

    @ObfuscatedName("av.x(III)Z")
    public boolean method169(int arg0, int arg1) {
        return arg0 >> 6 == this.field496 && arg1 >> 6 == this.field497;
    }

    @ObfuscatedName("av.y(IIIB)[I")
    public int[] method170(int arg0, int arg1, int arg2) {
        return this.method191(arg0, arg1, arg2) ? new int[] { this.field496 * 64 - this.field494 * 64 + arg1, this.field497 * 64 - this.field495 * 64 + arg2 } : null;
    }

    @ObfuscatedName("av.e(IIB)Lhy;")
    public class213 method177(int arg0, int arg1) {
        if (this.method169(arg0, arg1)) {
            int var3 = this.field494 * 64 - this.field496 * 64 + arg0;
            int var4 = this.field495 * 64 - this.field497 * 64 + arg1;
            return new class213(this.field492, var3, var4);
        } else {
            return null;
        }
    }

    @ObfuscatedName("av.f(Lfw;I)V")
    public void method194(class174 arg0) {
        this.field492 = arg0.method2921();
        this.field493 = arg0.method2921();
        this.field494 = arg0.method2916();
        this.field495 = arg0.method2916();
        this.field496 = arg0.method2916();
        this.field497 = arg0.method2916();
        this.method476();
    }

    @ObfuscatedName("av.v(I)V")
    public void method476() {
    }
}
