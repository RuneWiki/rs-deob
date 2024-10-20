package deob;

@ObfuscatedName("bg")
public class class61 {

    @ObfuscatedName("bg.e")
    public int field1272 = 2;

    @ObfuscatedName("bg.l")
    public int[] field1268 = new int[2];

    @ObfuscatedName("bg.c")
    public int[] field1269 = new int[2];

    @ObfuscatedName("bg.h")
    public int field1274;

    @ObfuscatedName("bg.r")
    public int field1270;

    @ObfuscatedName("bg.a")
    public int field1271;

    @ObfuscatedName("bg.b")
    public int field1267;

    @ObfuscatedName("bg.u")
    public int field1273;

    @ObfuscatedName("bg.o")
    public int field1276;

    @ObfuscatedName("bg.p")
    public int field1275;

    @ObfuscatedName("bg.i")
    public int field1266;

    public class61() {
        this.field1268[0] = 0;
        this.field1268[1] = 65535;
        this.field1269[0] = 0;
        this.field1269[1] = 65535;
    }

    @ObfuscatedName("bg.e(Ldd;)V")
    public final void method1296(class123 arg0) {
        this.field1271 = arg0.method2464();
        this.field1274 = arg0.method2468();
        this.field1270 = arg0.method2468();
        this.method1297(arg0);
    }

    @ObfuscatedName("bg.l(Ldd;)V")
    public final void method1297(class123 arg0) {
        this.field1272 = arg0.method2464();
        this.field1268 = new int[this.field1272];
        this.field1269 = new int[this.field1272];
        for (int var2 = 0; var2 < this.field1272; var2++) {
            this.field1268[var2] = arg0.method2466();
            this.field1269[var2] = arg0.method2466();
        }
    }

    @ObfuscatedName("bg.c()V")
    public final void method1298() {
        this.field1267 = 0;
        this.field1273 = 0;
        this.field1276 = 0;
        this.field1275 = 0;
        this.field1266 = 0;
    }

    @ObfuscatedName("bg.h(I)I")
    public final int method1304(int arg0) {
        if (this.field1266 >= this.field1267) {
            this.field1275 = this.field1269[this.field1273++] << 15;
            if (this.field1273 >= this.field1272) {
                this.field1273 = this.field1272 - 1;
            }
            this.field1267 = (int) ((double) this.field1268[this.field1273] / 65536.0D * (double) arg0);
            if (this.field1267 > this.field1266) {
                this.field1276 = ((this.field1269[this.field1273] << 15) - this.field1275) / (this.field1267 - this.field1266);
            }
        }
        this.field1275 += this.field1276;
        this.field1266++;
        return this.field1275 - this.field1276 >> 15;
    }
}
