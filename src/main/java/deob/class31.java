package deob;

@ObfuscatedName("an")
public class class31 implements class43 {

    @ObfuscatedName("an.i")
    public int field449;

    @ObfuscatedName("an.w")
    public int field439;

    @ObfuscatedName("an.a")
    public int field438;

    @ObfuscatedName("an.t")
    public int field447;

    @ObfuscatedName("an.s")
    public int field440;

    @ObfuscatedName("an.r")
    public int field441;

    @ObfuscatedName("an.v")
    public int field442;

    @ObfuscatedName("an.y")
    public int field437;

    @ObfuscatedName("an.j")
    public int field446;

    @ObfuscatedName("an.k")
    public int field445;

    @ObfuscatedName("an.i(Lar;I)V")
    public void method162(class33 arg0) {
        if (arg0.field468 > this.field442) {
            arg0.field468 = this.field442;
        }
        if (arg0.field469 < this.field446) {
            arg0.field469 = this.field446;
        }
        if (arg0.field473 > this.field437) {
            arg0.field473 = this.field437;
        }
        if (arg0.field467 < this.field445) {
            arg0.field467 = this.field445;
        }
    }

    @ObfuscatedName("an.w(IIII)Z")
    public boolean method167(int arg0, int arg1, int arg2) {
        if (arg0 >= this.field449 && arg0 < this.field449 + this.field439) {
            return arg1 >> 6 >= this.field438 && arg1 >> 6 <= this.field440 && arg2 >> 6 >= this.field447 && arg2 >> 6 <= this.field441;
        } else {
            return false;
        }
    }

    @ObfuscatedName("an.a(III)Z")
    public boolean method189(int arg0, int arg1) {
        return arg0 >> 6 >= this.field442 && arg0 >> 6 <= this.field446 && arg1 >> 6 >= this.field437 && arg1 >> 6 <= this.field445;
    }

    @ObfuscatedName("an.t(IIII)[I")
    public int[] method164(int arg0, int arg1, int arg2) {
        return this.method167(arg0, arg1, arg2) ? new int[] { this.field442 * 64 - this.field438 * 64 + arg1, this.field437 * 64 - this.field447 * 64 + arg2 } : null;
    }

    @ObfuscatedName("an.s(III)Lhb;")
    public class213 method165(int arg0, int arg1) {
        if (this.method189(arg0, arg1)) {
            int var3 = this.field438 * 64 - this.field442 * 64 + arg0;
            int var4 = this.field447 * 64 - this.field437 * 64 + arg1;
            return new class213(this.field449, var3, var4);
        } else {
            return null;
        }
    }

    @ObfuscatedName("an.r(Lfp;I)V")
    public void method166(class174 arg0) {
        this.field449 = arg0.method3061();
        this.field439 = arg0.method3061();
        this.field438 = arg0.method2882();
        this.field447 = arg0.method2882();
        this.field440 = arg0.method2882();
        this.field441 = arg0.method2882();
        this.field442 = arg0.method2882();
        this.field437 = arg0.method2882();
        this.field446 = arg0.method2882();
        this.field445 = arg0.method2882();
        this.method223();
    }

    @ObfuscatedName("an.v(B)V")
    public void method223() {
    }
}
