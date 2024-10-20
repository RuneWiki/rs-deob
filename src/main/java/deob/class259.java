package deob;

@ObfuscatedName("ju")
public class class259 implements class262 {

    @ObfuscatedName("ju.aq")
    public int field2669;

    @ObfuscatedName("ju.aw")
    public int field2668;

    @ObfuscatedName("ju.al")
    public int field2670;

    @ObfuscatedName("ju.ai")
    public int field2672;

    @ObfuscatedName("ju.ar")
    public int field2671;

    @ObfuscatedName("ju.as")
    public int field2667;

    @ObfuscatedName("ju.aq(Ljw;I)V")
    public void method4235(class242 arg0) {
        if (arg0.field2524 > this.field2671) {
            arg0.field2524 = this.field2671;
        }
        if (arg0.field2525 < this.field2671) {
            arg0.field2525 = this.field2671;
        }
        if (arg0.field2526 > this.field2667) {
            arg0.field2526 = this.field2667;
        }
        if (arg0.field2527 < this.field2667) {
            arg0.field2527 = this.field2667;
        }
    }

    @ObfuscatedName("ju.aw(IIII)Z")
    public boolean method4236(int arg0, int arg1, int arg2) {
        if (arg0 >= this.field2669 && arg0 < this.field2669 + this.field2668) {
            return arg1 >> 6 == this.field2670 && arg2 >> 6 == this.field2672;
        } else {
            return false;
        }
    }

    @ObfuscatedName("ju.al(III)Z")
    public boolean method4237(int arg0, int arg1) {
        return arg0 >> 6 == this.field2671 && arg1 >> 6 == this.field2667;
    }

    @ObfuscatedName("ju.ai(IIII)[I")
    public int[] method4246(int arg0, int arg1, int arg2) {
        return this.method4236(arg0, arg1, arg2) ? new int[] { this.field2671 * 64 - this.field2670 * 64 + arg1, this.field2667 * 64 - this.field2672 * 64 + arg2 } : null;
    }

    @ObfuscatedName("ju.ar(III)Lns;")
    public class339 method4234(int arg0, int arg1) {
        if (this.method4237(arg0, arg1)) {
            int var3 = this.field2670 * 64 - this.field2671 * 64 + arg0;
            int var4 = this.field2672 * 64 - this.field2667 * 64 + arg1;
            return new class339(this.field2669, var3, var4);
        } else {
            return null;
        }
    }

    @ObfuscatedName("ju.as(Luq;I)V")
    public void method4244(class534 arg0) {
        this.field2669 = arg0.method8591();
        this.field2668 = arg0.method8591();
        this.field2670 = arg0.method8593();
        this.field2672 = arg0.method8593();
        this.field2671 = arg0.method8593();
        this.field2667 = arg0.method8593();
        this.method4581();
    }

    @ObfuscatedName("ju.aa(I)V")
    public void method4581() {
    }
}
