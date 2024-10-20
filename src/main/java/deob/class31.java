package deob;

@ObfuscatedName("at")
public class class31 implements class43 {

    @ObfuscatedName("at.i")
    public int field432;

    @ObfuscatedName("at.c")
    public int field433;

    @ObfuscatedName("at.e")
    public int field442;

    @ObfuscatedName("at.v")
    public int field434;

    @ObfuscatedName("at.b")
    public int field436;

    @ObfuscatedName("at.y")
    public int field437;

    @ObfuscatedName("at.h")
    public int field438;

    @ObfuscatedName("at.x")
    public int field439;

    @ObfuscatedName("at.f")
    public int field440;

    @ObfuscatedName("at.n")
    public int field441;

    @ObfuscatedName("at.i(Lai;B)V")
    public void method165(class33 arg0) {
        if (arg0.field459 > this.field438) {
            arg0.field459 = this.field438;
        }
        if (arg0.field466 < this.field440) {
            arg0.field466 = this.field440;
        }
        if (arg0.field457 > this.field439) {
            arg0.field457 = this.field439;
        }
        if (arg0.field462 < this.field441) {
            arg0.field462 = this.field441;
        }
    }

    @ObfuscatedName("at.c(IIII)Z")
    public boolean method166(int arg0, int arg1, int arg2) {
        if (arg0 >= this.field432 && arg0 < this.field433 + this.field432) {
            return arg1 >> 6 >= this.field442 && arg1 >> 6 <= this.field436 && arg2 >> 6 >= this.field434 && arg2 >> 6 <= this.field437;
        } else {
            return false;
        }
    }

    @ObfuscatedName("at.e(III)Z")
    public boolean method167(int arg0, int arg1) {
        return arg0 >> 6 >= this.field438 && arg0 >> 6 <= this.field440 && arg1 >> 6 >= this.field439 && arg1 >> 6 <= this.field441;
    }

    @ObfuscatedName("at.v(IIII)[I")
    public int[] method168(int arg0, int arg1, int arg2) {
        return this.method166(arg0, arg1, arg2) ? new int[] { this.field438 * 64 - this.field442 * 64 + arg1, this.field439 * 64 - this.field434 * 64 + arg2 } : null;
    }

    @ObfuscatedName("at.b(III)Lhh;")
    public class213 method186(int arg0, int arg1) {
        if (this.method167(arg0, arg1)) {
            int var3 = this.field442 * 64 - this.field438 * 64 + arg0;
            int var4 = this.field434 * 64 - this.field439 * 64 + arg1;
            return new class213(this.field432, var3, var4);
        } else {
            return null;
        }
    }

    @ObfuscatedName("at.y(Lfx;B)V")
    public void method174(class174 arg0) {
        this.field432 = arg0.method2870();
        this.field433 = arg0.method2870();
        this.field442 = arg0.method2872();
        this.field434 = arg0.method2872();
        this.field436 = arg0.method2872();
        this.field437 = arg0.method2872();
        this.field438 = arg0.method2872();
        this.field439 = arg0.method2872();
        this.field440 = arg0.method2872();
        this.field441 = arg0.method2872();
        this.method222();
    }

    @ObfuscatedName("at.h(I)V")
    public void method222() {
    }
}
