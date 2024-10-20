package deob;

@ObfuscatedName("ed")
public class class141 extends class133 {

    @ObfuscatedName("ed.o")
    public long[] field2153 = new long[10];

    @ObfuscatedName("ed.f")
    public int field2158 = 256;

    @ObfuscatedName("ed.i")
    public int field2154 = 1;

    @ObfuscatedName("ed.h")
    public long field2155 = class115.method568();

    @ObfuscatedName("ed.q")
    public int field2152 = 0;

    @ObfuscatedName("ed.u")
    public int field2157;

    public class141() {
        for (int var1 = 0; var1 < 10; var1++) {
            this.field2153[var1] = this.field2155;
        }
    }

    @ObfuscatedName("ed.o(I)V")
    public void method2625() {
        for (int var1 = 0; var1 < 10; var1++) {
            this.field2153[var1] = 0L;
        }
    }

    @ObfuscatedName("ed.f(III)I")
    public int method2626(int arg0, int arg1) {
        int var3 = this.field2158;
        int var4 = this.field2154;
        this.field2158 = 300;
        this.field2154 = 1;
        this.field2155 = class115.method568();
        if (this.field2153[this.field2157] == 0L) {
            this.field2158 = var3;
            this.field2154 = var4;
        } else if (this.field2155 > this.field2153[this.field2157]) {
            this.field2158 = (int) ((long) (arg0 * 2560) / (this.field2155 - this.field2153[this.field2157]));
        }
        if (this.field2158 < 25) {
            this.field2158 = 25;
        }
        if (this.field2158 > 256) {
            this.field2158 = 256;
            this.field2154 = (int) ((long) arg0 - (this.field2155 - this.field2153[this.field2157]) / 10L);
        }
        if (this.field2154 > arg0) {
            this.field2154 = arg0;
        }
        this.field2153[this.field2157] = this.field2155;
        this.field2157 = (this.field2157 + 1) % 10;
        if (this.field2154 > 1) {
            for (int var5 = 0; var5 < 10; var5++) {
                if (this.field2153[var5] != 0L) {
                    this.field2153[var5] += (long) this.field2154;
                }
            }
        }
        if (this.field2154 < arg1) {
            this.field2154 = arg1;
        }
        class127.method16((long) this.field2154);
        int var6 = 0;
        while (this.field2152 < 256) {
            var6++;
            this.field2152 += this.field2158;
        }
        this.field2152 &= 0xFF;
        return var6;
    }
}
