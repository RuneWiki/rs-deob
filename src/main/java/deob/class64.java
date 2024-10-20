package deob;

@ObfuscatedName("bc")
public class class64 extends class67 {

    @ObfuscatedName("bc.v")
    public long[] field1232 = new long[10];

    @ObfuscatedName("bc.f")
    public int field1233 = 256;

    @ObfuscatedName("bc.n")
    public int field1234 = 1;

    @ObfuscatedName("bc.c")
    public long field1237 = class120.method1383();

    @ObfuscatedName("bc.r")
    public int field1236 = 0;

    @ObfuscatedName("bc.k")
    public int field1235;

    public class64() {
        for (int var1 = 0; var1 < 10; var1++) {
            this.field1232[var1] = this.field1237;
        }
    }

    @ObfuscatedName("bc.v(B)V")
    public void method1373() {
        for (int var1 = 0; var1 < 10; var1++) {
            this.field1232[var1] = 0L;
        }
    }

    @ObfuscatedName("bc.f(IIB)I")
    public int method1374(int arg0, int arg1) {
        int var3 = this.field1233;
        int var4 = this.field1234;
        this.field1233 = 300;
        this.field1234 = 1;
        this.field1237 = class120.method1383();
        if (this.field1232[this.field1235] == 0L) {
            this.field1233 = var3;
            this.field1234 = var4;
        } else if (this.field1237 > this.field1232[this.field1235]) {
            this.field1233 = (int) ((long) (arg0 * 2560) / (this.field1237 - this.field1232[this.field1235]));
        }
        if (this.field1233 < 25) {
            this.field1233 = 25;
        }
        if (this.field1233 > 256) {
            this.field1233 = 256;
            this.field1234 = (int) ((long) arg0 - (this.field1237 - this.field1232[this.field1235]) / 10L);
        }
        if (this.field1234 > arg0) {
            this.field1234 = arg0;
        }
        this.field1232[this.field1235] = this.field1237;
        this.field1235 = (this.field1235 + 1) % 10;
        if (this.field1234 > 1) {
            for (int var5 = 0; var5 < 10; var5++) {
                if (this.field1232[var5] != 0L) {
                    this.field1232[var5] += (long) this.field1234;
                }
            }
        }
        if (this.field1234 < arg1) {
            this.field1234 = arg1;
        }
        class125.method2683((long) this.field1234);
        int var6 = 0;
        while (this.field1236 < 256) {
            var6++;
            this.field1236 += this.field1233;
        }
        this.field1236 &= 0xFF;
        return var6;
    }
}
