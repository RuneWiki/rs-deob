package deob;

@ObfuscatedName("ax")
public class class39 implements class43 {

    @ObfuscatedName("ax.a")
    public int field509;

    @ObfuscatedName("ax.j")
    public int field504;

    @ObfuscatedName("ax.n")
    public int field505;

    @ObfuscatedName("ax.r")
    public int field506;

    @ObfuscatedName("ax.v")
    public int field507;

    @ObfuscatedName("ax.e")
    public int field510;

    @ObfuscatedName("ax.a(Lam;I)V")
    public void method170(class33 arg0) {
        if (arg0.field448 > this.field507) {
            arg0.field448 = this.field507;
        }
        if (arg0.field449 < this.field507) {
            arg0.field449 = this.field507;
        }
        if (arg0.field442 > this.field510) {
            arg0.field442 = this.field510;
        }
        if (arg0.field451 < this.field510) {
            arg0.field451 = this.field510;
        }
    }

    @ObfuscatedName("ax.j(IIII)Z")
    public boolean method187(int arg0, int arg1, int arg2) {
        if (arg0 >= this.field509 && arg0 < this.field509 + this.field504) {
            return arg1 >> 6 == this.field505 && arg2 >> 6 == this.field506;
        } else {
            return false;
        }
    }

    @ObfuscatedName("ax.n(III)Z")
    public boolean method197(int arg0, int arg1) {
        return arg0 >> 6 == this.field507 && arg1 >> 6 == this.field510;
    }

    @ObfuscatedName("ax.r(IIIB)[I")
    public int[] method173(int arg0, int arg1, int arg2) {
        return this.method187(arg0, arg1, arg2) ? new int[] { this.field507 * 64 - this.field505 * 64 + arg1, this.field510 * 64 - this.field506 * 64 + arg2 } : null;
    }

    @ObfuscatedName("ax.v(III)Lhd;")
    public class213 method174(int arg0, int arg1) {
        if (this.method197(arg0, arg1)) {
            int var3 = this.field505 * 64 - this.field507 * 64 + arg0;
            int var4 = this.field506 * 64 - this.field510 * 64 + arg1;
            return new class213(this.field509, var3, var4);
        } else {
            return null;
        }
    }

    @ObfuscatedName("ax.e(Lfe;I)V")
    public void method182(class174 arg0) {
        this.field509 = arg0.method2871();
        this.field504 = arg0.method2871();
        this.field505 = arg0.method2873();
        this.field506 = arg0.method2873();
        this.field507 = arg0.method2873();
        this.field510 = arg0.method2873();
        this.method467();
    }

    @ObfuscatedName("ax.l(S)V")
    public void method467() {
    }
}
