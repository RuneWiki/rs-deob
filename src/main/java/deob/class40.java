package deob;

@ObfuscatedName("ag")
public class class40 extends class22 {

    @ObfuscatedName("ag.l")
    public int field328;

    @ObfuscatedName("ag.t")
    public int field327;

    @ObfuscatedName("ag.j")
    public int field326;

    @ObfuscatedName("ag.n")
    public int field329;

    @ObfuscatedName("ag.f(Lkq;I)V")
    public void method579(class300 arg0) {
        int var2 = arg0.method5110();
        if (class32.field254.field255 != var2) {
            throw new IllegalStateException("");
        }
        this.field145 = arg0.method5110();
        this.field146 = arg0.method5110();
        this.field143 = arg0.method5112();
        this.field142 = arg0.method5112();
        this.field328 = arg0.method5110();
        this.field327 = arg0.method5110();
        this.field156 = arg0.method5112();
        this.field144 = arg0.method5112();
        this.field326 = arg0.method5110();
        this.field329 = arg0.method5110();
        this.field157 = arg0.method5127();
        this.field152 = arg0.method5127();
    }

    @ObfuscatedName("ag.i(Lkq;I)V")
    public void method142(class300 arg0) {
        this.field146 = Math.min(this.field146, 4);
        this.field149 = new short[1][64][64];
        this.field159 = new short[this.field146][64][64];
        this.field151 = new byte[this.field146][64][64];
        this.field150 = new byte[this.field146][64][64];
        this.field153 = new class26[this.field146][64][64][];
        int var2 = arg0.method5110();
        if (class31.field252.field248 != var2) {
            throw new IllegalStateException("");
        }
        int var3 = arg0.method5110();
        int var4 = arg0.method5110();
        int var5 = arg0.method5110();
        int var6 = arg0.method5110();
        if (this.field156 != var3 || this.field144 != var4 || this.field326 != var5 || this.field329 != var6) {
            throw new IllegalStateException("");
        }
        for (int var7 = 0; var7 < 8; var7++) {
            for (int var8 = 0; var8 < 8; var8++) {
                this.method221(this.field326 * 8 + var7, this.field329 * 8 + var8, arg0);
            }
        }
    }

    public boolean equals(Object arg0) {
        if (!(arg0 instanceof class40)) {
            return false;
        }
        class40 var2 = (class40) arg0;
        if (this.field156 == var2.field156 && this.field144 == var2.field144) {
            return this.field326 == var2.field326 && this.field329 == var2.field329;
        } else {
            return false;
        }
    }

    public int hashCode() {
        return this.field156 | this.field144 << 8 | this.field326 << 16 | this.field329 << 24;
    }

    @ObfuscatedName("ag.y(I)I")
    public int method582() {
        return this.field328;
    }

    @ObfuscatedName("ag.w(I)I")
    public int method583() {
        return this.field327;
    }

    @ObfuscatedName("ag.an(B)I")
    public int method584() {
        return this.field326;
    }

    @ObfuscatedName("ag.ar(I)I")
    public int method600() {
        return this.field329;
    }
}
