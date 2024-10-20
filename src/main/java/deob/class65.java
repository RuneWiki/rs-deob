package deob;

@ObfuscatedName("bt")
public class class65 extends class68 {

    @ObfuscatedName("bt.g")
    public long[] field1254 = new long[10];

    @ObfuscatedName("bt.m")
    public int field1244 = 256;

    @ObfuscatedName("bt.v")
    public int field1251 = 1;

    @ObfuscatedName("bt.r")
    public long field1246 = class121.method131();

    @ObfuscatedName("bt.n")
    public int field1245 = 0;

    @ObfuscatedName("bt.i")
    public int field1248;

    public class65() {
        for (int var1 = 0; var1 < 10; var1++) {
            this.field1254[var1] = this.field1246;
        }
    }

    @ObfuscatedName("bt.g(I)V")
    public void method1353() {
        for (int var1 = 0; var1 < 10; var1++) {
            this.field1254[var1] = 0L;
        }
    }

    @ObfuscatedName("bt.m(IIB)I")
    public int method1362(int arg0, int arg1) {
        int var3 = this.field1244;
        int var4 = this.field1251;
        this.field1244 = 300;
        this.field1251 = 1;
        this.field1246 = class121.method131();
        if (this.field1254[this.field1248] == 0L) {
            this.field1244 = var3;
            this.field1251 = var4;
        } else if (this.field1246 > this.field1254[this.field1248]) {
            this.field1244 = (int) ((long) (arg0 * 2560) / (this.field1246 - this.field1254[this.field1248]));
        }
        if (this.field1244 < 25) {
            this.field1244 = 25;
        }
        if (this.field1244 > 256) {
            this.field1244 = 256;
            this.field1251 = (int) ((long) arg0 - (this.field1246 - this.field1254[this.field1248]) / 10L);
        }
        if (this.field1251 > arg0) {
            this.field1251 = arg0;
        }
        this.field1254[this.field1248] = this.field1246;
        this.field1248 = (this.field1248 + 1) % 10;
        if (this.field1251 > 1) {
            for (int var5 = 0; var5 < 10; var5++) {
                if (this.field1254[var5] != 0L) {
                    this.field1254[var5] += (long) this.field1251;
                }
            }
        }
        if (this.field1251 < arg1) {
            this.field1251 = arg1;
        }
        class126.method209((long) this.field1251);
        int var6 = 0;
        while (this.field1245 < 256) {
            var6++;
            this.field1245 += this.field1244;
        }
        this.field1245 &= 0xFF;
        return var6;
    }
}
