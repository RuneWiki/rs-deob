package deob;

@ObfuscatedName("bh")
public class class44 {

    @ObfuscatedName("bh.at")
    public int field289 = 2;

    @ObfuscatedName("bh.ah")
    public int[] field292 = new int[2];

    @ObfuscatedName("bh.ar")
    public int[] field290 = new int[2];

    @ObfuscatedName("bh.ao")
    public int field291;

    @ObfuscatedName("bh.ab")
    public int field295;

    @ObfuscatedName("bh.au")
    public int field297;

    @ObfuscatedName("bh.aa")
    public int field294;

    @ObfuscatedName("bh.ac")
    public int field293;

    @ObfuscatedName("bh.al")
    public int field296;

    @ObfuscatedName("bh.az")
    public int field288;

    @ObfuscatedName("bh.ap")
    public int field298;

    public class44() {
        this.field292[0] = 0;
        this.field292[1] = 65535;
        this.field290[0] = 0;
        this.field290[1] = 65535;
    }

    @ObfuscatedName("bh.at(Luj;)V")
    public final void method820(class527 arg0) {
        this.field297 = arg0.method8410();
        this.field291 = arg0.method8416();
        this.field295 = arg0.method8416();
        this.method832(arg0);
    }

    @ObfuscatedName("bh.ah(Luj;)V")
    public final void method832(class527 arg0) {
        this.field289 = arg0.method8410();
        this.field292 = new int[this.field289];
        this.field290 = new int[this.field289];
        for (int var2 = 0; var2 < this.field289; var2++) {
            this.field292[var2] = arg0.method8412();
            this.field290[var2] = arg0.method8412();
        }
    }

    @ObfuscatedName("bh.ar()V")
    public final void method822() {
        this.field294 = 0;
        this.field293 = 0;
        this.field296 = 0;
        this.field288 = 0;
        this.field298 = 0;
    }

    @ObfuscatedName("bh.ao(I)I")
    public final int method823(int arg0) {
        if (this.field298 >= this.field294) {
            this.field288 = this.field290[this.field293++] << 15;
            if (this.field293 >= this.field289) {
                this.field293 = this.field289 - 1;
            }
            this.field294 = (int) ((double) this.field292[this.field293] / 65536.0D * (double) arg0);
            if (this.field294 > this.field298) {
                this.field296 = ((this.field290[this.field293] << 15) - this.field288) / (this.field294 - this.field298);
            }
        }
        this.field288 += this.field296;
        this.field298++;
        return this.field288 - this.field296 >> 15;
    }
}
