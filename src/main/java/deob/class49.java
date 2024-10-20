package deob;

@ObfuscatedName("af")
public class class49 extends class31 {

    @ObfuscatedName("af.f")
    public int field362;

    @ObfuscatedName("af.a")
    public int field360;

    @ObfuscatedName("af.b")
    public int field361;

    @ObfuscatedName("af.y")
    public int field364;

    @ObfuscatedName("af.h(Lkj;I)V")
    public void method634(class311 arg0) {
        int var2 = arg0.method5274();
        if (class41.field297.field292 != var2) {
            throw new IllegalStateException("");
        }
        this.field182 = arg0.method5274();
        this.field190 = arg0.method5274();
        this.field188 = arg0.method5342();
        this.field183 = arg0.method5342();
        this.field362 = arg0.method5274();
        this.field360 = arg0.method5274();
        this.field181 = arg0.method5342();
        this.field189 = arg0.method5342();
        this.field361 = arg0.method5274();
        this.field364 = arg0.method5274();
        this.field184 = arg0.method5132();
        this.field185 = arg0.method5132();
    }

    @ObfuscatedName("af.v(Lkj;I)V")
    public void method206(class311 arg0) {
        this.field190 = Math.min(this.field190, 4);
        this.field186 = new short[1][64][64];
        this.field187 = new short[this.field190][64][64];
        this.field179 = new byte[this.field190][64][64];
        this.field178 = new byte[this.field190][64][64];
        this.field180 = new class35[this.field190][64][64][];
        int var2 = arg0.method5274();
        if (class40.field278.field281 != var2) {
            throw new IllegalStateException("");
        }
        int var3 = arg0.method5274();
        int var4 = arg0.method5274();
        int var5 = arg0.method5274();
        int var6 = arg0.method5274();
        if (this.field181 != var3 || this.field189 != var4 || this.field361 != var5 || this.field364 != var6) {
            throw new IllegalStateException("");
        }
        for (int var7 = 0; var7 < 8; var7++) {
            for (int var8 = 0; var8 < 8; var8++) {
                this.method279(this.field361 * 8 + var7, this.field364 * 8 + var8, arg0);
            }
        }
    }

    public boolean equals(Object arg0) {
        if (!(arg0 instanceof class49)) {
            return false;
        }
        class49 var2 = (class49) arg0;
        if (this.field181 == var2.field181 && this.field189 == var2.field189) {
            return this.field361 == var2.field361 && this.field364 == var2.field364;
        } else {
            return false;
        }
    }

    public int hashCode() {
        return this.field181 | this.field189 << 8 | this.field361 << 16 | this.field364 << 24;
    }

    @ObfuscatedName("af.x(I)I")
    public int method636() {
        return this.field362;
    }

    @ObfuscatedName("af.w(I)I")
    public int method637() {
        return this.field360;
    }

    @ObfuscatedName("af.t(B)I")
    public int method638() {
        return this.field361;
    }

    @ObfuscatedName("af.j(I)I")
    public int method639() {
        return this.field364;
    }
}
