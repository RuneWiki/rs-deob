package deob;

@ObfuscatedName("bu")
public class class44 {

    @ObfuscatedName("bu.ac")
    public int field282 = 2;

    @ObfuscatedName("bu.ae")
    public int[] field287 = new int[2];

    @ObfuscatedName("bu.ag")
    public int[] field284 = new int[2];

    @ObfuscatedName("bu.am")
    public int field285;

    @ObfuscatedName("bu.ax")
    public int field286;

    @ObfuscatedName("bu.aq")
    public int field292;

    @ObfuscatedName("bu.af")
    public int field283;

    @ObfuscatedName("bu.at")
    public int field289;

    @ObfuscatedName("bu.au")
    public int field290;

    @ObfuscatedName("bu.ar")
    public int field288;

    @ObfuscatedName("bu.al")
    public int field291;

    public class44() {
        this.field287[0] = 0;
        this.field287[1] = 65535;
        this.field284[0] = 0;
        this.field284[1] = 65535;
    }

    @ObfuscatedName("bu.ac(Lvf;)V")
    public final void method821(class551 arg0) {
        this.field292 = arg0.method8955();
        this.field285 = arg0.method9110();
        this.field286 = arg0.method9110();
        this.method836(arg0);
    }

    @ObfuscatedName("bu.ae(Lvf;)V")
    public final void method836(class551 arg0) {
        this.field282 = arg0.method8955();
        this.field287 = new int[this.field282];
        this.field284 = new int[this.field282];
        for (int var2 = 0; var2 < this.field282; var2++) {
            this.field287[var2] = arg0.method9119();
            this.field284[var2] = arg0.method9119();
        }
    }

    @ObfuscatedName("bu.ag()V")
    public final void method823() {
        this.field283 = 0;
        this.field289 = 0;
        this.field290 = 0;
        this.field288 = 0;
        this.field291 = 0;
    }

    @ObfuscatedName("bu.am(I)I")
    public final int method828(int arg0) {
        if (this.field291 >= this.field283) {
            this.field288 = this.field284[this.field289++] << 15;
            if (this.field289 >= this.field282) {
                this.field289 = this.field282 - 1;
            }
            this.field283 = (int) ((double) this.field287[this.field289] / 65536.0D * (double) arg0);
            if (this.field283 > this.field291) {
                this.field290 = ((this.field284[this.field289] << 15) - this.field288) / (this.field283 - this.field291);
            }
        }
        this.field288 += this.field290;
        this.field291++;
        return this.field288 - this.field290 >> 15;
    }
}
