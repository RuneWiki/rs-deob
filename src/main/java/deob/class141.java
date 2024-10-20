package deob;

@ObfuscatedName("ep")
public class class141 extends class133 {

    @ObfuscatedName("ep.n")
    public long[] field2154 = new long[10];

    @ObfuscatedName("ep.q")
    public int field2152 = 256;

    @ObfuscatedName("ep.c")
    public int field2148 = 1;

    @ObfuscatedName("ep.l")
    public long field2149 = class115.method179();

    @ObfuscatedName("ep.r")
    public int field2150 = 0;

    @ObfuscatedName("ep.u")
    public int field2151;

    public class141() {
        for (int var1 = 0; var1 < 10; var1++) {
            this.field2154[var1] = this.field2149;
        }
    }

    @ObfuscatedName("ep.n(I)V")
    public void method2682() {
        for (int var1 = 0; var1 < 10; var1++) {
            this.field2154[var1] = 0L;
        }
    }

    @ObfuscatedName("ep.q(III)I")
    public int method2683(int arg0, int arg1) {
        int var3 = this.field2152;
        int var4 = this.field2148;
        this.field2152 = 300;
        this.field2148 = 1;
        this.field2149 = class115.method179();
        if (this.field2154[this.field2151] == 0L) {
            this.field2152 = var3;
            this.field2148 = var4;
        } else if (this.field2149 > this.field2154[this.field2151]) {
            this.field2152 = (int) ((long) (arg0 * 2560) / (this.field2149 - this.field2154[this.field2151]));
        }
        if (this.field2152 < 25) {
            this.field2152 = 25;
        }
        if (this.field2152 > 256) {
            this.field2152 = 256;
            this.field2148 = (int) ((long) arg0 - (this.field2149 - this.field2154[this.field2151]) / 10L);
        }
        if (this.field2148 > arg0) {
            this.field2148 = arg0;
        }
        this.field2154[this.field2151] = this.field2149;
        this.field2151 = (this.field2151 + 1) % 10;
        if (this.field2148 > 1) {
            for (int var5 = 0; var5 < 10; var5++) {
                if (this.field2154[var5] != 0L) {
                    this.field2154[var5] += (long) this.field2148;
                }
            }
        }
        if (this.field2148 < arg1) {
            this.field2148 = arg1;
        }
        class127.method1567((long) this.field2148);
        int var6 = 0;
        while (this.field2150 < 256) {
            var6++;
            this.field2150 += this.field2152;
        }
        this.field2150 &= 0xFF;
        return var6;
    }
}
