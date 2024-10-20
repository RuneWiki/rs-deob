package deob;

@ObfuscatedName("eg")
public class class142 extends class134 {

    @ObfuscatedName("eg.s")
    public long[] field2180 = new long[10];

    @ObfuscatedName("eg.j")
    public int field2175 = 256;

    @ObfuscatedName("eg.p")
    public int field2177 = 1;

    @ObfuscatedName("eg.x")
    public long field2176 = class116.method157();

    @ObfuscatedName("eg.d")
    public int field2178 = 0;

    @ObfuscatedName("eg.u")
    public int field2179;

    public class142() {
        for (int var1 = 0; var1 < 10; var1++) {
            this.field2180[var1] = this.field2176;
        }
    }

    @ObfuscatedName("eg.j(B)V")
    public void method2679() {
        for (int var1 = 0; var1 < 10; var1++) {
            this.field2180[var1] = 0L;
        }
    }

    @ObfuscatedName("eg.p(III)I")
    public int method2680(int arg0, int arg1) {
        int var3 = this.field2175;
        int var4 = this.field2177;
        this.field2175 = 300;
        this.field2177 = 1;
        this.field2176 = class116.method157();
        if (this.field2180[this.field2179] == 0L) {
            this.field2175 = var3;
            this.field2177 = var4;
        } else if (this.field2176 > this.field2180[this.field2179]) {
            this.field2175 = (int) ((long) (arg0 * 2560) / (this.field2176 - this.field2180[this.field2179]));
        }
        if (this.field2175 < 25) {
            this.field2175 = 25;
        }
        if (this.field2175 > 256) {
            this.field2175 = 256;
            this.field2177 = (int) ((long) arg0 - (this.field2176 - this.field2180[this.field2179]) / 10L);
        }
        if (this.field2177 > arg0) {
            this.field2177 = arg0;
        }
        this.field2180[this.field2179] = this.field2176;
        this.field2179 = (this.field2179 + 1) % 10;
        if (this.field2177 > 1) {
            for (int var5 = 0; var5 < 10; var5++) {
                if (this.field2180[var5] != 0L) {
                    this.field2180[var5] += (long) this.field2177;
                }
            }
        }
        if (this.field2177 < arg1) {
            this.field2177 = arg1;
        }
        class128.method2294((long) this.field2177);
        int var6 = 0;
        while (this.field2178 < 256) {
            var6++;
            this.field2178 += this.field2175;
        }
        this.field2178 &= 0xFF;
        return var6;
    }
}
