package deob;

@ObfuscatedName("bf")
public class class65 extends class68 {

    @ObfuscatedName("bf.p")
    public long[] field1259 = new long[10];

    @ObfuscatedName("bf.i")
    public int field1265 = 256;

    @ObfuscatedName("bf.o")
    public int field1260 = 1;

    @ObfuscatedName("bf.n")
    public long field1261 = class121.method711();

    @ObfuscatedName("bf.l")
    public int field1262 = 0;

    @ObfuscatedName("bf.v")
    public int field1263;

    public class65() {
        for (int var1 = 0; var1 < 10; var1++) {
            this.field1259[var1] = this.field1261;
        }
    }

    @ObfuscatedName("bf.p(I)V")
    public void method1376() {
        for (int var1 = 0; var1 < 10; var1++) {
            this.field1259[var1] = 0L;
        }
    }

    @ObfuscatedName("bf.i(III)I")
    public int method1374(int arg0, int arg1) {
        int var3 = this.field1265;
        int var4 = this.field1260;
        this.field1265 = 300;
        this.field1260 = 1;
        this.field1261 = class121.method711();
        if (this.field1259[this.field1263] == 0L) {
            this.field1265 = var3;
            this.field1260 = var4;
        } else if (this.field1261 > this.field1259[this.field1263]) {
            this.field1265 = (int) ((long) (arg0 * 2560) / (this.field1261 - this.field1259[this.field1263]));
        }
        if (this.field1265 < 25) {
            this.field1265 = 25;
        }
        if (this.field1265 > 256) {
            this.field1265 = 256;
            this.field1260 = (int) ((long) arg0 - (this.field1261 - this.field1259[this.field1263]) / 10L);
        }
        if (this.field1260 > arg0) {
            this.field1260 = arg0;
        }
        this.field1259[this.field1263] = this.field1261;
        this.field1263 = (this.field1263 + 1) % 10;
        if (this.field1260 > 1) {
            for (int var5 = 0; var5 < 10; var5++) {
                if (this.field1259[var5] != 0L) {
                    this.field1259[var5] += (long) this.field1260;
                }
            }
        }
        if (this.field1260 < arg1) {
            this.field1260 = arg1;
        }
        class126.method2420((long) this.field1260);
        int var6 = 0;
        while (this.field1262 < 256) {
            var6++;
            this.field1262 += this.field1265;
        }
        this.field1262 &= 0xFF;
        return var6;
    }
}
