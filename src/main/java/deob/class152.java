package deob;

@ObfuscatedName("es")
public class class152 extends class159 {

    @ObfuscatedName("es.e")
    public long[] field2197 = new long[10];

    @ObfuscatedName("es.o")
    public int field2200 = 256;

    @ObfuscatedName("es.m")
    public int field2196 = 1;

    @ObfuscatedName("es.g")
    public long field2195 = class176.method218();

    @ObfuscatedName("es.d")
    public int field2198 = 0;

    @ObfuscatedName("es.b")
    public int field2199;

    public class152() {
        for (int var1 = 0; var1 < 10; var1++) {
            this.field2197[var1] = this.field2195;
        }
    }

    @ObfuscatedName("es.e(I)V")
    public void method2669() {
        for (int var1 = 0; var1 < 10; var1++) {
            this.field2197[var1] = 0L;
        }
    }

    @ObfuscatedName("es.o(III)I")
    public int method2673(int arg0, int arg1) {
        int var3 = this.field2200;
        int var4 = this.field2196;
        this.field2200 = 300;
        this.field2196 = 1;
        this.field2195 = class176.method218();
        if (this.field2197[this.field2199] == 0L) {
            this.field2200 = var3;
            this.field2196 = var4;
        } else if (this.field2195 > this.field2197[this.field2199]) {
            this.field2200 = (int) ((long) (arg0 * 2560) / (this.field2195 - this.field2197[this.field2199]));
        }
        if (this.field2200 < 25) {
            this.field2200 = 25;
        }
        if (this.field2200 > 256) {
            this.field2200 = 256;
            this.field2196 = (int) ((long) arg0 - (this.field2195 - this.field2197[this.field2199]) / 10L);
        }
        if (this.field2196 > arg0) {
            this.field2196 = arg0;
        }
        this.field2197[this.field2199] = this.field2195;
        this.field2199 = (this.field2199 + 1) % 10;
        if (this.field2196 > 1) {
            for (int var5 = 0; var5 < 10; var5++) {
                if (this.field2197[var5] != 0L) {
                    this.field2197[var5] += (long) this.field2196;
                }
            }
        }
        if (this.field2196 < arg1) {
            this.field2196 = arg1;
        }
        class182.method1535((long) this.field2196);
        int var6 = 0;
        while (this.field2198 < 256) {
            var6++;
            this.field2198 += this.field2200;
        }
        this.field2198 &= 0xFF;
        return var6;
    }
}
