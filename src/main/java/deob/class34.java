package deob;

@ObfuscatedName("ak")
public class class34 implements class38 {

    @ObfuscatedName("ak.u")
    public int field290;

    @ObfuscatedName("ak.f")
    public int field286;

    @ObfuscatedName("ak.b")
    public int field285;

    @ObfuscatedName("ak.g")
    public int field292;

    @ObfuscatedName("ak.z")
    public int field288;

    @ObfuscatedName("ak.p")
    public int field283;

    @ObfuscatedName("ak.u(Laf;I)V")
    public void method206(class27 arg0) {
        if (arg0.field215 > this.field288) {
            arg0.field215 = this.field288;
        }
        if (arg0.field224 < this.field288) {
            arg0.field224 = this.field288;
        }
        if (arg0.field217 > this.field283) {
            arg0.field217 = this.field283;
        }
        if (arg0.field218 < this.field283) {
            arg0.field218 = this.field283;
        }
    }

    @ObfuscatedName("ak.f(IIIB)Z")
    public boolean method207(int arg0, int arg1, int arg2) {
        if (arg0 >= this.field290 && arg0 < this.field290 + this.field286) {
            return arg1 >> 6 == this.field285 && arg2 >> 6 == this.field292;
        } else {
            return false;
        }
    }

    @ObfuscatedName("ak.b(III)Z")
    public boolean method208(int arg0, int arg1) {
        return arg0 >> 6 == this.field288 && arg1 >> 6 == this.field283;
    }

    @ObfuscatedName("ak.g(IIIB)[I")
    public int[] method236(int arg0, int arg1, int arg2) {
        return this.method207(arg0, arg1, arg2) ? new int[] { this.field288 * 64 - this.field285 * 64 + arg1, this.field283 * 64 - this.field292 * 64 + arg2 } : null;
    }

    @ObfuscatedName("ak.z(III)Lhx;")
    public class214 method209(int arg0, int arg1) {
        if (this.method208(arg0, arg1)) {
            int var3 = this.field285 * 64 - this.field288 * 64 + arg0;
            int var4 = this.field292 * 64 - this.field283 * 64 + arg1;
            return new class214(this.field290, var3, var4);
        } else {
            return null;
        }
    }

    @ObfuscatedName("ak.p(Lkg;I)V")
    public void method211(class300 arg0) {
        this.field290 = arg0.method5138();
        this.field286 = arg0.method5138();
        this.field285 = arg0.method5337();
        this.field292 = arg0.method5337();
        this.field288 = arg0.method5337();
        this.field283 = arg0.method5337();
        this.method519();
    }

    @ObfuscatedName("ak.h(S)V")
    public void method519() {
    }
}
