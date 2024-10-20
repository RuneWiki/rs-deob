package deob;

@ObfuscatedName("eo")
public class class141 extends class133 {

    @ObfuscatedName("eo.h")
    public long[] field2147 = new long[10];

    @ObfuscatedName("eo.q")
    public int field2150 = 256;

    @ObfuscatedName("eo.v")
    public int field2149 = 1;

    @ObfuscatedName("eo.n")
    public long field2152 = class115.method2082();

    @ObfuscatedName("eo.f")
    public int field2151 = 0;

    @ObfuscatedName("eo.g")
    public int field2154;

    public class141() {
        for (int var1 = 0; var1 < 10; var1++) {
            this.field2147[var1] = this.field2152;
        }
    }

    @ObfuscatedName("eo.h(I)V")
    public void method2730() {
        for (int var1 = 0; var1 < 10; var1++) {
            this.field2147[var1] = 0L;
        }
    }

    @ObfuscatedName("eo.q(III)I")
    public int method2731(int arg0, int arg1) {
        int var3 = this.field2150;
        int var4 = this.field2149;
        this.field2150 = 300;
        this.field2149 = 1;
        this.field2152 = class115.method2082();
        if (this.field2147[this.field2154] == 0L) {
            this.field2150 = var3;
            this.field2149 = var4;
        } else if (this.field2152 > this.field2147[this.field2154]) {
            this.field2150 = (int) ((long) (arg0 * 2560) / (this.field2152 - this.field2147[this.field2154]));
        }
        if (this.field2150 < 25) {
            this.field2150 = 25;
        }
        if (this.field2150 > 256) {
            this.field2150 = 256;
            this.field2149 = (int) ((long) arg0 - (this.field2152 - this.field2147[this.field2154]) / 10L);
        }
        if (this.field2149 > arg0) {
            this.field2149 = arg0;
        }
        this.field2147[this.field2154] = this.field2152;
        this.field2154 = (this.field2154 + 1) % 10;
        if (this.field2149 > 1) {
            for (int var5 = 0; var5 < 10; var5++) {
                if (this.field2147[var5] != 0L) {
                    this.field2147[var5] += (long) this.field2149;
                }
            }
        }
        if (this.field2149 < arg1) {
            this.field2149 = arg1;
        }
        class127.method2075((long) this.field2149);
        int var6 = 0;
        while (this.field2151 < 256) {
            var6++;
            this.field2151 += this.field2150;
        }
        this.field2151 &= 0xFF;
        return var6;
    }
}
