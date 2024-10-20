package deob;

@ObfuscatedName("eq")
public class class152 extends class159 {

    @ObfuscatedName("eq.w")
    public long[] field2210 = new long[10];

    @ObfuscatedName("eq.s")
    public int field2205 = 256;

    @ObfuscatedName("eq.q")
    public int field2206 = 1;

    @ObfuscatedName("eq.o")
    public long field2209 = class176.method3200();

    @ObfuscatedName("eq.g")
    public int field2208 = 0;

    @ObfuscatedName("eq.v")
    public int field2207;

    public class152() {
        for (int var1 = 0; var1 < 10; var1++) {
            this.field2210[var1] = this.field2209;
        }
    }

    @ObfuscatedName("eq.w(B)V")
    public void method2722() {
        for (int var1 = 0; var1 < 10; var1++) {
            this.field2210[var1] = 0L;
        }
    }

    @ObfuscatedName("eq.s(III)I")
    public int method2723(int arg0, int arg1) {
        int var3 = this.field2205;
        int var4 = this.field2206;
        this.field2205 = 300;
        this.field2206 = 1;
        this.field2209 = class176.method3200();
        if (this.field2210[this.field2207] == 0L) {
            this.field2205 = var3;
            this.field2206 = var4;
        } else if (this.field2209 > this.field2210[this.field2207]) {
            this.field2205 = (int) ((long) (arg0 * 2560) / (this.field2209 - this.field2210[this.field2207]));
        }
        if (this.field2205 < 25) {
            this.field2205 = 25;
        }
        if (this.field2205 > 256) {
            this.field2205 = 256;
            this.field2206 = (int) ((long) arg0 - (this.field2209 - this.field2210[this.field2207]) / 10L);
        }
        if (this.field2206 > arg0) {
            this.field2206 = arg0;
        }
        this.field2210[this.field2207] = this.field2209;
        this.field2207 = (this.field2207 + 1) % 10;
        if (this.field2206 > 1) {
            for (int var5 = 0; var5 < 10; var5++) {
                if (this.field2210[var5] != 0L) {
                    this.field2210[var5] += (long) this.field2206;
                }
            }
        }
        if (this.field2206 < arg1) {
            this.field2206 = arg1;
        }
        class182.method1687((long) this.field2206);
        int var6 = 0;
        while (this.field2208 < 256) {
            var6++;
            this.field2208 += this.field2205;
        }
        this.field2208 &= 0xFF;
        return var6;
    }
}
