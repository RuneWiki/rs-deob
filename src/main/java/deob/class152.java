package deob;

@ObfuscatedName("ef")
public class class152 extends class159 {

    @ObfuscatedName("ef.i")
    public long[] field2194 = new long[10];

    @ObfuscatedName("ef.h")
    public int field2193 = 256;

    @ObfuscatedName("ef.u")
    public int field2192 = 1;

    @ObfuscatedName("ef.q")
    public long field2195 = class176.method3821();

    @ObfuscatedName("ef.g")
    public int field2191 = 0;

    @ObfuscatedName("ef.v")
    public int field2190;

    public class152() {
        for (int var1 = 0; var1 < 10; var1++) {
            this.field2194[var1] = this.field2195;
        }
    }

    @ObfuscatedName("ef.i(B)V")
    public void method2701() {
        for (int var1 = 0; var1 < 10; var1++) {
            this.field2194[var1] = 0L;
        }
    }

    @ObfuscatedName("ef.h(III)I")
    public int method2700(int arg0, int arg1) {
        int var3 = this.field2193;
        int var4 = this.field2192;
        this.field2193 = 300;
        this.field2192 = 1;
        this.field2195 = class176.method3821();
        if (this.field2194[this.field2190] == 0L) {
            this.field2193 = var3;
            this.field2192 = var4;
        } else if (this.field2195 > this.field2194[this.field2190]) {
            this.field2193 = (int) ((long) (arg0 * 2560) / (this.field2195 - this.field2194[this.field2190]));
        }
        if (this.field2193 < 25) {
            this.field2193 = 25;
        }
        if (this.field2193 > 256) {
            this.field2193 = 256;
            this.field2192 = (int) ((long) arg0 - (this.field2195 - this.field2194[this.field2190]) / 10L);
        }
        if (this.field2192 > arg0) {
            this.field2192 = arg0;
        }
        this.field2194[this.field2190] = this.field2195;
        this.field2190 = (this.field2190 + 1) % 10;
        if (this.field2192 > 1) {
            for (int var5 = 0; var5 < 10; var5++) {
                if (this.field2194[var5] != 0L) {
                    this.field2194[var5] += (long) this.field2192;
                }
            }
        }
        if (this.field2192 < arg1) {
            this.field2192 = arg1;
        }
        class182.method138((long) this.field2192);
        int var6 = 0;
        while (this.field2191 < 256) {
            var6++;
            this.field2191 += this.field2193;
        }
        this.field2191 &= 0xFF;
        return var6;
    }
}
