package deob;

@ObfuscatedName("bm")
public class class64 extends class67 {

    @ObfuscatedName("bm.z")
    public long[] field1253 = new long[10];

    @ObfuscatedName("bm.h")
    public int field1258 = 256;

    @ObfuscatedName("bm.c")
    public int field1254 = 1;

    @ObfuscatedName("bm.p")
    public long field1255 = class120.method228();

    @ObfuscatedName("bm.i")
    public int field1256 = 0;

    @ObfuscatedName("bm.v")
    public int field1262;

    public class64() {
        for (int var1 = 0; var1 < 10; var1++) {
            this.field1253[var1] = this.field1255;
        }
    }

    @ObfuscatedName("bm.z(B)V")
    public void method1327() {
        for (int var1 = 0; var1 < 10; var1++) {
            this.field1253[var1] = 0L;
        }
    }

    @ObfuscatedName("bm.h(III)I")
    public int method1331(int arg0, int arg1) {
        int var3 = this.field1258;
        int var4 = this.field1254;
        this.field1258 = 300;
        this.field1254 = 1;
        this.field1255 = class120.method228();
        if (this.field1253[this.field1262] == 0L) {
            this.field1258 = var3;
            this.field1254 = var4;
        } else if (this.field1255 > this.field1253[this.field1262]) {
            this.field1258 = (int) ((long) (arg0 * 2560) / (this.field1255 - this.field1253[this.field1262]));
        }
        if (this.field1258 < 25) {
            this.field1258 = 25;
        }
        if (this.field1258 > 256) {
            this.field1258 = 256;
            this.field1254 = (int) ((long) arg0 - (this.field1255 - this.field1253[this.field1262]) / 10L);
        }
        if (this.field1254 > arg0) {
            this.field1254 = arg0;
        }
        this.field1253[this.field1262] = this.field1255;
        this.field1262 = (this.field1262 + 1) % 10;
        if (this.field1254 > 1) {
            for (int var5 = 0; var5 < 10; var5++) {
                if (this.field1253[var5] != 0L) {
                    this.field1253[var5] += (long) this.field1254;
                }
            }
        }
        if (this.field1254 < arg1) {
            this.field1254 = arg1;
        }
        class125.method2379((long) this.field1254);
        int var6 = 0;
        while (this.field1256 < 256) {
            var6++;
            this.field1256 += this.field1258;
        }
        this.field1256 &= 0xFF;
        return var6;
    }
}
