package deob;

@ObfuscatedName("fw")
public class class174 extends class180 {

    @ObfuscatedName("fw.m")
    public long[] field2042 = new long[10];

    @ObfuscatedName("fw.o")
    public int field2045 = 256;

    @ObfuscatedName("fw.q")
    public int field2041 = 1;

    @ObfuscatedName("fw.j")
    public long field2043 = class307.method3253();

    @ObfuscatedName("fw.p")
    public int field2039 = 0;

    @ObfuscatedName("fw.g")
    public int field2044;

    public class174() {
        for (int var1 = 0; var1 < 10; var1++) {
            this.field2042[var1] = this.field2043;
        }
    }

    @ObfuscatedName("fw.m(I)V")
    public void method3247() {
        for (int var1 = 0; var1 < 10; var1++) {
            this.field2042[var1] = 0L;
        }
    }

    @ObfuscatedName("fw.o(III)I")
    public int method3250(int arg0, int arg1) {
        int var3 = this.field2045;
        int var4 = this.field2041;
        this.field2045 = 300;
        this.field2041 = 1;
        this.field2043 = class307.method3253();
        if (this.field2042[this.field2044] == 0L) {
            this.field2045 = var3;
            this.field2041 = var4;
        } else if (this.field2043 > this.field2042[this.field2044]) {
            this.field2045 = (int) ((long) (arg0 * 2560) / (this.field2043 - this.field2042[this.field2044]));
        }
        if (this.field2045 < 25) {
            this.field2045 = 25;
        }
        if (this.field2045 > 256) {
            this.field2045 = 256;
            this.field2041 = (int) ((long) arg0 - (this.field2043 - this.field2042[this.field2044]) / 10L);
        }
        if (this.field2041 > arg0) {
            this.field2041 = arg0;
        }
        this.field2042[this.field2044] = this.field2043;
        this.field2044 = (this.field2044 + 1) % 10;
        if (this.field2041 > 1) {
            for (int var5 = 0; var5 < 10; var5++) {
                if (this.field2042[var5] != 0L) {
                    this.field2042[var5] += (long) this.field2041;
                }
            }
        }
        if (this.field2041 < arg1) {
            this.field2041 = arg1;
        }
        long var6 = (long) this.field2041;
        if (var6 > 0L) {
            if (var6 % 10L == 0L) {
                class308.method3708(var6 - 1L);
                class308.method3708(1L);
            } else {
                class308.method3708(var6);
            }
        }
        int var8 = 0;
        while (this.field2039 < 256) {
            var8++;
            this.field2039 += this.field2045;
        }
        this.field2039 &= 0xFF;
        return var8;
    }
}
