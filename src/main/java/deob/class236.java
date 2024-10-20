package deob;

@ObfuscatedName("jg")
public class class236 implements class257 {

    @ObfuscatedName("jg.at")
    public int field2459;

    @ObfuscatedName("jg.ah")
    public int field2454;

    @ObfuscatedName("jg.ar")
    public int field2455;

    @ObfuscatedName("jg.ao")
    public int field2456;

    @ObfuscatedName("jg.ab")
    public int field2457;

    @ObfuscatedName("jg.au")
    public int field2462;

    @ObfuscatedName("jg.aa")
    public int field2453;

    @ObfuscatedName("jg.ac")
    public int field2461;

    @ObfuscatedName("jg.al")
    public int field2458;

    @ObfuscatedName("jg.az")
    public int field2460;

    @ObfuscatedName("jg.at(Ljv;B)V")
    public void method4150(class237 arg0) {
        if (arg0.field2470 > this.field2453) {
            arg0.field2470 = this.field2453;
        }
        if (arg0.field2471 < this.field2458) {
            arg0.field2471 = this.field2458;
        }
        if (arg0.field2472 > this.field2461) {
            arg0.field2472 = this.field2461;
        }
        if (arg0.field2475 < this.field2460) {
            arg0.field2475 = this.field2460;
        }
    }

    @ObfuscatedName("jg.ah(IIIB)Z")
    public boolean method4140(int arg0, int arg1, int arg2) {
        if (arg0 >= this.field2459 && arg0 < this.field2459 + this.field2454) {
            return arg1 >> 6 >= this.field2455 && arg1 >> 6 <= this.field2457 && arg2 >> 6 >= this.field2456 && arg2 >> 6 <= this.field2462;
        } else {
            return false;
        }
    }

    @ObfuscatedName("jg.ar(III)Z")
    public boolean method4141(int arg0, int arg1) {
        return arg0 >> 6 >= this.field2453 && arg0 >> 6 <= this.field2458 && arg1 >> 6 >= this.field2461 && arg1 >> 6 <= this.field2460;
    }

    @ObfuscatedName("jg.ao(IIIS)[I")
    public int[] method4142(int arg0, int arg1, int arg2) {
        return this.method4140(arg0, arg1, arg2) ? new int[] { this.field2453 * 64 - this.field2455 * 64 + arg1, this.field2461 * 64 - this.field2456 * 64 + arg2 } : null;
    }

    @ObfuscatedName("jg.ab(III)Lmh;")
    public class334 method4155(int arg0, int arg1) {
        if (this.method4141(arg0, arg1)) {
            int var3 = this.field2455 * 64 - this.field2453 * 64 + arg0;
            int var4 = this.field2456 * 64 - this.field2461 * 64 + arg1;
            return new class334(this.field2459, var3, var4);
        } else {
            return null;
        }
    }

    @ObfuscatedName("jg.au(Luj;B)V")
    public void method4143(class527 arg0) {
        this.field2459 = arg0.method8410();
        this.field2454 = arg0.method8410();
        this.field2455 = arg0.method8412();
        this.field2456 = arg0.method8412();
        this.field2457 = arg0.method8412();
        this.field2462 = arg0.method8412();
        this.field2453 = arg0.method8412();
        this.field2461 = arg0.method8412();
        this.field2458 = arg0.method8412();
        this.field2460 = arg0.method8412();
        this.method4144();
    }

    @ObfuscatedName("jg.aa(I)V")
    public void method4144() {
    }
}
