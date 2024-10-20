package deob;

@ObfuscatedName("fv")
public class class163 extends class173 {

    @ObfuscatedName("fv.g")
    public long[] field2156 = new long[10];

    @ObfuscatedName("fv.e")
    public int field2155 = 256;

    @ObfuscatedName("fv.b")
    public int field2151 = 1;

    @ObfuscatedName("fv.z")
    public long field2149 = class197.method4873();

    @ObfuscatedName("fv.n")
    public int field2152 = 0;

    @ObfuscatedName("fv.l")
    public int field2154;

    public class163() {
        for (int var1 = 0; var1 < 10; var1++) {
            this.field2156[var1] = this.field2149;
        }
    }

    @ObfuscatedName("fv.g(I)V")
    public void method3036() {
        for (int var1 = 0; var1 < 10; var1++) {
            this.field2156[var1] = 0L;
        }
    }

    @ObfuscatedName("fv.e(III)I")
    public int method3037(int arg0, int arg1) {
        int var3 = this.field2155;
        int var4 = this.field2151;
        this.field2155 = 300;
        this.field2151 = 1;
        this.field2149 = class197.method4873();
        if (this.field2156[this.field2154] == 0L) {
            this.field2155 = var3;
            this.field2151 = var4;
        } else if (this.field2149 > this.field2156[this.field2154]) {
            this.field2155 = (int) ((long) (arg0 * 2560) / (this.field2149 - this.field2156[this.field2154]));
        }
        if (this.field2155 < 25) {
            this.field2155 = 25;
        }
        if (this.field2155 > 256) {
            this.field2155 = 256;
            this.field2151 = (int) ((long) arg0 - (this.field2149 - this.field2156[this.field2154]) / 10L);
        }
        if (this.field2151 > arg0) {
            this.field2151 = arg0;
        }
        this.field2156[this.field2154] = this.field2149;
        this.field2154 = (this.field2154 + 1) % 10;
        if (this.field2151 > 1) {
            for (int var5 = 0; var5 < 10; var5++) {
                if (this.field2156[var5] != 0L) {
                    this.field2156[var5] += (long) this.field2151;
                }
            }
        }
        if (this.field2151 < arg1) {
            this.field2151 = arg1;
        }
        class204.method48((long) this.field2151);
        int var6 = 0;
        while (this.field2152 < 256) {
            var6++;
            this.field2152 += this.field2155;
        }
        this.field2152 &= 0xFF;
        return var6;
    }
}
