package deob;

@ObfuscatedName("af")
public class class40 implements class44 {

    @ObfuscatedName("af.c")
    public int field499;

    @ObfuscatedName("af.i")
    public int field496;

    @ObfuscatedName("af.o")
    public int field497;

    @ObfuscatedName("af.j")
    public int field498;

    @ObfuscatedName("af.k")
    public int field504;

    @ObfuscatedName("af.x")
    public int field500;

    @ObfuscatedName("af.c(Las;I)V")
    public void method216(class33 arg0) {
        if (arg0.field434 > this.field504) {
            arg0.field434 = this.field504;
        }
        if (arg0.field432 < this.field504) {
            arg0.field432 = this.field504;
        }
        if (arg0.field435 > this.field500) {
            arg0.field435 = this.field500;
        }
        if (arg0.field437 < this.field500) {
            arg0.field437 = this.field500;
        }
    }

    @ObfuscatedName("af.i(IIII)Z")
    public boolean method194(int arg0, int arg1, int arg2) {
        if (arg0 >= this.field499 && arg0 < this.field499 + this.field496) {
            return arg1 >> 6 == this.field497 && arg2 >> 6 == this.field498;
        } else {
            return false;
        }
    }

    @ObfuscatedName("af.o(IIS)Z")
    public boolean method195(int arg0, int arg1) {
        return arg0 >> 6 == this.field504 && arg1 >> 6 == this.field500;
    }

    @ObfuscatedName("af.j(IIII)[I")
    public int[] method196(int arg0, int arg1, int arg2) {
        return this.method194(arg0, arg1, arg2) ? new int[] { this.field504 * 64 - this.field497 * 64 + arg1, this.field500 * 64 - this.field498 * 64 + arg2 } : null;
    }

    @ObfuscatedName("af.k(IIB)Lim;")
    public class239 method218(int arg0, int arg1) {
        if (this.method195(arg0, arg1)) {
            int var3 = this.field497 * 64 - this.field504 * 64 + arg0;
            int var4 = this.field498 * 64 - this.field500 * 64 + arg1;
            return new class239(this.field499, var3, var4);
        } else {
            return null;
        }
    }

    @ObfuscatedName("af.x(Lgp;I)V")
    public void method198(class195 arg0) {
        this.field499 = arg0.method3429();
        this.field496 = arg0.method3429();
        this.field497 = arg0.method3218();
        this.field498 = arg0.method3218();
        this.field504 = arg0.method3218();
        this.field500 = arg0.method3218();
        this.method496();
    }

    @ObfuscatedName("af.z(B)V")
    public void method496() {
    }
}
