package deob;

@ObfuscatedName("ht")
public class class224 implements class245 {

    @ObfuscatedName("ht.c")
    public int field2692;

    @ObfuscatedName("ht.v")
    public int field2689;

    @ObfuscatedName("ht.q")
    public int field2693;

    @ObfuscatedName("ht.f")
    public int field2691;

    @ObfuscatedName("ht.j")
    public int field2695;

    @ObfuscatedName("ht.e")
    public int field2697;

    @ObfuscatedName("ht.g")
    public int field2694;

    @ObfuscatedName("ht.w")
    public int field2690;

    @ObfuscatedName("ht.y")
    public int field2696;

    @ObfuscatedName("ht.i")
    public int field2688;

    @ObfuscatedName("ht.c(Lhg;I)V")
    public void method4246(class225 arg0) {
        if (arg0.field2700 > this.field2694) {
            arg0.field2700 = this.field2694;
        }
        if (arg0.field2706 < this.field2696) {
            arg0.field2706 = this.field2696;
        }
        if (arg0.field2707 > this.field2690) {
            arg0.field2707 = this.field2690;
        }
        if (arg0.field2703 < this.field2688) {
            arg0.field2703 = this.field2688;
        }
    }

    @ObfuscatedName("ht.v(IIII)Z")
    public boolean method4259(int arg0, int arg1, int arg2) {
        if (arg0 >= this.field2692 && arg0 < this.field2692 + this.field2689) {
            return arg1 >> 6 >= this.field2693 && arg1 >> 6 <= this.field2695 && arg2 >> 6 >= this.field2691 && arg2 >> 6 <= this.field2697;
        } else {
            return false;
        }
    }

    @ObfuscatedName("ht.q(III)Z")
    public boolean method4248(int arg0, int arg1) {
        return arg0 >> 6 >= this.field2694 && arg0 >> 6 <= this.field2696 && arg1 >> 6 >= this.field2690 && arg1 >> 6 <= this.field2688;
    }

    @ObfuscatedName("ht.f(IIII)[I")
    public int[] method4249(int arg0, int arg1, int arg2) {
        return this.method4259(arg0, arg1, arg2) ? new int[] { this.field2694 * 64 - this.field2693 * 64 + arg1, this.field2690 * 64 - this.field2691 * 64 + arg2 } : null;
    }

    @ObfuscatedName("ht.j(III)Lkd;")
    public class289 method4250(int arg0, int arg1) {
        if (this.method4248(arg0, arg1)) {
            int var3 = this.field2693 * 64 - this.field2694 * 64 + arg0;
            int var4 = this.field2691 * 64 - this.field2690 * 64 + arg1;
            return new class289(this.field2692, var3, var4);
        } else {
            return null;
        }
    }

    @ObfuscatedName("ht.e(Lqt;B)V")
    public void method4270(class443 arg0) {
        this.field2692 = arg0.method7047();
        this.field2689 = arg0.method7047();
        this.field2693 = arg0.method7049();
        this.field2691 = arg0.method7049();
        this.field2695 = arg0.method7049();
        this.field2697 = arg0.method7049();
        this.field2694 = arg0.method7049();
        this.field2690 = arg0.method7049();
        this.field2696 = arg0.method7049();
        this.field2688 = arg0.method7049();
        this.method4252();
    }

    @ObfuscatedName("ht.g(B)V")
    public void method4252() {
    }
}
