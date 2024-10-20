package deob;

@ObfuscatedName("br")
public class class66 extends class69 {

    @ObfuscatedName("br.e")
    public long[] field1280 = new long[10];

    @ObfuscatedName("br.i")
    public int field1270 = 256;

    @ObfuscatedName("br.k")
    public int field1271 = 1;

    @ObfuscatedName("br.q")
    public long field1272 = class122.method37();

    @ObfuscatedName("br.j")
    public int field1273 = 0;

    @ObfuscatedName("br.z")
    public int field1279;

    public class66() {
        for (int var1 = 0; var1 < 10; var1++) {
            this.field1280[var1] = this.field1272;
        }
    }

    @ObfuscatedName("br.e(I)V")
    public void method1402() {
        for (int var1 = 0; var1 < 10; var1++) {
            this.field1280[var1] = 0L;
        }
    }

    @ObfuscatedName("br.i(III)I")
    public int method1399(int arg0, int arg1) {
        int var3 = this.field1270;
        int var4 = this.field1271;
        this.field1270 = 300;
        this.field1271 = 1;
        this.field1272 = class122.method37();
        if (this.field1280[this.field1279] == 0L) {
            this.field1270 = var3;
            this.field1271 = var4;
        } else if (this.field1272 > this.field1280[this.field1279]) {
            this.field1270 = (int) ((long) (arg0 * 2560) / (this.field1272 - this.field1280[this.field1279]));
        }
        if (this.field1270 < 25) {
            this.field1270 = 25;
        }
        if (this.field1270 > 256) {
            this.field1270 = 256;
            this.field1271 = (int) ((long) arg0 - (this.field1272 - this.field1280[this.field1279]) / 10L);
        }
        if (this.field1271 > arg0) {
            this.field1271 = arg0;
        }
        this.field1280[this.field1279] = this.field1272;
        this.field1279 = (this.field1279 + 1) % 10;
        if (this.field1271 > 1) {
            for (int var5 = 0; var5 < 10; var5++) {
                if (this.field1280[var5] != 0L) {
                    this.field1280[var5] += (long) this.field1271;
                }
            }
        }
        if (this.field1271 < arg1) {
            this.field1271 = arg1;
        }
        class127.method2200((long) this.field1271);
        int var6 = 0;
        while (this.field1273 < 256) {
            var6++;
            this.field1273 += this.field1270;
        }
        this.field1273 &= 0xFF;
        return var6;
    }
}
