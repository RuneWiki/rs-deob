package deob;

@ObfuscatedName("ev")
public class class141 extends class133 {

    @ObfuscatedName("ev.y")
    public long[] field2144 = new long[10];

    @ObfuscatedName("ev.d")
    public int field2145 = 256;

    @ObfuscatedName("ev.g")
    public int field2150 = 1;

    @ObfuscatedName("ev.w")
    public long field2146 = class115.method671();

    @ObfuscatedName("ev.e")
    public int field2148 = 0;

    @ObfuscatedName("ev.c")
    public int field2149;

    public class141() {
        for (int var1 = 0; var1 < 10; var1++) {
            this.field2144[var1] = this.field2146;
        }
    }

    @ObfuscatedName("ev.y(I)V")
    public void method2656() {
        for (int var1 = 0; var1 < 10; var1++) {
            this.field2144[var1] = 0L;
        }
    }

    @ObfuscatedName("ev.d(III)I")
    public int method2659(int arg0, int arg1) {
        int var3 = this.field2145;
        int var4 = this.field2150;
        this.field2145 = 300;
        this.field2150 = 1;
        this.field2146 = class115.method671();
        if (this.field2144[this.field2149] == 0L) {
            this.field2145 = var3;
            this.field2150 = var4;
        } else if (this.field2146 > this.field2144[this.field2149]) {
            this.field2145 = (int) ((long) (arg0 * 2560) / (this.field2146 - this.field2144[this.field2149]));
        }
        if (this.field2145 < 25) {
            this.field2145 = 25;
        }
        if (this.field2145 > 256) {
            this.field2145 = 256;
            this.field2150 = (int) ((long) arg0 - (this.field2146 - this.field2144[this.field2149]) / 10L);
        }
        if (this.field2150 > arg0) {
            this.field2150 = arg0;
        }
        this.field2144[this.field2149] = this.field2146;
        this.field2149 = (this.field2149 + 1) % 10;
        if (this.field2150 > 1) {
            for (int var5 = 0; var5 < 10; var5++) {
                if (this.field2144[var5] != 0L) {
                    this.field2144[var5] += (long) this.field2150;
                }
            }
        }
        if (this.field2150 < arg1) {
            this.field2150 = arg1;
        }
        class127.method1535((long) this.field2150);
        int var6 = 0;
        while (this.field2148 < 256) {
            var6++;
            this.field2148 += this.field2145;
        }
        this.field2148 &= 0xFF;
        return var6;
    }
}
