package deob;

@ObfuscatedName("ei")
public class class153 extends class160 {

    @ObfuscatedName("ei.d")
    public long[] field2125 = new long[10];

    @ObfuscatedName("ei.x")
    public int field2120 = 256;

    @ObfuscatedName("ei.k")
    public int field2121 = 1;

    @ObfuscatedName("ei.z")
    public long field2126 = class183.method2932();

    @ObfuscatedName("ei.v")
    public int field2123 = 0;

    @ObfuscatedName("ei.m")
    public int field2122;

    public class153() {
        for (int var1 = 0; var1 < 10; var1++) {
            this.field2125[var1] = this.field2126;
        }
    }

    @ObfuscatedName("ei.d(I)V")
    public void method2803() {
        for (int var1 = 0; var1 < 10; var1++) {
            this.field2125[var1] = 0L;
        }
    }

    @ObfuscatedName("ei.x(III)I")
    public int method2804(int arg0, int arg1) {
        int var3 = this.field2120;
        int var4 = this.field2121;
        this.field2120 = 300;
        this.field2121 = 1;
        this.field2126 = class183.method2932();
        if (this.field2125[this.field2122] == 0L) {
            this.field2120 = var3;
            this.field2121 = var4;
        } else if (this.field2126 > this.field2125[this.field2122]) {
            this.field2120 = (int) ((long) (arg0 * 2560) / (this.field2126 - this.field2125[this.field2122]));
        }
        if (this.field2120 < 25) {
            this.field2120 = 25;
        }
        if (this.field2120 > 256) {
            this.field2120 = 256;
            this.field2121 = (int) ((long) arg0 - (this.field2126 - this.field2125[this.field2122]) / 10L);
        }
        if (this.field2121 > arg0) {
            this.field2121 = arg0;
        }
        this.field2125[this.field2122] = this.field2126;
        this.field2122 = (this.field2122 + 1) % 10;
        if (this.field2121 > 1) {
            for (int var5 = 0; var5 < 10; var5++) {
                if (this.field2125[var5] != 0L) {
                    this.field2125[var5] += (long) this.field2121;
                }
            }
        }
        if (this.field2121 < arg1) {
            this.field2121 = arg1;
        }
        class189.method13((long) this.field2121);
        int var6 = 0;
        while (this.field2123 < 256) {
            var6++;
            this.field2123 += this.field2120;
        }
        this.field2123 &= 0xFF;
        return var6;
    }
}
