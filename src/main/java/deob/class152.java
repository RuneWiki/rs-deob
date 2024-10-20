package deob;

@ObfuscatedName("el")
public class class152 extends class159 {

    @ObfuscatedName("el.d")
    public long[] field2189 = new long[10];

    @ObfuscatedName("el.q")
    public int field2182 = 256;

    @ObfuscatedName("el.x")
    public int field2183 = 1;

    @ObfuscatedName("el.y")
    public long field2184 = class176.method3746();

    @ObfuscatedName("el.e")
    public int field2181 = 0;

    @ObfuscatedName("el.f")
    public int field2186;

    public class152() {
        for (int var1 = 0; var1 < 10; var1++) {
            this.field2189[var1] = this.field2184;
        }
    }

    @ObfuscatedName("el.d(B)V")
    public void method2668() {
        for (int var1 = 0; var1 < 10; var1++) {
            this.field2189[var1] = 0L;
        }
    }

    @ObfuscatedName("el.q(III)I")
    public int method2669(int arg0, int arg1) {
        int var3 = this.field2182;
        int var4 = this.field2183;
        this.field2182 = 300;
        this.field2183 = 1;
        this.field2184 = class176.method3746();
        if (this.field2189[this.field2186] == 0L) {
            this.field2182 = var3;
            this.field2183 = var4;
        } else if (this.field2184 > this.field2189[this.field2186]) {
            this.field2182 = (int) ((long) (arg0 * 2560) / (this.field2184 - this.field2189[this.field2186]));
        }
        if (this.field2182 < 25) {
            this.field2182 = 25;
        }
        if (this.field2182 > 256) {
            this.field2182 = 256;
            this.field2183 = (int) ((long) arg0 - (this.field2184 - this.field2189[this.field2186]) / 10L);
        }
        if (this.field2183 > arg0) {
            this.field2183 = arg0;
        }
        this.field2189[this.field2186] = this.field2184;
        this.field2186 = (this.field2186 + 1) % 10;
        if (this.field2183 > 1) {
            for (int var5 = 0; var5 < 10; var5++) {
                if (this.field2189[var5] != 0L) {
                    this.field2189[var5] += (long) this.field2183;
                }
            }
        }
        if (this.field2183 < arg1) {
            this.field2183 = arg1;
        }
        class182.method2253((long) this.field2183);
        int var6 = 0;
        while (this.field2181 < 256) {
            var6++;
            this.field2181 += this.field2182;
        }
        this.field2181 &= 0xFF;
        return var6;
    }
}
