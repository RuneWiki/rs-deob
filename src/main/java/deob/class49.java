package deob;

@ObfuscatedName("ac")
public class class49 extends class31 {

    @ObfuscatedName("ac.g")
    public int field376;

    @ObfuscatedName("ac.i")
    public int field379;

    @ObfuscatedName("ac.a")
    public int field375;

    @ObfuscatedName("ac.b")
    public int field378;

    @ObfuscatedName("ac.x(Lkb;B)V")
    public void method669(class310 arg0) {
        int var2 = arg0.method5137();
        if (class41.field304.field311 != var2) {
            throw new IllegalStateException("");
        }
        this.field200 = arg0.method5137();
        this.field201 = arg0.method5137();
        this.field204 = arg0.method5139();
        this.field196 = arg0.method5139();
        this.field376 = arg0.method5137();
        this.field379 = arg0.method5137();
        this.field198 = arg0.method5139();
        this.field199 = arg0.method5139();
        this.field375 = arg0.method5137();
        this.field378 = arg0.method5137();
        this.field202 = arg0.method5154();
        this.field203 = arg0.method5154();
    }

    @ObfuscatedName("ac.m(Lkb;B)V")
    public void method235(class310 arg0) {
        this.field201 = Math.min(this.field201, 4);
        this.field205 = new short[1][64][64];
        this.field197 = new short[this.field201][64][64];
        this.field206 = new byte[this.field201][64][64];
        this.field207 = new byte[this.field201][64][64];
        this.field208 = new class35[this.field201][64][64][];
        int var2 = arg0.method5137();
        if (class40.field298.field299 != var2) {
            throw new IllegalStateException("");
        }
        int var3 = arg0.method5137();
        int var4 = arg0.method5137();
        int var5 = arg0.method5137();
        int var6 = arg0.method5137();
        if (this.field198 != var3 || this.field199 != var4 || this.field375 != var5 || this.field378 != var6) {
            throw new IllegalStateException("");
        }
        for (int var7 = 0; var7 < 8; var7++) {
            for (int var8 = 0; var8 < 8; var8++) {
                this.method319(this.field375 * 8 + var7, this.field378 * 8 + var8, arg0);
            }
        }
    }

    public boolean equals(Object arg0) {
        if (!(arg0 instanceof class49)) {
            return false;
        }
        class49 var2 = (class49) arg0;
        if (this.field198 == var2.field198 && this.field199 == var2.field199) {
            return this.field375 == var2.field375 && this.field378 == var2.field378;
        } else {
            return false;
        }
    }

    public int hashCode() {
        return this.field198 | this.field199 << 8 | this.field375 << 16 | this.field378 << 24;
    }

    @ObfuscatedName("ac.k(B)I")
    public int method655() {
        return this.field376;
    }

    @ObfuscatedName("ac.d(I)I")
    public int method656() {
        return this.field379;
    }

    @ObfuscatedName("ac.w(I)I")
    public int method653() {
        return this.field375;
    }

    @ObfuscatedName("ac.aq(I)I")
    public int method658() {
        return this.field378;
    }
}
