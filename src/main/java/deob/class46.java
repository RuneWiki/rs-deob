package deob;

@ObfuscatedName("ae")
public class class46 extends class29 {

    @ObfuscatedName("ae.c")
    public int field553;

    @ObfuscatedName("ae.s")
    public int field548;

    @ObfuscatedName("ae.n")
    public int field549;

    @ObfuscatedName("ae.y")
    public int field547;

    @ObfuscatedName("ae.a(Lgh;Lgh;I)V")
    public void method552(class185 arg0, class185 arg1) {
        int var3 = arg1.method2962();
        if (class37.field472.field473 != var3) {
            throw new IllegalStateException("");
        }
        this.field378 = arg1.method2962();
        this.field379 = arg1.method2962();
        this.field384 = arg1.method3194();
        this.field375 = arg1.method3194();
        this.field553 = arg1.method2962();
        this.field548 = arg1.method2962();
        this.field381 = arg1.method3194();
        this.field377 = arg1.method3194();
        this.field549 = arg1.method2962();
        this.field547 = arg1.method2962();
        this.field379 = Math.min(this.field379, 4);
        this.field380 = new short[1][64][64];
        this.field376 = new short[this.field379][64][64];
        this.field382 = new byte[this.field379][64][64];
        this.field383 = new byte[this.field379][64][64];
        this.field385 = new class32[this.field379][64][64][];
        int var4 = arg0.method2962();
        if (class36.field469.field464 != var4) {
            throw new IllegalStateException("");
        }
        int var5 = arg0.method2962();
        int var6 = arg0.method2962();
        int var7 = arg0.method2962();
        int var8 = arg0.method2962();
        if (this.field381 != var5 || this.field377 != var6 || this.field549 != var7 || this.field547 != var8) {
            throw new IllegalStateException("");
        }
        for (int var9 = 0; var9 < 8; var9++) {
            for (int var10 = 0; var10 < 8; var10++) {
                this.method226(this.field549 * 8 + var9, this.field547 * 8 + var10, arg0);
            }
        }
    }

    @ObfuscatedName("ae.w(III)Z")
    public boolean method553(int arg0, int arg1) {
        if (arg0 < this.field549 * 8) {
            return false;
        } else if (arg1 < this.field547 * 8) {
            return false;
        } else if (arg0 >= this.field549 * 8 + 8) {
            return false;
        } else {
            return arg1 < this.field547 * 8 + 8;
        }
    }

    public boolean equals(Object arg0) {
        if (!(arg0 instanceof class46)) {
            return false;
        }
        class46 var2 = (class46) arg0;
        if (this.field381 == var2.field381 && this.field377 == var2.field377) {
            return this.field549 == var2.field549 && this.field547 == var2.field547;
        } else {
            return false;
        }
    }

    public int hashCode() {
        return this.field381 | this.field377 << 8 | this.field549 << 16 | this.field547 << 24;
    }

    @ObfuscatedName("ae.e(B)I")
    public int method551() {
        return this.field553;
    }

    @ObfuscatedName("ae.k(I)I")
    public int method575() {
        return this.field548;
    }

    @ObfuscatedName("ae.p(I)I")
    public int method556() {
        return this.field549;
    }

    @ObfuscatedName("ae.ab(I)I")
    public int method557() {
        return this.field547;
    }
}
