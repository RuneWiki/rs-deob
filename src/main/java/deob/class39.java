package deob;

@ObfuscatedName("aj")
public class class39 implements class43 {

    @ObfuscatedName("aj.i")
    public int field536;

    @ObfuscatedName("aj.j")
    public int field532;

    @ObfuscatedName("aj.a")
    public int field534;

    @ObfuscatedName("aj.r")
    public int field535;

    @ObfuscatedName("aj.o")
    public int field541;

    @ObfuscatedName("aj.n")
    public int field537;

    @ObfuscatedName("aj.i(Lam;I)V")
    public void method199(class33 arg0) {
        if (arg0.field463 > this.field541) {
            arg0.field463 = this.field541;
        }
        if (arg0.field469 < this.field541) {
            arg0.field469 = this.field541;
        }
        if (arg0.field457 > this.field537) {
            arg0.field457 = this.field537;
        }
        if (arg0.field466 < this.field537) {
            arg0.field466 = this.field537;
        }
    }

    @ObfuscatedName("aj.j(IIII)Z")
    public boolean method225(int arg0, int arg1, int arg2) {
        if (arg0 >= this.field536 && arg0 < this.field536 + this.field532) {
            return arg1 >> 6 == this.field534 && arg2 >> 6 == this.field535;
        } else {
            return false;
        }
    }

    @ObfuscatedName("aj.a(IIB)Z")
    public boolean method201(int arg0, int arg1) {
        return arg0 >> 6 == this.field541 && arg1 >> 6 == this.field537;
    }

    @ObfuscatedName("aj.r(IIII)[I")
    public int[] method202(int arg0, int arg1, int arg2) {
        return this.method225(arg0, arg1, arg2) ? new int[] { this.field541 * 64 - this.field534 * 64 + arg1, this.field537 * 64 - this.field535 * 64 + arg2 } : null;
    }

    @ObfuscatedName("aj.o(III)Lhs;")
    public class214 method203(int arg0, int arg1) {
        if (this.method201(arg0, arg1)) {
            int var3 = this.field534 * 64 - this.field541 * 64 + arg0;
            int var4 = this.field535 * 64 - this.field537 * 64 + arg1;
            return new class214(this.field536, var3, var4);
        } else {
            return null;
        }
    }

    @ObfuscatedName("aj.n(Lfp;I)V")
    public void method204(class175 arg0) {
        this.field536 = arg0.method2999();
        this.field532 = arg0.method2999();
        this.field534 = arg0.method2995();
        this.field535 = arg0.method2995();
        this.field541 = arg0.method2995();
        this.field537 = arg0.method2995();
        this.method488();
    }

    @ObfuscatedName("aj.q(B)V")
    public void method488() {
    }
}
