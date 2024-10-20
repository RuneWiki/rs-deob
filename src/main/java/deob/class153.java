package deob;

@ObfuscatedName("ep")
public class class153 extends class163 {

    @ObfuscatedName("ep.s")
    public long[] field2097 = new long[10];

    @ObfuscatedName("ep.g")
    public int field2098 = 256;

    @ObfuscatedName("ep.m")
    public int field2102 = 1;

    @ObfuscatedName("ep.h")
    public long field2100 = class187.method2705();

    @ObfuscatedName("ep.i")
    public int field2101 = 0;

    @ObfuscatedName("ep.w")
    public int field2099;

    public class153() {
        for (int var1 = 0; var1 < 10; var1++) {
            this.field2097[var1] = this.field2100;
        }
    }

    @ObfuscatedName("ep.s(I)V")
    public void method2956() {
        for (int var1 = 0; var1 < 10; var1++) {
            this.field2097[var1] = 0L;
        }
    }

    @ObfuscatedName("ep.g(III)I")
    public int method2955(int arg0, int arg1) {
        int var3 = this.field2098;
        int var4 = this.field2102;
        this.field2098 = 300;
        this.field2102 = 1;
        this.field2100 = class187.method2705();
        if (this.field2097[this.field2099] == 0L) {
            this.field2098 = var3;
            this.field2102 = var4;
        } else if (this.field2100 > this.field2097[this.field2099]) {
            this.field2098 = (int) ((long) (arg0 * 2560) / (this.field2100 - this.field2097[this.field2099]));
        }
        if (this.field2098 < 25) {
            this.field2098 = 25;
        }
        if (this.field2098 > 256) {
            this.field2098 = 256;
            this.field2102 = (int) ((long) arg0 - (this.field2100 - this.field2097[this.field2099]) / 10L);
        }
        if (this.field2102 > arg0) {
            this.field2102 = arg0;
        }
        this.field2097[this.field2099] = this.field2100;
        this.field2099 = (this.field2099 + 1) % 10;
        if (this.field2102 > 1) {
            for (int var5 = 0; var5 < 10; var5++) {
                if (this.field2097[var5] != 0L) {
                    this.field2097[var5] += (long) this.field2102;
                }
            }
        }
        if (this.field2102 < arg1) {
            this.field2102 = arg1;
        }
        class193.method2520((long) this.field2102);
        int var6 = 0;
        while (this.field2101 < 256) {
            var6++;
            this.field2101 += this.field2098;
        }
        this.field2101 &= 0xFF;
        return var6;
    }
}
