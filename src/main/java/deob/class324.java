package deob;

@ObfuscatedName("lg")
public class class324 {

    @ObfuscatedName("lg.c")
    public int field3940;

    @ObfuscatedName("lg.i")
    public int field3939;

    @ObfuscatedName("lg.o")
    public int field3937;

    @ObfuscatedName("lg.j")
    public int field3938;

    public class324(int arg0, int arg1) {
        this(0, 0, arg0, arg1);
    }

    public class324(int arg0, int arg1, int arg2, int arg3) {
        this.method5298(arg0, arg1);
        this.method5276(arg2, arg3);
    }

    @ObfuscatedName("lg.c(IIB)V")
    public void method5298(int arg0, int arg1) {
        this.field3940 = arg0;
        this.field3939 = arg1;
    }

    @ObfuscatedName("lg.i(III)V")
    public void method5276(int arg0, int arg1) {
        this.field3937 = arg0;
        this.field3938 = arg1;
    }

    public String toString() {
        return null;
    }

    @ObfuscatedName("lg.o(Llg;Llg;I)V")
    public void method5275(class324 arg0, class324 arg1) {
        this.method5279(arg0, arg1);
        this.method5274(arg0, arg1);
    }

    @ObfuscatedName("lg.j(Llg;Llg;B)V")
    public void method5279(class324 arg0, class324 arg1) {
        arg1.field3940 = this.field3940;
        arg1.field3937 = this.field3937;
        if (this.field3940 < arg0.field3940) {
            arg1.field3937 -= arg0.field3940 - this.field3940;
            arg1.field3940 = arg0.field3940;
        }
        if (arg1.method5281() > arg0.method5281()) {
            arg1.field3937 -= arg1.method5281() - arg0.method5281();
        }
        if (arg1.field3937 < 0) {
            arg1.field3937 = 0;
        }
    }

    @ObfuscatedName("lg.k(Llg;Llg;I)V")
    public void method5274(class324 arg0, class324 arg1) {
        arg1.field3939 = this.field3939;
        arg1.field3938 = this.field3938;
        if (this.field3939 < arg0.field3939) {
            arg1.field3938 -= arg0.field3939 - this.field3939;
            arg1.field3939 = arg0.field3939;
        }
        if (arg1.method5290() > arg0.method5290()) {
            arg1.field3938 -= arg1.method5290() - arg0.method5290();
        }
        if (arg1.field3938 < 0) {
            arg1.field3938 = 0;
        }
    }

    @ObfuscatedName("lg.x(I)I")
    public int method5281() {
        return this.field3940 + this.field3937;
    }

    @ObfuscatedName("lg.z(I)I")
    public int method5290() {
        return this.field3939 + this.field3938;
    }
}
