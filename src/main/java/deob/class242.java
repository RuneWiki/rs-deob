package deob;

@ObfuscatedName("ir")
public class class242 implements class245 {

    @ObfuscatedName("ir.c")
    public int field2855;

    @ObfuscatedName("ir.v")
    public int field2852;

    @ObfuscatedName("ir.q")
    public int field2853;

    @ObfuscatedName("ir.f")
    public int field2854;

    @ObfuscatedName("ir.j")
    public int field2857;

    @ObfuscatedName("ir.e")
    public int field2856;

    @ObfuscatedName("ir.c(Lhg;I)V")
    public void method4246(class225 arg0) {
        if (arg0.field2700 > this.field2857) {
            arg0.field2700 = this.field2857;
        }
        if (arg0.field2706 < this.field2857) {
            arg0.field2706 = this.field2857;
        }
        if (arg0.field2707 > this.field2856) {
            arg0.field2707 = this.field2856;
        }
        if (arg0.field2703 < this.field2856) {
            arg0.field2703 = this.field2856;
        }
    }

    @ObfuscatedName("ir.v(IIII)Z")
    public boolean method4259(int arg0, int arg1, int arg2) {
        if (arg0 >= this.field2855 && arg0 < this.field2855 + this.field2852) {
            return arg1 >> 6 == this.field2853 && arg2 >> 6 == this.field2854;
        } else {
            return false;
        }
    }

    @ObfuscatedName("ir.q(III)Z")
    public boolean method4248(int arg0, int arg1) {
        return arg0 >> 6 == this.field2857 && arg1 >> 6 == this.field2856;
    }

    @ObfuscatedName("ir.f(IIII)[I")
    public int[] method4249(int arg0, int arg1, int arg2) {
        return this.method4259(arg0, arg1, arg2) ? new int[] { this.field2857 * 64 - this.field2853 * 64 + arg1, this.field2856 * 64 - this.field2854 * 64 + arg2 } : null;
    }

    @ObfuscatedName("ir.j(III)Lkd;")
    public class289 method4250(int arg0, int arg1) {
        if (this.method4248(arg0, arg1)) {
            int var3 = this.field2853 * 64 - this.field2857 * 64 + arg0;
            int var4 = this.field2854 * 64 - this.field2856 * 64 + arg1;
            return new class289(this.field2855, var3, var4);
        } else {
            return null;
        }
    }

    @ObfuscatedName("ir.e(Lqt;B)V")
    public void method4270(class443 arg0) {
        this.field2855 = arg0.method7047();
        this.field2852 = arg0.method7047();
        this.field2853 = arg0.method7049();
        this.field2854 = arg0.method7049();
        this.field2857 = arg0.method7049();
        this.field2856 = arg0.method7049();
        this.method4596();
    }

    @ObfuscatedName("ir.g(I)V")
    public void method4596() {
    }
}
