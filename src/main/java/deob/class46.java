package deob;

@ObfuscatedName("ac")
public class class46 extends class29 {

    @ObfuscatedName("ac.u")
    public int field564;

    @ObfuscatedName("ac.n")
    public int field559;

    @ObfuscatedName("ac.c")
    public int field560;

    @ObfuscatedName("ac.y")
    public int field561;

    @ObfuscatedName("ac.d(Lfr;Lfr;I)V")
    public void method584(class181 arg0, class181 arg1) {
        int var3 = arg1.method3204();
        if (class37.field483.field481 != var3) {
            throw new IllegalStateException("");
        }
        this.field390 = arg1.method3204();
        this.field384 = arg1.method3204();
        this.field392 = arg1.method3179();
        this.field380 = arg1.method3179();
        this.field564 = arg1.method3204();
        this.field559 = arg1.method3204();
        this.field386 = arg1.method3179();
        this.field382 = arg1.method3179();
        this.field560 = arg1.method3204();
        this.field561 = arg1.method3204();
        this.field384 = Math.min(this.field384, 4);
        this.field385 = new short[1][64][64];
        this.field387 = new short[this.field384][64][64];
        this.field379 = new byte[this.field384][64][64];
        this.field388 = new byte[this.field384][64][64];
        this.field389 = new class32[this.field384][64][64][];
        int var4 = arg0.method3204();
        if (class36.field476.field475 != var4) {
            throw new IllegalStateException("");
        }
        int var5 = arg0.method3204();
        int var6 = arg0.method3204();
        int var7 = arg0.method3204();
        int var8 = arg0.method3204();
        if (this.field386 != var5 || this.field382 != var6 || this.field560 != var7 || this.field561 != var8) {
            throw new IllegalStateException("");
        }
        for (int var9 = 0; var9 < 8; var9++) {
            for (int var10 = 0; var10 < 8; var10++) {
                this.method208(this.field560 * 8 + var9, this.field561 * 8 + var10, arg0);
            }
        }
    }

    @ObfuscatedName("ac.x(III)Z")
    public boolean method566(int arg0, int arg1) {
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
        if (!(arg0 instanceof class46)) {
            return false;
        }
        class46 var2 = (class46) arg0;
        if (this.field386 == var2.field386 && this.field382 == var2.field382) {
            return this.field560 == var2.field560 && this.field561 == var2.field561;
        } else {
            return false;
        }
    }

    public int hashCode() {
        return this.field386 | this.field382 << 8 | this.field560 << 16 | this.field561 << 24;
    }

    @ObfuscatedName("ac.k(B)I")
    public int method569() {
        return this.field564;
    }

    @ObfuscatedName("ac.i(I)I")
    public int method570() {
        return this.field559;
    }

    @ObfuscatedName("ac.o(I)I")
    public int method571() {
        return this.field560;
    }

    @ObfuscatedName("ac.w(I)I")
    public int method568() {
        return this.field561;
    }
}
