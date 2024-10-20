package deob;

@ObfuscatedName("jv")
public class class241 implements class262 {

    @ObfuscatedName("jv.aq")
    public int field2512;

    @ObfuscatedName("jv.aw")
    public int field2508;

    @ObfuscatedName("jv.al")
    public int field2509;

    @ObfuscatedName("jv.ai")
    public int field2507;

    @ObfuscatedName("jv.ar")
    public int field2513;

    @ObfuscatedName("jv.as")
    public int field2511;

    @ObfuscatedName("jv.aa")
    public int field2515;

    @ObfuscatedName("jv.az")
    public int field2514;

    @ObfuscatedName("jv.ao")
    public int field2510;

    @ObfuscatedName("jv.au")
    public int field2516;

    @ObfuscatedName("jv.aq(Ljw;I)V")
    public void method4235(class242 arg0) {
        if (arg0.field2524 > this.field2515) {
            arg0.field2524 = this.field2515;
        }
        if (arg0.field2525 < this.field2510) {
            arg0.field2525 = this.field2510;
        }
        if (arg0.field2526 > this.field2514) {
            arg0.field2526 = this.field2514;
        }
        if (arg0.field2527 < this.field2516) {
            arg0.field2527 = this.field2516;
        }
    }

    @ObfuscatedName("jv.aw(IIII)Z")
    public boolean method4236(int arg0, int arg1, int arg2) {
        if (arg0 >= this.field2512 && arg0 < this.field2512 + this.field2508) {
            return arg1 >> 6 >= this.field2509 && arg1 >> 6 <= this.field2513 && arg2 >> 6 >= this.field2507 && arg2 >> 6 <= this.field2511;
        } else {
            return false;
        }
    }

    @ObfuscatedName("jv.al(III)Z")
    public boolean method4237(int arg0, int arg1) {
        return arg0 >> 6 >= this.field2515 && arg0 >> 6 <= this.field2510 && arg1 >> 6 >= this.field2514 && arg1 >> 6 <= this.field2516;
    }

    @ObfuscatedName("jv.ai(IIII)[I")
    public int[] method4246(int arg0, int arg1, int arg2) {
        return this.method4236(arg0, arg1, arg2) ? new int[] { this.field2515 * 64 - this.field2509 * 64 + arg1, this.field2514 * 64 - this.field2507 * 64 + arg2 } : null;
    }

    @ObfuscatedName("jv.ar(III)Lns;")
    public class339 method4234(int arg0, int arg1) {
        if (this.method4237(arg0, arg1)) {
            int var3 = this.field2509 * 64 - this.field2515 * 64 + arg0;
            int var4 = this.field2507 * 64 - this.field2514 * 64 + arg1;
            return new class339(this.field2512, var3, var4);
        } else {
            return null;
        }
    }

    @ObfuscatedName("jv.as(Luq;I)V")
    public void method4244(class534 arg0) {
        this.field2512 = arg0.method8591();
        this.field2508 = arg0.method8591();
        this.field2509 = arg0.method8593();
        this.field2507 = arg0.method8593();
        this.field2513 = arg0.method8593();
        this.field2511 = arg0.method8593();
        this.field2515 = arg0.method8593();
        this.field2514 = arg0.method8593();
        this.field2510 = arg0.method8593();
        this.field2516 = arg0.method8593();
        this.method4241();
    }

    @ObfuscatedName("jv.aa(I)V")
    public void method4241() {
    }
}
