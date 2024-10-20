package deob;

@ObfuscatedName("io")
public class class218 extends class226 {

    @ObfuscatedName("io.aq")
    public long[] field2354 = new long[10];

    @ObfuscatedName("io.aw")
    public int field2352 = 256;

    @ObfuscatedName("io.al")
    public int field2349 = 1;

    @ObfuscatedName("io.ai")
    public long field2350 = class318.method2218();

    @ObfuscatedName("io.ar")
    public int field2351 = 0;

    @ObfuscatedName("io.as")
    public int field2347;

    public class218() {
        for (int var1 = 0; var1 < 10; var1++) {
            this.field2354[var1] = this.field2350;
        }
    }

    @ObfuscatedName("io.aq(I)V")
    public void method3776() {
        for (int var1 = 0; var1 < 10; var1++) {
            this.field2354[var1] = 0L;
        }
    }

    @ObfuscatedName("io.aw(IIB)I")
    public int method3777(int arg0, int arg1) {
        int var3 = this.field2352;
        int var4 = this.field2349;
        this.field2352 = 300;
        this.field2349 = 1;
        this.field2350 = class318.method2218();
        if (this.field2354[this.field2347] == 0L) {
            this.field2352 = var3;
            this.field2349 = var4;
        } else if (this.field2350 > this.field2354[this.field2347]) {
            this.field2352 = (int) ((long) (arg0 * 2560) / (this.field2350 - this.field2354[this.field2347]));
        }
        if (this.field2352 < 25) {
            this.field2352 = 25;
        }
        if (this.field2352 > 256) {
            this.field2352 = 256;
            this.field2349 = (int) ((long) arg0 - (this.field2350 - this.field2354[this.field2347]) / 10L);
        }
        if (this.field2349 > arg0) {
            this.field2349 = arg0;
        }
        this.field2354[this.field2347] = this.field2350;
        this.field2347 = (this.field2347 + 1) % 10;
        if (this.field2349 > 1) {
            for (int var5 = 0; var5 < 10; var5++) {
                if (this.field2354[var5] != 0L) {
                    this.field2354[var5] += (long) this.field2349;
                }
            }
        }
        if (this.field2349 < arg1) {
            this.field2349 = arg1;
        }
        class319.method3040((long) this.field2349);
        int var6 = 0;
        while (this.field2351 < 256) {
            var6++;
            this.field2351 += this.field2352;
        }
        this.field2351 &= 0xFF;
        return var6;
    }
}
