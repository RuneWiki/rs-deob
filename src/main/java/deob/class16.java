package deob;

@ObfuscatedName("w")
public class class16 extends class22 {

    @ObfuscatedName("w.c(Lkp;B)V")
    public void method156(class301 arg0) {
        int var2 = arg0.method5129();
        if (class32.field278.field280 != var2) {
            throw new IllegalStateException("");
        }
        this.field188 = arg0.method5129();
        this.field180 = arg0.method5129();
        this.field183 = arg0.method5124();
        this.field179 = arg0.method5124();
        this.field177 = arg0.method5124();
        this.field178 = arg0.method5124();
        this.field185 = arg0.method5146();
        this.field182 = arg0.method5146();
    }

    @ObfuscatedName("w.t(Lkp;S)V")
    public void method157(class301 arg0) {
        this.field180 = Math.min(this.field180, 4);
        this.field181 = new short[1][64][64];
        this.field184 = new short[this.field180][64][64];
        this.field189 = new byte[this.field180][64][64];
        this.field176 = new byte[this.field180][64][64];
        this.field187 = new class26[this.field180][64][64][];
        int var2 = arg0.method5129();
        if (class31.field271.field270 != var2) {
            throw new IllegalStateException("");
        }
        int var3 = arg0.method5129();
        int var4 = arg0.method5129();
        if (this.field177 != var3 || this.field178 != var4) {
            throw new IllegalStateException("");
        }
        for (int var5 = 0; var5 < 64; var5++) {
            for (int var6 = 0; var6 < 64; var6++) {
                this.method242(var5, var6, arg0);
            }
        }
    }

    public boolean equals(Object arg0) {
        if ((arg0 instanceof class16)) {
            class16 var2 = (class16) arg0;
            return this.field177 == var2.field177 && this.field178 == var2.field178;
        } else {
            return false;
        }
    }

    public int hashCode() {
        return this.field177 | this.field178 << 8;
    }
}
