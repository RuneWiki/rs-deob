package deob;

@ObfuscatedName("bb")
public class class44 {

    @ObfuscatedName("bb.aq")
    public int field291 = 2;

    @ObfuscatedName("bb.ad")
    public int[] field285 = new int[2];

    @ObfuscatedName("bb.ag")
    public int[] field286 = new int[2];

    @ObfuscatedName("bb.ak")
    public int field289;

    @ObfuscatedName("bb.ap")
    public int field288;

    @ObfuscatedName("bb.an")
    public int field287;

    @ObfuscatedName("bb.aj")
    public int field290;

    @ObfuscatedName("bb.av")
    public int field284;

    @ObfuscatedName("bb.ab")
    public int field292;

    @ObfuscatedName("bb.ai")
    public int field293;

    @ObfuscatedName("bb.ae")
    public int field294;

    public class44() {
        this.field285[0] = 0;
        this.field285[1] = 65535;
        this.field286[0] = 0;
        this.field286[1] = 65535;
    }

    @ObfuscatedName("bb.aq(Lvp;)V")
    public final void method836(class547 arg0) {
        this.field287 = arg0.method8804();
        this.field289 = arg0.method8734();
        this.field288 = arg0.method8734();
        this.method829(arg0);
    }

    @ObfuscatedName("bb.ad(Lvp;)V")
    public final void method829(class547 arg0) {
        this.field291 = arg0.method8804();
        this.field285 = new int[this.field291];
        this.field286 = new int[this.field291];
        for (int var2 = 0; var2 < this.field291; var2++) {
            this.field285[var2] = arg0.method8899();
            this.field286[var2] = arg0.method8899();
        }
    }

    @ObfuscatedName("bb.ag()V")
    public final void method830() {
        this.field290 = 0;
        this.field284 = 0;
        this.field292 = 0;
        this.field293 = 0;
        this.field294 = 0;
    }

    @ObfuscatedName("bb.ak(I)I")
    public final int method833(int arg0) {
        if (this.field294 >= this.field290) {
            this.field293 = this.field286[this.field284++] << 15;
            if (this.field284 >= this.field291) {
                this.field284 = this.field291 - 1;
            }
            this.field290 = (int) ((double) this.field285[this.field284] / 65536.0D * (double) arg0);
            if (this.field290 > this.field294) {
                this.field292 = ((this.field286[this.field284] << 15) - this.field293) / (this.field290 - this.field294);
            }
        }
        this.field293 += this.field292;
        this.field294++;
        return this.field293 - this.field292 >> 15;
    }
}
