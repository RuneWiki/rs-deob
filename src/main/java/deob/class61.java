package deob;

@ObfuscatedName("bq")
public class class61 {

    @ObfuscatedName("bq.i")
    public int field1258 = 2;

    @ObfuscatedName("bq.h")
    public int[] field1254 = new int[2];

    @ObfuscatedName("bq.e")
    public int[] field1255 = new int[2];

    @ObfuscatedName("bq.g")
    public int field1256;

    @ObfuscatedName("bq.n")
    public int field1253;

    @ObfuscatedName("bq.u")
    public int field1257;

    @ObfuscatedName("bq.d")
    public int field1259;

    @ObfuscatedName("bq.l")
    public int field1260;

    @ObfuscatedName("bq.m")
    public int field1261;

    @ObfuscatedName("bq.j")
    public int field1262;

    @ObfuscatedName("bq.y")
    public int field1263;

    public class61() {
        this.field1254[0] = 0;
        this.field1254[1] = 65535;
        this.field1255[0] = 0;
        this.field1255[1] = 65535;
    }

    @ObfuscatedName("bq.i(Ldn;)V")
    public final void method1235(class123 arg0) {
        this.field1257 = arg0.method2404();
        this.field1256 = arg0.method2409();
        this.field1253 = arg0.method2409();
        this.method1240(arg0);
    }

    @ObfuscatedName("bq.h(Ldn;)V")
    public final void method1240(class123 arg0) {
        this.field1258 = arg0.method2404();
        this.field1254 = new int[this.field1258];
        this.field1255 = new int[this.field1258];
        for (int var2 = 0; var2 < this.field1258; var2++) {
            this.field1254[var2] = arg0.method2406();
            this.field1255[var2] = arg0.method2406();
        }
    }

    @ObfuscatedName("bq.e()V")
    public final void method1237() {
        this.field1259 = 0;
        this.field1260 = 0;
        this.field1261 = 0;
        this.field1262 = 0;
        this.field1263 = 0;
    }

    @ObfuscatedName("bq.g(I)I")
    public final int method1241(int arg0) {
        if (this.field1263 >= this.field1259) {
            this.field1262 = this.field1255[this.field1260++] << 15;
            if (this.field1260 >= this.field1258) {
                this.field1260 = this.field1258 - 1;
            }
            this.field1259 = (int) ((double) this.field1254[this.field1260] / 65536.0D * (double) arg0);
            if (this.field1259 > this.field1263) {
                this.field1261 = ((this.field1255[this.field1260] << 15) - this.field1262) / (this.field1259 - this.field1263);
            }
        }
        this.field1262 += this.field1261;
        this.field1263++;
        return this.field1262 - this.field1261 >> 15;
    }
}
