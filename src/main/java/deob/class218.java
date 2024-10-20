package deob;

@ObfuscatedName("ie")
public class class218 extends class221 {

    @ObfuscatedName("ie.at")
    public long[] field2322 = new long[10];

    @ObfuscatedName("ie.ah")
    public int field2317 = 256;

    @ObfuscatedName("ie.ar")
    public int field2318 = 1;

    @ObfuscatedName("ie.ao")
    public long field2320 = class313.method3460();

    @ObfuscatedName("ie.ab")
    public int field2321 = 0;

    @ObfuscatedName("ie.au")
    public int field2319;

    public class218() {
        for (int var1 = 0; var1 < 10; var1++) {
            this.field2322[var1] = this.field2320;
        }
    }

    @ObfuscatedName("ie.at(I)V")
    public void method3790() {
        for (int var1 = 0; var1 < 10; var1++) {
            this.field2322[var1] = 0L;
        }
    }

    @ObfuscatedName("ie.ah(III)I")
    public int method3785(int arg0, int arg1) {
        int var3 = this.field2317;
        int var4 = this.field2318;
        this.field2317 = 300;
        this.field2318 = 1;
        this.field2320 = class313.method3460();
        if (this.field2322[this.field2319] == 0L) {
            this.field2317 = var3;
            this.field2318 = var4;
        } else if (this.field2320 > this.field2322[this.field2319]) {
            this.field2317 = (int) ((long) (arg0 * 2560) / (this.field2320 - this.field2322[this.field2319]));
        }
        if (this.field2317 < 25) {
            this.field2317 = 25;
        }
        if (this.field2317 > 256) {
            this.field2317 = 256;
            this.field2318 = (int) ((long) arg0 - (this.field2320 - this.field2322[this.field2319]) / 10L);
        }
        if (this.field2318 > arg0) {
            this.field2318 = arg0;
        }
        this.field2322[this.field2319] = this.field2320;
        this.field2319 = (this.field2319 + 1) % 10;
        if (this.field2318 > 1) {
            for (int var5 = 0; var5 < 10; var5++) {
                if (this.field2322[var5] != 0L) {
                    this.field2322[var5] += (long) this.field2318;
                }
            }
        }
        if (this.field2318 < arg1) {
            this.field2318 = arg1;
        }
        class314.method3920((long) this.field2318);
        int var6 = 0;
        while (this.field2321 < 256) {
            var6++;
            this.field2321 += this.field2317;
        }
        this.field2321 &= 0xFF;
        return var6;
    }
}
