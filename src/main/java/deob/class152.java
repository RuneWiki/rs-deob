package deob;

@ObfuscatedName("ej")
public class class152 extends class162 {

    @ObfuscatedName("ej.w")
    public long[] field2214 = new long[10];

    @ObfuscatedName("ej.o")
    public int field2220 = 256;

    @ObfuscatedName("ej.x")
    public int field2215 = 1;

    @ObfuscatedName("ej.k")
    public long field2216 = class179.method1665();

    @ObfuscatedName("ej.f")
    public int field2219 = 0;

    @ObfuscatedName("ej.i")
    public int field2218;

    public class152() {
        for (int var1 = 0; var1 < 10; var1++) {
            this.field2214[var1] = this.field2216;
        }
    }

    @ObfuscatedName("ej.w(B)V")
    public void method2629() {
        for (int var1 = 0; var1 < 10; var1++) {
            this.field2214[var1] = 0L;
        }
    }

    @ObfuscatedName("ej.o(IIB)I")
    public int method2631(int arg0, int arg1) {
        int var3 = this.field2220;
        int var4 = this.field2215;
        this.field2220 = 300;
        this.field2215 = 1;
        this.field2216 = class179.method1665();
        if (this.field2214[this.field2218] == 0L) {
            this.field2220 = var3;
            this.field2215 = var4;
        } else if (this.field2216 > this.field2214[this.field2218]) {
            this.field2220 = (int) ((long) (arg0 * 2560) / (this.field2216 - this.field2214[this.field2218]));
        }
        if (this.field2220 < 25) {
            this.field2220 = 25;
        }
        if (this.field2220 > 256) {
            this.field2220 = 256;
            this.field2215 = (int) ((long) arg0 - (this.field2216 - this.field2214[this.field2218]) / 10L);
        }
        if (this.field2215 > arg0) {
            this.field2215 = arg0;
        }
        this.field2214[this.field2218] = this.field2216;
        this.field2218 = (this.field2218 + 1) % 10;
        if (this.field2215 > 1) {
            for (int var5 = 0; var5 < 10; var5++) {
                if (this.field2214[var5] != 0L) {
                    this.field2214[var5] += (long) this.field2215;
                }
            }
        }
        if (this.field2215 < arg1) {
            this.field2215 = arg1;
        }
        class185.method7((long) this.field2215);
        int var6 = 0;
        while (this.field2219 < 256) {
            var6++;
            this.field2219 += this.field2220;
        }
        this.field2219 &= 0xFF;
        return var6;
    }
}
