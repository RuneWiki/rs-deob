package deob;

@ObfuscatedName("eo")
public class class142 extends class134 {

    @ObfuscatedName("eo.t")
    public long[] field2196 = new long[10];

    @ObfuscatedName("eo.i")
    public int field2197 = 256;

    @ObfuscatedName("eo.g")
    public int field2198 = 1;

    @ObfuscatedName("eo.h")
    public long field2199 = class116.method2586();

    @ObfuscatedName("eo.z")
    public int field2203 = 0;

    @ObfuscatedName("eo.r")
    public int field2201;

    public class142() {
        for (int var1 = 0; var1 < 10; var1++) {
            this.field2196[var1] = this.field2199;
        }
    }

    @ObfuscatedName("eo.t(B)V")
    public void method2657() {
        for (int var1 = 0; var1 < 10; var1++) {
            this.field2196[var1] = 0L;
        }
    }

    @ObfuscatedName("eo.i(IIS)I")
    public int method2658(int arg0, int arg1) {
        int var3 = this.field2197;
        int var4 = this.field2198;
        this.field2197 = 300;
        this.field2198 = 1;
        this.field2199 = class116.method2586();
        if (this.field2196[this.field2201] == 0L) {
            this.field2197 = var3;
            this.field2198 = var4;
        } else if (this.field2199 > this.field2196[this.field2201]) {
            this.field2197 = (int) ((long) (arg0 * 2560) / (this.field2199 - this.field2196[this.field2201]));
        }
        if (this.field2197 < 25) {
            this.field2197 = 25;
        }
        if (this.field2197 > 256) {
            this.field2197 = 256;
            this.field2198 = (int) ((long) arg0 - (this.field2199 - this.field2196[this.field2201]) / 10L);
        }
        if (this.field2198 > arg0) {
            this.field2198 = arg0;
        }
        this.field2196[this.field2201] = this.field2199;
        this.field2201 = (this.field2201 + 1) % 10;
        if (this.field2198 > 1) {
            for (int var5 = 0; var5 < 10; var5++) {
                if (this.field2196[var5] != 0L) {
                    this.field2196[var5] += (long) this.field2198;
                }
            }
        }
        if (this.field2198 < arg1) {
            this.field2198 = arg1;
        }
        class128.method894((long) this.field2198);
        int var6 = 0;
        while (this.field2203 < 256) {
            var6++;
            this.field2203 += this.field2197;
        }
        this.field2203 &= 0xFF;
        return var6;
    }
}
