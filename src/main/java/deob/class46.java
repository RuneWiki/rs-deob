package deob;

@ObfuscatedName("ac")
public class class46 extends class29 {

    @ObfuscatedName("ac.x")
    public int field549;

    @ObfuscatedName("ac.q")
    public int field543;

    @ObfuscatedName("ac.v")
    public int field547;

    @ObfuscatedName("ac.n")
    public int field544;

    @ObfuscatedName("ac.p(Lgj;Lgj;I)V")
    public void method559(class185 arg0, class185 arg1) {
        int var3 = arg1.method3197();
        if (class37.field469.field468 != var3) {
            throw new IllegalStateException("");
        }
        this.field380 = arg1.method3197();
        this.field382 = arg1.method3197();
        this.field385 = arg1.method3124();
        this.field377 = arg1.method3124();
        this.field549 = arg1.method3197();
        this.field543 = arg1.method3197();
        this.field378 = arg1.method3124();
        this.field379 = arg1.method3124();
        this.field547 = arg1.method3197();
        this.field544 = arg1.method3197();
        this.field382 = Math.min(this.field382, 4);
        this.field381 = new short[1][64][64];
        this.field383 = new short[this.field382][64][64];
        this.field387 = new byte[this.field382][64][64];
        this.field384 = new byte[this.field382][64][64];
        this.field386 = new class32[this.field382][64][64][];
        int var4 = arg0.method3197();
        if (class36.field462.field463 != var4) {
            throw new IllegalStateException("");
        }
        int var5 = arg0.method3197();
        int var6 = arg0.method3197();
        int var7 = arg0.method3197();
        int var8 = arg0.method3197();
        if (this.field378 != var5 || this.field379 != var6 || this.field547 != var7 || this.field544 != var8) {
            throw new IllegalStateException("");
        }
        for (int var9 = 0; var9 < 8; var9++) {
            for (int var10 = 0; var10 < 8; var10++) {
                this.method239(this.field547 * 8 + var9, this.field544 * 8 + var10, arg0);
            }
        }
    }

    @ObfuscatedName("ac.i(III)Z")
    public boolean method560(int arg0, int arg1) {
        if (arg0 < this.field547 * 8) {
            return false;
        } else if (arg1 < this.field544 * 8) {
            return false;
        } else if (arg0 >= this.field547 * 8 + 8) {
            return false;
        } else {
            return arg1 < this.field544 * 8 + 8;
        }
    }

    public boolean equals(Object arg0) {
        if (!(arg0 instanceof class46)) {
            return false;
        }
        class46 var2 = (class46) arg0;
        if (this.field378 == var2.field378 && this.field379 == var2.field379) {
            return this.field547 == var2.field547 && this.field544 == var2.field544;
        } else {
            return false;
        }
    }

    public int hashCode() {
        return this.field378 | this.field379 << 8 | this.field547 << 16 | this.field544 << 24;
    }

    @ObfuscatedName("ac.w(B)I")
    public int method558() {
        return this.field549;
    }

    @ObfuscatedName("ac.ay(B)I")
    public int method562() {
        return this.field543;
    }

    @ObfuscatedName("ac.ax(I)I")
    public int method576() {
        return this.field547;
    }

    @ObfuscatedName("ac.ae(I)I")
    public int method583() {
        return this.field544;
    }
}
