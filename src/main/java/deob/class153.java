package deob;

@ObfuscatedName("ex")
public class class153 extends class163 {

    @ObfuscatedName("ex.p")
    public long[] field2086 = new long[10];

    @ObfuscatedName("ex.i")
    public int field2085 = 256;

    @ObfuscatedName("ex.w")
    public int field2089 = 1;

    @ObfuscatedName("ex.s")
    public long field2088 = class187.method35();

    @ObfuscatedName("ex.j")
    public int field2087 = 0;

    @ObfuscatedName("ex.a")
    public int field2090;

    public class153() {
        for (int var1 = 0; var1 < 10; var1++) {
            this.field2086[var1] = this.field2088;
        }
    }

    @ObfuscatedName("ex.p(B)V")
    public void method2834() {
        for (int var1 = 0; var1 < 10; var1++) {
            this.field2086[var1] = 0L;
        }
    }

    @ObfuscatedName("ex.i(III)I")
    public int method2831(int arg0, int arg1) {
        int var3 = this.field2085;
        int var4 = this.field2089;
        this.field2085 = 300;
        this.field2089 = 1;
        this.field2088 = class187.method35();
        if (this.field2086[this.field2090] == 0L) {
            this.field2085 = var3;
            this.field2089 = var4;
        } else if (this.field2088 > this.field2086[this.field2090]) {
            this.field2085 = (int) ((long) (arg0 * 2560) / (this.field2088 - this.field2086[this.field2090]));
        }
        if (this.field2085 < 25) {
            this.field2085 = 25;
        }
        if (this.field2085 > 256) {
            this.field2085 = 256;
            this.field2089 = (int) ((long) arg0 - (this.field2088 - this.field2086[this.field2090]) / 10L);
        }
        if (this.field2089 > arg0) {
            this.field2089 = arg0;
        }
        this.field2086[this.field2090] = this.field2088;
        this.field2090 = (this.field2090 + 1) % 10;
        if (this.field2089 > 1) {
            for (int var5 = 0; var5 < 10; var5++) {
                if (this.field2086[var5] != 0L) {
                    this.field2086[var5] += (long) this.field2089;
                }
            }
        }
        if (this.field2089 < arg1) {
            this.field2089 = arg1;
        }
        class193.method4((long) this.field2089);
        int var6 = 0;
        while (this.field2087 < 256) {
            var6++;
            this.field2087 += this.field2085;
        }
        this.field2087 &= 0xFF;
        return var6;
    }
}
