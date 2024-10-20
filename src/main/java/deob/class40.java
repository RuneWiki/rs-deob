package deob;

@ObfuscatedName("as")
public class class40 extends class22 {

    @ObfuscatedName("as.o")
    public int field342;

    @ObfuscatedName("as.u")
    public int field338;

    @ObfuscatedName("as.y")
    public int field339;

    @ObfuscatedName("as.k")
    public int field337;

    @ObfuscatedName("as.a(Lgx;I)V")
    public void method598(class190 arg0) {
        int var2 = arg0.method3443();
        if (class32.field273.field275 != var2) {
            throw new IllegalStateException("");
        }
        this.field173 = arg0.method3443();
        this.field169 = arg0.method3443();
        this.field174 = arg0.method3610();
        this.field170 = arg0.method3610();
        this.field342 = arg0.method3443();
        this.field338 = arg0.method3443();
        this.field171 = arg0.method3610();
        this.field172 = arg0.method3610();
        this.field339 = arg0.method3443();
        this.field337 = arg0.method3443();
        this.field175 = arg0.method3656();
        this.field178 = arg0.method3656();
    }

    @ObfuscatedName("as.s(Lgx;I)V")
    public void method168(class190 arg0) {
        this.field169 = Math.min(this.field169, 4);
        this.field189 = new short[1][64][64];
        this.field186 = new short[this.field169][64][64];
        this.field179 = new byte[this.field169][64][64];
        this.field180 = new byte[this.field169][64][64];
        this.field181 = new class26[this.field169][64][64][];
        int var2 = arg0.method3443();
        if (class31.field270.field271 != var2) {
            throw new IllegalStateException("");
        }
        int var3 = arg0.method3443();
        int var4 = arg0.method3443();
        int var5 = arg0.method3443();
        int var6 = arg0.method3443();
        if (this.field171 != var3 || this.field172 != var4 || this.field339 != var5 || this.field337 != var6) {
            throw new IllegalStateException("");
        }
        for (int var7 = 0; var7 < 8; var7++) {
            for (int var8 = 0; var8 < 8; var8++) {
                this.method250(this.field339 * 8 + var7, this.field337 * 8 + var8, arg0);
            }
        }
    }

    public boolean equals(Object arg0) {
        if (!(arg0 instanceof class40)) {
            return false;
        }
        class40 var2 = (class40) arg0;
        if (this.field171 == var2.field171 && this.field172 == var2.field172) {
            return this.field339 == var2.field339 && this.field337 == var2.field337;
        } else {
            return false;
        }
    }

    public int hashCode() {
        return this.field171 | this.field172 << 8 | this.field339 << 16 | this.field337 << 24;
    }

    @ObfuscatedName("as.g(I)I")
    public int method599() {
        return this.field342;
    }

    @ObfuscatedName("as.x(I)I")
    public int method600() {
        return this.field338;
    }

    @ObfuscatedName("as.aq(I)I")
    public int method601() {
        return this.field339;
    }

    @ObfuscatedName("as.al(I)I")
    public int method602() {
        return this.field337;
    }
}
