package deob;

@ObfuscatedName("ev")
public class class152 extends class159 {

    @ObfuscatedName("ev.i")
    public long[] field2225 = new long[10];

    @ObfuscatedName("ev.w")
    public int field2227 = 256;

    @ObfuscatedName("ev.a")
    public int field2223 = 1;

    @ObfuscatedName("ev.t")
    public long field2226 = class176.method2862();

    @ObfuscatedName("ev.s")
    public int field2229 = 0;

    @ObfuscatedName("ev.r")
    public int field2228;

    public class152() {
        for (int var1 = 0; var1 < 10; var1++) {
            this.field2225[var1] = this.field2226;
        }
    }

    @ObfuscatedName("ev.i(B)V")
    public void method2652() {
        for (int var1 = 0; var1 < 10; var1++) {
            this.field2225[var1] = 0L;
        }
    }

    @ObfuscatedName("ev.w(IIB)I")
    public int method2653(int arg0, int arg1) {
        int var3 = this.field2227;
        int var4 = this.field2223;
        this.field2227 = 300;
        this.field2223 = 1;
        this.field2226 = class176.method2862();
        if (this.field2225[this.field2228] == 0L) {
            this.field2227 = var3;
            this.field2223 = var4;
        } else if (this.field2226 > this.field2225[this.field2228]) {
            this.field2227 = (int) ((long) (arg0 * 2560) / (this.field2226 - this.field2225[this.field2228]));
        }
        if (this.field2227 < 25) {
            this.field2227 = 25;
        }
        if (this.field2227 > 256) {
            this.field2227 = 256;
            this.field2223 = (int) ((long) arg0 - (this.field2226 - this.field2225[this.field2228]) / 10L);
        }
        if (this.field2223 > arg0) {
            this.field2223 = arg0;
        }
        this.field2225[this.field2228] = this.field2226;
        this.field2228 = (this.field2228 + 1) % 10;
        if (this.field2223 > 1) {
            for (int var5 = 0; var5 < 10; var5++) {
                if (this.field2225[var5] != 0L) {
                    this.field2225[var5] += (long) this.field2223;
                }
            }
        }
        if (this.field2223 < arg1) {
            this.field2223 = arg1;
        }
        class182.method1004((long) this.field2223);
        int var6 = 0;
        while (this.field2229 < 256) {
            var6++;
            this.field2229 += this.field2227;
        }
        this.field2229 &= 0xFF;
        return var6;
    }
}
