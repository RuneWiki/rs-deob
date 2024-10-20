package deob;

@ObfuscatedName("fw")
public class class163 extends class173 {

    @ObfuscatedName("fw.o")
    public long[] field2182 = new long[10];

    @ObfuscatedName("fw.k")
    public int field2181 = 256;

    @ObfuscatedName("fw.t")
    public int field2183 = 1;

    @ObfuscatedName("fw.d")
    public long field2184 = class197.method1005();

    @ObfuscatedName("fw.h")
    public int field2185 = 0;

    @ObfuscatedName("fw.m")
    public int field2186;

    public class163() {
        for (int var1 = 0; var1 < 10; var1++) {
            this.field2182[var1] = this.field2184;
        }
    }

    @ObfuscatedName("fw.o(S)V")
    public void method2934() {
        for (int var1 = 0; var1 < 10; var1++) {
            this.field2182[var1] = 0L;
        }
    }

    @ObfuscatedName("fw.k(III)I")
    public int method2933(int arg0, int arg1) {
        int var3 = this.field2181;
        int var4 = this.field2183;
        this.field2181 = 300;
        this.field2183 = 1;
        this.field2184 = class197.method1005();
        if (this.field2182[this.field2186] == 0L) {
            this.field2181 = var3;
            this.field2183 = var4;
        } else if (this.field2184 > this.field2182[this.field2186]) {
            this.field2181 = (int) ((long) (arg0 * 2560) / (this.field2184 - this.field2182[this.field2186]));
        }
        if (this.field2181 < 25) {
            this.field2181 = 25;
        }
        if (this.field2181 > 256) {
            this.field2181 = 256;
            this.field2183 = (int) ((long) arg0 - (this.field2184 - this.field2182[this.field2186]) / 10L);
        }
        if (this.field2183 > arg0) {
            this.field2183 = arg0;
        }
        this.field2182[this.field2186] = this.field2184;
        this.field2186 = (this.field2186 + 1) % 10;
        if (this.field2183 > 1) {
            for (int var5 = 0; var5 < 10; var5++) {
                if (this.field2182[var5] != 0L) {
                    this.field2182[var5] += (long) this.field2183;
                }
            }
        }
        if (this.field2183 < arg1) {
            this.field2183 = arg1;
        }
        class204.method12((long) this.field2183);
        int var6 = 0;
        while (this.field2185 < 256) {
            var6++;
            this.field2185 += this.field2181;
        }
        this.field2185 &= 0xFF;
        return var6;
    }
}
