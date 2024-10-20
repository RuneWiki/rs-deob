package deob;

@ObfuscatedName("ba")
public class class65 extends class68 {

    @ObfuscatedName("ba.b")
    public long[] field1274 = new long[10];

    @ObfuscatedName("ba.c")
    public int field1270 = 256;

    @ObfuscatedName("ba.j")
    public int field1277 = 1;

    @ObfuscatedName("ba.i")
    public long field1269 = class121.method2318();

    @ObfuscatedName("ba.k")
    public int field1275 = 0;

    @ObfuscatedName("ba.q")
    public int field1271;

    public class65() {
        for (int var1 = 0; var1 < 10; var1++) {
            this.field1274[var1] = this.field1269;
        }
    }

    @ObfuscatedName("ba.b(B)V")
    public void method1321() {
        for (int var1 = 0; var1 < 10; var1++) {
            this.field1274[var1] = 0L;
        }
    }

    @ObfuscatedName("ba.c(III)I")
    public int method1322(int arg0, int arg1) {
        int var3 = this.field1270;
        int var4 = this.field1277;
        this.field1270 = 300;
        this.field1277 = 1;
        this.field1269 = class121.method2318();
        if (this.field1274[this.field1271] == 0L) {
            this.field1270 = var3;
            this.field1277 = var4;
        } else if (this.field1269 > this.field1274[this.field1271]) {
            this.field1270 = (int) ((long) (arg0 * 2560) / (this.field1269 - this.field1274[this.field1271]));
        }
        if (this.field1270 < 25) {
            this.field1270 = 25;
        }
        if (this.field1270 > 256) {
            this.field1270 = 256;
            this.field1277 = (int) ((long) arg0 - (this.field1269 - this.field1274[this.field1271]) / 10L);
        }
        if (this.field1277 > arg0) {
            this.field1277 = arg0;
        }
        this.field1274[this.field1271] = this.field1269;
        this.field1271 = (this.field1271 + 1) % 10;
        if (this.field1277 > 1) {
            for (int var5 = 0; var5 < 10; var5++) {
                if (this.field1274[var5] != 0L) {
                    this.field1274[var5] += (long) this.field1277;
                }
            }
        }
        if (this.field1277 < arg1) {
            this.field1277 = arg1;
        }
        class126.method874((long) this.field1277);
        int var6 = 0;
        while (this.field1275 < 256) {
            var6++;
            this.field1275 += this.field1270;
        }
        this.field1275 &= 0xFF;
        return var6;
    }
}
