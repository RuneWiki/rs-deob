package deob;

@ObfuscatedName("al")
public class class28 implements class32 {

    @ObfuscatedName("al.y")
    public int field263;

    @ObfuscatedName("al.c")
    public int field259;

    @ObfuscatedName("al.n")
    public int field260;

    @ObfuscatedName("al.u")
    public int field265;

    @ObfuscatedName("al.i")
    public int field262;

    @ObfuscatedName("al.r")
    public int field261;

    @ObfuscatedName("al.y(Lw;S)V")
    public void method119(class21 arg0) {
        if (arg0.field185 > this.field262) {
            arg0.field185 = this.field262;
        }
        if (arg0.field195 < this.field262) {
            arg0.field195 = this.field262;
        }
        if (arg0.field187 > this.field261) {
            arg0.field187 = this.field261;
        }
        if (arg0.field188 < this.field261) {
            arg0.field188 = this.field261;
        }
    }

    @ObfuscatedName("al.c(IIIS)Z")
    public boolean method129(int arg0, int arg1, int arg2) {
        if (arg0 >= this.field263 && arg0 < this.field263 + this.field259) {
            return arg1 >> 6 == this.field260 && arg2 >> 6 == this.field265;
        } else {
            return false;
        }
    }

    @ObfuscatedName("al.n(III)Z")
    public boolean method121(int arg0, int arg1) {
        return arg0 >> 6 == this.field262 && arg1 >> 6 == this.field261;
    }

    @ObfuscatedName("al.u(IIIB)[I")
    public int[] method118(int arg0, int arg1, int arg2) {
        return this.method129(arg0, arg1, arg2) ? new int[] { this.field262 * 64 - this.field260 * 64 + arg1, this.field261 * 64 - this.field265 * 64 + arg2 } : null;
    }

    @ObfuscatedName("al.i(III)Lhm;")
    public class229 method123(int arg0, int arg1) {
        if (this.method121(arg0, arg1)) {
            int var3 = this.field260 * 64 - this.field262 * 64 + arg0;
            int var4 = this.field265 * 64 - this.field261 * 64 + arg1;
            return new class229(this.field263, var3, var4);
        } else {
            return null;
        }
    }

    @ObfuscatedName("al.p(Lge;I)V")
    public void method122(class185 arg0) {
        this.field263 = arg0.method3299();
        this.field259 = arg0.method3299();
        this.field260 = arg0.method3280();
        this.field265 = arg0.method3280();
        this.field262 = arg0.method3280();
        this.field261 = arg0.method3280();
        this.method440();
    }

    @ObfuscatedName("al.e(I)V")
    public void method440() {
    }
}
