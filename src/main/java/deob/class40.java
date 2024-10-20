package deob;

@ObfuscatedName("at")
public class class40 extends class22 {

    @ObfuscatedName("at.z")
    public int field319;

    @ObfuscatedName("at.j")
    public int field320;

    @ObfuscatedName("at.s")
    public int field322;

    @ObfuscatedName("at.t")
    public int field324;

    @ObfuscatedName("at.m(Lgr;I)V")
    public void method601(class202 arg0) {
        int var2 = arg0.method3551();
        if (class32.field255.field256 != var2) {
            throw new IllegalStateException("");
        }
        this.field149 = arg0.method3551();
        this.field157 = arg0.method3551();
        this.field150 = arg0.method3530();
        this.field147 = arg0.method3530();
        this.field319 = arg0.method3551();
        this.field320 = arg0.method3551();
        this.field160 = arg0.method3530();
        this.field148 = arg0.method3530();
        this.field322 = arg0.method3551();
        this.field324 = arg0.method3551();
        this.field151 = arg0.method3434();
        this.field153 = arg0.method3434();
    }

    @ObfuscatedName("at.f(Lgr;I)V")
    public void method157(class202 arg0) {
        this.field157 = Math.min(this.field157, 4);
        this.field152 = new short[1][64][64];
        this.field146 = new short[this.field157][64][64];
        this.field155 = new byte[this.field157][64][64];
        this.field156 = new byte[this.field157][64][64];
        this.field145 = new class26[this.field157][64][64][];
        int var2 = arg0.method3551();
        if (class31.field248.field249 != var2) {
            throw new IllegalStateException("");
        }
        int var3 = arg0.method3551();
        int var4 = arg0.method3551();
        int var5 = arg0.method3551();
        int var6 = arg0.method3551();
        if (this.field160 != var3 || this.field148 != var4 || this.field322 != var5 || this.field324 != var6) {
            throw new IllegalStateException("");
        }
        for (int var7 = 0; var7 < 8; var7++) {
            for (int var8 = 0; var8 < 8; var8++) {
                this.method239(this.field322 * 8 + var7, this.field324 * 8 + var8, arg0);
            }
        }
    }

    public boolean equals(Object arg0) {
        if (!(arg0 instanceof class40)) {
            return false;
        }
        class40 var2 = (class40) arg0;
        if (this.field160 == var2.field160 && this.field148 == var2.field148) {
            return this.field322 == var2.field322 && this.field324 == var2.field324;
        } else {
            return false;
        }
    }

    public int hashCode() {
        return this.field160 | this.field148 << 8 | this.field322 << 16 | this.field324 << 24;
    }

    @ObfuscatedName("at.q(I)I")
    public int method603() {
        return this.field319;
    }

    @ObfuscatedName("at.w(I)I")
    public int method604() {
        return this.field320;
    }

    @ObfuscatedName("at.o(B)I")
    public int method605() {
        return this.field322;
    }

    @ObfuscatedName("at.au(I)I")
    public int method606() {
        return this.field324;
    }
}
