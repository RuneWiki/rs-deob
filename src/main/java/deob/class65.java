package deob;

@ObfuscatedName("bv")
public class class65 extends class68 {

    @ObfuscatedName("bv.p")
    public long[] field1260 = new long[10];

    @ObfuscatedName("bv.e")
    public int field1253 = 256;

    @ObfuscatedName("bv.a")
    public int field1254 = 1;

    @ObfuscatedName("bv.h")
    public long field1261 = class121.method2();

    @ObfuscatedName("bv.y")
    public int field1252 = 0;

    @ObfuscatedName("bv.j")
    public int field1256;

    public class65() {
        for (int var1 = 0; var1 < 10; var1++) {
            this.field1260[var1] = this.field1261;
        }
    }

    @ObfuscatedName("bv.p(I)V")
    public void method1368() {
        for (int var1 = 0; var1 < 10; var1++) {
            this.field1260[var1] = 0L;
        }
    }

    @ObfuscatedName("bv.e(III)I")
    public int method1376(int arg0, int arg1) {
        int var3 = this.field1253;
        int var4 = this.field1254;
        this.field1253 = 300;
        this.field1254 = 1;
        this.field1261 = class121.method2();
        if (this.field1260[this.field1256] == 0L) {
            this.field1253 = var3;
            this.field1254 = var4;
        } else if (this.field1261 > this.field1260[this.field1256]) {
            this.field1253 = (int) ((long) (arg0 * 2560) / (this.field1261 - this.field1260[this.field1256]));
        }
        if (this.field1253 < 25) {
            this.field1253 = 25;
        }
        if (this.field1253 > 256) {
            this.field1253 = 256;
            this.field1254 = (int) ((long) arg0 - (this.field1261 - this.field1260[this.field1256]) / 10L);
        }
        if (this.field1254 > arg0) {
            this.field1254 = arg0;
        }
        this.field1260[this.field1256] = this.field1261;
        this.field1256 = (this.field1256 + 1) % 10;
        if (this.field1254 > 1) {
            for (int var5 = 0; var5 < 10; var5++) {
                if (this.field1260[var5] != 0L) {
                    this.field1260[var5] += (long) this.field1254;
                }
            }
        }
        if (this.field1254 < arg1) {
            this.field1254 = arg1;
        }
        class126.method47((long) this.field1254);
        int var6 = 0;
        while (this.field1252 < 256) {
            var6++;
            this.field1252 += this.field1253;
        }
        this.field1252 &= 0xFF;
        return var6;
    }
}
