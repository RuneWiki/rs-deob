package deob;

@ObfuscatedName("ll")
public class class320 {

    @ObfuscatedName("ll.c")
    public int field3837;

    @ObfuscatedName("ll.t")
    public int field3836;

    @ObfuscatedName("ll.o")
    public int field3838;

    @ObfuscatedName("ll.e")
    public int field3839;

    public class320(int arg0, int arg1) {
        this(0, 0, arg0, arg1);
    }

    public class320(int arg0, int arg1, int arg2, int arg3) {
        this.method5543(arg0, arg1);
        this.method5544(arg2, arg3);
    }

    @ObfuscatedName("ll.c(III)V")
    public void method5543(int arg0, int arg1) {
        this.field3837 = arg0;
        this.field3836 = arg1;
    }

    @ObfuscatedName("ll.t(IIB)V")
    public void method5544(int arg0, int arg1) {
        this.field3838 = arg0;
        this.field3839 = arg1;
    }

    public String toString() {
        return null;
    }

    @ObfuscatedName("ll.o(Lll;Lll;I)V")
    public void method5545(class320 arg0, class320 arg1) {
        this.method5546(arg0, arg1);
        this.method5547(arg0, arg1);
    }

    @ObfuscatedName("ll.e(Lll;Lll;I)V")
    public void method5546(class320 arg0, class320 arg1) {
        arg1.field3837 = this.field3837;
        arg1.field3838 = this.field3838;
        if (this.field3837 < arg0.field3837) {
            arg1.field3838 -= arg0.field3837 - this.field3837;
            arg1.field3837 = arg0.field3837;
        }
        if (arg1.method5548() > arg0.method5548()) {
            arg1.field3838 -= arg1.method5548() - arg0.method5548();
        }
        if (arg1.field3838 < 0) {
            arg1.field3838 = 0;
        }
    }

    @ObfuscatedName("ll.i(Lll;Lll;I)V")
    public void method5547(class320 arg0, class320 arg1) {
        arg1.field3836 = this.field3836;
        arg1.field3839 = this.field3839;
        if (this.field3836 < arg0.field3836) {
            arg1.field3839 -= arg0.field3836 - this.field3836;
            arg1.field3836 = arg0.field3836;
        }
        if (arg1.method5549() > arg0.method5549()) {
            arg1.field3839 -= arg1.method5549() - arg0.method5549();
        }
        if (arg1.field3839 < 0) {
            arg1.field3839 = 0;
        }
    }

    @ObfuscatedName("ll.g(I)I")
    public int method5548() {
        return this.field3838 + this.field3837;
    }

    @ObfuscatedName("ll.d(I)I")
    public int method5549() {
        return this.field3839 + this.field3836;
    }
}
