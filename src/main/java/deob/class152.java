package deob;

@ObfuscatedName("ev")
public class class152 extends class159 {

    @ObfuscatedName("ev.i")
    public long[] field2228 = new long[10];

    @ObfuscatedName("ev.c")
    public int field2225 = 256;

    @ObfuscatedName("ev.e")
    public int field2226 = 1;

    @ObfuscatedName("ev.v")
    public long field2227 = class176.method89();

    @ObfuscatedName("ev.b")
    public int field2224 = 0;

    @ObfuscatedName("ev.y")
    public int field2229;

    public class152() {
        for (int var1 = 0; var1 < 10; var1++) {
            this.field2228[var1] = this.field2227;
        }
    }

    @ObfuscatedName("ev.i(B)V")
    public void method2659() {
        for (int var1 = 0; var1 < 10; var1++) {
            this.field2228[var1] = 0L;
        }
    }

    @ObfuscatedName("ev.c(III)I")
    public int method2660(int arg0, int arg1) {
        int var3 = this.field2225;
        int var4 = this.field2226;
        this.field2225 = 300;
        this.field2226 = 1;
        this.field2227 = class176.method89();
        if (this.field2228[this.field2229] == 0L) {
            this.field2225 = var3;
            this.field2226 = var4;
        } else if (this.field2227 > this.field2228[this.field2229]) {
            this.field2225 = (int) ((long) (arg0 * 2560) / (this.field2227 - this.field2228[this.field2229]));
        }
        if (this.field2225 < 25) {
            this.field2225 = 25;
        }
        if (this.field2225 > 256) {
            this.field2225 = 256;
            this.field2226 = (int) ((long) arg0 - (this.field2227 - this.field2228[this.field2229]) / 10L);
        }
        if (this.field2226 > arg0) {
            this.field2226 = arg0;
        }
        this.field2228[this.field2229] = this.field2227;
        this.field2229 = (this.field2229 + 1) % 10;
        if (this.field2226 > 1) {
            for (int var5 = 0; var5 < 10; var5++) {
                if (this.field2228[var5] != 0L) {
                    this.field2228[var5] += (long) this.field2226;
                }
            }
        }
        if (this.field2226 < arg1) {
            this.field2226 = arg1;
        }
        class182.method10((long) this.field2226);
        int var6 = 0;
        while (this.field2224 < 256) {
            var6++;
            this.field2224 += this.field2225;
        }
        this.field2224 &= 0xFF;
        return var6;
    }
}
