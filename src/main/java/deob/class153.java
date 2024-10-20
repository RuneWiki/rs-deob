package deob;

@ObfuscatedName("ew")
public class class153 extends class163 {

    @ObfuscatedName("ew.a")
    public long[] field2099 = new long[10];

    @ObfuscatedName("ew.w")
    public int field2098 = 256;

    @ObfuscatedName("ew.e")
    public int field2100 = 1;

    @ObfuscatedName("ew.k")
    public long field2103 = class187.method1411();

    @ObfuscatedName("ew.u")
    public int field2101 = 0;

    @ObfuscatedName("ew.z")
    public int field2102;

    public class153() {
        for (int var1 = 0; var1 < 10; var1++) {
            this.field2099[var1] = this.field2103;
        }
    }

    @ObfuscatedName("ew.a(I)V")
    public void method2694() {
        for (int var1 = 0; var1 < 10; var1++) {
            this.field2099[var1] = 0L;
        }
    }

    @ObfuscatedName("ew.w(III)I")
    public int method2699(int arg0, int arg1) {
        int var3 = this.field2098;
        int var4 = this.field2100;
        this.field2098 = 300;
        this.field2100 = 1;
        this.field2103 = class187.method1411();
        if (this.field2099[this.field2102] == 0L) {
            this.field2098 = var3;
            this.field2100 = var4;
        } else if (this.field2103 > this.field2099[this.field2102]) {
            this.field2098 = (int) ((long) (arg0 * 2560) / (this.field2103 - this.field2099[this.field2102]));
        }
        if (this.field2098 < 25) {
            this.field2098 = 25;
        }
        if (this.field2098 > 256) {
            this.field2098 = 256;
            this.field2100 = (int) ((long) arg0 - (this.field2103 - this.field2099[this.field2102]) / 10L);
        }
        if (this.field2100 > arg0) {
            this.field2100 = arg0;
        }
        this.field2099[this.field2102] = this.field2103;
        this.field2102 = (this.field2102 + 1) % 10;
        if (this.field2100 > 1) {
            for (int var5 = 0; var5 < 10; var5++) {
                if (this.field2099[var5] != 0L) {
                    this.field2099[var5] += (long) this.field2100;
                }
            }
        }
        if (this.field2100 < arg1) {
            this.field2100 = arg1;
        }
        class193.method1373((long) this.field2100);
        int var6 = 0;
        while (this.field2101 < 256) {
            var6++;
            this.field2101 += this.field2098;
        }
        this.field2101 &= 0xFF;
        return var6;
    }
}
