package deob;

@ObfuscatedName("ep")
public class class152 extends class159 {

    @ObfuscatedName("ep.c")
    public long[] field2176 = new long[10];

    @ObfuscatedName("ep.o")
    public int field2167 = 256;

    @ObfuscatedName("ep.i")
    public int field2175 = 1;

    @ObfuscatedName("ep.u")
    public long field2168 = class176.method2679();

    @ObfuscatedName("ep.g")
    public int field2170 = 0;

    @ObfuscatedName("ep.m")
    public int field2172;

    public class152() {
        for (int var1 = 0; var1 < 10; var1++) {
            this.field2176[var1] = this.field2168;
        }
    }

    @ObfuscatedName("ep.c(I)V")
    public void method2626() {
        for (int var1 = 0; var1 < 10; var1++) {
            this.field2176[var1] = 0L;
        }
    }

    @ObfuscatedName("ep.o(III)I")
    public int method2624(int arg0, int arg1) {
        int var3 = this.field2167;
        int var4 = this.field2175;
        this.field2167 = 300;
        this.field2175 = 1;
        this.field2168 = class176.method2679();
        if (this.field2176[this.field2172] == 0L) {
            this.field2167 = var3;
            this.field2175 = var4;
        } else if (this.field2168 > this.field2176[this.field2172]) {
            this.field2167 = (int) ((long) (arg0 * 2560) / (this.field2168 - this.field2176[this.field2172]));
        }
        if (this.field2167 < 25) {
            this.field2167 = 25;
        }
        if (this.field2167 > 256) {
            this.field2167 = 256;
            this.field2175 = (int) ((long) arg0 - (this.field2168 - this.field2176[this.field2172]) / 10L);
        }
        if (this.field2175 > arg0) {
            this.field2175 = arg0;
        }
        this.field2176[this.field2172] = this.field2168;
        this.field2172 = (this.field2172 + 1) % 10;
        if (this.field2175 > 1) {
            for (int var5 = 0; var5 < 10; var5++) {
                if (this.field2176[var5] != 0L) {
                    this.field2176[var5] += (long) this.field2175;
                }
            }
        }
        if (this.field2175 < arg1) {
            this.field2175 = arg1;
        }
        Statics.method2614((long) this.field2175);
        int var6 = 0;
        while (this.field2170 < 256) {
            var6++;
            this.field2170 += this.field2167;
        }
        this.field2170 &= 0xFF;
        return var6;
    }
}
