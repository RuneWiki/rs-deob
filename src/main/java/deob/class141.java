package deob;

@ObfuscatedName("ea")
public class class141 extends class133 {

    @ObfuscatedName("ea.i")
    public long[] field2155 = new long[10];

    @ObfuscatedName("ea.v")
    public int field2164 = 256;

    @ObfuscatedName("ea.f")
    public int field2156 = 1;

    @ObfuscatedName("ea.h")
    public long field2157 = class115.method2906();

    @ObfuscatedName("ea.a")
    public int field2159 = 0;

    @ObfuscatedName("ea.s")
    public int field2163;

    public class141() {
        for (int var1 = 0; var1 < 10; var1++) {
            this.field2155[var1] = this.field2157;
        }
    }

    @ObfuscatedName("ea.v(I)V")
    public void method2640() {
        for (int var1 = 0; var1 < 10; var1++) {
            this.field2155[var1] = 0L;
        }
    }

    @ObfuscatedName("ea.f(III)I")
    public int method2643(int arg0, int arg1) {
        int var3 = this.field2164;
        int var4 = this.field2156;
        this.field2164 = 300;
        this.field2156 = 1;
        this.field2157 = class115.method2906();
        if (this.field2155[this.field2163] == 0L) {
            this.field2164 = var3;
            this.field2156 = var4;
        } else if (this.field2157 > this.field2155[this.field2163]) {
            this.field2164 = (int) ((long) (arg0 * 2560) / (this.field2157 - this.field2155[this.field2163]));
        }
        if (this.field2164 < 25) {
            this.field2164 = 25;
        }
        if (this.field2164 > 256) {
            this.field2164 = 256;
            this.field2156 = (int) ((long) arg0 - (this.field2157 - this.field2155[this.field2163]) / 10L);
        }
        if (this.field2156 > arg0) {
            this.field2156 = arg0;
        }
        this.field2155[this.field2163] = this.field2157;
        this.field2163 = (this.field2163 + 1) % 10;
        if (this.field2156 > 1) {
            for (int var5 = 0; var5 < 10; var5++) {
                if (this.field2155[var5] != 0L) {
                    this.field2155[var5] += (long) this.field2156;
                }
            }
        }
        if (this.field2156 < arg1) {
            this.field2156 = arg1;
        }
        class127.method848((long) this.field2156);
        int var6 = 0;
        while (this.field2159 < 256) {
            var6++;
            this.field2159 += this.field2164;
        }
        this.field2159 &= 0xFF;
        return var6;
    }
}
