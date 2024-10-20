package deob;

@ObfuscatedName("ev")
public class class142 extends class134 {

    @ObfuscatedName("ev.b")
    public long[] field2156 = new long[10];

    @ObfuscatedName("ev.g")
    public int field2147 = 256;

    @ObfuscatedName("ev.j")
    public int field2148 = 1;

    @ObfuscatedName("ev.d")
    public long field2151 = class116.method1946();

    @ObfuscatedName("ev.x")
    public int field2150 = 0;

    @ObfuscatedName("ev.y")
    public int field2152;

    public class142() {
        for (int var1 = 0; var1 < 10; var1++) {
            this.field2156[var1] = this.field2151;
        }
    }

    @ObfuscatedName("ev.b(B)V")
    public void method2714() {
        for (int var1 = 0; var1 < 10; var1++) {
            this.field2156[var1] = 0L;
        }
    }

    @ObfuscatedName("ev.g(IIB)I")
    public int method2719(int arg0, int arg1) {
        int var3 = this.field2147;
        int var4 = this.field2148;
        this.field2147 = 300;
        this.field2148 = 1;
        this.field2151 = class116.method1946();
        if (this.field2156[this.field2152] == 0L) {
            this.field2147 = var3;
            this.field2148 = var4;
        } else if (this.field2151 > this.field2156[this.field2152]) {
            this.field2147 = (int) ((long) (arg0 * 2560) / (this.field2151 - this.field2156[this.field2152]));
        }
        if (this.field2147 < 25) {
            this.field2147 = 25;
        }
        if (this.field2147 > 256) {
            this.field2147 = 256;
            this.field2148 = (int) ((long) arg0 - (this.field2151 - this.field2156[this.field2152]) / 10L);
        }
        if (this.field2148 > arg0) {
            this.field2148 = arg0;
        }
        this.field2156[this.field2152] = this.field2151;
        this.field2152 = (this.field2152 + 1) % 10;
        if (this.field2148 > 1) {
            for (int var5 = 0; var5 < 10; var5++) {
                if (this.field2156[var5] != 0L) {
                    this.field2156[var5] += (long) this.field2148;
                }
            }
        }
        if (this.field2148 < arg1) {
            this.field2148 = arg1;
        }
        class128.method2289((long) this.field2148);
        int var6 = 0;
        while (this.field2150 < 256) {
            var6++;
            this.field2150 += this.field2147;
        }
        this.field2150 &= 0xFF;
        return var6;
    }
}
