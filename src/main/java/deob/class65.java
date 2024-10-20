package deob;

@ObfuscatedName("bc")
public class class65 extends class68 {

    @ObfuscatedName("bc.l")
    public long[] field1249 = new long[10];

    @ObfuscatedName("bc.b")
    public int field1245 = 256;

    @ObfuscatedName("bc.o")
    public int field1247 = 1;

    @ObfuscatedName("bc.w")
    public long field1254 = class121.method1435();

    @ObfuscatedName("bc.r")
    public int field1248 = 0;

    @ObfuscatedName("bc.k")
    public int field1250;

    public class65() {
        for (int var1 = 0; var1 < 10; var1++) {
            this.field1249[var1] = this.field1254;
        }
    }

    @ObfuscatedName("bc.l(B)V")
    public void method1360() {
        for (int var1 = 0; var1 < 10; var1++) {
            this.field1249[var1] = 0L;
        }
    }

    @ObfuscatedName("bc.b(III)I")
    public int method1374(int arg0, int arg1) {
        int var3 = this.field1245;
        int var4 = this.field1247;
        this.field1245 = 300;
        this.field1247 = 1;
        this.field1254 = class121.method1435();
        if (this.field1249[this.field1250] == 0L) {
            this.field1245 = var3;
            this.field1247 = var4;
        } else if (this.field1254 > this.field1249[this.field1250]) {
            this.field1245 = (int) ((long) (arg0 * 2560) / (this.field1254 - this.field1249[this.field1250]));
        }
        if (this.field1245 < 25) {
            this.field1245 = 25;
        }
        if (this.field1245 > 256) {
            this.field1245 = 256;
            this.field1247 = (int) ((long) arg0 - (this.field1254 - this.field1249[this.field1250]) / 10L);
        }
        if (this.field1247 > arg0) {
            this.field1247 = arg0;
        }
        this.field1249[this.field1250] = this.field1254;
        this.field1250 = (this.field1250 + 1) % 10;
        if (this.field1247 > 1) {
            for (int var5 = 0; var5 < 10; var5++) {
                if (this.field1249[var5] != 0L) {
                    this.field1249[var5] += (long) this.field1247;
                }
            }
        }
        if (this.field1247 < arg1) {
            this.field1247 = arg1;
        }
        class126.method46((long) this.field1247);
        int var6 = 0;
        while (this.field1248 < 256) {
            var6++;
            this.field1248 += this.field1245;
        }
        this.field1248 &= 0xFF;
        return var6;
    }
}
