package deob;

@ObfuscatedName("lc")
public class class316 {

    @ObfuscatedName("lc.g")
    public int field3837;

    @ObfuscatedName("lc.r")
    public int field3836;

    @ObfuscatedName("lc.e")
    public int field3838;

    @ObfuscatedName("lc.q")
    public int field3839;

    public class316(int arg0, int arg1) {
        this(0, 0, arg0, arg1);
    }

    public class316(int arg0, int arg1, int arg2, int arg3) {
        this.method5526(arg0, arg1);
        this.method5527(arg2, arg3);
    }

    @ObfuscatedName("lc.g(III)V")
    public void method5526(int arg0, int arg1) {
        this.field3837 = arg0;
        this.field3836 = arg1;
    }

    @ObfuscatedName("lc.r(III)V")
    public void method5527(int arg0, int arg1) {
        this.field3838 = arg0;
        this.field3839 = arg1;
    }

    public String toString() {
        return null;
    }

    @ObfuscatedName("lc.e(Llc;Llc;I)V")
    public void method5529(class316 arg0, class316 arg1) {
        this.method5558(arg0, arg1);
        this.method5530(arg0, arg1);
    }

    @ObfuscatedName("lc.q(Llc;Llc;B)V")
    public void method5558(class316 arg0, class316 arg1) {
        arg1.field3837 = this.field3837;
        arg1.field3838 = this.field3838;
        if (this.field3837 < arg0.field3837) {
            arg1.field3838 -= arg0.field3837 - this.field3837;
            arg1.field3837 = arg0.field3837;
        }
        if (arg1.method5531() > arg0.method5531()) {
            arg1.field3838 -= arg1.method5531() - arg0.method5531();
        }
        if (arg1.field3838 < 0) {
            arg1.field3838 = 0;
        }
    }

    @ObfuscatedName("lc.c(Llc;Llc;I)V")
    public void method5530(class316 arg0, class316 arg1) {
        arg1.field3836 = this.field3836;
        arg1.field3839 = this.field3839;
        if (this.field3836 < arg0.field3836) {
            arg1.field3839 -= arg0.field3836 - this.field3836;
            arg1.field3836 = arg0.field3836;
        }
        if (arg1.method5532() > arg0.method5532()) {
            arg1.field3839 -= arg1.method5532() - arg0.method5532();
        }
        if (arg1.field3839 < 0) {
            arg1.field3839 = 0;
        }
    }

    @ObfuscatedName("lc.i(I)I")
    public int method5531() {
        return this.field3838 + this.field3837;
    }

    @ObfuscatedName("lc.p(I)I")
    public int method5532() {
        return this.field3839 + this.field3836;
    }
}
