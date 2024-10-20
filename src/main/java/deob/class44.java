package deob;

@ObfuscatedName("bf")
public class class44 {

    @ObfuscatedName("bf.af")
    public int field320 = 2;

    @ObfuscatedName("bf.an")
    public int[] field319 = new int[2];

    @ObfuscatedName("bf.aw")
    public int[] field325 = new int[2];

    @ObfuscatedName("bf.ac")
    public int field321;

    @ObfuscatedName("bf.au")
    public int field322;

    @ObfuscatedName("bf.ab")
    public int field318;

    @ObfuscatedName("bf.aq")
    public int field324;

    @ObfuscatedName("bf.al")
    public int field326;

    @ObfuscatedName("bf.at")
    public int field323;

    @ObfuscatedName("bf.aa")
    public int field327;

    @ObfuscatedName("bf.ay")
    public int field328;

    public class44() {
        this.field319[0] = 0;
        this.field319[1] = 65535;
        this.field325[0] = 0;
        this.field325[1] = 65535;
    }

    @ObfuscatedName("bf.af(Lsg;)V")
    public final void method839(class489 arg0) {
        this.field318 = arg0.method8248();
        this.field321 = arg0.method8254();
        this.field322 = arg0.method8254();
        this.method849(arg0);
    }

    @ObfuscatedName("bf.an(Lsg;)V")
    public final void method849(class489 arg0) {
        this.field320 = arg0.method8248();
        this.field319 = new int[this.field320];
        this.field325 = new int[this.field320];
        for (int var2 = 0; var2 < this.field320; var2++) {
            this.field319[var2] = arg0.method8250();
            this.field325[var2] = arg0.method8250();
        }
    }

    @ObfuscatedName("bf.aw()V")
    public final void method844() {
        this.field324 = 0;
        this.field326 = 0;
        this.field323 = 0;
        this.field327 = 0;
        this.field328 = 0;
    }

    @ObfuscatedName("bf.ac(I)I")
    public final int method841(int arg0) {
        if (this.field328 >= this.field324) {
            this.field327 = this.field325[this.field326++] << 15;
            if (this.field326 >= this.field320) {
                this.field326 = this.field320 - 1;
            }
            this.field324 = (int) ((double) this.field319[this.field326] / 65536.0D * (double) arg0);
            if (this.field324 > this.field328) {
                this.field323 = ((this.field325[this.field326] << 15) - this.field327) / (this.field324 - this.field328);
            }
        }
        this.field327 += this.field323;
        this.field328++;
        return this.field327 - this.field323 >> 15;
    }
}
