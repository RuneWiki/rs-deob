package deob;

@ObfuscatedName("em")
public class class141 extends class133 {

    @ObfuscatedName("em.o")
    public long[] field2160 = new long[10];

    @ObfuscatedName("em.e")
    public int field2162 = 256;

    @ObfuscatedName("em.u")
    public int field2159 = 1;

    @ObfuscatedName("em.b")
    public long field2166 = class115.method102();

    @ObfuscatedName("em.p")
    public int field2161 = 0;

    @ObfuscatedName("em.s")
    public int field2164;

    public class141() {
        for (int var1 = 0; var1 < 10; var1++) {
            this.field2160[var1] = this.field2166;
        }
    }

    @ObfuscatedName("em.o(S)V")
    public void method2684() {
        for (int var1 = 0; var1 < 10; var1++) {
            this.field2160[var1] = 0L;
        }
    }

    @ObfuscatedName("em.e(IIB)I")
    public int method2692(int arg0, int arg1) {
        int var3 = this.field2162;
        int var4 = this.field2159;
        this.field2162 = 300;
        this.field2159 = 1;
        this.field2166 = class115.method102();
        if (this.field2160[this.field2164] == 0L) {
            this.field2162 = var3;
            this.field2159 = var4;
        } else if (this.field2166 > this.field2160[this.field2164]) {
            this.field2162 = (int) ((long) (arg0 * 2560) / (this.field2166 - this.field2160[this.field2164]));
        }
        if (this.field2162 < 25) {
            this.field2162 = 25;
        }
        if (this.field2162 > 256) {
            this.field2162 = 256;
            this.field2159 = (int) ((long) arg0 - (this.field2166 - this.field2160[this.field2164]) / 10L);
        }
        if (this.field2159 > arg0) {
            this.field2159 = arg0;
        }
        this.field2160[this.field2164] = this.field2166;
        this.field2164 = (this.field2164 + 1) % 10;
        if (this.field2159 > 1) {
            for (int var5 = 0; var5 < 10; var5++) {
                if (this.field2160[var5] != 0L) {
                    this.field2160[var5] += (long) this.field2159;
                }
            }
        }
        if (this.field2159 < arg1) {
            this.field2159 = arg1;
        }
        class127.method2614((long) this.field2159);
        int var6 = 0;
        while (this.field2161 < 256) {
            var6++;
            this.field2161 += this.field2162;
        }
        this.field2161 &= 0xFF;
        return var6;
    }
}
