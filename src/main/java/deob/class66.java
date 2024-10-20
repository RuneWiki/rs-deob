package deob;

@ObfuscatedName("bb")
public class class66 extends class69 {

    @ObfuscatedName("bb.i")
    public long[] field1265 = new long[10];

    @ObfuscatedName("bb.b")
    public int field1259 = 256;

    @ObfuscatedName("bb.r")
    public int field1260 = 1;

    @ObfuscatedName("bb.l")
    public long field1261 = class122.method195();

    @ObfuscatedName("bb.s")
    public int field1267 = 0;

    @ObfuscatedName("bb.d")
    public int field1263;

    public class66() {
        for (int var1 = 0; var1 < 10; var1++) {
            this.field1265[var1] = this.field1261;
        }
    }

    @ObfuscatedName("bb.i(B)V")
    public void method1336() {
        for (int var1 = 0; var1 < 10; var1++) {
            this.field1265[var1] = 0L;
        }
    }

    @ObfuscatedName("bb.b(IIB)I")
    public int method1338(int arg0, int arg1) {
        int var3 = this.field1259;
        int var4 = this.field1260;
        this.field1259 = 300;
        this.field1260 = 1;
        this.field1261 = class122.method195();
        if (this.field1265[this.field1263] == 0L) {
            this.field1259 = var3;
            this.field1260 = var4;
        } else if (this.field1261 > this.field1265[this.field1263]) {
            this.field1259 = (int) ((long) (arg0 * 2560) / (this.field1261 - this.field1265[this.field1263]));
        }
        if (this.field1259 < 25) {
            this.field1259 = 25;
        }
        if (this.field1259 > 256) {
            this.field1259 = 256;
            this.field1260 = (int) ((long) arg0 - (this.field1261 - this.field1265[this.field1263]) / 10L);
        }
        if (this.field1260 > arg0) {
            this.field1260 = arg0;
        }
        this.field1265[this.field1263] = this.field1261;
        this.field1263 = (this.field1263 + 1) % 10;
        if (this.field1260 > 1) {
            for (int var5 = 0; var5 < 10; var5++) {
                if (this.field1265[var5] != 0L) {
                    this.field1265[var5] += (long) this.field1260;
                }
            }
        }
        if (this.field1260 < arg1) {
            this.field1260 = arg1;
        }
        class127.method1642((long) this.field1260);
        int var6 = 0;
        while (this.field1267 < 256) {
            var6++;
            this.field1267 += this.field1259;
        }
        this.field1267 &= 0xFF;
        return var6;
    }
}
