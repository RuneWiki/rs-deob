package deob;

@ObfuscatedName("ej")
public class class141 extends class133 {

    @ObfuscatedName("ej.j")
    public long[] field2149 = new long[10];

    @ObfuscatedName("ej.m")
    public int field2150 = 256;

    @ObfuscatedName("ej.f")
    public int field2151 = 1;

    @ObfuscatedName("ej.l")
    public long field2152 = class115.method2038();

    @ObfuscatedName("ej.u")
    public int field2153 = 0;

    @ObfuscatedName("ej.a")
    public int field2154;

    public class141() {
        for (int var1 = 0; var1 < 10; var1++) {
            this.field2149[var1] = this.field2152;
        }
    }

    @ObfuscatedName("ej.j(I)V")
    public void method2712() {
        for (int var1 = 0; var1 < 10; var1++) {
            this.field2149[var1] = 0L;
        }
    }

    @ObfuscatedName("ej.m(III)I")
    public int method2714(int arg0, int arg1) {
        int var3 = this.field2150;
        int var4 = this.field2151;
        this.field2150 = 300;
        this.field2151 = 1;
        this.field2152 = class115.method2038();
        if (this.field2149[this.field2154] == 0L) {
            this.field2150 = var3;
            this.field2151 = var4;
        } else if (this.field2152 > this.field2149[this.field2154]) {
            this.field2150 = (int) ((long) (arg0 * 2560) / (this.field2152 - this.field2149[this.field2154]));
        }
        if (this.field2150 < 25) {
            this.field2150 = 25;
        }
        if (this.field2150 > 256) {
            this.field2150 = 256;
            this.field2151 = (int) ((long) arg0 - (this.field2152 - this.field2149[this.field2154]) / 10L);
        }
        if (this.field2151 > arg0) {
            this.field2151 = arg0;
        }
        this.field2149[this.field2154] = this.field2152;
        this.field2154 = (this.field2154 + 1) % 10;
        if (this.field2151 > 1) {
            for (int var5 = 0; var5 < 10; var5++) {
                if (this.field2149[var5] != 0L) {
                    this.field2149[var5] += (long) this.field2151;
                }
            }
        }
        if (this.field2151 < arg1) {
            this.field2151 = arg1;
        }
        class127.method692((long) this.field2151);
        int var6 = 0;
        while (this.field2153 < 256) {
            var6++;
            this.field2153 += this.field2150;
        }
        this.field2153 &= 0xFF;
        return var6;
    }
}
