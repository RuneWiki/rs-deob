package deob;

@ObfuscatedName("ev")
public class class153 extends class163 {

    @ObfuscatedName("ev.y")
    public long[] field1963 = new long[10];

    @ObfuscatedName("ev.c")
    public int field1964 = 256;

    @ObfuscatedName("ev.n")
    public int field1962 = 1;

    @ObfuscatedName("ev.u")
    public long field1965 = class187.method1700();

    @ObfuscatedName("ev.i")
    public int field1966 = 0;

    @ObfuscatedName("ev.r")
    public int field1967;

    public class153() {
        for (int var1 = 0; var1 < 10; var1++) {
            this.field1963[var1] = this.field1965;
        }
    }

    @ObfuscatedName("ev.y(I)V")
    public void method2951() {
        for (int var1 = 0; var1 < 10; var1++) {
            this.field1963[var1] = 0L;
        }
    }

    @ObfuscatedName("ev.c(III)I")
    public int method2952(int arg0, int arg1) {
        int var3 = this.field1964;
        int var4 = this.field1962;
        this.field1964 = 300;
        this.field1962 = 1;
        this.field1965 = class187.method1700();
        if (this.field1963[this.field1967] == 0L) {
            this.field1964 = var3;
            this.field1962 = var4;
        } else if (this.field1965 > this.field1963[this.field1967]) {
            this.field1964 = (int) ((long) (arg0 * 2560) / (this.field1965 - this.field1963[this.field1967]));
        }
        if (this.field1964 < 25) {
            this.field1964 = 25;
        }
        if (this.field1964 > 256) {
            this.field1964 = 256;
            this.field1962 = (int) ((long) arg0 - (this.field1965 - this.field1963[this.field1967]) / 10L);
        }
        if (this.field1962 > arg0) {
            this.field1962 = arg0;
        }
        this.field1963[this.field1967] = this.field1965;
        this.field1967 = (this.field1967 + 1) % 10;
        if (this.field1962 > 1) {
            for (int var5 = 0; var5 < 10; var5++) {
                if (this.field1963[var5] != 0L) {
                    this.field1963[var5] += (long) this.field1962;
                }
            }
        }
        if (this.field1962 < arg1) {
            this.field1962 = arg1;
        }
        class194.method1689((long) this.field1962);
        int var6 = 0;
        while (this.field1966 < 256) {
            var6++;
            this.field1966 += this.field1964;
        }
        this.field1966 &= 0xFF;
        return var6;
    }
}
