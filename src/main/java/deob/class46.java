package deob;

@ObfuscatedName("at")
public class class46 extends class29 {

    @ObfuscatedName("at.r")
    public int field544;

    @ObfuscatedName("at.d")
    public int field541;

    @ObfuscatedName("at.v")
    public int field545;

    @ObfuscatedName("at.s")
    public int field543;

    @ObfuscatedName("at.b(Lgn;Lgn;B)V")
    public void method586(class194 arg0, class194 arg1) {
        int var3 = arg1.method3247();
        if (class37.field465.field470 != var3) {
            throw new IllegalStateException("");
        }
        this.field385 = arg1.method3247();
        this.field378 = arg1.method3247();
        this.field384 = arg1.method3249();
        this.field374 = arg1.method3249();
        this.field544 = arg1.method3247();
        this.field541 = arg1.method3247();
        this.field375 = arg1.method3249();
        this.field382 = arg1.method3249();
        this.field545 = arg1.method3247();
        this.field543 = arg1.method3247();
        this.field378 = Math.min(this.field378, 4);
        this.field379 = new short[1][64][64];
        this.field380 = new short[this.field378][64][64];
        this.field387 = new byte[this.field378][64][64];
        this.field381 = new byte[this.field378][64][64];
        this.field383 = new class32[this.field378][64][64][];
        int var4 = arg0.method3247();
        if (class36.field454.field456 != var4) {
            throw new IllegalStateException("");
        }
        int var5 = arg0.method3247();
        int var6 = arg0.method3247();
        int var7 = arg0.method3247();
        int var8 = arg0.method3247();
        if (this.field375 != var5 || this.field382 != var6 || this.field545 != var7 || this.field543 != var8) {
            throw new IllegalStateException("");
        }
        for (int var9 = 0; var9 < 8; var9++) {
            for (int var10 = 0; var10 < 8; var10++) {
                this.method225(this.field545 * 8 + var9, this.field543 * 8 + var10, arg0);
            }
        }
    }

    @ObfuscatedName("at.q(IIB)Z")
    public boolean method595(int arg0, int arg1) {
        if (arg0 < this.field545 * 8) {
            return false;
        } else if (arg1 < this.field543 * 8) {
            return false;
        } else if (arg0 >= this.field545 * 8 + 8) {
            return false;
        } else {
            return arg1 < this.field543 * 8 + 8;
        }
    }

    public boolean equals(Object arg0) {
        if (!(arg0 instanceof class46)) {
            return false;
        }
        class46 var2 = (class46) arg0;
        if (this.field375 == var2.field375 && this.field382 == var2.field382) {
            return this.field545 == var2.field545 && this.field543 == var2.field543;
        } else {
            return false;
        }
    }

    public int hashCode() {
        return this.field375 | this.field382 << 8 | this.field545 << 16 | this.field543 << 24;
    }

    @ObfuscatedName("at.o(I)I")
    public int method584() {
        return this.field544;
    }

    @ObfuscatedName("at.p(I)I")
    public int method585() {
        return this.field541;
    }

    @ObfuscatedName("at.ak(I)I")
    public int method594() {
        return this.field545;
    }

    @ObfuscatedName("at.al(B)I")
    public int method587() {
        return this.field543;
    }
}
