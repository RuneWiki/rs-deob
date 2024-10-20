package deob;

@ObfuscatedName("ib")
public class class221 extends class229 {

    @ObfuscatedName("ib.aq")
    public long[] field2371 = new long[10];

    @ObfuscatedName("ib.ad")
    public int field2372 = 256;

    @ObfuscatedName("ib.ag")
    public int field2373 = 1;

    @ObfuscatedName("ib.ak")
    public long field2375 = class327.method4500();

    @ObfuscatedName("ib.ap")
    public int field2374 = 0;

    @ObfuscatedName("ib.an")
    public int field2376;

    public class221() {
        for (int var1 = 0; var1 < 10; var1++) {
            this.field2371[var1] = this.field2375;
        }
    }

    @ObfuscatedName("ib.aq(I)V")
    public void method3803() {
        for (int var1 = 0; var1 < 10; var1++) {
            this.field2371[var1] = 0L;
        }
    }

    @ObfuscatedName("ib.ad(III)I")
    public int method3802(int arg0, int arg1) {
        int var3 = this.field2372;
        int var4 = this.field2373;
        this.field2372 = 300;
        this.field2373 = 1;
        this.field2375 = class327.method4500();
        if (this.field2371[this.field2376] == 0L) {
            this.field2372 = var3;
            this.field2373 = var4;
        } else if (this.field2375 > this.field2371[this.field2376]) {
            this.field2372 = (int) ((long) (arg0 * 2560) / (this.field2375 - this.field2371[this.field2376]));
        }
        if (this.field2372 < 25) {
            this.field2372 = 25;
        }
        if (this.field2372 > 256) {
            this.field2372 = 256;
            this.field2373 = (int) ((long) arg0 - (this.field2375 - this.field2371[this.field2376]) / 10L);
        }
        if (this.field2373 > arg0) {
            this.field2373 = arg0;
        }
        this.field2371[this.field2376] = this.field2375;
        this.field2376 = (this.field2376 + 1) % 10;
        if (this.field2373 > 1) {
            for (int var5 = 0; var5 < 10; var5++) {
                if (this.field2371[var5] != 0L) {
                    this.field2371[var5] += (long) this.field2373;
                }
            }
        }
        if (this.field2373 < arg1) {
            this.field2373 = arg1;
        }
        class328.method3390((long) this.field2373);
        int var6 = 0;
        while (this.field2374 < 256) {
            var6++;
            this.field2374 += this.field2372;
        }
        this.field2374 &= 0xFF;
        return var6;
    }
}
