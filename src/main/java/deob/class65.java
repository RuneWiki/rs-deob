package deob;

@ObfuscatedName("bl")
public class class65 extends class68 {

    @ObfuscatedName("bl.i")
    public long[] field1260 = new long[10];

    @ObfuscatedName("bl.v")
    public int field1258 = 256;

    @ObfuscatedName("bl.m")
    public int field1262 = 1;

    @ObfuscatedName("bl.j")
    public long field1259 = class121.method142();

    @ObfuscatedName("bl.o")
    public int field1261 = 0;

    @ObfuscatedName("bl.l")
    public int field1257;

    public class65() {
        for (int var1 = 0; var1 < 10; var1++) {
            this.field1260[var1] = this.field1259;
        }
    }

    @ObfuscatedName("bl.i(B)V")
    public void method1372() {
        for (int var1 = 0; var1 < 10; var1++) {
            this.field1260[var1] = 0L;
        }
    }

    @ObfuscatedName("bl.v(III)I")
    public int method1373(int arg0, int arg1) {
        int var3 = this.field1258;
        int var4 = this.field1262;
        this.field1258 = 300;
        this.field1262 = 1;
        this.field1259 = class121.method142();
        if (this.field1260[this.field1257] == 0L) {
            this.field1258 = var3;
            this.field1262 = var4;
        } else if (this.field1259 > this.field1260[this.field1257]) {
            this.field1258 = (int) ((long) (arg0 * 2560) / (this.field1259 - this.field1260[this.field1257]));
        }
        if (this.field1258 < 25) {
            this.field1258 = 25;
        }
        if (this.field1258 > 256) {
            this.field1258 = 256;
            this.field1262 = (int) ((long) arg0 - (this.field1259 - this.field1260[this.field1257]) / 10L);
        }
        if (this.field1262 > arg0) {
            this.field1262 = arg0;
        }
        this.field1260[this.field1257] = this.field1259;
        this.field1257 = (this.field1257 + 1) % 10;
        if (this.field1262 > 1) {
            for (int var5 = 0; var5 < 10; var5++) {
                if (this.field1260[var5] != 0L) {
                    this.field1260[var5] += (long) this.field1262;
                }
            }
        }
        if (this.field1262 < arg1) {
            this.field1262 = arg1;
        }
        class126.method1440((long) this.field1262);
        int var6 = 0;
        while (this.field1261 < 256) {
            var6++;
            this.field1261 += this.field1258;
        }
        this.field1261 &= 0xFF;
        return var6;
    }
}
