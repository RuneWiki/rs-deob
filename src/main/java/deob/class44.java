package deob;

@ObfuscatedName("bz")
public class class44 {

    @ObfuscatedName("bz.aw")
    public int field326 = 2;

    @ObfuscatedName("bz.ay")
    public int[] field321 = new int[2];

    @ObfuscatedName("bz.ar")
    public int[] field322 = new int[2];

    @ObfuscatedName("bz.am")
    public int field323;

    @ObfuscatedName("bz.as")
    public int field324;

    @ObfuscatedName("bz.aj")
    public int field327;

    @ObfuscatedName("bz.ag")
    public int field325;

    @ObfuscatedName("bz.az")
    public int field320;

    @ObfuscatedName("bz.av")
    public int field328;

    @ObfuscatedName("bz.ap")
    public int field329;

    @ObfuscatedName("bz.aq")
    public int field330;

    public class44() {
        this.field321[0] = 0;
        this.field321[1] = 65535;
        this.field322[0] = 0;
        this.field322[1] = 65535;
    }

    @ObfuscatedName("bz.aw(Lty;)V")
    public final void method811(class514 arg0) {
        this.field327 = arg0.method8244();
        this.field323 = arg0.method8496();
        this.field324 = arg0.method8496();
        this.method812(arg0);
    }

    @ObfuscatedName("bz.ay(Lty;)V")
    public final void method812(class514 arg0) {
        this.field326 = arg0.method8244();
        this.field321 = new int[this.field326];
        this.field322 = new int[this.field326];
        for (int var2 = 0; var2 < this.field326; var2++) {
            this.field321[var2] = arg0.method8246();
            this.field322[var2] = arg0.method8246();
        }
    }

    @ObfuscatedName("bz.ar()V")
    public final void method813() {
        this.field325 = 0;
        this.field320 = 0;
        this.field328 = 0;
        this.field329 = 0;
        this.field330 = 0;
    }

    @ObfuscatedName("bz.am(I)I")
    public final int method814(int arg0) {
        if (this.field330 >= this.field325) {
            this.field329 = this.field322[this.field320++] << 15;
            if (this.field320 >= this.field326) {
                this.field320 = this.field326 - 1;
            }
            this.field325 = (int) ((double) this.field321[this.field320] / 65536.0D * (double) arg0);
            if (this.field325 > this.field330) {
                this.field328 = ((this.field322[this.field320] << 15) - this.field329) / (this.field325 - this.field330);
            }
        }
        this.field329 += this.field328;
        this.field330++;
        return this.field329 - this.field328 >> 15;
    }
}
