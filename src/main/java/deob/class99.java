package deob;

@ObfuscatedName("cx")
public class class99 {

    @ObfuscatedName("cx.y")
    public int field1375;

    @ObfuscatedName("cx.c")
    public int field1374 = 2;

    @ObfuscatedName("cx.n")
    public int[] field1372 = new int[2];

    @ObfuscatedName("cx.u")
    public int[] field1373 = new int[2];

    @ObfuscatedName("cx.i")
    public int field1377;

    @ObfuscatedName("cx.r")
    public int field1381;

    @ObfuscatedName("cx.j")
    public int field1376;

    @ObfuscatedName("cx.p")
    public int field1380;

    @ObfuscatedName("cx.e")
    public int field1378;

    @ObfuscatedName("cx.s")
    public int field1379;

    @ObfuscatedName("cx.v")
    public int field1371;

    public class99() {
        this.field1372[0] = 0;
        this.field1372[1] = 65535;
        this.field1373[0] = 0;
        this.field1373[1] = 65535;
    }

    @ObfuscatedName("cx.y(Lge;)V")
    public final void method2071(class185 arg0) {
        this.field1376 = arg0.method3299();
        this.field1377 = arg0.method3374();
        this.field1381 = arg0.method3374();
        this.method2074(arg0);
    }

    @ObfuscatedName("cx.c(Lge;)V")
    public final void method2074(class185 arg0) {
        this.field1374 = arg0.method3299();
        this.field1372 = new int[this.field1374];
        this.field1373 = new int[this.field1374];
        for (int var2 = 0; var2 < this.field1374; var2++) {
            this.field1372[var2] = arg0.method3280();
            this.field1373[var2] = arg0.method3280();
        }
    }

    @ObfuscatedName("cx.n()V")
    public final void method2078() {
        this.field1380 = 0;
        this.field1378 = 0;
        this.field1379 = 0;
        this.field1371 = 0;
        this.field1375 = 0;
    }

    @ObfuscatedName("cx.u(I)I")
    public final int method2070(int arg0) {
        if (this.field1375 >= this.field1380) {
            this.field1371 = this.field1373[this.field1378++] << 15;
            if (this.field1378 >= this.field1374) {
                this.field1378 = this.field1374 - 1;
            }
            this.field1380 = (int) ((double) this.field1372[this.field1378] / 65536.0D * (double) arg0);
            if (this.field1380 > this.field1375) {
                this.field1379 = ((this.field1373[this.field1378] << 15) - this.field1371) / (this.field1380 - this.field1375);
            }
        }
        this.field1371 += this.field1379;
        this.field1375++;
        return this.field1371 - this.field1379 >> 15;
    }
}
