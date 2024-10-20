package deob;

@ObfuscatedName("aa")
public class class47 extends class29 {

    @ObfuscatedName("aa.o")
    public int field560;

    @ObfuscatedName("aa.c")
    public int field561;

    @ObfuscatedName("aa.v")
    public int field562;

    @ObfuscatedName("aa.u")
    public int field563;

    @ObfuscatedName("aa.t(Lgb;Lgb;I)V")
    public void method608(class195 arg0, class195 arg1) {
        int var3 = arg1.method3236();
        if (class38.field483.field484 != var3) {
            throw new IllegalStateException("");
        }
        this.field382 = arg1.method3236();
        this.field383 = arg1.method3236();
        this.field380 = arg1.method3238();
        this.field379 = arg1.method3238();
        this.field560 = arg1.method3236();
        this.field561 = arg1.method3236();
        this.field391 = arg1.method3238();
        this.field386 = arg1.method3238();
        this.field562 = arg1.method3236();
        this.field563 = arg1.method3236();
        this.field383 = Math.min(this.field383, 4);
        this.field384 = new short[1][64][64];
        this.field385 = new short[this.field383][64][64];
        this.field390 = new byte[this.field383][64][64];
        this.field387 = new byte[this.field383][64][64];
        this.field388 = new class32[this.field383][64][64][];
        int var4 = arg0.method3236();
        if (class37.field474.field475 != var4) {
            throw new IllegalStateException("");
        }
        int var5 = arg0.method3236();
        int var6 = arg0.method3236();
        int var7 = arg0.method3236();
        int var8 = arg0.method3236();
        if (this.field391 != var5 || this.field386 != var6 || this.field562 != var7 || this.field563 != var8) {
            throw new IllegalStateException("");
        }
        for (int var9 = 0; var9 < 8; var9++) {
            for (int var10 = 0; var10 < 8; var10++) {
                this.method219(this.field562 * 8 + var9, this.field563 * 8 + var10, arg0);
            }
        }
    }

    @ObfuscatedName("aa.q(III)Z")
    public boolean method616(int arg0, int arg1) {
        if (arg0 < this.field562 * 8) {
            return false;
        } else if (arg1 < this.field563 * 8) {
            return false;
        } else if (arg0 >= this.field562 * 8 + 8) {
            return false;
        } else {
            return arg1 < this.field563 * 8 + 8;
        }
    }

    public boolean equals(Object arg0) {
        if (!(arg0 instanceof class47)) {
            return false;
        }
        class47 var2 = (class47) arg0;
        if (this.field391 == var2.field391 && this.field386 == var2.field386) {
            return this.field562 == var2.field562 && this.field563 == var2.field563;
        } else {
            return false;
        }
    }

    public int hashCode() {
        return this.field391 | this.field386 << 8 | this.field562 << 16 | this.field563 << 24;
    }

    @ObfuscatedName("aa.i(I)I")
    public int method618() {
        return this.field560;
    }

    @ObfuscatedName("aa.a(B)I")
    public int method609() {
        return this.field561;
    }

    @ObfuscatedName("aa.l(B)I")
    public int method610() {
        return this.field562;
    }

    @ObfuscatedName("aa.am(B)I")
    public int method611() {
        return this.field563;
    }
}
