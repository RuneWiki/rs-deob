package deob;

@ObfuscatedName("bk")
public class class58 {

    @ObfuscatedName("bk.a")
    public int field1209 = 2;

    @ObfuscatedName("bk.w")
    public int[] field1207 = new int[2];

    @ObfuscatedName("bk.d")
    public int[] field1214 = new int[2];

    @ObfuscatedName("bk.c")
    public int field1210;

    @ObfuscatedName("bk.y")
    public int field1208;

    @ObfuscatedName("bk.k")
    public int field1211;

    @ObfuscatedName("bk.r")
    public int field1212;

    @ObfuscatedName("bk.p")
    public int field1213;

    @ObfuscatedName("bk.q")
    public int field1217;

    @ObfuscatedName("bk.m")
    public int field1215;

    @ObfuscatedName("bk.e")
    public int field1216;

    public class58() {
        this.field1207[0] = 0;
        this.field1207[1] = 65535;
        this.field1214[0] = 0;
        this.field1214[1] = 65535;
    }

    @ObfuscatedName("bk.a(Ldx;)V")
    public final void method1281(class120 arg0) {
        this.field1212 = arg0.method2462();
        this.field1210 = arg0.method2467();
        this.field1211 = arg0.method2467();
        this.method1286(arg0);
    }

    @ObfuscatedName("bk.w(Ldx;)V")
    public final void method1286(class120 arg0) {
        this.field1209 = arg0.method2462();
        this.field1207 = new int[this.field1209];
        this.field1214 = new int[this.field1209];
        for (int var2 = 0; var2 < this.field1209; var2++) {
            this.field1207[var2] = arg0.method2464();
            this.field1214[var2] = arg0.method2464();
        }
    }

    @ObfuscatedName("bk.d()V")
    public final void method1285() {
        this.field1213 = 0;
        this.field1217 = 0;
        this.field1215 = 0;
        this.field1216 = 0;
        this.field1208 = 0;
    }

    @ObfuscatedName("bk.c(I)I")
    public final int method1283(int arg0) {
        if (this.field1208 >= this.field1213) {
            this.field1216 = this.field1214[this.field1217++] << 15;
            if (this.field1217 >= this.field1209) {
                this.field1217 = this.field1209 - 1;
            }
            this.field1213 = (int) ((double) this.field1207[this.field1217] / 65536.0D * (double) arg0);
            if (this.field1213 > this.field1208) {
                this.field1215 = ((this.field1214[this.field1217] << 15) - this.field1216) / (this.field1213 - this.field1208);
            }
        }
        this.field1216 += this.field1215;
        this.field1208++;
        return this.field1216 - this.field1215 >> 15;
    }
}
