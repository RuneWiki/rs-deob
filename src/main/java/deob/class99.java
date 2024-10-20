package deob;

@ObfuscatedName("cx")
public class class99 {

    @ObfuscatedName("cx.f")
    public int field1364 = 2;

    @ObfuscatedName("cx.h")
    public int[] field1366 = new int[2];

    @ObfuscatedName("cx.e")
    public int[] field1365 = new int[2];

    @ObfuscatedName("cx.b")
    public int field1368;

    @ObfuscatedName("cx.l")
    public int field1367;

    @ObfuscatedName("cx.w")
    public int field1363;

    @ObfuscatedName("cx.d")
    public int field1369;

    @ObfuscatedName("cx.n")
    public int field1370;

    @ObfuscatedName("cx.s")
    public int field1371;

    @ObfuscatedName("cx.g")
    public int field1372;

    @ObfuscatedName("cx.a")
    public int field1373;

    public class99() {
        this.field1366[0] = 0;
        this.field1366[1] = 65535;
        this.field1365[0] = 0;
        this.field1365[1] = 65535;
    }

    @ObfuscatedName("cx.f(Lgx;)V")
    public final void method2072(class185 arg0) {
        this.field1363 = arg0.method3323();
        this.field1368 = arg0.method3328();
        this.field1367 = arg0.method3328();
        this.method2083(arg0);
    }

    @ObfuscatedName("cx.h(Lgx;)V")
    public final void method2083(class185 arg0) {
        this.field1364 = arg0.method3323();
        this.field1366 = new int[this.field1364];
        this.field1365 = new int[this.field1364];
        for (int var2 = 0; var2 < this.field1364; var2++) {
            this.field1366[var2] = arg0.method3325();
            this.field1365[var2] = arg0.method3325();
        }
    }

    @ObfuscatedName("cx.e()V")
    public final void method2074() {
        this.field1369 = 0;
        this.field1370 = 0;
        this.field1371 = 0;
        this.field1372 = 0;
        this.field1373 = 0;
    }

    @ObfuscatedName("cx.b(I)I")
    public final int method2071(int arg0) {
        if (this.field1373 >= this.field1369) {
            this.field1372 = this.field1365[this.field1370++] << 15;
            if (this.field1370 >= this.field1364) {
                this.field1370 = this.field1364 - 1;
            }
            this.field1369 = (int) ((double) this.field1366[this.field1370] / 65536.0D * (double) arg0);
            if (this.field1369 > this.field1373) {
                this.field1371 = ((this.field1365[this.field1370] << 15) - this.field1372) / (this.field1369 - this.field1373);
            }
        }
        this.field1372 += this.field1371;
        this.field1373++;
        return this.field1372 - this.field1371 >> 15;
    }
}
