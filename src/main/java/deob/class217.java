package deob;

@ObfuscatedName("ht")
public class class217 implements class238 {

    @ObfuscatedName("ht.c")
    public int field2595;

    @ObfuscatedName("ht.b")
    public int field2592;

    @ObfuscatedName("ht.p")
    public int field2593;

    @ObfuscatedName("ht.m")
    public int field2597;

    @ObfuscatedName("ht.t")
    public int field2594;

    @ObfuscatedName("ht.s")
    public int field2599;

    @ObfuscatedName("ht.j")
    public int field2596;

    @ObfuscatedName("ht.w")
    public int field2598;

    @ObfuscatedName("ht.n")
    public int field2601;

    @ObfuscatedName("ht.r")
    public int field2600;

    @ObfuscatedName("ht.c(Lhr;I)V")
    public void method4050(class218 arg0) {
        if (arg0.field2603 > this.field2596) {
            arg0.field2603 = this.field2596;
        }
        if (arg0.field2610 < this.field2601) {
            arg0.field2610 = this.field2601;
        }
        if (arg0.field2611 > this.field2598) {
            arg0.field2611 = this.field2598;
        }
        if (arg0.field2608 < this.field2600) {
            arg0.field2608 = this.field2600;
        }
    }

    @ObfuscatedName("ht.b(IIIB)Z")
    public boolean method4051(int arg0, int arg1, int arg2) {
        if (arg0 >= this.field2595 && arg0 < this.field2595 + this.field2592) {
            return arg1 >> 6 >= this.field2593 && arg1 >> 6 <= this.field2594 && arg2 >> 6 >= this.field2597 && arg2 >> 6 <= this.field2599;
        } else {
            return false;
        }
    }

    @ObfuscatedName("ht.p(III)Z")
    public boolean method4049(int arg0, int arg1) {
        return arg0 >> 6 >= this.field2596 && arg0 >> 6 <= this.field2601 && arg1 >> 6 >= this.field2598 && arg1 >> 6 <= this.field2600;
    }

    @ObfuscatedName("ht.m(IIII)[I")
    public int[] method4053(int arg0, int arg1, int arg2) {
        return this.method4051(arg0, arg1, arg2) ? new int[] { this.field2596 * 64 - this.field2593 * 64 + arg1, this.field2598 * 64 - this.field2597 * 64 + arg2 } : null;
    }

    @ObfuscatedName("ht.t(IIS)Lju;")
    public class277 method4056(int arg0, int arg1) {
        if (this.method4049(arg0, arg1)) {
            int var3 = this.field2593 * 64 - this.field2596 * 64 + arg0;
            int var4 = this.field2597 * 64 - this.field2598 * 64 + arg1;
            return new class277(this.field2595, var3, var4);
        } else {
            return null;
        }
    }

    @ObfuscatedName("ht.s(Lpi;S)V")
    public void method4054(class419 arg0) {
        this.field2595 = arg0.method6781();
        this.field2592 = arg0.method6781();
        this.field2593 = arg0.method6672();
        this.field2597 = arg0.method6672();
        this.field2594 = arg0.method6672();
        this.field2599 = arg0.method6672();
        this.field2596 = arg0.method6672();
        this.field2598 = arg0.method6672();
        this.field2601 = arg0.method6672();
        this.field2600 = arg0.method6672();
        this.method4055();
    }

    @ObfuscatedName("ht.j(I)V")
    public void method4055() {
    }
}
