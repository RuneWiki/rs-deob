package deob;

@ObfuscatedName("aw")
public class class31 implements class43 {

    @ObfuscatedName("aw.n")
    public int field442;

    @ObfuscatedName("aw.p")
    public int field435;

    @ObfuscatedName("aw.i")
    public int field436;

    @ObfuscatedName("aw.j")
    public int field437;

    @ObfuscatedName("aw.f")
    public int field438;

    @ObfuscatedName("aw.m")
    public int field439;

    @ObfuscatedName("aw.c")
    public int field440;

    @ObfuscatedName("aw.z")
    public int field441;

    @ObfuscatedName("aw.h")
    public int field434;

    @ObfuscatedName("aw.g")
    public int field443;

    @ObfuscatedName("aw.n(Lal;B)V")
    public void method214(class33 arg0) {
        if (arg0.field461 > this.field440) {
            arg0.field461 = this.field440;
        }
        if (arg0.field469 < this.field434) {
            arg0.field469 = this.field434;
        }
        if (arg0.field466 > this.field441) {
            arg0.field466 = this.field441;
        }
        if (arg0.field467 < this.field443) {
            arg0.field467 = this.field443;
        }
    }

    @ObfuscatedName("aw.p(IIIB)Z")
    public boolean method210(int arg0, int arg1, int arg2) {
        if (arg0 >= this.field442 && arg0 < this.field442 + this.field435) {
            return arg1 >> 6 >= this.field436 && arg1 >> 6 <= this.field438 && arg2 >> 6 >= this.field437 && arg2 >> 6 <= this.field439;
        } else {
            return false;
        }
    }

    @ObfuscatedName("aw.i(III)Z")
    public boolean method198(int arg0, int arg1) {
        return arg0 >> 6 >= this.field440 && arg0 >> 6 <= this.field434 && arg1 >> 6 >= this.field441 && arg1 >> 6 <= this.field443;
    }

    @ObfuscatedName("aw.j(IIIB)[I")
    public int[] method195(int arg0, int arg1, int arg2) {
        return this.method210(arg0, arg1, arg2) ? new int[] { this.field440 * 64 - this.field436 * 64 + arg1, this.field441 * 64 - this.field437 * 64 + arg2 } : null;
    }

    @ObfuscatedName("aw.f(III)Lhl;")
    public class213 method211(int arg0, int arg1) {
        if (this.method198(arg0, arg1)) {
            int var3 = this.field436 * 64 - this.field440 * 64 + arg0;
            int var4 = this.field437 * 64 - this.field441 * 64 + arg1;
            return new class213(this.field442, var3, var4);
        } else {
            return null;
        }
    }

    @ObfuscatedName("aw.m(Lfl;I)V")
    public void method201(class174 arg0) {
        this.field442 = arg0.method2925();
        this.field435 = arg0.method2925();
        this.field436 = arg0.method3065();
        this.field437 = arg0.method3065();
        this.field438 = arg0.method3065();
        this.field439 = arg0.method3065();
        this.field440 = arg0.method3065();
        this.field441 = arg0.method3065();
        this.field434 = arg0.method3065();
        this.field443 = arg0.method3065();
        this.method241();
    }

    @ObfuscatedName("aw.c(I)V")
    public void method241() {
    }
}
