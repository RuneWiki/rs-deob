package deob;

@ObfuscatedName("bf")
public class class44 {

    @ObfuscatedName("bf.ac")
    public int field314 = 2;

    @ObfuscatedName("bf.al")
    public int[] field310 = new int[2];

    @ObfuscatedName("bf.ak")
    public int[] field311 = new int[2];

    @ObfuscatedName("bf.ax")
    public int field312;

    @ObfuscatedName("bf.ao")
    public int field313;

    @ObfuscatedName("bf.ah")
    public int field309;

    @ObfuscatedName("bf.ar")
    public int field315;

    @ObfuscatedName("bf.ab")
    public int field316;

    @ObfuscatedName("bf.am")
    public int field317;

    @ObfuscatedName("bf.av")
    public int field318;

    @ObfuscatedName("bf.ag")
    public int field319;

    public class44() {
        this.field310[0] = 0;
        this.field310[1] = 65535;
        this.field311[0] = 0;
        this.field311[1] = 65535;
    }

    @ObfuscatedName("bf.ac(Lul;)V")
    public final void method805(class530 arg0) {
        this.field309 = arg0.method8365();
        this.field312 = arg0.method8371();
        this.field313 = arg0.method8371();
        this.method806(arg0);
    }

    @ObfuscatedName("bf.al(Lul;)V")
    public final void method806(class530 arg0) {
        this.field314 = arg0.method8365();
        this.field310 = new int[this.field314];
        this.field311 = new int[this.field314];
        for (int var2 = 0; var2 < this.field314; var2++) {
            this.field310[var2] = arg0.method8598();
            this.field311[var2] = arg0.method8598();
        }
    }

    @ObfuscatedName("bf.ak()V")
    public final void method810() {
        this.field315 = 0;
        this.field316 = 0;
        this.field317 = 0;
        this.field318 = 0;
        this.field319 = 0;
    }

    @ObfuscatedName("bf.ax(I)I")
    public final int method811(int arg0) {
        if (this.field319 >= this.field315) {
            this.field318 = this.field311[this.field316++] << 15;
            if (this.field316 >= this.field314) {
                this.field316 = this.field314 - 1;
            }
            this.field315 = (int) ((double) this.field310[this.field316] / 65536.0D * (double) arg0);
            if (this.field315 > this.field319) {
                this.field317 = ((this.field311[this.field316] << 15) - this.field318) / (this.field315 - this.field319);
            }
        }
        this.field318 += this.field317;
        this.field319++;
        return this.field318 - this.field317 >> 15;
    }
}
