package deob;

@ObfuscatedName("ah")
public class class34 implements class38 {

    @ObfuscatedName("ah.m")
    public int field268;

    @ObfuscatedName("ah.f")
    public int field277;

    @ObfuscatedName("ah.q")
    public int field269;

    @ObfuscatedName("ah.w")
    public int field270;

    @ObfuscatedName("ah.o")
    public int field278;

    @ObfuscatedName("ah.u")
    public int field272;

    @ObfuscatedName("ah.m(Lag;I)V")
    public void method204(class27 arg0) {
        if (arg0.field211 > this.field278) {
            arg0.field211 = this.field278;
        }
        if (arg0.field212 < this.field278) {
            arg0.field212 = this.field278;
        }
        if (arg0.field218 > this.field272) {
            arg0.field218 = this.field272;
        }
        if (arg0.field214 < this.field272) {
            arg0.field214 = this.field272;
        }
    }

    @ObfuscatedName("ah.f(IIIB)Z")
    public boolean method205(int arg0, int arg1, int arg2) {
        if (arg0 >= this.field268 && arg0 < this.field277 + this.field268) {
            return arg1 >> 6 == this.field269 && arg2 >> 6 == this.field270;
        } else {
            return false;
        }
    }

    @ObfuscatedName("ah.q(IIB)Z")
    public boolean method223(int arg0, int arg1) {
        return arg0 >> 6 == this.field278 && arg1 >> 6 == this.field272;
    }

    @ObfuscatedName("ah.w(IIII)[I")
    public int[] method209(int arg0, int arg1, int arg2) {
        return this.method205(arg0, arg1, arg2) ? new int[] { this.field278 * 64 - this.field269 * 64 + arg1, this.field272 * 64 - this.field270 * 64 + arg2 } : null;
    }

    @ObfuscatedName("ah.o(III)Lhu;")
    public class225 method207(int arg0, int arg1) {
        if (this.method223(arg0, arg1)) {
            int var3 = this.field269 * 64 - this.field278 * 64 + arg0;
            int var4 = this.field270 * 64 - this.field272 * 64 + arg1;
            return new class225(this.field268, var3, var4);
        } else {
            return null;
        }
    }

    @ObfuscatedName("ah.u(Lgr;B)V")
    public void method208(class202 arg0) {
        this.field268 = arg0.method3551();
        this.field277 = arg0.method3551();
        this.field269 = arg0.method3530();
        this.field270 = arg0.method3530();
        this.field278 = arg0.method3530();
        this.field272 = arg0.method3530();
        this.method524();
    }

    @ObfuscatedName("ah.g(I)V")
    public void method524() {
    }
}
