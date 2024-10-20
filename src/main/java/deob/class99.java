package deob;

@ObfuscatedName("cv")
public class class99 {

    @ObfuscatedName("cv.v")
    public int field1369 = 2;

    @ObfuscatedName("cv.s")
    public int[] field1367 = new int[2];

    @ObfuscatedName("cv.o")
    public int[] field1366 = new int[2];

    @ObfuscatedName("cv.k")
    public int field1368;

    @ObfuscatedName("cv.u")
    public int field1370;

    @ObfuscatedName("cv.i")
    public int field1371;

    @ObfuscatedName("cv.t")
    public int field1372;

    @ObfuscatedName("cv.p")
    public int field1374;

    @ObfuscatedName("cv.l")
    public int field1373;

    @ObfuscatedName("cv.b")
    public int field1375;

    @ObfuscatedName("cv.c")
    public int field1376;

    public class99() {
        this.field1367[0] = 0;
        this.field1367[1] = 65535;
        this.field1366[0] = 0;
        this.field1366[1] = 65535;
    }

    @ObfuscatedName("cv.v(Lgx;)V")
    public final void method2074(class185 arg0) {
        this.field1371 = arg0.method3274();
        this.field1368 = arg0.method3279();
        this.field1370 = arg0.method3279();
        this.method2075(arg0);
    }

    @ObfuscatedName("cv.s(Lgx;)V")
    public final void method2075(class185 arg0) {
        this.field1369 = arg0.method3274();
        this.field1367 = new int[this.field1369];
        this.field1366 = new int[this.field1369];
        for (int var2 = 0; var2 < this.field1369; var2++) {
            this.field1367[var2] = arg0.method3276();
            this.field1366[var2] = arg0.method3276();
        }
    }

    @ObfuscatedName("cv.o()V")
    public final void method2076() {
        this.field1372 = 0;
        this.field1374 = 0;
        this.field1373 = 0;
        this.field1375 = 0;
        this.field1376 = 0;
    }

    @ObfuscatedName("cv.k(I)I")
    public final int method2081(int arg0) {
        if (this.field1376 >= this.field1372) {
            this.field1375 = this.field1366[this.field1374++] << 15;
            if (this.field1374 >= this.field1369) {
                this.field1374 = this.field1369 - 1;
            }
            this.field1372 = (int) ((double) this.field1367[this.field1374] / 65536.0D * (double) arg0);
            if (this.field1372 > this.field1376) {
                this.field1373 = ((this.field1366[this.field1374] << 15) - this.field1375) / (this.field1372 - this.field1376);
            }
        }
        this.field1375 += this.field1373;
        this.field1376++;
        return this.field1375 - this.field1373 >> 15;
    }
}
