package deob;

@ObfuscatedName("jh")
public class class244 implements class257 {

    @ObfuscatedName("jh.at")
    public int field2544;

    @ObfuscatedName("jh.ah")
    public int field2532;

    @ObfuscatedName("jh.ar")
    public int field2539;

    @ObfuscatedName("jh.ao")
    public int field2534;

    @ObfuscatedName("jh.ab")
    public int field2535;

    @ObfuscatedName("jh.au")
    public int field2536;

    @ObfuscatedName("jh.aa")
    public int field2537;

    @ObfuscatedName("jh.ac")
    public int field2538;

    @ObfuscatedName("jh.al")
    public int field2547;

    @ObfuscatedName("jh.az")
    public int field2540;

    @ObfuscatedName("jh.ap")
    public int field2541;

    @ObfuscatedName("jh.av")
    public int field2543;

    @ObfuscatedName("jh.ax")
    public int field2531;

    @ObfuscatedName("jh.as")
    public int field2545;

    @ObfuscatedName("jh.at(Ljv;B)V")
    public void method4150(class237 arg0) {
        if (arg0.field2470 > this.field2535) {
            arg0.field2470 = this.field2535;
        }
        if (arg0.field2471 < this.field2535) {
            arg0.field2471 = this.field2535;
        }
        if (arg0.field2472 > this.field2536) {
            arg0.field2472 = this.field2536;
        }
        if (arg0.field2475 < this.field2536) {
            arg0.field2475 = this.field2536;
        }
    }

    @ObfuscatedName("jh.ah(IIIB)Z")
    public boolean method4140(int arg0, int arg1, int arg2) {
        if (arg0 >= this.field2544 && arg0 < this.field2544 + this.field2532) {
            return arg1 >= (this.field2539 << 6) + (this.field2537 << 3) && arg1 <= (this.field2547 << 3) + (this.field2539 << 6) + 7 && arg2 >= (this.field2538 << 3) + (this.field2534 << 6) && arg2 <= (this.field2540 << 3) + (this.field2534 << 6) + 7;
        } else {
            return false;
        }
    }

    @ObfuscatedName("jh.ar(III)Z")
    public boolean method4141(int arg0, int arg1) {
        return arg0 >= (this.field2541 << 3) + (this.field2535 << 6) && arg0 <= (this.field2535 << 6) + (this.field2531 << 3) + 7 && arg1 >= (this.field2543 << 3) + (this.field2536 << 6) && arg1 <= (this.field2545 << 3) + (this.field2536 << 6) + 7;
    }

    @ObfuscatedName("jh.ao(IIIS)[I")
    public int[] method4142(int arg0, int arg1, int arg2) {
        return this.method4140(arg0, arg1, arg2) ? new int[] { this.field2541 * 8 - this.field2537 * 8 + this.field2535 * 64 - this.field2539 * 64 + arg1, this.field2543 * 8 - this.field2538 * 8 + this.field2536 * 64 - this.field2534 * 64 + arg2 } : null;
    }

    @ObfuscatedName("jh.ab(III)Lmh;")
    public class334 method4155(int arg0, int arg1) {
        if (this.method4141(arg0, arg1)) {
            int var3 = this.field2537 * 8 - this.field2541 * 8 + this.field2539 * 64 - this.field2535 * 64 + arg0;
            int var4 = this.field2538 * 8 - this.field2543 * 8 + this.field2534 * 64 - this.field2536 * 64 + arg1;
            return new class334(this.field2544, var3, var4);
        } else {
            return null;
        }
    }

    @ObfuscatedName("jh.au(Luj;B)V")
    public void method4143(class527 arg0) {
        this.field2544 = arg0.method8410();
        this.field2532 = arg0.method8410();
        this.field2539 = arg0.method8412();
        this.field2537 = arg0.method8410();
        this.field2547 = arg0.method8410();
        this.field2534 = arg0.method8412();
        this.field2538 = arg0.method8410();
        this.field2540 = arg0.method8410();
        this.field2535 = arg0.method8412();
        this.field2541 = arg0.method8410();
        this.field2531 = arg0.method8410();
        this.field2536 = arg0.method8412();
        this.field2543 = arg0.method8410();
        this.field2545 = arg0.method8410();
        this.method4426();
    }

    @ObfuscatedName("jh.aa(I)V")
    public void method4426() {
    }
}
