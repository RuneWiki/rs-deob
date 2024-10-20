package deob;

@ObfuscatedName("ec")
public class class133 extends class125 {

    @ObfuscatedName("ec.o")
    public long[] field2062 = new long[10];

    @ObfuscatedName("ec.l")
    public int field2057 = 256;

    @ObfuscatedName("ec.g")
    public int field2060 = 1;

    @ObfuscatedName("ec.u")
    public long field2059 = class107.method2661();

    @ObfuscatedName("ec.q")
    public int field2063 = 0;

    @ObfuscatedName("ec.r")
    public int field2061;

    public class133() {
        for (int var1 = 0; var1 < 10; var1++) {
            this.field2062[var1] = this.field2059;
        }
    }

    @ObfuscatedName("ec.l(B)V")
    public void method2586() {
        for (int var1 = 0; var1 < 10; var1++) {
            this.field2062[var1] = 0L;
        }
    }

    @ObfuscatedName("ec.g(III)I")
    public int method2581(int arg0, int arg1) {
        int var3 = this.field2057;
        int var4 = this.field2060;
        this.field2057 = 300;
        this.field2060 = 1;
        this.field2059 = class107.method2661();
        if (this.field2062[this.field2061] == 0L) {
            this.field2057 = var3;
            this.field2060 = var4;
        } else if (this.field2059 > this.field2062[this.field2061]) {
            this.field2057 = (int) ((long) (arg0 * 2560) / (this.field2059 - this.field2062[this.field2061]));
        }
        if (this.field2057 < 25) {
            this.field2057 = 25;
        }
        if (this.field2057 > 256) {
            this.field2057 = 256;
            this.field2060 = (int) ((long) arg0 - (this.field2059 - this.field2062[this.field2061]) / 10L);
        }
        if (this.field2060 > arg0) {
            this.field2060 = arg0;
        }
        this.field2062[this.field2061] = this.field2059;
        this.field2061 = (this.field2061 + 1) % 10;
        if (this.field2060 > 1) {
            for (int var5 = 0; var5 < 10; var5++) {
                if (this.field2062[var5] != 0L) {
                    this.field2062[var5] += (long) this.field2060;
                }
            }
        }
        if (this.field2060 < arg1) {
            this.field2060 = arg1;
        }
        Statics.method832((long) this.field2060);
        int var6 = 0;
        while (this.field2063 < 256) {
            var6++;
            this.field2063 += this.field2057;
        }
        this.field2063 &= 0xFF;
        return var6;
    }
}
