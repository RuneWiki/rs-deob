package deob;

@ObfuscatedName("i")
public class class25 extends class31 {

    @ObfuscatedName("i.m(Lkn;I)V")
    public void method215(class310 arg0) {
        int var2 = arg0.method5227();
        if (class41.field302.field299 != var2) {
            throw new IllegalStateException("");
        }
        this.field192 = arg0.method5227();
        this.field187 = arg0.method5227();
        this.field181 = arg0.method5283();
        this.field190 = arg0.method5283();
        this.field178 = arg0.method5283();
        this.field182 = arg0.method5283();
        this.field177 = arg0.method5353();
        this.field183 = arg0.method5353();
    }

    @ObfuscatedName("i.o(Lkn;I)V")
    public void method202(class310 arg0) {
        this.field187 = Math.min(this.field187, 4);
        this.field184 = new short[1][64][64];
        this.field185 = new short[this.field187][64][64];
        this.field186 = new byte[this.field187][64][64];
        this.field176 = new byte[this.field187][64][64];
        this.field188 = new class35[this.field187][64][64][];
        int var2 = arg0.method5227();
        if (class40.field297.field296 != var2) {
            throw new IllegalStateException("");
        }
        int var3 = arg0.method5227();
        int var4 = arg0.method5227();
        if (this.field178 != var3 || this.field182 != var4) {
            throw new IllegalStateException("");
        }
        for (int var5 = 0; var5 < 64; var5++) {
            for (int var6 = 0; var6 < 64; var6++) {
                this.method284(var5, var6, arg0);
            }
        }
    }

    public boolean equals(Object arg0) {
        if ((arg0 instanceof class25)) {
            class25 var2 = (class25) arg0;
            return this.field178 == var2.field178 && this.field182 == var2.field182;
        } else {
            return false;
        }
    }

    public int hashCode() {
        return this.field178 | this.field182 << 8;
    }
}
