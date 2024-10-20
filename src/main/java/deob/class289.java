package deob;

@ObfuscatedName("lu")
public class class289 extends class295 {

    @ObfuscatedName("lu.ac")
    public int field3146;

    @ObfuscatedName("lu.ae")
    public int field3149;

    @ObfuscatedName("lu.ag")
    public int field3148;

    @ObfuscatedName("lu.am")
    public int field3147;

    @ObfuscatedName("lu.ac(Lvf;B)V")
    public void method5529(class551 arg0) {
        int var2 = arg0.method8955();
        if (class301.field3237.field3236 != var2) {
            throw new IllegalStateException("");
        }
        this.field3194 = arg0.method8955();
        this.field3195 = arg0.method8955();
        this.field3200 = arg0.method9119();
        this.field3191 = arg0.method9119();
        this.field3146 = arg0.method8955();
        this.field3149 = arg0.method8955();
        this.field3190 = arg0.method9119();
        this.field3193 = arg0.method9119();
        this.field3148 = arg0.method8955();
        this.field3147 = arg0.method8955();
        this.field3196 = arg0.method9205();
        this.field3197 = arg0.method9205();
    }

    @ObfuscatedName("lu.ae(Lvf;I)V")
    public void method5225(class551 arg0) {
        this.field3195 = Math.min(this.field3195, 4);
        this.field3192 = new short[1][64][64];
        this.field3199 = new short[this.field3195][64][64];
        this.field3198 = new byte[this.field3195][64][64];
        this.field3201 = new byte[this.field3195][64][64];
        this.field3202 = new class297[this.field3195][64][64][];
        int var2 = arg0.method8955();
        if (class300.field3228.field3229 != var2) {
            throw new IllegalStateException("");
        }
        int var3 = arg0.method8955();
        int var4 = arg0.method8955();
        int var5 = arg0.method8955();
        int var6 = arg0.method8955();
        if (this.field3190 != var3 || this.field3193 != var4 || this.field3148 != var5 || this.field3147 != var6) {
            throw new IllegalStateException("");
        }
        for (int var7 = 0; var7 < 8; var7++) {
            for (int var8 = 0; var8 < 8; var8++) {
                this.method5572(this.field3148 * 8 + var7, this.field3147 * 8 + var8, arg0);
            }
        }
    }

    public boolean equals(Object arg0) {
        if (!(arg0 instanceof class289)) {
            return false;
        }
        class289 var2 = (class289) arg0;
        if (this.field3190 == var2.field3190 && this.field3193 == var2.field3193) {
            return this.field3148 == var2.field3148 && this.field3147 == var2.field3147;
        } else {
            return false;
        }
    }

    public int hashCode() {
        return this.field3190 | this.field3193 << 8 | this.field3148 << 16 | this.field3147 << 24;
    }

    @ObfuscatedName("lu.ag(I)I")
    public int method5541() {
        return this.field3146;
    }

    @ObfuscatedName("lu.am(I)I")
    public int method5528() {
        return this.field3149;
    }

    @ObfuscatedName("lu.ax(I)I")
    public int method5533() {
        return this.field3148;
    }

    @ObfuscatedName("lu.aq(I)I")
    public int method5530() {
        return this.field3147;
    }
}
