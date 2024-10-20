package deob;

@ObfuscatedName("bd")
public class class65 extends class68 {

    @ObfuscatedName("bd.f")
    public long[] field1240 = new long[10];

    @ObfuscatedName("bd.t")
    public int field1237 = 256;

    @ObfuscatedName("bd.n")
    public int field1238 = 1;

    @ObfuscatedName("bd.e")
    public long field1242 = class121.method133();

    @ObfuscatedName("bd.l")
    public int field1243 = 0;

    @ObfuscatedName("bd.d")
    public int field1241;

    public class65() {
        for (int var1 = 0; var1 < 10; var1++) {
            this.field1240[var1] = this.field1242;
        }
    }

    @ObfuscatedName("bd.f(I)V")
    public void method1369() {
        for (int var1 = 0; var1 < 10; var1++) {
            this.field1240[var1] = 0L;
        }
    }

    @ObfuscatedName("bd.t(III)I")
    public int method1372(int arg0, int arg1) {
        int var3 = this.field1237;
        int var4 = this.field1238;
        this.field1237 = 300;
        this.field1238 = 1;
        this.field1242 = class121.method133();
        if (this.field1240[this.field1241] == 0L) {
            this.field1237 = var3;
            this.field1238 = var4;
        } else if (this.field1242 > this.field1240[this.field1241]) {
            this.field1237 = (int) ((long) (arg0 * 2560) / (this.field1242 - this.field1240[this.field1241]));
        }
        if (this.field1237 < 25) {
            this.field1237 = 25;
        }
        if (this.field1237 > 256) {
            this.field1237 = 256;
            this.field1238 = (int) ((long) arg0 - (this.field1242 - this.field1240[this.field1241]) / 10L);
        }
        if (this.field1238 > arg0) {
            this.field1238 = arg0;
        }
        this.field1240[this.field1241] = this.field1242;
        this.field1241 = (this.field1241 + 1) % 10;
        if (this.field1238 > 1) {
            for (int var5 = 0; var5 < 10; var5++) {
                if (this.field1240[var5] != 0L) {
                    this.field1240[var5] += (long) this.field1238;
                }
            }
        }
        if (this.field1238 < arg1) {
            this.field1238 = arg1;
        }
        class126.method815((long) this.field1238);
        int var6 = 0;
        while (this.field1243 < 256) {
            var6++;
            this.field1243 += this.field1237;
        }
        this.field1243 &= 0xFF;
        return var6;
    }
}
