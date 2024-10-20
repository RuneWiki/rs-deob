package deob;

@ObfuscatedName("br")
public class class44 {

    @ObfuscatedName("br.au")
    public int field324 = 2;

    @ObfuscatedName("br.ae")
    public int[] field320 = new int[2];

    @ObfuscatedName("br.ao")
    public int[] field321 = new int[2];

    @ObfuscatedName("br.at")
    public int field322;

    @ObfuscatedName("br.ac")
    public int field319;

    @ObfuscatedName("br.ai")
    public int field323;

    @ObfuscatedName("br.az")
    public int field326;

    @ObfuscatedName("br.ap")
    public int field328;

    @ObfuscatedName("br.aa")
    public int field327;

    @ObfuscatedName("br.af")
    public int field325;

    @ObfuscatedName("br.ad")
    public int field329;

    public class44() {
        this.field320[0] = 0;
        this.field320[1] = 65535;
        this.field321[0] = 0;
        this.field321[1] = 65535;
    }

    @ObfuscatedName("br.au(Ltm;)V")
    public final void method835(class515 arg0) {
        this.field323 = arg0.method8300();
        this.field322 = arg0.method8306();
        this.field319 = arg0.method8306();
        this.method842(arg0);
    }

    @ObfuscatedName("br.ae(Ltm;)V")
    public final void method842(class515 arg0) {
        this.field324 = arg0.method8300();
        this.field320 = new int[this.field324];
        this.field321 = new int[this.field324];
        for (int var2 = 0; var2 < this.field324; var2++) {
            this.field320[var2] = arg0.method8448();
            this.field321[var2] = arg0.method8448();
        }
    }

    @ObfuscatedName("br.ao()V")
    public final void method834() {
        this.field326 = 0;
        this.field328 = 0;
        this.field327 = 0;
        this.field325 = 0;
        this.field329 = 0;
    }

    @ObfuscatedName("br.at(I)I")
    public final int method832(int arg0) {
        if (this.field329 >= this.field326) {
            this.field325 = this.field321[this.field328++] << 15;
            if (this.field328 >= this.field324) {
                this.field328 = this.field324 - 1;
            }
            this.field326 = (int) ((double) this.field320[this.field328] / 65536.0D * (double) arg0);
            if (this.field326 > this.field329) {
                this.field327 = ((this.field321[this.field328] << 15) - this.field325) / (this.field326 - this.field329);
            }
        }
        this.field325 += this.field327;
        this.field329++;
        return this.field325 - this.field327 >> 15;
    }
}
