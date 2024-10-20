package deob;

@ObfuscatedName("hf")
public class class229 implements class245 {

    @ObfuscatedName("hf.c")
    public int field2763;

    @ObfuscatedName("hf.v")
    public int field2762;

    @ObfuscatedName("hf.q")
    public int field2752;

    @ObfuscatedName("hf.f")
    public int field2753;

    @ObfuscatedName("hf.j")
    public int field2750;

    @ObfuscatedName("hf.e")
    public int field2755;

    @ObfuscatedName("hf.g")
    public int field2751;

    @ObfuscatedName("hf.w")
    public int field2757;

    @ObfuscatedName("hf.y")
    public int field2758;

    @ObfuscatedName("hf.i")
    public int field2759;

    @ObfuscatedName("hf.c(Lhg;I)V")
    public void method4246(class225 arg0) {
        if (arg0.field2700 > this.field2750) {
            arg0.field2700 = this.field2750;
        }
        if (arg0.field2706 < this.field2750) {
            arg0.field2706 = this.field2750;
        }
        if (arg0.field2707 > this.field2755) {
            arg0.field2707 = this.field2755;
        }
        if (arg0.field2703 < this.field2755) {
            arg0.field2703 = this.field2755;
        }
    }

    @ObfuscatedName("hf.v(IIII)Z")
    public boolean method4259(int arg0, int arg1, int arg2) {
        if (arg0 >= this.field2763 && arg0 < this.field2763 + this.field2762) {
            return arg1 >= (this.field2752 << 6) + (this.field2751 << 3) && arg1 <= (this.field2752 << 6) + (this.field2751 << 3) + 7 && arg2 >= (this.field2757 << 3) + (this.field2753 << 6) && arg2 <= (this.field2757 << 3) + (this.field2753 << 6) + 7;
        } else {
            return false;
        }
    }

    @ObfuscatedName("hf.q(III)Z")
    public boolean method4248(int arg0, int arg1) {
        return arg0 >= (this.field2758 << 3) + (this.field2750 << 6) && arg0 <= (this.field2758 << 3) + (this.field2750 << 6) + 7 && arg1 >= (this.field2759 << 3) + (this.field2755 << 6) && arg1 <= (this.field2759 << 3) + (this.field2755 << 6) + 7;
    }

    @ObfuscatedName("hf.f(IIII)[I")
    public int[] method4249(int arg0, int arg1, int arg2) {
        return this.method4259(arg0, arg1, arg2) ? new int[] { this.field2758 * 8 - this.field2751 * 8 + this.field2750 * 64 - this.field2752 * 64 + arg1, this.field2759 * 8 - this.field2757 * 8 + this.field2755 * 64 - this.field2753 * 64 + arg2 } : null;
    }

    @ObfuscatedName("hf.j(III)Lkd;")
    public class289 method4250(int arg0, int arg1) {
        if (this.method4248(arg0, arg1)) {
            int var3 = this.field2751 * 8 - this.field2758 * 8 + this.field2752 * 64 - this.field2750 * 64 + arg0;
            int var4 = this.field2757 * 8 - this.field2759 * 8 + this.field2753 * 64 - this.field2755 * 64 + arg1;
            return new class289(this.field2763, var3, var4);
        } else {
            return null;
        }
    }

    @ObfuscatedName("hf.e(Lqt;B)V")
    public void method4270(class443 arg0) {
        this.field2763 = arg0.method7047();
        this.field2762 = arg0.method7047();
        this.field2752 = arg0.method7049();
        this.field2751 = arg0.method7047();
        this.field2753 = arg0.method7049();
        this.field2757 = arg0.method7047();
        this.field2750 = arg0.method7049();
        this.field2758 = arg0.method7047();
        this.field2755 = arg0.method7049();
        this.field2759 = arg0.method7047();
        this.method4522();
    }

    @ObfuscatedName("hf.g(B)V")
    public void method4522() {
    }
}
