package deob;

@ObfuscatedName("ax")
public class class46 extends class29 {

    @ObfuscatedName("ax.a")
    public int field563;

    @ObfuscatedName("ax.y")
    public int field566;

    @ObfuscatedName("ax.w")
    public int field565;

    @ObfuscatedName("ax.k")
    public int field568;

    @ObfuscatedName("ax.m(Lfv;Lfv;I)V")
    public void method601(class181 arg0, class181 arg1) {
        int var3 = arg1.method3012();
        if (class37.field479.field482 != var3) {
            throw new IllegalStateException("");
        }
        this.field396 = arg1.method3012();
        this.field392 = arg1.method3012();
        this.field400 = arg1.method3009();
        this.field393 = arg1.method3009();
        this.field563 = arg1.method3012();
        this.field566 = arg1.method3012();
        this.field394 = arg1.method3009();
        this.field395 = arg1.method3009();
        this.field565 = arg1.method3012();
        this.field568 = arg1.method3012();
        this.field392 = Math.min(this.field392, 4);
        this.field397 = new short[1][64][64];
        this.field398 = new short[this.field392][64][64];
        this.field399 = new byte[this.field392][64][64];
        this.field401 = new byte[this.field392][64][64];
        this.field402 = new class32[this.field392][64][64][];
        int var4 = arg0.method3012();
        if (class36.field470.field469 != var4) {
            throw new IllegalStateException("");
        }
        int var5 = arg0.method3012();
        int var6 = arg0.method3012();
        int var7 = arg0.method3012();
        int var8 = arg0.method3012();
        if (this.field394 != var5 || this.field395 != var6 || this.field565 != var7 || this.field568 != var8) {
            throw new IllegalStateException("");
        }
        for (int var9 = 0; var9 < 8; var9++) {
            for (int var10 = 0; var10 < 8; var10++) {
                this.method229(this.field565 * 8 + var9, this.field568 * 8 + var10, arg0);
            }
        }
    }

    @ObfuscatedName("ax.p(III)Z")
    public boolean method602(int arg0, int arg1) {
        if (arg0 < this.field565 * 8) {
            return false;
        } else if (arg1 < this.field568 * 8) {
            return false;
        } else if (arg0 >= this.field565 * 8 + 8) {
            return false;
        } else {
            return arg1 < this.field568 * 8 + 8;
        }
    }

    public boolean equals(Object arg0) {
        if (!(arg0 instanceof class46)) {
            return false;
        }
        class46 var2 = (class46) arg0;
        if (this.field394 == var2.field394 && this.field395 == var2.field395) {
            return this.field565 == var2.field565 && this.field568 == var2.field568;
        } else {
            return false;
        }
    }

    public int hashCode() {
        return this.field394 | this.field395 << 8 | this.field565 << 16 | this.field568 << 24;
    }

    @ObfuscatedName("ax.ak(I)I")
    public int method609() {
        return this.field563;
    }

    @ObfuscatedName("ax.at(I)I")
    public int method605() {
        return this.field566;
    }

    @ObfuscatedName("ax.an(I)I")
    public int method606() {
        return this.field565;
    }

    @ObfuscatedName("ax.ah(B)I")
    public int method607() {
        return this.field568;
    }
}
