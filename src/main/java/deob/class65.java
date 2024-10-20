package deob;

@ObfuscatedName("bs")
public class class65 extends class68 {

    @ObfuscatedName("bs.a")
    public long[] field1270 = new long[10];

    @ObfuscatedName("bs.x")
    public int field1262 = 256;

    @ObfuscatedName("bs.e")
    public int field1263 = 1;

    @ObfuscatedName("bs.r")
    public long field1269 = class121.method245();

    @ObfuscatedName("bs.p")
    public int field1265 = 0;

    @ObfuscatedName("bs.n")
    public int field1266;

    public class65() {
        for (int var1 = 0; var1 < 10; var1++) {
            this.field1270[var1] = this.field1269;
        }
    }

    @ObfuscatedName("bs.a(B)V")
    public void method1327() {
        for (int var1 = 0; var1 < 10; var1++) {
            this.field1270[var1] = 0L;
        }
    }

    @ObfuscatedName("bs.x(III)I")
    public int method1328(int arg0, int arg1) {
        int var3 = this.field1262;
        int var4 = this.field1263;
        this.field1262 = 300;
        this.field1263 = 1;
        this.field1269 = class121.method245();
        if (this.field1270[this.field1266] == 0L) {
            this.field1262 = var3;
            this.field1263 = var4;
        } else if (this.field1269 > this.field1270[this.field1266]) {
            this.field1262 = (int) ((long) (arg0 * 2560) / (this.field1269 - this.field1270[this.field1266]));
        }
        if (this.field1262 < 25) {
            this.field1262 = 25;
        }
        if (this.field1262 > 256) {
            this.field1262 = 256;
            this.field1263 = (int) ((long) arg0 - (this.field1269 - this.field1270[this.field1266]) / 10L);
        }
        if (this.field1263 > arg0) {
            this.field1263 = arg0;
        }
        this.field1270[this.field1266] = this.field1269;
        this.field1266 = (this.field1266 + 1) % 10;
        if (this.field1263 > 1) {
            for (int var5 = 0; var5 < 10; var5++) {
                if (this.field1270[var5] != 0L) {
                    this.field1270[var5] += (long) this.field1263;
                }
            }
        }
        if (this.field1263 < arg1) {
            this.field1263 = arg1;
        }
        class126.method164((long) this.field1263);
        int var6 = 0;
        while (this.field1265 < 256) {
            var6++;
            this.field1265 += this.field1262;
        }
        this.field1265 &= 0xFF;
        return var6;
    }
}
