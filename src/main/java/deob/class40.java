package deob;

@ObfuscatedName("ar")
public class class40 extends class22 {

    @ObfuscatedName("ar.w")
    public int field348;

    @ObfuscatedName("ar.k")
    public int field344;

    @ObfuscatedName("ar.q")
    public int field346;

    @ObfuscatedName("ar.z")
    public int field347;

    @ObfuscatedName("ar.c(Lkp;I)V")
    public void method587(class301 arg0) {
        int var2 = arg0.method5129();
        if (class32.field279.field280 != var2) {
            throw new IllegalStateException("");
        }
        this.field188 = arg0.method5129();
        this.field180 = arg0.method5129();
        this.field183 = arg0.method5124();
        this.field179 = arg0.method5124();
        this.field348 = arg0.method5129();
        this.field344 = arg0.method5129();
        this.field177 = arg0.method5124();
        this.field178 = arg0.method5124();
        this.field346 = arg0.method5129();
        this.field347 = arg0.method5129();
        this.field185 = arg0.method5146();
        this.field182 = arg0.method5146();
    }

    @ObfuscatedName("ar.t(Lkp;S)V")
    public void method157(class301 arg0) {
        this.field180 = Math.min(this.field180, 4);
        this.field181 = new short[1][64][64];
        this.field184 = new short[this.field180][64][64];
        this.field189 = new byte[this.field180][64][64];
        this.field176 = new byte[this.field180][64][64];
        this.field187 = new class26[this.field180][64][64][];
        int var2 = arg0.method5129();
        if (class31.field272.field270 != var2) {
            throw new IllegalStateException("");
        }
        int var3 = arg0.method5129();
        int var4 = arg0.method5129();
        int var5 = arg0.method5129();
        int var6 = arg0.method5129();
        if (this.field177 != var3 || this.field178 != var4 || this.field346 != var5 || this.field347 != var6) {
            throw new IllegalStateException("");
        }
        for (int var7 = 0; var7 < 8; var7++) {
            for (int var8 = 0; var8 < 8; var8++) {
                this.method242(this.field346 * 8 + var7, this.field347 * 8 + var8, arg0);
            }
        }
    }

    public boolean equals(Object arg0) {
        if (!(arg0 instanceof class40)) {
            return false;
        }
        class40 var2 = (class40) arg0;
        if (this.field177 == var2.field177 && this.field178 == var2.field178) {
            return this.field346 == var2.field346 && this.field347 == var2.field347;
        } else {
            return false;
        }
    }

    public int hashCode() {
        return this.field177 | this.field178 << 8 | this.field346 << 16 | this.field347 << 24;
    }

    @ObfuscatedName("ar.o(B)I")
    public int method594() {
        return this.field348;
    }

    @ObfuscatedName("ar.e(B)I")
    public int method588() {
        return this.field344;
    }

    @ObfuscatedName("ar.i(I)I")
    public int method592() {
        return this.field346;
    }

    @ObfuscatedName("ar.g(I)I")
    public int method590() {
        return this.field347;
    }
}
