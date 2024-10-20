package deob;

@ObfuscatedName("ew")
public class class153 extends class160 {

    @ObfuscatedName("ew.b")
    public long[] field2116 = new long[10];

    @ObfuscatedName("ew.s")
    public int field2113 = 256;

    @ObfuscatedName("ew.r")
    public int field2114 = 1;

    @ObfuscatedName("ew.g")
    public long field2115 = class183.method1711();

    @ObfuscatedName("ew.x")
    public int field2119 = 0;

    @ObfuscatedName("ew.f")
    public int field2112;

    public class153() {
        for (int var1 = 0; var1 < 10; var1++) {
            this.field2116[var1] = this.field2115;
        }
    }

    @ObfuscatedName("ew.b(S)V")
    public void method2709() {
        for (int var1 = 0; var1 < 10; var1++) {
            this.field2116[var1] = 0L;
        }
    }

    @ObfuscatedName("ew.s(III)I")
    public int method2706(int arg0, int arg1) {
        int var3 = this.field2113;
        int var4 = this.field2114;
        this.field2113 = 300;
        this.field2114 = 1;
        this.field2115 = class183.method1711();
        if (this.field2116[this.field2112] == 0L) {
            this.field2113 = var3;
            this.field2114 = var4;
        } else if (this.field2115 > this.field2116[this.field2112]) {
            this.field2113 = (int) ((long) (arg0 * 2560) / (this.field2115 - this.field2116[this.field2112]));
        }
        if (this.field2113 < 25) {
            this.field2113 = 25;
        }
        if (this.field2113 > 256) {
            this.field2113 = 256;
            this.field2114 = (int) ((long) arg0 - (this.field2115 - this.field2116[this.field2112]) / 10L);
        }
        if (this.field2114 > arg0) {
            this.field2114 = arg0;
        }
        this.field2116[this.field2112] = this.field2115;
        this.field2112 = (this.field2112 + 1) % 10;
        if (this.field2114 > 1) {
            for (int var5 = 0; var5 < 10; var5++) {
                if (this.field2116[var5] != 0L) {
                    this.field2116[var5] += (long) this.field2114;
                }
            }
        }
        if (this.field2114 < arg1) {
            this.field2114 = arg1;
        }
        class189.method2888((long) this.field2114);
        int var6 = 0;
        while (this.field2119 < 256) {
            var6++;
            this.field2119 += this.field2113;
        }
        this.field2119 &= 0xFF;
        return var6;
    }
}
