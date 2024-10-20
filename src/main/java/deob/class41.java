package deob;

@ObfuscatedName("az")
public class class41 {

    @ObfuscatedName("az.c")
    public int field310 = 2;

    @ObfuscatedName("az.l")
    public int[] field311 = new int[2];

    @ObfuscatedName("az.s")
    public int[] field312 = new int[2];

    @ObfuscatedName("az.e")
    public int field313;

    @ObfuscatedName("az.r")
    public int field316;

    @ObfuscatedName("az.o")
    public int field315;

    @ObfuscatedName("az.i")
    public int field319;

    @ObfuscatedName("az.w")
    public int field317;

    @ObfuscatedName("az.v")
    public int field318;

    @ObfuscatedName("az.a")
    public int field314;

    @ObfuscatedName("az.y")
    public int field320;

    public class41() {
        this.field311[0] = 0;
        this.field311[1] = 65535;
        this.field312[0] = 0;
        this.field312[1] = 65535;
    }

    @ObfuscatedName("az.c(Lpi;)V")
    public final void method743(class421 arg0) {
        this.field315 = arg0.method6686();
        this.field313 = arg0.method6669();
        this.field316 = arg0.method6669();
        this.method748(arg0);
    }

    @ObfuscatedName("az.l(Lpi;)V")
    public final void method748(class421 arg0) {
        this.field310 = arg0.method6686();
        this.field311 = new int[this.field310];
        this.field312 = new int[this.field310];
        for (int var2 = 0; var2 < this.field310; var2++) {
            this.field311[var2] = arg0.method6666();
            this.field312[var2] = arg0.method6666();
        }
    }

    @ObfuscatedName("az.s()V")
    public final void method742() {
        this.field319 = 0;
        this.field317 = 0;
        this.field318 = 0;
        this.field314 = 0;
        this.field320 = 0;
    }

    @ObfuscatedName("az.e(I)I")
    public final int method745(int arg0) {
        if (this.field320 >= this.field319) {
            this.field314 = this.field312[this.field317++] << 15;
            if (this.field317 >= this.field310) {
                this.field317 = this.field310 - 1;
            }
            this.field319 = (int) ((double) this.field311[this.field317] / 65536.0D * (double) arg0);
            if (this.field319 > this.field320) {
                this.field318 = ((this.field312[this.field317] << 15) - this.field314) / (this.field319 - this.field320);
            }
        }
        this.field314 += this.field318;
        this.field320++;
        return this.field314 - this.field318 >> 15;
    }
}
