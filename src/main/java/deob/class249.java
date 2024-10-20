package deob;

@ObfuscatedName("jg")
public class class249 implements class262 {

    @ObfuscatedName("jg.aq")
    public int field2589;

    @ObfuscatedName("jg.aw")
    public int field2590;

    @ObfuscatedName("jg.al")
    public int field2591;

    @ObfuscatedName("jg.ai")
    public int field2592;

    @ObfuscatedName("jg.ar")
    public int field2600;

    @ObfuscatedName("jg.as")
    public int field2594;

    @ObfuscatedName("jg.aa")
    public int field2596;

    @ObfuscatedName("jg.az")
    public int field2593;

    @ObfuscatedName("jg.ao")
    public int field2597;

    @ObfuscatedName("jg.au")
    public int field2595;

    @ObfuscatedName("jg.ak")
    public int field2599;

    @ObfuscatedName("jg.ah")
    public int field2598;

    @ObfuscatedName("jg.aj")
    public int field2601;

    @ObfuscatedName("jg.af")
    public int field2602;

    @ObfuscatedName("jg.aq(Ljw;I)V")
    public void method4235(class242 arg0) {
        if (arg0.field2524 > this.field2600) {
            arg0.field2524 = this.field2600;
        }
        if (arg0.field2525 < this.field2600) {
            arg0.field2525 = this.field2600;
        }
        if (arg0.field2526 > this.field2594) {
            arg0.field2526 = this.field2594;
        }
        if (arg0.field2527 < this.field2594) {
            arg0.field2527 = this.field2594;
        }
    }

    @ObfuscatedName("jg.aw(IIII)Z")
    public boolean method4236(int arg0, int arg1, int arg2) {
        if (arg0 >= this.field2589 && arg0 < this.field2590 + this.field2589) {
            return arg1 >= (this.field2596 << 3) + (this.field2591 << 6) && arg1 <= (this.field2597 << 3) + (this.field2591 << 6) + 7 && arg2 >= (this.field2593 << 3) + (this.field2592 << 6) && arg2 <= (this.field2595 << 3) + (this.field2592 << 6) + 7;
        } else {
            return false;
        }
    }

    @ObfuscatedName("jg.al(III)Z")
    public boolean method4237(int arg0, int arg1) {
        return arg0 >= (this.field2600 << 6) + (this.field2599 << 3) && arg0 <= (this.field2601 << 3) + (this.field2600 << 6) + 7 && arg1 >= (this.field2598 << 3) + (this.field2594 << 6) && arg1 <= (this.field2602 << 3) + (this.field2594 << 6) + 7;
    }

    @ObfuscatedName("jg.ai(IIII)[I")
    public int[] method4246(int arg0, int arg1, int arg2) {
        return this.method4236(arg0, arg1, arg2) ? new int[] { this.field2599 * 8 - this.field2596 * 8 + this.field2600 * 64 - this.field2591 * 64 + arg1, this.field2598 * 8 - this.field2593 * 8 + this.field2594 * 64 - this.field2592 * 64 + arg2 } : null;
    }

    @ObfuscatedName("jg.ar(III)Lns;")
    public class339 method4234(int arg0, int arg1) {
        if (this.method4237(arg0, arg1)) {
            int var3 = this.field2596 * 8 - this.field2599 * 8 + this.field2591 * 64 - this.field2600 * 64 + arg0;
            int var4 = this.field2593 * 8 - this.field2598 * 8 + this.field2592 * 64 - this.field2594 * 64 + arg1;
            return new class339(this.field2589, var3, var4);
        } else {
            return null;
        }
    }

    @ObfuscatedName("jg.as(Luq;I)V")
    public void method4244(class534 arg0) {
        this.field2589 = arg0.method8591();
        this.field2590 = arg0.method8591();
        this.field2591 = arg0.method8593();
        this.field2596 = arg0.method8591();
        this.field2597 = arg0.method8591();
        this.field2592 = arg0.method8593();
        this.field2593 = arg0.method8591();
        this.field2595 = arg0.method8591();
        this.field2600 = arg0.method8593();
        this.field2599 = arg0.method8591();
        this.field2601 = arg0.method8591();
        this.field2594 = arg0.method8593();
        this.field2598 = arg0.method8591();
        this.field2602 = arg0.method8591();
        this.method4522();
    }

    @ObfuscatedName("jg.aa(I)V")
    public void method4522() {
    }
}
