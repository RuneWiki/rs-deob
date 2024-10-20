package deob;

@ObfuscatedName("bt")
public class class65 extends class68 {

    @ObfuscatedName("bt.j")
    public long[] field1259 = new long[10];

    @ObfuscatedName("bt.f")
    public int field1260 = 256;

    @ObfuscatedName("bt.o")
    public int field1261 = 1;

    @ObfuscatedName("bt.h")
    public long field1262 = class121.method2140();

    @ObfuscatedName("bt.u")
    public int field1263 = 0;

    @ObfuscatedName("bt.a")
    public int field1264;

    public class65() {
        for (int var1 = 0; var1 < 10; var1++) {
            this.field1259[var1] = this.field1262;
        }
    }

    @ObfuscatedName("bt.j(I)V")
    public void method1352() {
        for (int var1 = 0; var1 < 10; var1++) {
            this.field1259[var1] = 0L;
        }
    }

    @ObfuscatedName("bt.f(III)I")
    public int method1353(int arg0, int arg1) {
        int var3 = this.field1260;
        int var4 = this.field1261;
        this.field1260 = 300;
        this.field1261 = 1;
        this.field1262 = class121.method2140();
        if (this.field1259[this.field1264] == 0L) {
            this.field1260 = var3;
            this.field1261 = var4;
        } else if (this.field1262 > this.field1259[this.field1264]) {
            this.field1260 = (int) ((long) (arg0 * 2560) / (this.field1262 - this.field1259[this.field1264]));
        }
        if (this.field1260 < 25) {
            this.field1260 = 25;
        }
        if (this.field1260 > 256) {
            this.field1260 = 256;
            this.field1261 = (int) ((long) arg0 - (this.field1262 - this.field1259[this.field1264]) / 10L);
        }
        if (this.field1261 > arg0) {
            this.field1261 = arg0;
        }
        this.field1259[this.field1264] = this.field1262;
        this.field1264 = (this.field1264 + 1) % 10;
        if (this.field1261 > 1) {
            for (int var5 = 0; var5 < 10; var5++) {
                if (this.field1259[var5] != 0L) {
                    this.field1259[var5] += (long) this.field1261;
                }
            }
        }
        if (this.field1261 < arg1) {
            this.field1261 = arg1;
        }
        class126.method768((long) this.field1261);
        int var6 = 0;
        while (this.field1263 < 256) {
            var6++;
            this.field1263 += this.field1260;
        }
        this.field1263 &= 0xFF;
        return var6;
    }
}
