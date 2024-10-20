package deob;

@ObfuscatedName("jj")
public class class246 implements class262 {

    @ObfuscatedName("jj.aq")
    public int field2576;

    @ObfuscatedName("jj.aw")
    public int field2567;

    @ObfuscatedName("jj.al")
    public int field2571;

    @ObfuscatedName("jj.ai")
    public int field2569;

    @ObfuscatedName("jj.ar")
    public int field2568;

    @ObfuscatedName("jj.as")
    public int field2566;

    @ObfuscatedName("jj.aa")
    public int field2570;

    @ObfuscatedName("jj.az")
    public int field2573;

    @ObfuscatedName("jj.ao")
    public int field2574;

    @ObfuscatedName("jj.au")
    public int field2575;

    @ObfuscatedName("jj.aq(Ljw;I)V")
    public void method4235(class242 arg0) {
        if (arg0.field2524 > this.field2568) {
            arg0.field2524 = this.field2568;
        }
        if (arg0.field2525 < this.field2568) {
            arg0.field2525 = this.field2568;
        }
        if (arg0.field2526 > this.field2566) {
            arg0.field2526 = this.field2566;
        }
        if (arg0.field2527 < this.field2566) {
            arg0.field2527 = this.field2566;
        }
    }

    @ObfuscatedName("jj.aw(IIII)Z")
    public boolean method4236(int arg0, int arg1, int arg2) {
        if (arg0 >= this.field2576 && arg0 < this.field2576 + this.field2567) {
            return arg1 >= (this.field2571 << 6) + (this.field2570 << 3) && arg1 <= (this.field2571 << 6) + (this.field2570 << 3) + 7 && arg2 >= (this.field2573 << 3) + (this.field2569 << 6) && arg2 <= (this.field2573 << 3) + (this.field2569 << 6) + 7;
        } else {
            return false;
        }
    }

    @ObfuscatedName("jj.al(III)Z")
    public boolean method4237(int arg0, int arg1) {
        return arg0 >= (this.field2574 << 3) + (this.field2568 << 6) && arg0 <= (this.field2574 << 3) + (this.field2568 << 6) + 7 && arg1 >= (this.field2575 << 3) + (this.field2566 << 6) && arg1 <= (this.field2575 << 3) + (this.field2566 << 6) + 7;
    }

    @ObfuscatedName("jj.ai(IIII)[I")
    public int[] method4246(int arg0, int arg1, int arg2) {
        return this.method4236(arg0, arg1, arg2) ? new int[] { this.field2574 * 8 - this.field2570 * 8 + this.field2568 * 64 - this.field2571 * 64 + arg1, this.field2575 * 8 - this.field2573 * 8 + this.field2566 * 64 - this.field2569 * 64 + arg2 } : null;
    }

    @ObfuscatedName("jj.ar(III)Lns;")
    public class339 method4234(int arg0, int arg1) {
        if (this.method4237(arg0, arg1)) {
            int var3 = this.field2570 * 8 - this.field2574 * 8 + this.field2571 * 64 - this.field2568 * 64 + arg0;
            int var4 = this.field2573 * 8 - this.field2575 * 8 + this.field2569 * 64 - this.field2566 * 64 + arg1;
            return new class339(this.field2576, var3, var4);
        } else {
            return null;
        }
    }

    @ObfuscatedName("jj.as(Luq;I)V")
    public void method4244(class534 arg0) {
        this.field2576 = arg0.method8591();
        this.field2567 = arg0.method8591();
        this.field2571 = arg0.method8593();
        this.field2570 = arg0.method8591();
        this.field2569 = arg0.method8593();
        this.field2573 = arg0.method8591();
        this.field2568 = arg0.method8593();
        this.field2574 = arg0.method8591();
        this.field2566 = arg0.method8593();
        this.field2575 = arg0.method8591();
        this.method4513();
    }

    @ObfuscatedName("jj.aa(I)V")
    public void method4513() {
    }
}
