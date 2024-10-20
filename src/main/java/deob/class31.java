package deob;

@ObfuscatedName("ad")
public class class31 implements class43 {

    @ObfuscatedName("ad.i")
    public int field435;

    @ObfuscatedName("ad.j")
    public int field436;

    @ObfuscatedName("ad.a")
    public int field438;

    @ObfuscatedName("ad.r")
    public int field442;

    @ObfuscatedName("ad.o")
    public int field439;

    @ObfuscatedName("ad.n")
    public int field440;

    @ObfuscatedName("ad.q")
    public int field441;

    @ObfuscatedName("ad.b")
    public int field437;

    @ObfuscatedName("ad.k")
    public int field443;

    @ObfuscatedName("ad.s")
    public int field444;

    @ObfuscatedName("ad.i(Lam;I)V")
    public void method199(class33 arg0) {
        if (arg0.field463 > this.field441) {
            arg0.field463 = this.field441;
        }
        if (arg0.field469 < this.field443) {
            arg0.field469 = this.field443;
        }
        if (arg0.field457 > this.field437) {
            arg0.field457 = this.field437;
        }
        if (arg0.field466 < this.field444) {
            arg0.field466 = this.field444;
        }
    }

    @ObfuscatedName("ad.j(IIII)Z")
    public boolean method225(int arg0, int arg1, int arg2) {
        if (arg0 >= this.field435 && arg0 < this.field436 + this.field435) {
            return arg1 >> 6 >= this.field438 && arg1 >> 6 <= this.field439 && arg2 >> 6 >= this.field442 && arg2 >> 6 <= this.field440;
        } else {
            return false;
        }
    }

    @ObfuscatedName("ad.a(IIB)Z")
    public boolean method201(int arg0, int arg1) {
        return arg0 >> 6 >= this.field441 && arg0 >> 6 <= this.field443 && arg1 >> 6 >= this.field437 && arg1 >> 6 <= this.field444;
    }

    @ObfuscatedName("ad.r(IIII)[I")
    public int[] method202(int arg0, int arg1, int arg2) {
        return this.method225(arg0, arg1, arg2) ? new int[] { this.field441 * 64 - this.field438 * 64 + arg1, this.field437 * 64 - this.field442 * 64 + arg2 } : null;
    }

    @ObfuscatedName("ad.o(III)Lhs;")
    public class214 method203(int arg0, int arg1) {
        if (this.method201(arg0, arg1)) {
            int var3 = this.field438 * 64 - this.field441 * 64 + arg0;
            int var4 = this.field442 * 64 - this.field437 * 64 + arg1;
            return new class214(this.field435, var3, var4);
        } else {
            return null;
        }
    }

    @ObfuscatedName("ad.n(Lfp;I)V")
    public void method204(class175 arg0) {
        this.field435 = arg0.method2999();
        this.field436 = arg0.method2999();
        this.field438 = arg0.method2995();
        this.field442 = arg0.method2995();
        this.field439 = arg0.method2995();
        this.field440 = arg0.method2995();
        this.field441 = arg0.method2995();
        this.field437 = arg0.method2995();
        this.field443 = arg0.method2995();
        this.field444 = arg0.method2995();
        this.method259();
    }

    @ObfuscatedName("ad.q(I)V")
    public void method259() {
    }
}
