package deob;

@ObfuscatedName("il")
public class class224 extends class232 {

    @ObfuscatedName("il.ap")
    public long[] field2405 = new long[10];

    @ObfuscatedName("il.aw")
    public int field2408 = 256;

    @ObfuscatedName("il.ak")
    public int field2404 = 1;

    @ObfuscatedName("il.aj")
    public long field2406 = class330.method2257();

    @ObfuscatedName("il.ai")
    public int field2407 = 0;

    @ObfuscatedName("il.ay")
    public int field2410;

    public class224() {
        for (int var1 = 0; var1 < 10; var1++) {
            this.field2405[var1] = this.field2406;
        }
    }

    @ObfuscatedName("il.ap(I)V")
    public void method4141() {
        for (int var1 = 0; var1 < 10; var1++) {
            this.field2405[var1] = 0L;
        }
    }

    @ObfuscatedName("il.aw(IIB)I")
    public int method4142(int arg0, int arg1) {
        int var3 = this.field2408;
        int var4 = this.field2404;
        this.field2408 = 300;
        this.field2404 = 1;
        this.field2406 = class330.method2257();
        if (this.field2405[this.field2410] == 0L) {
            this.field2408 = var3;
            this.field2404 = var4;
        } else if (this.field2406 > this.field2405[this.field2410]) {
            this.field2408 = (int) ((long) (arg0 * 2560) / (this.field2406 - this.field2405[this.field2410]));
        }
        if (this.field2408 < 25) {
            this.field2408 = 25;
        }
        if (this.field2408 > 256) {
            this.field2408 = 256;
            this.field2404 = (int) ((long) arg0 - (this.field2406 - this.field2405[this.field2410]) / 10L);
        }
        if (this.field2404 > arg0) {
            this.field2404 = arg0;
        }
        this.field2405[this.field2410] = this.field2406;
        this.field2410 = (this.field2410 + 1) % 10;
        if (this.field2404 > 1) {
            for (int var5 = 0; var5 < 10; var5++) {
                if (this.field2405[var5] != 0L) {
                    this.field2405[var5] += (long) this.field2404;
                }
            }
        }
        if (this.field2404 < arg1) {
            this.field2404 = arg1;
        }
        class331.method1920((long) this.field2404);
        int var6 = 0;
        while (this.field2407 < 256) {
            var6++;
            this.field2407 += this.field2408;
        }
        this.field2407 &= 0xFF;
        return var6;
    }
}
