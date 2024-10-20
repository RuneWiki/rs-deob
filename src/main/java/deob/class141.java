package deob;

@ObfuscatedName("er")
public class class141 extends class133 {

    @ObfuscatedName("er.f")
    public long[] field2159 = new long[10];

    @ObfuscatedName("er.s")
    public int field2161 = 256;

    @ObfuscatedName("er.q")
    public int field2158 = 1;

    @ObfuscatedName("er.g")
    public long field2157 = class115.method645();

    @ObfuscatedName("er.m")
    public int field2156 = 0;

    @ObfuscatedName("er.t")
    public int field2162;

    public class141() {
        for (int var1 = 0; var1 < 10; var1++) {
            this.field2159[var1] = this.field2157;
        }
    }

    @ObfuscatedName("er.s(I)V")
    public void method2677() {
        for (int var1 = 0; var1 < 10; var1++) {
            this.field2159[var1] = 0L;
        }
    }

    @ObfuscatedName("er.q(III)I")
    public int method2680(int arg0, int arg1) {
        int var3 = this.field2161;
        int var4 = this.field2158;
        this.field2161 = 300;
        this.field2158 = 1;
        this.field2157 = class115.method645();
        if (this.field2159[this.field2162] == 0L) {
            this.field2161 = var3;
            this.field2158 = var4;
        } else if (this.field2157 > this.field2159[this.field2162]) {
            this.field2161 = (int) ((long) (arg0 * 2560) / (this.field2157 - this.field2159[this.field2162]));
        }
        if (this.field2161 < 25) {
            this.field2161 = 25;
        }
        if (this.field2161 > 256) {
            this.field2161 = 256;
            this.field2158 = (int) ((long) arg0 - (this.field2157 - this.field2159[this.field2162]) / 10L);
        }
        if (this.field2158 > arg0) {
            this.field2158 = arg0;
        }
        this.field2159[this.field2162] = this.field2157;
        this.field2162 = (this.field2162 + 1) % 10;
        if (this.field2158 > 1) {
            for (int var5 = 0; var5 < 10; var5++) {
                if (this.field2159[var5] != 0L) {
                    this.field2159[var5] += (long) this.field2158;
                }
            }
        }
        if (this.field2158 < arg1) {
            this.field2158 = arg1;
        }
        class127.method1962((long) this.field2158);
        int var6 = 0;
        while (this.field2156 < 256) {
            var6++;
            this.field2156 += this.field2161;
        }
        this.field2156 &= 0xFF;
        return var6;
    }
}
