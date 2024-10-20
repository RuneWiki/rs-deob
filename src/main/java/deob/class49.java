package deob;

@ObfuscatedName("aw")
public class class49 extends class31 {

    @ObfuscatedName("aw.c")
    public int field364;

    @ObfuscatedName("aw.f")
    public int field360;

    @ObfuscatedName("aw.y")
    public int field361;

    @ObfuscatedName("aw.v")
    public int field362;

    @ObfuscatedName("aw.z(Lkf;B)V")
    public void method646(class310 arg0) {
        int var2 = arg0.method5193();
        if (class41.field289.field288 != var2) {
            throw new IllegalStateException("");
        }
        this.field188 = arg0.method5193();
        this.field186 = arg0.method5193();
        this.field184 = arg0.method5195();
        this.field182 = arg0.method5195();
        this.field364 = arg0.method5193();
        this.field360 = arg0.method5193();
        this.field198 = arg0.method5195();
        this.field181 = arg0.method5195();
        this.field361 = arg0.method5193();
        this.field362 = arg0.method5193();
        this.field187 = arg0.method5210();
        this.field194 = arg0.method5210();
    }

    @ObfuscatedName("aw.k(Lkf;I)V")
    public void method219(class310 arg0) {
        this.field186 = Math.min(this.field186, 4);
        this.field191 = new short[1][64][64];
        this.field190 = new short[this.field186][64][64];
        this.field199 = new byte[this.field186][64][64];
        this.field192 = new byte[this.field186][64][64];
        this.field193 = new class35[this.field186][64][64][];
        int var2 = arg0.method5193();
        if (class40.field281.field282 != var2) {
            throw new IllegalStateException("");
        }
        int var3 = arg0.method5193();
        int var4 = arg0.method5193();
        int var5 = arg0.method5193();
        int var6 = arg0.method5193();
        if (this.field198 != var3 || this.field181 != var4 || this.field361 != var5 || this.field362 != var6) {
            throw new IllegalStateException("");
        }
        for (int var7 = 0; var7 < 8; var7++) {
            for (int var8 = 0; var8 < 8; var8++) {
                this.method298(this.field361 * 8 + var7, this.field362 * 8 + var8, arg0);
            }
        }
    }

    public boolean equals(Object arg0) {
        if (!(arg0 instanceof class49)) {
            return false;
        }
        class49 var2 = (class49) arg0;
        if (this.field198 == var2.field198 && this.field181 == var2.field181) {
            return this.field361 == var2.field361 && this.field362 == var2.field362;
        } else {
            return false;
        }
    }

    public int hashCode() {
        return this.field198 | this.field181 << 8 | this.field361 << 16 | this.field362 << 24;
    }

    @ObfuscatedName("aw.s(I)I")
    public int method636() {
        return this.field364;
    }

    @ObfuscatedName("aw.t(I)I")
    public int method644() {
        return this.field360;
    }

    @ObfuscatedName("aw.i(I)I")
    public int method638() {
        return this.field361;
    }

    @ObfuscatedName("aw.aa(I)I")
    public int method639() {
        return this.field362;
    }
}
