package deob;

@ObfuscatedName("hy")
public class class222 implements class238 {

    @ObfuscatedName("hy.c")
    public int field2659;

    @ObfuscatedName("hy.b")
    public int field2665;

    @ObfuscatedName("hy.p")
    public int field2658;

    @ObfuscatedName("hy.m")
    public int field2663;

    @ObfuscatedName("hy.t")
    public int field2660;

    @ObfuscatedName("hy.s")
    public int field2661;

    @ObfuscatedName("hy.j")
    public int field2662;

    @ObfuscatedName("hy.w")
    public int field2657;

    @ObfuscatedName("hy.n")
    public int field2664;

    @ObfuscatedName("hy.r")
    public int field2656;

    @ObfuscatedName("hy.c(Lhr;I)V")
    public void method4050(class218 arg0) {
        if (arg0.field2603 > this.field2660) {
            arg0.field2603 = this.field2660;
        }
        if (arg0.field2610 < this.field2660) {
            arg0.field2610 = this.field2660;
        }
        if (arg0.field2611 > this.field2661) {
            arg0.field2611 = this.field2661;
        }
        if (arg0.field2608 < this.field2661) {
            arg0.field2608 = this.field2661;
        }
    }

    @ObfuscatedName("hy.b(IIIB)Z")
    public boolean method4051(int arg0, int arg1, int arg2) {
        if (arg0 >= this.field2659 && arg0 < this.field2665 + this.field2659) {
            return arg1 >= (this.field2662 << 3) + (this.field2658 << 6) && arg1 <= (this.field2662 << 3) + (this.field2658 << 6) + 7 && arg2 >= (this.field2663 << 6) + (this.field2657 << 3) && arg2 <= (this.field2663 << 6) + (this.field2657 << 3) + 7;
        } else {
            return false;
        }
    }

    @ObfuscatedName("hy.p(III)Z")
    public boolean method4049(int arg0, int arg1) {
        return arg0 >= (this.field2664 << 3) + (this.field2660 << 6) && arg0 <= (this.field2664 << 3) + (this.field2660 << 6) + 7 && arg1 >= (this.field2661 << 6) + (this.field2656 << 3) && arg1 <= (this.field2661 << 6) + (this.field2656 << 3) + 7;
    }

    @ObfuscatedName("hy.m(IIII)[I")
    public int[] method4053(int arg0, int arg1, int arg2) {
        return this.method4051(arg0, arg1, arg2) ? new int[] { this.field2664 * 8 - this.field2662 * 8 + this.field2660 * 64 - this.field2658 * 64 + arg1, this.field2656 * 8 - this.field2657 * 8 + this.field2661 * 64 - this.field2663 * 64 + arg2 } : null;
    }

    @ObfuscatedName("hy.t(IIS)Lju;")
    public class277 method4056(int arg0, int arg1) {
        if (this.method4049(arg0, arg1)) {
            int var3 = this.field2662 * 8 - this.field2664 * 8 + this.field2658 * 64 - this.field2660 * 64 + arg0;
            int var4 = this.field2657 * 8 - this.field2656 * 8 + this.field2663 * 64 - this.field2661 * 64 + arg1;
            return new class277(this.field2659, var3, var4);
        } else {
            return null;
        }
    }

    @ObfuscatedName("hy.s(Lpi;S)V")
    public void method4054(class419 arg0) {
        this.field2659 = arg0.method6781();
        this.field2665 = arg0.method6781();
        this.field2658 = arg0.method6672();
        this.field2662 = arg0.method6781();
        this.field2663 = arg0.method6672();
        this.field2657 = arg0.method6781();
        this.field2660 = arg0.method6672();
        this.field2664 = arg0.method6781();
        this.field2661 = arg0.method6672();
        this.field2656 = arg0.method6781();
        this.method4333();
    }

    @ObfuscatedName("hy.j(I)V")
    public void method4333() {
    }
}
