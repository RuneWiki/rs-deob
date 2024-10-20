package deob;

@ObfuscatedName("l")
public class class25 extends class31 {

    @ObfuscatedName("l.z(Lkf;B)V")
    public void method218(class310 arg0) {
        int var2 = arg0.method5193();
        if (class41.field292.field288 != var2) {
            throw new IllegalStateException("");
        }
        this.field188 = arg0.method5193();
        this.field186 = arg0.method5193();
        this.field184 = arg0.method5195();
        this.field182 = arg0.method5195();
        this.field198 = arg0.method5195();
        this.field181 = arg0.method5195();
        this.field187 = arg0.method5210();
        this.field194 = arg0.method5210();
    }

    @ObfuscatedName("l.k(Lkf;I)V")
    public void method219(class310 arg0) {
        this.field186 = Math.min(this.field186, 4);
        this.field191 = new short[1][64][64];
        this.field190 = new short[this.field186][64][64];
        this.field199 = new byte[this.field186][64][64];
        this.field192 = new byte[this.field186][64][64];
        this.field193 = new class35[this.field186][64][64][];
        int var2 = arg0.method5193();
        if (class40.field280.field282 != var2) {
            throw new IllegalStateException("");
        }
        int var3 = arg0.method5193();
        int var4 = arg0.method5193();
        if (this.field198 != var3 || this.field181 != var4) {
            throw new IllegalStateException("");
        }
        for (int var5 = 0; var5 < 64; var5++) {
            for (int var6 = 0; var6 < 64; var6++) {
                this.method298(var5, var6, arg0);
            }
        }
    }

    public boolean equals(Object arg0) {
        if ((arg0 instanceof class25)) {
            class25 var2 = (class25) arg0;
            return this.field198 == var2.field198 && this.field181 == var2.field181;
        } else {
            return false;
        }
    }

    public int hashCode() {
        return this.field198 | this.field181 << 8;
    }
}
