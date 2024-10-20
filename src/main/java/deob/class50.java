package deob;

@ObfuscatedName("ar")
public class class50 implements class44 {

    @ObfuscatedName("ar.c")
    public int field588;

    @ObfuscatedName("ar.i")
    public int field581;

    @ObfuscatedName("ar.o")
    public int field586;

    @ObfuscatedName("ar.j")
    public int field582;

    @ObfuscatedName("ar.k")
    public int field583;

    @ObfuscatedName("ar.x")
    public int field591;

    @ObfuscatedName("ar.z")
    public int field589;

    @ObfuscatedName("ar.p")
    public int field584;

    @ObfuscatedName("ar.w")
    public int field587;

    @ObfuscatedName("ar.r")
    public int field585;

    @ObfuscatedName("ar.c(Las;I)V")
    public void method216(class33 arg0) {
        if (arg0.field434 > this.field583) {
            arg0.field434 = this.field583;
        }
        if (arg0.field432 < this.field583) {
            arg0.field432 = this.field583;
        }
        if (arg0.field435 > this.field591) {
            arg0.field435 = this.field591;
        }
        if (arg0.field437 < this.field591) {
            arg0.field437 = this.field591;
        }
    }

    @ObfuscatedName("ar.i(IIII)Z")
    public boolean method194(int arg0, int arg1, int arg2) {
        if (arg0 >= this.field588 && arg0 < this.field588 + this.field581) {
            return arg1 >= (this.field589 << 3) + (this.field586 << 6) && arg1 <= (this.field589 << 3) + (this.field586 << 6) + 7 && arg2 >= (this.field584 << 3) + (this.field582 << 6) && arg2 <= (this.field584 << 3) + (this.field582 << 6) + 7;
        } else {
            return false;
        }
    }

    @ObfuscatedName("ar.o(IIS)Z")
    public boolean method195(int arg0, int arg1) {
        return arg0 >= (this.field587 << 3) + (this.field583 << 6) && arg0 <= (this.field587 << 3) + (this.field583 << 6) + 7 && arg1 >= (this.field591 << 6) + (this.field585 << 3) && arg1 <= (this.field591 << 6) + (this.field585 << 3) + 7;
    }

    @ObfuscatedName("ar.j(IIII)[I")
    public int[] method196(int arg0, int arg1, int arg2) {
        return this.method194(arg0, arg1, arg2) ? new int[] { this.field587 * 8 - this.field589 * 8 + this.field583 * 64 - this.field586 * 64 + arg1, this.field585 * 8 - this.field584 * 8 + this.field591 * 64 - this.field582 * 64 + arg2 } : null;
    }

    @ObfuscatedName("ar.k(IIB)Lim;")
    public class239 method218(int arg0, int arg1) {
        if (this.method195(arg0, arg1)) {
            int var3 = this.field589 * 8 - this.field587 * 8 + this.field586 * 64 - this.field583 * 64 + arg0;
            int var4 = this.field584 * 8 - this.field585 * 8 + this.field582 * 64 - this.field591 * 64 + arg1;
            return new class239(this.field588, var3, var4);
        } else {
            return null;
        }
    }

    @ObfuscatedName("ar.x(Lgp;I)V")
    public void method198(class195 arg0) {
        this.field588 = arg0.method3429();
        this.field581 = arg0.method3429();
        this.field586 = arg0.method3218();
        this.field589 = arg0.method3429();
        this.field582 = arg0.method3218();
        this.field584 = arg0.method3429();
        this.field583 = arg0.method3218();
        this.field587 = arg0.method3429();
        this.field591 = arg0.method3218();
        this.field585 = arg0.method3429();
        this.method669();
    }

    @ObfuscatedName("ar.z(I)V")
    public void method669() {
    }
}
