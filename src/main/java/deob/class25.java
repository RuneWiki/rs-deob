package deob;

@ObfuscatedName("k")
public class class25 extends class31 {

    @ObfuscatedName("k.h(Lkj;I)V")
    public void method212(class311 arg0) {
        int var2 = arg0.method5274();
        if (class41.field293.field292 != var2) {
            throw new IllegalStateException("");
        }
        this.field182 = arg0.method5274();
        this.field190 = arg0.method5274();
        this.field188 = arg0.method5342();
        this.field183 = arg0.method5342();
        this.field181 = arg0.method5342();
        this.field189 = arg0.method5342();
        this.field184 = arg0.method5132();
        this.field185 = arg0.method5132();
    }

    @ObfuscatedName("k.v(Lkj;I)V")
    public void method206(class311 arg0) {
        this.field190 = Math.min(this.field190, 4);
        this.field186 = new short[1][64][64];
        this.field187 = new short[this.field190][64][64];
        this.field179 = new byte[this.field190][64][64];
        this.field178 = new byte[this.field190][64][64];
        this.field180 = new class35[this.field190][64][64][];
        int var2 = arg0.method5274();
        if (class40.field279.field281 != var2) {
            throw new IllegalStateException("");
        }
        int var3 = arg0.method5274();
        int var4 = arg0.method5274();
        if (this.field181 != var3 || this.field189 != var4) {
            throw new IllegalStateException("");
        }
        for (int var5 = 0; var5 < 64; var5++) {
            for (int var6 = 0; var6 < 64; var6++) {
                this.method279(var5, var6, arg0);
            }
        }
    }

    public boolean equals(Object arg0) {
        if ((arg0 instanceof class25)) {
            class25 var2 = (class25) arg0;
            return this.field181 == var2.field181 && this.field189 == var2.field189;
        } else {
            return false;
        }
    }

    public int hashCode() {
        return this.field181 | this.field189 << 8;
    }
}
