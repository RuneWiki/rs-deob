package deob;

@ObfuscatedName("bg")
public class class65 extends class68 {

    @ObfuscatedName("bg.i")
    public long[] field1262 = new long[10];

    @ObfuscatedName("bg.p")
    public int field1256 = 256;

    @ObfuscatedName("bg.a")
    public int field1257 = 1;

    @ObfuscatedName("bg.l")
    public long field1258 = class121.method2124();

    @ObfuscatedName("bg.q")
    public int field1259 = 0;

    @ObfuscatedName("bg.b")
    public int field1260;

    public class65() {
        for (int var1 = 0; var1 < 10; var1++) {
            this.field1262[var1] = this.field1258;
        }
    }

    @ObfuscatedName("bg.i(I)V")
    public void method1298() {
        for (int var1 = 0; var1 < 10; var1++) {
            this.field1262[var1] = 0L;
        }
    }

    @ObfuscatedName("bg.p(III)I")
    public int method1297(int arg0, int arg1) {
        int var3 = this.field1256;
        int var4 = this.field1257;
        this.field1256 = 300;
        this.field1257 = 1;
        this.field1258 = class121.method2124();
        if (this.field1262[this.field1260] == 0L) {
            this.field1256 = var3;
            this.field1257 = var4;
        } else if (this.field1258 > this.field1262[this.field1260]) {
            this.field1256 = (int) ((long) (arg0 * 2560) / (this.field1258 - this.field1262[this.field1260]));
        }
        if (this.field1256 < 25) {
            this.field1256 = 25;
        }
        if (this.field1256 > 256) {
            this.field1256 = 256;
            this.field1257 = (int) ((long) arg0 - (this.field1258 - this.field1262[this.field1260]) / 10L);
        }
        if (this.field1257 > arg0) {
            this.field1257 = arg0;
        }
        this.field1262[this.field1260] = this.field1258;
        this.field1260 = (this.field1260 + 1) % 10;
        if (this.field1257 > 1) {
            for (int var5 = 0; var5 < 10; var5++) {
                if (this.field1262[var5] != 0L) {
                    this.field1262[var5] += (long) this.field1257;
                }
            }
        }
        if (this.field1257 < arg1) {
            this.field1257 = arg1;
        }
        class126.method1489((long) this.field1257);
        int var6 = 0;
        while (this.field1259 < 256) {
            var6++;
            this.field1259 += this.field1256;
        }
        this.field1259 &= 0xFF;
        return var6;
    }
}
