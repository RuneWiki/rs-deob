package deob;

@ObfuscatedName("aa")
public class class46 extends class29 {

    @ObfuscatedName("aa.w")
    public int field590;

    @ObfuscatedName("aa.v")
    public int field585;

    @ObfuscatedName("aa.h")
    public int field586;

    @ObfuscatedName("aa.t")
    public int field587;

    @ObfuscatedName("aa.c(Lfp;Lfp;I)V")
    public void method546(class174 arg0, class174 arg1) {
        int var3 = arg1.method2843();
        if (class37.field493.field501 != var3) {
            throw new IllegalStateException("");
        }
        this.field397 = arg1.method2843();
        this.field406 = arg1.method2843();
        this.field404 = arg1.method2861();
        this.field394 = arg1.method2861();
        this.field590 = arg1.method2843();
        this.field585 = arg1.method2843();
        this.field395 = arg1.method2861();
        this.field393 = arg1.method2861();
        this.field586 = arg1.method2843();
        this.field587 = arg1.method2843();
        this.field406 = Math.min(this.field406, 4);
        this.field399 = new short[1][64][64];
        this.field400 = new short[this.field406][64][64];
        this.field401 = new byte[this.field406][64][64];
        this.field402 = new byte[this.field406][64][64];
        this.field398 = new class32[this.field406][64][64][];
        int var4 = arg0.method2843();
        if (class36.field483.field482 != var4) {
            throw new IllegalStateException("");
        }
        int var5 = arg0.method2843();
        int var6 = arg0.method2843();
        int var7 = arg0.method2843();
        int var8 = arg0.method2843();
        if (this.field395 != var5 || this.field393 != var6 || this.field586 != var7 || this.field587 != var8) {
            throw new IllegalStateException("");
        }
        for (int var9 = 0; var9 < 8; var9++) {
            for (int var10 = 0; var10 < 8; var10++) {
                this.method213(this.field586 * 8 + var9, this.field587 * 8 + var10, arg0);
            }
        }
    }

    @ObfuscatedName("aa.o(III)Z")
    public boolean method537(int arg0, int arg1) {
        if (arg0 < this.field586 * 8) {
            return false;
        } else if (arg1 < this.field587 * 8) {
            return false;
        } else if (arg0 >= this.field586 * 8 + 8) {
            return false;
        } else {
            return arg1 < this.field587 * 8 + 8;
        }
    }

    public boolean equals(Object arg0) {
        if (!(arg0 instanceof class46)) {
            return false;
        }
        class46 var2 = (class46) arg0;
        if (this.field395 == var2.field395 && this.field393 == var2.field393) {
            return this.field586 == var2.field586 && this.field587 == var2.field587;
        } else {
            return false;
        }
    }

    public int hashCode() {
        return this.field395 | this.field393 << 8 | this.field586 << 16 | this.field587 << 24;
    }

    @ObfuscatedName("aa.i(I)I")
    public int method554() {
        return this.field590;
    }

    @ObfuscatedName("aa.av(I)I")
    public int method535() {
        return this.field585;
    }

    @ObfuscatedName("aa.al(I)I")
    public int method540() {
        return this.field586;
    }

    @ObfuscatedName("aa.ab(I)I")
    public int method538() {
        return this.field587;
    }
}
