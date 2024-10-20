package deob;

@ObfuscatedName("fc")
public class class174 extends class180 {

    @ObfuscatedName("fc.f")
    public long[] field2043 = new long[10];

    @ObfuscatedName("fc.b")
    public int field2041 = 256;

    @ObfuscatedName("fc.l")
    public int field2042 = 1;

    @ObfuscatedName("fc.m")
    public long field2044 = class308.method4786();

    @ObfuscatedName("fc.z")
    public int field2048 = 0;

    @ObfuscatedName("fc.q")
    public int field2045;

    public class174() {
        for (int var1 = 0; var1 < 10; var1++) {
            this.field2043[var1] = this.field2044;
        }
    }

    @ObfuscatedName("fc.f(I)V")
    public void method3274() {
        for (int var1 = 0; var1 < 10; var1++) {
            this.field2043[var1] = 0L;
        }
    }

    @ObfuscatedName("fc.b(III)I")
    public int method3280(int arg0, int arg1) {
        int var3 = this.field2041;
        int var4 = this.field2042;
        this.field2041 = 300;
        this.field2042 = 1;
        this.field2044 = class308.method4786();
        if (this.field2043[this.field2045] == 0L) {
            this.field2041 = var3;
            this.field2042 = var4;
        } else if (this.field2044 > this.field2043[this.field2045]) {
            this.field2041 = (int) ((long) (arg0 * 2560) / (this.field2044 - this.field2043[this.field2045]));
        }
        if (this.field2041 < 25) {
            this.field2041 = 25;
        }
        if (this.field2041 > 256) {
            this.field2041 = 256;
            this.field2042 = (int) ((long) arg0 - (this.field2044 - this.field2043[this.field2045]) / 10L);
        }
        if (this.field2042 > arg0) {
            this.field2042 = arg0;
        }
        this.field2043[this.field2045] = this.field2044;
        this.field2045 = (this.field2045 + 1) % 10;
        if (this.field2042 > 1) {
            for (int var5 = 0; var5 < 10; var5++) {
                if (this.field2043[var5] != 0L) {
                    this.field2043[var5] += (long) this.field2042;
                }
            }
        }
        if (this.field2042 < arg1) {
            this.field2042 = arg1;
        }
        class309.method735((long) this.field2042);
        int var6 = 0;
        while (this.field2048 < 256) {
            var6++;
            this.field2048 += this.field2041;
        }
        this.field2048 &= 0xFF;
        return var6;
    }
}
