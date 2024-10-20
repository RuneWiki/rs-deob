package deob;

@ObfuscatedName("bq")
public class class65 extends class68 {

    @ObfuscatedName("bq.t")
    public long[] field1291 = new long[10];

    @ObfuscatedName("bq.l")
    public int field1287 = 256;

    @ObfuscatedName("bq.c")
    public int field1289 = 1;

    @ObfuscatedName("bq.d")
    public long field1290 = class121.method2693();

    @ObfuscatedName("bq.b")
    public int field1292 = 0;

    @ObfuscatedName("bq.i")
    public int field1288;

    public class65() {
        for (int var1 = 0; var1 < 10; var1++) {
            this.field1291[var1] = this.field1290;
        }
    }

    @ObfuscatedName("bq.t(I)V")
    public void method1366() {
        for (int var1 = 0; var1 < 10; var1++) {
            this.field1291[var1] = 0L;
        }
    }

    @ObfuscatedName("bq.l(III)I")
    public int method1361(int arg0, int arg1) {
        int var3 = this.field1287;
        int var4 = this.field1289;
        this.field1287 = 300;
        this.field1289 = 1;
        this.field1290 = class121.method2693();
        if (this.field1291[this.field1288] == 0L) {
            this.field1287 = var3;
            this.field1289 = var4;
        } else if (this.field1290 > this.field1291[this.field1288]) {
            this.field1287 = (int) ((long) (arg0 * 2560) / (this.field1290 - this.field1291[this.field1288]));
        }
        if (this.field1287 < 25) {
            this.field1287 = 25;
        }
        if (this.field1287 > 256) {
            this.field1287 = 256;
            this.field1289 = (int) ((long) arg0 - (this.field1290 - this.field1291[this.field1288]) / 10L);
        }
        if (this.field1289 > arg0) {
            this.field1289 = arg0;
        }
        this.field1291[this.field1288] = this.field1290;
        this.field1288 = (this.field1288 + 1) % 10;
        if (this.field1289 > 1) {
            for (int var5 = 0; var5 < 10; var5++) {
                if (this.field1291[var5] != 0L) {
                    this.field1291[var5] += (long) this.field1289;
                }
            }
        }
        if (this.field1289 < arg1) {
            this.field1289 = arg1;
        }
        class126.method3086((long) this.field1289);
        int var6 = 0;
        while (this.field1292 < 256) {
            var6++;
            this.field1292 += this.field1287;
        }
        this.field1292 &= 0xFF;
        return var6;
    }
}
