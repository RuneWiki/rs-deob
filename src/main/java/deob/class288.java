package deob;

@ObfuscatedName("lf")
public class class288 extends class294 {

    @ObfuscatedName("lf.ap")
    public int field3161;

    @ObfuscatedName("lf.aw")
    public int field3159;

    @ObfuscatedName("lf.ak")
    public int field3158;

    @ObfuscatedName("lf.aj")
    public int field3160;

    @ObfuscatedName("lf.ap(Lvl;I)V")
    public void method5742(class558 arg0) {
        int var2 = arg0.method9258();
        if (class300.field3244.field3243 != var2) {
            throw new IllegalStateException("");
        }
        this.field3210 = arg0.method9258();
        this.field3203 = arg0.method9258();
        this.field3216 = arg0.method9260();
        this.field3202 = arg0.method9260();
        this.field3161 = arg0.method9258();
        this.field3159 = arg0.method9258();
        this.field3205 = arg0.method9260();
        this.field3209 = arg0.method9260();
        this.field3158 = arg0.method9258();
        this.field3160 = arg0.method9258();
        this.field3207 = arg0.method9278();
        this.field3208 = arg0.method9278();
    }

    @ObfuscatedName("lf.aw(Lvl;I)V")
    public void method5435(class558 arg0) {
        this.field3203 = Math.min(this.field3203, 4);
        this.field3206 = new short[1][64][64];
        this.field3201 = new short[this.field3203][64][64];
        this.field3211 = new byte[this.field3203][64][64];
        this.field3212 = new byte[this.field3203][64][64];
        this.field3213 = new class296[this.field3203][64][64][];
        int var2 = arg0.method9258();
        if (class299.field3240.field3242 != var2) {
            throw new IllegalStateException("");
        }
        int var3 = arg0.method9258();
        int var4 = arg0.method9258();
        int var5 = arg0.method9258();
        int var6 = arg0.method9258();
        if (this.field3205 != var3 || this.field3209 != var4 || this.field3158 != var5 || this.field3160 != var6) {
            throw new IllegalStateException("");
        }
        for (int var7 = 0; var7 < 8; var7++) {
            for (int var8 = 0; var8 < 8; var8++) {
                this.method5773(this.field3158 * 8 + var7, this.field3160 * 8 + var8, arg0);
            }
        }
    }

    public boolean equals(Object arg0) {
        if (!(arg0 instanceof class288)) {
            return false;
        }
        class288 var2 = (class288) arg0;
        if (this.field3205 == var2.field3205 && this.field3209 == var2.field3209) {
            return this.field3158 == var2.field3158 && this.field3160 == var2.field3160;
        } else {
            return false;
        }
    }

    public int hashCode() {
        return this.field3205 | this.field3209 << 8 | this.field3158 << 16 | this.field3160 << 24;
    }

    @ObfuscatedName("lf.ak(I)I")
    public int method5730() {
        return this.field3161;
    }

    @ObfuscatedName("lf.aj(I)I")
    public int method5746() {
        return this.field3159;
    }

    @ObfuscatedName("lf.ai(I)I")
    public int method5732() {
        return this.field3158;
    }

    @ObfuscatedName("lf.ae(B)I")
    public int method5731() {
        return this.field3160;
    }
}
