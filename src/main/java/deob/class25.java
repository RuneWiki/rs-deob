package deob;

@ObfuscatedName("y")
public class class25 extends class31 {

    @ObfuscatedName("y.x(Lkb;I)V")
    public void method234(class310 arg0) {
        int var2 = arg0.method5137();
        if (class41.field303.field311 != var2) {
            throw new IllegalStateException("");
        }
        this.field200 = arg0.method5137();
        this.field201 = arg0.method5137();
        this.field204 = arg0.method5139();
        this.field196 = arg0.method5139();
        this.field198 = arg0.method5139();
        this.field199 = arg0.method5139();
        this.field202 = arg0.method5154();
        this.field203 = arg0.method5154();
    }

    @ObfuscatedName("y.m(Lkb;B)V")
    public void method235(class310 arg0) {
        this.field201 = Math.min(this.field201, 4);
        this.field205 = new short[1][64][64];
        this.field197 = new short[this.field201][64][64];
        this.field206 = new byte[this.field201][64][64];
        this.field207 = new byte[this.field201][64][64];
        this.field208 = new class35[this.field201][64][64][];
        int var2 = arg0.method5137();
        if (class40.field301.field299 != var2) {
            throw new IllegalStateException("");
        }
        int var3 = arg0.method5137();
        int var4 = arg0.method5137();
        if (this.field198 != var3 || this.field199 != var4) {
            throw new IllegalStateException("");
        }
        for (int var5 = 0; var5 < 64; var5++) {
            for (int var6 = 0; var6 < 64; var6++) {
                this.method319(var5, var6, arg0);
            }
        }
    }

    public boolean equals(Object arg0) {
        if ((arg0 instanceof class25)) {
            class25 var2 = (class25) arg0;
            return this.field198 == var2.field198 && this.field199 == var2.field199;
        } else {
            return false;
        }
    }

    public int hashCode() {
        return this.field198 | this.field199 << 8;
    }
}
