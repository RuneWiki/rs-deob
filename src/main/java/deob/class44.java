package deob;

@ObfuscatedName("be")
public class class44 {

    @ObfuscatedName("be.ab")
    public int field282 = 2;

    @ObfuscatedName("be.ay")
    public int[] field278 = new int[2];

    @ObfuscatedName("be.an")
    public int[] field279 = new int[2];

    @ObfuscatedName("be.au")
    public int field287;

    @ObfuscatedName("be.ax")
    public int field281;

    @ObfuscatedName("be.ao")
    public int field280;

    @ObfuscatedName("be.am")
    public int field283;

    @ObfuscatedName("be.ac")
    public int field284;

    @ObfuscatedName("be.ae")
    public int field285;

    @ObfuscatedName("be.ad")
    public int field286;

    @ObfuscatedName("be.aq")
    public int field277;

    public class44() {
        this.field278[0] = 0;
        this.field278[1] = 65535;
        this.field279[0] = 0;
        this.field279[1] = 65535;
    }

    @ObfuscatedName("be.ab(Lvg;)V")
    public final void method780(class549 arg0) {
        this.field280 = arg0.method9025();
        this.field287 = arg0.method8803();
        this.field281 = arg0.method8803();
        this.method781(arg0);
    }

    @ObfuscatedName("be.ay(Lvg;)V")
    public final void method781(class549 arg0) {
        this.field282 = arg0.method9025();
        this.field278 = new int[this.field282];
        this.field279 = new int[this.field282];
        for (int var2 = 0; var2 < this.field282; var2++) {
            this.field278[var2] = arg0.method8968();
            this.field279[var2] = arg0.method8968();
        }
    }

    @ObfuscatedName("be.an()V")
    public final void method788() {
        this.field283 = 0;
        this.field284 = 0;
        this.field285 = 0;
        this.field286 = 0;
        this.field277 = 0;
    }

    @ObfuscatedName("be.au(I)I")
    public final int method783(int arg0) {
        if (this.field277 >= this.field283) {
            this.field286 = this.field279[this.field284++] << 15;
            if (this.field284 >= this.field282) {
                this.field284 = this.field282 - 1;
            }
            this.field283 = (int) ((double) this.field278[this.field284] / 65536.0D * (double) arg0);
            if (this.field283 > this.field277) {
                this.field285 = ((this.field279[this.field284] << 15) - this.field286) / (this.field283 - this.field277);
            }
        }
        this.field286 += this.field285;
        this.field277++;
        return this.field286 - this.field285 >> 15;
    }
}
