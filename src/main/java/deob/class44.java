package deob;

@ObfuscatedName("bo")
public class class44 {

    @ObfuscatedName("bo.ap")
    public int field283 = 2;

    @ObfuscatedName("bo.aw")
    public int[] field281 = new int[2];

    @ObfuscatedName("bo.ak")
    public int[] field277 = new int[2];

    @ObfuscatedName("bo.aj")
    public int field278;

    @ObfuscatedName("bo.ai")
    public int field275;

    @ObfuscatedName("bo.ay")
    public int field280;

    @ObfuscatedName("bo.as")
    public int field284;

    @ObfuscatedName("bo.ae")
    public int field282;

    @ObfuscatedName("bo.am")
    public int field285;

    @ObfuscatedName("bo.at")
    public int field279;

    @ObfuscatedName("bo.au")
    public int field276;

    public class44() {
        this.field281[0] = 0;
        this.field281[1] = 65535;
        this.field277[0] = 0;
        this.field277[1] = 65535;
    }

    @ObfuscatedName("bo.ap(Lvl;)V")
    public final void method820(class558 arg0) {
        this.field280 = arg0.method9258();
        this.field278 = arg0.method9264();
        this.field275 = arg0.method9264();
        this.method817(arg0);
    }

    @ObfuscatedName("bo.aw(Lvl;)V")
    public final void method817(class558 arg0) {
        this.field283 = arg0.method9258();
        this.field281 = new int[this.field283];
        this.field277 = new int[this.field283];
        for (int var2 = 0; var2 < this.field283; var2++) {
            this.field281[var2] = arg0.method9260();
            this.field277[var2] = arg0.method9260();
        }
    }

    @ObfuscatedName("bo.ak()V")
    public final void method829() {
        this.field284 = 0;
        this.field282 = 0;
        this.field285 = 0;
        this.field279 = 0;
        this.field276 = 0;
    }

    @ObfuscatedName("bo.aj(I)I")
    public final int method824(int arg0) {
        if (this.field276 >= this.field284) {
            this.field279 = this.field277[this.field282++] << 15;
            if (this.field282 >= this.field283) {
                this.field282 = this.field283 - 1;
            }
            this.field284 = (int) ((double) this.field281[this.field282] / 65536.0D * (double) arg0);
            if (this.field284 > this.field276) {
                this.field285 = ((this.field277[this.field282] << 15) - this.field279) / (this.field284 - this.field276);
            }
        }
        this.field279 += this.field285;
        this.field276++;
        return this.field279 - this.field285 >> 15;
    }
}
