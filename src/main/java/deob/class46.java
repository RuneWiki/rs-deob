package deob;

@ObfuscatedName("ak")
public class class46 extends class29 {

    @ObfuscatedName("ak.u")
    public int field560;

    @ObfuscatedName("ak.p")
    public int field561;

    @ObfuscatedName("ak.w")
    public int field567;

    @ObfuscatedName("ak.t")
    public int field563;

    @ObfuscatedName("ak.n(Lgv;Lgv;I)V")
    public void method553(class185 arg0, class185 arg1) {
        int var3 = arg1.method3021();
        if (class37.field481.field486 != var3) {
            throw new IllegalStateException("");
        }
        this.field390 = arg1.method3021();
        this.field394 = arg1.method3021();
        this.field391 = arg1.method3015();
        this.field389 = arg1.method3015();
        this.field560 = arg1.method3021();
        this.field561 = arg1.method3021();
        this.field393 = arg1.method3015();
        this.field392 = arg1.method3015();
        this.field567 = arg1.method3021();
        this.field563 = arg1.method3021();
        this.field394 = Math.min(this.field394, 4);
        this.field395 = new short[1][64][64];
        this.field396 = new short[this.field394][64][64];
        this.field397 = new byte[this.field394][64][64];
        this.field398 = new byte[this.field394][64][64];
        this.field399 = new class32[this.field394][64][64][];
        int var4 = arg0.method3021();
        if (class36.field472.field471 != var4) {
            throw new IllegalStateException("");
        }
        int var5 = arg0.method3021();
        int var6 = arg0.method3021();
        int var7 = arg0.method3021();
        int var8 = arg0.method3021();
        if (this.field393 != var5 || this.field392 != var6 || this.field567 != var7 || this.field563 != var8) {
            throw new IllegalStateException("");
        }
        for (int var9 = 0; var9 < 8; var9++) {
            for (int var10 = 0; var10 < 8; var10++) {
                this.method202(this.field567 * 8 + var9, this.field563 * 8 + var10, arg0);
            }
        }
    }

    @ObfuscatedName("ak.v(III)Z")
    public boolean method554(int arg0, int arg1) {
        if (arg0 < this.field567 * 8) {
            return false;
        } else if (arg1 < this.field563 * 8) {
            return false;
        } else if (arg0 >= this.field567 * 8 + 8) {
            return false;
        } else {
            return arg1 < this.field563 * 8 + 8;
        }
    }

    public boolean equals(Object arg0) {
        if (!(arg0 instanceof class46)) {
            return false;
        }
        class46 var2 = (class46) arg0;
        if (this.field393 == var2.field393 && this.field392 == var2.field392) {
            return this.field567 == var2.field567 && this.field563 == var2.field563;
        } else {
            return false;
        }
    }

    public int hashCode() {
        return this.field393 | this.field392 << 8 | this.field567 << 16 | this.field563 << 24;
    }

    @ObfuscatedName("ak.y(I)I")
    public int method569() {
        return this.field560;
    }

    @ObfuscatedName("ak.r(I)I")
    public int method556() {
        return this.field561;
    }

    @ObfuscatedName("ak.at(B)I")
    public int method555() {
        return this.field567;
    }

    @ObfuscatedName("ak.ag(I)I")
    public int method565() {
        return this.field563;
    }
}
