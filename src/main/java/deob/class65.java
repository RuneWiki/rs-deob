package deob;

@ObfuscatedName("bz")
public class class65 extends class68 {

    @ObfuscatedName("bz.a")
    public long[] field1235 = new long[10];

    @ObfuscatedName("bz.r")
    public int field1236 = 256;

    @ObfuscatedName("bz.u")
    public int field1237 = 1;

    @ObfuscatedName("bz.t")
    public long field1239 = class121.method1471();

    @ObfuscatedName("bz.k")
    public int field1238 = 0;

    @ObfuscatedName("bz.x")
    public int field1240;

    public class65() {
        for (int var1 = 0; var1 < 10; var1++) {
            this.field1235[var1] = this.field1239;
        }
    }

    @ObfuscatedName("bz.a(I)V")
    public void method1283() {
        for (int var1 = 0; var1 < 10; var1++) {
            this.field1235[var1] = 0L;
        }
    }

    @ObfuscatedName("bz.r(III)I")
    public int method1281(int arg0, int arg1) {
        int var3 = this.field1236;
        int var4 = this.field1237;
        this.field1236 = 300;
        this.field1237 = 1;
        this.field1239 = class121.method1471();
        if (this.field1235[this.field1240] == 0L) {
            this.field1236 = var3;
            this.field1237 = var4;
        } else if (this.field1239 > this.field1235[this.field1240]) {
            this.field1236 = (int) ((long) (arg0 * 2560) / (this.field1239 - this.field1235[this.field1240]));
        }
        if (this.field1236 < 25) {
            this.field1236 = 25;
        }
        if (this.field1236 > 256) {
            this.field1236 = 256;
            this.field1237 = (int) ((long) arg0 - (this.field1239 - this.field1235[this.field1240]) / 10L);
        }
        if (this.field1237 > arg0) {
            this.field1237 = arg0;
        }
        this.field1235[this.field1240] = this.field1239;
        this.field1240 = (this.field1240 + 1) % 10;
        if (this.field1237 > 1) {
            for (int var5 = 0; var5 < 10; var5++) {
                if (this.field1235[var5] != 0L) {
                    this.field1235[var5] += (long) this.field1237;
                }
            }
        }
        if (this.field1237 < arg1) {
            this.field1237 = arg1;
        }
        class127.method1598((long) this.field1237);
        int var6 = 0;
        while (this.field1238 < 256) {
            var6++;
            this.field1238 += this.field1236;
        }
        this.field1238 &= 0xFF;
        return var6;
    }
}
