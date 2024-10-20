package deob;

@ObfuscatedName("ll")
public class class316 {

    @ObfuscatedName("ll.c")
    public int field3805;

    @ObfuscatedName("ll.q")
    public int field3804;

    @ObfuscatedName("ll.m")
    public int field3808;

    @ObfuscatedName("ll.j")
    public int field3803;

    public class316(int arg0, int arg1) {
        this(0, 0, arg0, arg1);
    }

    public class316(int arg0, int arg1, int arg2, int arg3) {
        this.method5324(arg0, arg1);
        this.method5337(arg2, arg3);
    }

    @ObfuscatedName("ll.c(IIB)V")
    public void method5324(int arg0, int arg1) {
        this.field3805 = arg0;
        this.field3804 = arg1;
    }

    @ObfuscatedName("ll.q(III)V")
    public void method5337(int arg0, int arg1) {
        this.field3808 = arg0;
        this.field3803 = arg1;
    }

    public String toString() {
        return null;
    }

    @ObfuscatedName("ll.m(Lll;Lll;I)V")
    public void method5327(class316 arg0, class316 arg1) {
        this.method5328(arg0, arg1);
        this.method5329(arg0, arg1);
    }

    @ObfuscatedName("ll.j(Lll;Lll;I)V")
    public void method5328(class316 arg0, class316 arg1) {
        arg1.field3805 = this.field3805;
        arg1.field3808 = this.field3808;
        if (this.field3805 < arg0.field3805) {
            arg1.field3808 -= arg0.field3805 - this.field3805;
            arg1.field3805 = arg0.field3805;
        }
        if (arg1.method5326() > arg0.method5326()) {
            arg1.field3808 -= arg1.method5326() - arg0.method5326();
        }
        if (arg1.field3808 < 0) {
            arg1.field3808 = 0;
        }
    }

    @ObfuscatedName("ll.g(Lll;Lll;B)V")
    public void method5329(class316 arg0, class316 arg1) {
        arg1.field3804 = this.field3804;
        arg1.field3803 = this.field3803;
        if (this.field3804 < arg0.field3804) {
            arg1.field3803 -= arg0.field3804 - this.field3804;
            arg1.field3804 = arg0.field3804;
        }
        if (arg1.method5330() > arg0.method5330()) {
            arg1.field3803 -= arg1.method5330() - arg0.method5330();
        }
        if (arg1.field3803 < 0) {
            arg1.field3803 = 0;
        }
    }

    @ObfuscatedName("ll.i(B)I")
    public int method5326() {
        return this.field3808 + this.field3805;
    }

    @ObfuscatedName("ll.h(I)I")
    public int method5330() {
        return this.field3804 + this.field3803;
    }
}
