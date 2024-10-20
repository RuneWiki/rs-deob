package deob;

@ObfuscatedName("ee")
public class class133 extends class125 {

    @ObfuscatedName("ee.n")
    public long[] field2061 = new long[10];

    @ObfuscatedName("ee.o")
    public int field2063 = 256;

    @ObfuscatedName("ee.a")
    public int field2062 = 1;

    @ObfuscatedName("ee.w")
    public long field2064 = class107.method1430();

    @ObfuscatedName("ee.m")
    public int field2067 = 0;

    @ObfuscatedName("ee.h")
    public int field2065;

    public class133() {
        for (int var1 = 0; var1 < 10; var1++) {
            this.field2061[var1] = this.field2064;
        }
    }

    @ObfuscatedName("ee.n(B)V")
    public void method2580() {
        for (int var1 = 0; var1 < 10; var1++) {
            this.field2061[var1] = 0L;
        }
    }

    @ObfuscatedName("ee.o(III)I")
    public int method2581(int arg0, int arg1) {
        int var3 = this.field2063;
        int var4 = this.field2062;
        this.field2063 = 300;
        this.field2062 = 1;
        this.field2064 = class107.method1430();
        if (this.field2061[this.field2065] == 0L) {
            this.field2063 = var3;
            this.field2062 = var4;
        } else if (this.field2064 > this.field2061[this.field2065]) {
            this.field2063 = (int) ((long) (arg0 * 2560) / (this.field2064 - this.field2061[this.field2065]));
        }
        if (this.field2063 < 25) {
            this.field2063 = 25;
        }
        if (this.field2063 > 256) {
            this.field2063 = 256;
            this.field2062 = (int) ((long) arg0 - (this.field2064 - this.field2061[this.field2065]) / 10L);
        }
        if (this.field2062 > arg0) {
            this.field2062 = arg0;
        }
        this.field2061[this.field2065] = this.field2064;
        this.field2065 = (this.field2065 + 1) % 10;
        if (this.field2062 > 1) {
            for (int var5 = 0; var5 < 10; var5++) {
                if (this.field2061[var5] != 0L) {
                    this.field2061[var5] += (long) this.field2062;
                }
            }
        }
        if (this.field2062 < arg1) {
            this.field2062 = arg1;
        }
        class119.method2156((long) this.field2062);
        int var6 = 0;
        while (this.field2067 < 256) {
            var6++;
            this.field2067 += this.field2063;
        }
        this.field2067 &= 0xFF;
        return var6;
    }
}
