package deob;

@ObfuscatedName("ey")
public class class145 extends class137 {

    @ObfuscatedName("ey.l")
    public long[] field2231 = new long[10];

    @ObfuscatedName("ey.g")
    public int field2222 = 256;

    @ObfuscatedName("ey.r")
    public int field2224 = 1;

    @ObfuscatedName("ey.e")
    public long field2232 = class119.method1224();

    @ObfuscatedName("ey.h")
    public int field2225 = 0;

    @ObfuscatedName("ey.s")
    public int field2226;

    public class145() {
        for (int var1 = 0; var1 < 10; var1++) {
            this.field2231[var1] = this.field2232;
        }
    }

    @ObfuscatedName("ey.g(B)V")
    public void method2847() {
        for (int var1 = 0; var1 < 10; var1++) {
            this.field2231[var1] = 0L;
        }
    }

    @ObfuscatedName("ey.r(III)I")
    public int method2849(int arg0, int arg1) {
        int var3 = this.field2222;
        int var4 = this.field2224;
        this.field2222 = 300;
        this.field2224 = 1;
        this.field2232 = class119.method1224();
        if (this.field2231[this.field2226] == 0L) {
            this.field2222 = var3;
            this.field2224 = var4;
        } else if (this.field2232 > this.field2231[this.field2226]) {
            this.field2222 = (int) ((long) (arg0 * 2560) / (this.field2232 - this.field2231[this.field2226]));
        }
        if (this.field2222 < 25) {
            this.field2222 = 25;
        }
        if (this.field2222 > 256) {
            this.field2222 = 256;
            this.field2224 = (int) ((long) arg0 - (this.field2232 - this.field2231[this.field2226]) / 10L);
        }
        if (this.field2224 > arg0) {
            this.field2224 = arg0;
        }
        this.field2231[this.field2226] = this.field2232;
        this.field2226 = (this.field2226 + 1) % 10;
        if (this.field2224 > 1) {
            for (int var5 = 0; var5 < 10; var5++) {
                if (this.field2231[var5] != 0L) {
                    this.field2231[var5] += (long) this.field2224;
                }
            }
        }
        if (this.field2224 < arg1) {
            this.field2224 = arg1;
        }
        class131.method587((long) this.field2224);
        int var6 = 0;
        while (this.field2225 < 256) {
            var6++;
            this.field2225 += this.field2222;
        }
        this.field2225 &= 0xFF;
        return var6;
    }
}
