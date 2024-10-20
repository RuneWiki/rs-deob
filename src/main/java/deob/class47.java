package deob;

@ObfuscatedName("av")
public class class47 extends class29 {

    @ObfuscatedName("av.a")
    public int field563;

    @ObfuscatedName("av.e")
    public int field562;

    @ObfuscatedName("av.f")
    public int field560;

    @ObfuscatedName("av.l")
    public int field561;

    @ObfuscatedName("av.c(Lgp;Lgp;B)V")
    public void method591(class195 arg0, class195 arg1) {
        int var3 = arg1.method3429();
        if (class38.field483.field484 != var3) {
            throw new IllegalStateException("");
        }
        this.field393 = arg1.method3429();
        this.field392 = arg1.method3429();
        this.field391 = arg1.method3218();
        this.field388 = arg1.method3218();
        this.field563 = arg1.method3429();
        this.field562 = arg1.method3429();
        this.field387 = arg1.method3218();
        this.field390 = arg1.method3218();
        this.field560 = arg1.method3429();
        this.field561 = arg1.method3429();
        this.field392 = Math.min(this.field392, 4);
        this.field389 = new short[1][64][64];
        this.field394 = new short[this.field392][64][64];
        this.field395 = new byte[this.field392][64][64];
        this.field396 = new byte[this.field392][64][64];
        this.field397 = new class32[this.field392][64][64][];
        int var4 = arg0.method3429();
        if (class37.field476.field475 != var4) {
            throw new IllegalStateException("");
        }
        int var5 = arg0.method3429();
        int var6 = arg0.method3429();
        int var7 = arg0.method3429();
        int var8 = arg0.method3429();
        if (this.field387 != var5 || this.field390 != var6 || this.field560 != var7 || this.field561 != var8) {
            throw new IllegalStateException("");
        }
        for (int var9 = 0; var9 < 8; var9++) {
            for (int var10 = 0; var10 < 8; var10++) {
                this.method228(this.field560 * 8 + var9, this.field561 * 8 + var10, arg0);
            }
        }
    }

    @ObfuscatedName("av.i(III)Z")
    public boolean method592(int arg0, int arg1) {
        if (arg0 < this.field560 * 8) {
            return false;
        } else if (arg1 < this.field561 * 8) {
            return false;
        } else if (arg0 >= this.field560 * 8 + 8) {
            return false;
        } else {
            return arg1 < this.field561 * 8 + 8;
        }
    }

    public boolean equals(Object arg0) {
        if (!(arg0 instanceof class47)) {
            return false;
        }
        class47 var2 = (class47) arg0;
        if (this.field387 == var2.field387 && this.field390 == var2.field390) {
            return this.field560 == var2.field560 && this.field561 == var2.field561;
        } else {
            return false;
        }
    }

    public int hashCode() {
        return this.field387 | this.field390 << 8 | this.field560 << 16 | this.field561 << 24;
    }

    @ObfuscatedName("av.o(B)I")
    public int method594() {
        return this.field563;
    }

    @ObfuscatedName("av.am(B)I")
    public int method595() {
        return this.field562;
    }

    @ObfuscatedName("av.aq(I)I")
    public int method605() {
        return this.field560;
    }

    @ObfuscatedName("av.ae(B)I")
    public int method597() {
        return this.field561;
    }
}
