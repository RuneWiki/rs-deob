package deob;

@ObfuscatedName("el")
public class class151 extends class161 {

    @ObfuscatedName("el.w")
    public long[] field1943 = new long[10];

    @ObfuscatedName("el.m")
    public int field1946 = 256;

    @ObfuscatedName("el.q")
    public int field1944 = 1;

    @ObfuscatedName("el.b")
    public long field1942 = class185.method3151();

    @ObfuscatedName("el.f")
    public int field1945 = 0;

    @ObfuscatedName("el.n")
    public int field1947;

    public class151() {
        for (int var1 = 0; var1 < 10; var1++) {
            this.field1943[var1] = this.field1942;
        }
    }

    @ObfuscatedName("el.w(I)V")
    public void method2972() {
        for (int var1 = 0; var1 < 10; var1++) {
            this.field1943[var1] = 0L;
        }
    }

    @ObfuscatedName("el.m(III)I")
    public int method2974(int arg0, int arg1) {
        int var3 = this.field1946;
        int var4 = this.field1944;
        this.field1946 = 300;
        this.field1944 = 1;
        this.field1942 = class185.method3151();
        if (this.field1943[this.field1947] == 0L) {
            this.field1946 = var3;
            this.field1944 = var4;
        } else if (this.field1942 > this.field1943[this.field1947]) {
            this.field1946 = (int) ((long) (arg0 * 2560) / (this.field1942 - this.field1943[this.field1947]));
        }
        if (this.field1946 < 25) {
            this.field1946 = 25;
        }
        if (this.field1946 > 256) {
            this.field1946 = 256;
            this.field1944 = (int) ((long) arg0 - (this.field1942 - this.field1943[this.field1947]) / 10L);
        }
        if (this.field1944 > arg0) {
            this.field1944 = arg0;
        }
        this.field1943[this.field1947] = this.field1942;
        this.field1947 = (this.field1947 + 1) % 10;
        if (this.field1944 > 1) {
            for (int var5 = 0; var5 < 10; var5++) {
                if (this.field1943[var5] != 0L) {
                    this.field1943[var5] += (long) this.field1944;
                }
            }
        }
        if (this.field1944 < arg1) {
            this.field1944 = arg1;
        }
        class192.method196((long) this.field1944);
        int var6 = 0;
        while (this.field1945 < 256) {
            var6++;
            this.field1945 += this.field1946;
        }
        this.field1945 &= 0xFF;
        return var6;
    }
}
