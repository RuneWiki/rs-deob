package deob;

@ObfuscatedName("eh")
public class class133 extends class125 {

    @ObfuscatedName("eh.y")
    public long[] field2089 = new long[10];

    @ObfuscatedName("eh.k")
    public int field2088 = 256;

    @ObfuscatedName("eh.g")
    public int field2085 = 1;

    @ObfuscatedName("eh.n")
    public long field2086 = class107.method78();

    @ObfuscatedName("eh.t")
    public int field2087 = 0;

    @ObfuscatedName("eh.e")
    public int field2092;

    public class133() {
        for (int var1 = 0; var1 < 10; var1++) {
            this.field2089[var1] = this.field2086;
        }
    }

    @ObfuscatedName("eh.y(I)V")
    public void method2512() {
        for (int var1 = 0; var1 < 10; var1++) {
            this.field2089[var1] = 0L;
        }
    }

    @ObfuscatedName("eh.k(IIB)I")
    public int method2513(int arg0, int arg1) {
        int var3 = this.field2088;
        int var4 = this.field2085;
        this.field2088 = 300;
        this.field2085 = 1;
        this.field2086 = class107.method78();
        if (this.field2089[this.field2092] == 0L) {
            this.field2088 = var3;
            this.field2085 = var4;
        } else if (this.field2086 > this.field2089[this.field2092]) {
            this.field2088 = (int) ((long) (arg0 * 2560) / (this.field2086 - this.field2089[this.field2092]));
        }
        if (this.field2088 < 25) {
            this.field2088 = 25;
        }
        if (this.field2088 > 256) {
            this.field2088 = 256;
            this.field2085 = (int) ((long) arg0 - (this.field2086 - this.field2089[this.field2092]) / 10L);
        }
        if (this.field2085 > arg0) {
            this.field2085 = arg0;
        }
        this.field2089[this.field2092] = this.field2086;
        this.field2092 = (this.field2092 + 1) % 10;
        if (this.field2085 > 1) {
            for (int var5 = 0; var5 < 10; var5++) {
                if (this.field2089[var5] != 0L) {
                    this.field2089[var5] += (long) this.field2085;
                }
            }
        }
        if (this.field2085 < arg1) {
            this.field2085 = arg1;
        }
        class119.method488((long) this.field2085);
        int var6 = 0;
        while (this.field2087 < 256) {
            var6++;
            this.field2087 += this.field2088;
        }
        this.field2087 &= 0xFF;
        return var6;
    }
}
