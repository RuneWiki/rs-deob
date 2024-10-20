package deob;

@ObfuscatedName("o")
public class class25 extends class31 {

    @ObfuscatedName("o.n(Lkx;I)V")
    public void method217(class311 arg0) {
        int var2 = arg0.method5310();
        if (class41.field302.field292 != var2) {
            throw new IllegalStateException("");
        }
        this.field198 = arg0.method5310();
        this.field199 = arg0.method5310();
        this.field200 = arg0.method5247();
        this.field195 = arg0.method5247();
        this.field196 = arg0.method5247();
        this.field207 = arg0.method5247();
        this.field197 = arg0.method5389();
        this.field201 = arg0.method5389();
    }

    @ObfuscatedName("o.v(Lkx;B)V")
    public void method221(class311 arg0) {
        this.field199 = Math.min(this.field199, 4);
        this.field202 = new short[1][64][64];
        this.field203 = new short[this.field199][64][64];
        this.field194 = new byte[this.field199][64][64];
        this.field205 = new byte[this.field199][64][64];
        this.field206 = new class35[this.field199][64][64][];
        int var2 = arg0.method5310();
        if (class40.field286.field288 != var2) {
            throw new IllegalStateException("");
        }
        int var3 = arg0.method5310();
        int var4 = arg0.method5310();
        if (this.field196 != var3 || this.field207 != var4) {
            throw new IllegalStateException("");
        }
        for (int var5 = 0; var5 < 64; var5++) {
            for (int var6 = 0; var6 < 64; var6++) {
                this.method318(var5, var6, arg0);
            }
        }
    }

    public boolean equals(Object arg0) {
        if ((arg0 instanceof class25)) {
            class25 var2 = (class25) arg0;
            return this.field196 == var2.field196 && this.field207 == var2.field207;
        } else {
            return false;
        }
    }

    public int hashCode() {
        return this.field196 | this.field207 << 8;
    }
}
