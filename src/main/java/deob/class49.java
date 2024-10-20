package deob;

@ObfuscatedName("ap")
public class class49 implements class43 {

    @ObfuscatedName("ap.i")
    public int field631;

    @ObfuscatedName("ap.j")
    public int field620;

    @ObfuscatedName("ap.a")
    public int field621;

    @ObfuscatedName("ap.r")
    public int field622;

    @ObfuscatedName("ap.o")
    public int field623;

    @ObfuscatedName("ap.n")
    public int field624;

    @ObfuscatedName("ap.q")
    public int field625;

    @ObfuscatedName("ap.b")
    public int field626;

    @ObfuscatedName("ap.k")
    public int field633;

    @ObfuscatedName("ap.s")
    public int field628;

    @ObfuscatedName("ap.i(Lam;I)V")
    public void method199(class33 arg0) {
        if (arg0.field463 > this.field623) {
            arg0.field463 = this.field623;
        }
        if (arg0.field469 < this.field623) {
            arg0.field469 = this.field623;
        }
        if (arg0.field457 > this.field624) {
            arg0.field457 = this.field624;
        }
        if (arg0.field466 < this.field624) {
            arg0.field466 = this.field624;
        }
    }

    @ObfuscatedName("ap.j(IIII)Z")
    public boolean method225(int arg0, int arg1, int arg2) {
        if (arg0 >= this.field631 && arg0 < this.field631 + this.field620) {
            return arg1 >= (this.field625 << 3) + (this.field621 << 6) && arg1 <= (this.field625 << 3) + (this.field621 << 6) + 7 && arg2 >= (this.field626 << 3) + (this.field622 << 6) && arg2 <= (this.field626 << 3) + (this.field622 << 6) + 7;
        } else {
            return false;
        }
    }

    @ObfuscatedName("ap.a(IIB)Z")
    public boolean method201(int arg0, int arg1) {
        return arg0 >= (this.field633 << 3) + (this.field623 << 6) && arg0 <= (this.field633 << 3) + (this.field623 << 6) + 7 && arg1 >= (this.field628 << 3) + (this.field624 << 6) && arg1 <= (this.field628 << 3) + (this.field624 << 6) + 7;
    }

    @ObfuscatedName("ap.r(IIII)[I")
    public int[] method202(int arg0, int arg1, int arg2) {
        return this.method225(arg0, arg1, arg2) ? new int[] { this.field633 * 8 - this.field625 * 8 + this.field623 * 64 - this.field621 * 64 + arg1, this.field628 * 8 - this.field626 * 8 + this.field624 * 64 - this.field622 * 64 + arg2 } : null;
    }

    @ObfuscatedName("ap.o(III)Lhs;")
    public class214 method203(int arg0, int arg1) {
        if (this.method201(arg0, arg1)) {
            int var3 = this.field625 * 8 - this.field633 * 8 + this.field621 * 64 - this.field623 * 64 + arg0;
            int var4 = this.field626 * 8 - this.field628 * 8 + this.field622 * 64 - this.field624 * 64 + arg1;
            return new class214(this.field631, var3, var4);
        } else {
            return null;
        }
    }

    @ObfuscatedName("ap.n(Lfp;I)V")
    public void method204(class175 arg0) {
        this.field631 = arg0.method2999();
        this.field620 = arg0.method2999();
        this.field621 = arg0.method2995();
        this.field625 = arg0.method2999();
        this.field622 = arg0.method2995();
        this.field626 = arg0.method2999();
        this.field623 = arg0.method2995();
        this.field633 = arg0.method2999();
        this.field624 = arg0.method2995();
        this.field628 = arg0.method2999();
        this.method655();
    }

    @ObfuscatedName("ap.q(I)V")
    public void method655() {
    }
}
