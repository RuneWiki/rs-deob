package deob;

@ObfuscatedName("et")
public class class153 extends class160 {

    @ObfuscatedName("et.e")
    public long[] field2197 = new long[10];

    @ObfuscatedName("et.n")
    public int field2192 = 256;

    @ObfuscatedName("et.g")
    public int field2195 = 1;

    @ObfuscatedName("et.y")
    public long field2193 = class177.method2903();

    @ObfuscatedName("et.w")
    public int field2194 = 0;

    @ObfuscatedName("et.k")
    public int field2190;

    public class153() {
        for (int var1 = 0; var1 < 10; var1++) {
            this.field2197[var1] = this.field2193;
        }
    }

    @ObfuscatedName("et.e(I)V")
    public void method2715() {
        for (int var1 = 0; var1 < 10; var1++) {
            this.field2197[var1] = 0L;
        }
    }

    @ObfuscatedName("et.n(III)I")
    public int method2717(int arg0, int arg1) {
        int var3 = this.field2192;
        int var4 = this.field2195;
        this.field2192 = 300;
        this.field2195 = 1;
        this.field2193 = class177.method2903();
        if (this.field2197[this.field2190] == 0L) {
            this.field2192 = var3;
            this.field2195 = var4;
        } else if (this.field2193 > this.field2197[this.field2190]) {
            this.field2192 = (int) ((long) (arg0 * 2560) / (this.field2193 - this.field2197[this.field2190]));
        }
        if (this.field2192 < 25) {
            this.field2192 = 25;
        }
        if (this.field2192 > 256) {
            this.field2192 = 256;
            this.field2195 = (int) ((long) arg0 - (this.field2193 - this.field2197[this.field2190]) / 10L);
        }
        if (this.field2195 > arg0) {
            this.field2195 = arg0;
        }
        this.field2197[this.field2190] = this.field2193;
        this.field2190 = (this.field2190 + 1) % 10;
        if (this.field2195 > 1) {
            for (int var5 = 0; var5 < 10; var5++) {
                if (this.field2197[var5] != 0L) {
                    this.field2197[var5] += (long) this.field2195;
                }
            }
        }
        if (this.field2195 < arg1) {
            this.field2195 = arg1;
        }
        class183.method534((long) this.field2195);
        int var6 = 0;
        while (this.field2194 < 256) {
            var6++;
            this.field2194 += this.field2192;
        }
        this.field2194 &= 0xFF;
        return var6;
    }
}
