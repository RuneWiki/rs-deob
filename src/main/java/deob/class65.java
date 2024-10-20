package deob;

@ObfuscatedName("bt")
public class class65 extends class68 {

    @ObfuscatedName("bt.b")
    public long[] field1251 = new long[10];

    @ObfuscatedName("bt.e")
    public int field1255 = 256;

    @ObfuscatedName("bt.g")
    public int field1256 = 1;

    @ObfuscatedName("bt.o")
    public long field1245 = class121.method2221();

    @ObfuscatedName("bt.a")
    public int field1246 = 0;

    @ObfuscatedName("bt.h")
    public int field1247;

    public class65() {
        for (int var1 = 0; var1 < 10; var1++) {
            this.field1251[var1] = this.field1245;
        }
    }

    @ObfuscatedName("bt.b(I)V")
    public void method1324() {
        for (int var1 = 0; var1 < 10; var1++) {
            this.field1251[var1] = 0L;
        }
    }

    @ObfuscatedName("bt.e(III)I")
    public int method1330(int arg0, int arg1) {
        int var3 = this.field1255;
        int var4 = this.field1256;
        this.field1255 = 300;
        this.field1256 = 1;
        this.field1245 = class121.method2221();
        if (this.field1251[this.field1247] == 0L) {
            this.field1255 = var3;
            this.field1256 = var4;
        } else if (this.field1245 > this.field1251[this.field1247]) {
            this.field1255 = (int) ((long) (arg0 * 2560) / (this.field1245 - this.field1251[this.field1247]));
        }
        if (this.field1255 < 25) {
            this.field1255 = 25;
        }
        if (this.field1255 > 256) {
            this.field1255 = 256;
            this.field1256 = (int) ((long) arg0 - (this.field1245 - this.field1251[this.field1247]) / 10L);
        }
        if (this.field1256 > arg0) {
            this.field1256 = arg0;
        }
        this.field1251[this.field1247] = this.field1245;
        this.field1247 = (this.field1247 + 1) % 10;
        if (this.field1256 > 1) {
            for (int var5 = 0; var5 < 10; var5++) {
                if (this.field1251[var5] != 0L) {
                    this.field1251[var5] += (long) this.field1256;
                }
            }
        }
        if (this.field1256 < arg1) {
            this.field1256 = arg1;
        }
        class127.method686((long) this.field1256);
        int var6 = 0;
        while (this.field1246 < 256) {
            var6++;
            this.field1246 += this.field1255;
        }
        this.field1246 &= 0xFF;
        return var6;
    }
}
