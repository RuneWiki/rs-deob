package deob;

@ObfuscatedName("ag")
public class class28 implements class32 {

    @ObfuscatedName("ag.f")
    public int field269;

    @ObfuscatedName("ag.l")
    public int field263;

    @ObfuscatedName("ag.w")
    public int field265;

    @ObfuscatedName("ag.s")
    public int field267;

    @ObfuscatedName("ag.e")
    public int field266;

    @ObfuscatedName("ag.a")
    public int field262;

    @ObfuscatedName("ag.f(Lh;B)V")
    public void method121(class21 arg0) {
        if (arg0.field191 > this.field266) {
            arg0.field191 = this.field266;
        }
        if (arg0.field192 < this.field266) {
            arg0.field192 = this.field266;
        }
        if (arg0.field187 > this.field262) {
            arg0.field187 = this.field262;
        }
        if (arg0.field194 < this.field262) {
            arg0.field194 = this.field262;
        }
    }

    @ObfuscatedName("ag.l(IIIB)Z")
    public boolean method122(int arg0, int arg1, int arg2) {
        if (arg0 >= this.field269 && arg0 < this.field269 + this.field263) {
            return arg1 >> 6 == this.field265 && arg2 >> 6 == this.field267;
        } else {
            return false;
        }
    }

    @ObfuscatedName("ag.w(IIB)Z")
    public boolean method131(int arg0, int arg1) {
        return arg0 >> 6 == this.field266 && arg1 >> 6 == this.field262;
    }

    @ObfuscatedName("ag.s(IIII)[I")
    public int[] method124(int arg0, int arg1, int arg2) {
        return this.method122(arg0, arg1, arg2) ? new int[] { this.field266 * 64 - this.field265 * 64 + arg1, this.field262 * 64 - this.field267 * 64 + arg2 } : null;
    }

    @ObfuscatedName("ag.e(IIB)Lhx;")
    public class229 method125(int arg0, int arg1) {
        if (this.method131(arg0, arg1)) {
            int var3 = this.field265 * 64 - this.field266 * 64 + arg0;
            int var4 = this.field267 * 64 - this.field262 * 64 + arg1;
            return new class229(this.field269, var3, var4);
        } else {
            return null;
        }
    }

    @ObfuscatedName("ag.c(Lgm;I)V")
    public void method126(class185 arg0) {
        this.field269 = arg0.method3344();
        this.field263 = arg0.method3344();
        this.field265 = arg0.method3346();
        this.field267 = arg0.method3346();
        this.field266 = arg0.method3346();
        this.field262 = arg0.method3346();
        this.method445();
    }

    @ObfuscatedName("ag.p(I)V")
    public void method445() {
    }
}
