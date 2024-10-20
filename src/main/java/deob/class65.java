package deob;

@ObfuscatedName("bs")
public class class65 extends class68 {

    @ObfuscatedName("bs.c")
    public long[] field1276 = new long[10];

    @ObfuscatedName("bs.q")
    public int field1268 = 256;

    @ObfuscatedName("bs.y")
    public int field1272 = 1;

    @ObfuscatedName("bs.v")
    public long field1270 = class121.method2119();

    @ObfuscatedName("bs.g")
    public int field1267 = 0;

    @ObfuscatedName("bs.x")
    public int field1269;

    public class65() {
        for (int var1 = 0; var1 < 10; var1++) {
            this.field1276[var1] = this.field1270;
        }
    }

    @ObfuscatedName("bs.c(B)V")
    public void method1295() {
        for (int var1 = 0; var1 < 10; var1++) {
            this.field1276[var1] = 0L;
        }
    }

    @ObfuscatedName("bs.q(III)I")
    public int method1294(int arg0, int arg1) {
        int var3 = this.field1268;
        int var4 = this.field1272;
        this.field1268 = 300;
        this.field1272 = 1;
        this.field1270 = class121.method2119();
        if (this.field1276[this.field1269] == 0L) {
            this.field1268 = var3;
            this.field1272 = var4;
        } else if (this.field1270 > this.field1276[this.field1269]) {
            this.field1268 = (int) ((long) (arg0 * 2560) / (this.field1270 - this.field1276[this.field1269]));
        }
        if (this.field1268 < 25) {
            this.field1268 = 25;
        }
        if (this.field1268 > 256) {
            this.field1268 = 256;
            this.field1272 = (int) ((long) arg0 - (this.field1270 - this.field1276[this.field1269]) / 10L);
        }
        if (this.field1272 > arg0) {
            this.field1272 = arg0;
        }
        this.field1276[this.field1269] = this.field1270;
        this.field1269 = (this.field1269 + 1) % 10;
        if (this.field1272 > 1) {
            for (int var5 = 0; var5 < 10; var5++) {
                if (this.field1276[var5] != 0L) {
                    this.field1276[var5] += (long) this.field1272;
                }
            }
        }
        if (this.field1272 < arg1) {
            this.field1272 = arg1;
        }
        class126.method577((long) this.field1272);
        int var6 = 0;
        while (this.field1267 < 256) {
            var6++;
            this.field1267 += this.field1268;
        }
        this.field1267 &= 0xFF;
        return var6;
    }
}
