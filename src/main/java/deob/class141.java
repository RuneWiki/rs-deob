package deob;

@ObfuscatedName("et")
public class class141 extends class133 {

    @ObfuscatedName("et.c")
    public long[] field2132 = new long[10];

    @ObfuscatedName("et.h")
    public int field2129 = 256;

    @ObfuscatedName("et.k")
    public int field2130 = 1;

    @ObfuscatedName("et.t")
    public long field2131 = class115.method2622();

    @ObfuscatedName("et.g")
    public int field2134 = 0;

    @ObfuscatedName("et.o")
    public int field2133;

    public class141() {
        for (int var1 = 0; var1 < 10; var1++) {
            this.field2132[var1] = this.field2131;
        }
    }

    @ObfuscatedName("et.h(I)V")
    public void method2633() {
        for (int var1 = 0; var1 < 10; var1++) {
            this.field2132[var1] = 0L;
        }
    }

    @ObfuscatedName("et.k(III)I")
    public int method2634(int arg0, int arg1) {
        int var3 = this.field2129;
        int var4 = this.field2130;
        this.field2129 = 300;
        this.field2130 = 1;
        this.field2131 = class115.method2622();
        if (this.field2132[this.field2133] == 0L) {
            this.field2129 = var3;
            this.field2130 = var4;
        } else if (this.field2131 > this.field2132[this.field2133]) {
            this.field2129 = (int) ((long) (arg0 * 2560) / (this.field2131 - this.field2132[this.field2133]));
        }
        if (this.field2129 < 25) {
            this.field2129 = 25;
        }
        if (this.field2129 > 256) {
            this.field2129 = 256;
            this.field2130 = (int) ((long) arg0 - (this.field2131 - this.field2132[this.field2133]) / 10L);
        }
        if (this.field2130 > arg0) {
            this.field2130 = arg0;
        }
        this.field2132[this.field2133] = this.field2131;
        this.field2133 = (this.field2133 + 1) % 10;
        if (this.field2130 > 1) {
            for (int var5 = 0; var5 < 10; var5++) {
                if (this.field2132[var5] != 0L) {
                    this.field2132[var5] += (long) this.field2130;
                }
            }
        }
        if (this.field2130 < arg1) {
            this.field2130 = arg1;
        }
        class127.method2079((long) this.field2130);
        int var6 = 0;
        while (this.field2134 < 256) {
            var6++;
            this.field2134 += this.field2129;
        }
        this.field2134 &= 0xFF;
        return var6;
    }
}
