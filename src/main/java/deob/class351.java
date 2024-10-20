package deob;

@ObfuscatedName("mo")
public class class351 {

    @ObfuscatedName("mo.i")
    public int field4021;

    @ObfuscatedName("mo.w")
    public int field4023;

    @ObfuscatedName("mo.s")
    public int field4022;

    @ObfuscatedName("mo.a")
    public int field4020;

    public class351(int arg0, int arg1) {
        this(0, 0, arg0, arg1);
    }

    public class351(int arg0, int arg1, int arg2, int arg3) {
        this.method5660(arg0, arg1);
        this.method5661(arg2, arg3);
    }

    @ObfuscatedName("mo.i(IIS)V")
    public void method5660(int arg0, int arg1) {
        this.field4021 = arg0;
        this.field4023 = arg1;
    }

    @ObfuscatedName("mo.w(IIB)V")
    public void method5661(int arg0, int arg1) {
        this.field4022 = arg0;
        this.field4020 = arg1;
    }

    @ObfuscatedName("mo.s(III)Z")
    public boolean method5662(int arg0, int arg1) {
        return arg0 >= this.field4021 && arg0 < this.field4022 + this.field4021 && arg1 >= this.field4023 && arg1 < this.field4023 + this.field4020;
    }

    public String toString() {
        return null;
    }

    @ObfuscatedName("mo.a(Lmo;Lmo;I)V")
    public void method5674(class351 arg0, class351 arg1) {
        this.method5664(arg0, arg1);
        this.method5665(arg0, arg1);
    }

    @ObfuscatedName("mo.o(Lmo;Lmo;I)V")
    public void method5664(class351 arg0, class351 arg1) {
        arg1.field4021 = this.field4021;
        arg1.field4022 = this.field4022;
        if (this.field4021 < arg0.field4021) {
            arg1.field4022 -= arg0.field4021 - this.field4021;
            arg1.field4021 = arg0.field4021;
        }
        if (arg1.method5666() > arg0.method5666()) {
            arg1.field4022 -= arg1.method5666() - arg0.method5666();
        }
        if (arg1.field4022 < 0) {
            arg1.field4022 = 0;
        }
    }

    @ObfuscatedName("mo.g(Lmo;Lmo;B)V")
    public void method5665(class351 arg0, class351 arg1) {
        arg1.field4023 = this.field4023;
        arg1.field4020 = this.field4020;
        if (this.field4023 < arg0.field4023) {
            arg1.field4020 -= arg0.field4023 - this.field4023;
            arg1.field4023 = arg0.field4023;
        }
        if (arg1.method5690() > arg0.method5690()) {
            arg1.field4020 -= arg1.method5690() - arg0.method5690();
        }
        if (arg1.field4020 < 0) {
            arg1.field4020 = 0;
        }
    }

    @ObfuscatedName("mo.e(I)I")
    public int method5666() {
        return this.field4022 + this.field4021;
    }

    @ObfuscatedName("mo.p(I)I")
    public int method5690() {
        return this.field4023 + this.field4020;
    }
}
