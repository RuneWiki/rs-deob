package deob;

@ObfuscatedName("ha")
public class class225 implements class238 {

    @ObfuscatedName("ha.c")
    public int field2679;

    @ObfuscatedName("ha.b")
    public int field2676;

    @ObfuscatedName("ha.p")
    public int field2688;

    @ObfuscatedName("ha.m")
    public int field2678;

    @ObfuscatedName("ha.t")
    public int field2684;

    @ObfuscatedName("ha.s")
    public int field2680;

    @ObfuscatedName("ha.j")
    public int field2681;

    @ObfuscatedName("ha.w")
    public int field2675;

    @ObfuscatedName("ha.n")
    public int field2683;

    @ObfuscatedName("ha.r")
    public int field2677;

    @ObfuscatedName("ha.o")
    public int field2685;

    @ObfuscatedName("ha.v")
    public int field2686;

    @ObfuscatedName("ha.d")
    public int field2687;

    @ObfuscatedName("ha.h")
    public int field2682;

    @ObfuscatedName("ha.c(Lhr;I)V")
    public void method4050(class218 arg0) {
        if (arg0.field2603 > this.field2684) {
            arg0.field2603 = this.field2684;
        }
        if (arg0.field2610 < this.field2684) {
            arg0.field2610 = this.field2684;
        }
        if (arg0.field2611 > this.field2680) {
            arg0.field2611 = this.field2680;
        }
        if (arg0.field2608 < this.field2680) {
            arg0.field2608 = this.field2680;
        }
    }

    @ObfuscatedName("ha.b(IIIB)Z")
    public boolean method4051(int arg0, int arg1, int arg2) {
        if (arg0 >= this.field2679 && arg0 < this.field2679 + this.field2676) {
            return arg1 >= (this.field2688 << 6) + (this.field2681 << 3) && arg1 <= (this.field2688 << 6) + (this.field2683 << 3) + 7 && arg2 >= (this.field2678 << 6) + (this.field2675 << 3) && arg2 <= (this.field2678 << 6) + (this.field2677 << 3) + 7;
        } else {
            return false;
        }
    }

    @ObfuscatedName("ha.p(III)Z")
    public boolean method4049(int arg0, int arg1) {
        return arg0 >= (this.field2685 << 3) + (this.field2684 << 6) && arg0 <= (this.field2687 << 3) + (this.field2684 << 6) + 7 && arg1 >= (this.field2686 << 3) + (this.field2680 << 6) && arg1 <= (this.field2682 << 3) + (this.field2680 << 6) + 7;
    }

    @ObfuscatedName("ha.m(IIII)[I")
    public int[] method4053(int arg0, int arg1, int arg2) {
        return this.method4051(arg0, arg1, arg2) ? new int[] { this.field2685 * 8 - this.field2681 * 8 + this.field2684 * 64 - this.field2688 * 64 + arg1, this.field2686 * 8 - this.field2675 * 8 + this.field2680 * 64 - this.field2678 * 64 + arg2 } : null;
    }

    @ObfuscatedName("ha.t(IIS)Lju;")
    public class277 method4056(int arg0, int arg1) {
        if (this.method4049(arg0, arg1)) {
            int var3 = this.field2681 * 8 - this.field2685 * 8 + this.field2688 * 64 - this.field2684 * 64 + arg0;
            int var4 = this.field2675 * 8 - this.field2686 * 8 + this.field2678 * 64 - this.field2680 * 64 + arg1;
            return new class277(this.field2679, var3, var4);
        } else {
            return null;
        }
    }

    @ObfuscatedName("ha.s(Lpi;S)V")
    public void method4054(class419 arg0) {
        this.field2679 = arg0.method6781();
        this.field2676 = arg0.method6781();
        this.field2688 = arg0.method6672();
        this.field2681 = arg0.method6781();
        this.field2683 = arg0.method6781();
        this.field2678 = arg0.method6672();
        this.field2675 = arg0.method6781();
        this.field2677 = arg0.method6781();
        this.field2684 = arg0.method6672();
        this.field2685 = arg0.method6781();
        this.field2687 = arg0.method6781();
        this.field2680 = arg0.method6672();
        this.field2686 = arg0.method6781();
        this.field2682 = arg0.method6781();
        this.method4343();
    }

    @ObfuscatedName("ha.j(I)V")
    public void method4343() {
    }
}
