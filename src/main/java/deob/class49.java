package deob;

@ObfuscatedName("aq")
public class class49 extends class31 {

    @ObfuscatedName("aq.r")
    public int field357;

    @ObfuscatedName("aq.s")
    public int field362;

    @ObfuscatedName("aq.v")
    public int field359;

    @ObfuscatedName("aq.d")
    public int field358;

    @ObfuscatedName("aq.m(Lkn;I)V")
    public void method625(class310 arg0) {
        int var2 = arg0.method5227();
        if (class41.field300.field299 != var2) {
            throw new IllegalStateException("");
        }
        this.field192 = arg0.method5227();
        this.field187 = arg0.method5227();
        this.field181 = arg0.method5283();
        this.field190 = arg0.method5283();
        this.field357 = arg0.method5227();
        this.field362 = arg0.method5227();
        this.field178 = arg0.method5283();
        this.field182 = arg0.method5283();
        this.field359 = arg0.method5227();
        this.field358 = arg0.method5227();
        this.field177 = arg0.method5353();
        this.field183 = arg0.method5353();
    }

    @ObfuscatedName("aq.o(Lkn;I)V")
    public void method202(class310 arg0) {
        this.field187 = Math.min(this.field187, 4);
        this.field184 = new short[1][64][64];
        this.field185 = new short[this.field187][64][64];
        this.field186 = new byte[this.field187][64][64];
        this.field176 = new byte[this.field187][64][64];
        this.field188 = new class35[this.field187][64][64][];
        int var2 = arg0.method5227();
        if (class40.field294.field296 != var2) {
            throw new IllegalStateException("");
        }
        int var3 = arg0.method5227();
        int var4 = arg0.method5227();
        int var5 = arg0.method5227();
        int var6 = arg0.method5227();
        if (this.field178 != var3 || this.field182 != var4 || this.field359 != var5 || this.field358 != var6) {
            throw new IllegalStateException("");
        }
        for (int var7 = 0; var7 < 8; var7++) {
            for (int var8 = 0; var8 < 8; var8++) {
                this.method284(this.field359 * 8 + var7, this.field358 * 8 + var8, arg0);
            }
        }
    }

    public boolean equals(Object arg0) {
        if (!(arg0 instanceof class49)) {
            return false;
        }
        class49 var2 = (class49) arg0;
        if (this.field178 == var2.field178 && this.field182 == var2.field182) {
            return this.field359 == var2.field359 && this.field358 == var2.field358;
        } else {
            return false;
        }
    }

    public int hashCode() {
        return this.field178 | this.field182 << 8 | this.field359 << 16 | this.field358 << 24;
    }

    @ObfuscatedName("aq.q(B)I")
    public int method635() {
        return this.field357;
    }

    @ObfuscatedName("aq.j(I)I")
    public int method630() {
        return this.field362;
    }

    @ObfuscatedName("aq.p(I)I")
    public int method631() {
        return this.field359;
    }

    @ObfuscatedName("aq.as(I)I")
    public int method627() {
        return this.field358;
    }
}
