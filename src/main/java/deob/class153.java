package deob;

@ObfuscatedName("ec")
public class class153 extends class163 {

    @ObfuscatedName("ec.v")
    public long[] field1968 = new long[10];

    @ObfuscatedName("ec.s")
    public int field1966 = 256;

    @ObfuscatedName("ec.o")
    public int field1967 = 1;

    @ObfuscatedName("ec.k")
    public long field1972 = class187.method3154();

    @ObfuscatedName("ec.u")
    public int field1969 = 0;

    @ObfuscatedName("ec.i")
    public int field1970;

    public class153() {
        for (int var1 = 0; var1 < 10; var1++) {
            this.field1968[var1] = this.field1972;
        }
    }

    @ObfuscatedName("ec.v(I)V")
    public void method2959() {
        for (int var1 = 0; var1 < 10; var1++) {
            this.field1968[var1] = 0L;
        }
    }

    @ObfuscatedName("ec.s(III)I")
    public int method2960(int arg0, int arg1) {
        int var3 = this.field1966;
        int var4 = this.field1967;
        this.field1966 = 300;
        this.field1967 = 1;
        this.field1972 = class187.method3154();
        if (this.field1968[this.field1970] == 0L) {
            this.field1966 = var3;
            this.field1967 = var4;
        } else if (this.field1972 > this.field1968[this.field1970]) {
            this.field1966 = (int) ((long) (arg0 * 2560) / (this.field1972 - this.field1968[this.field1970]));
        }
        if (this.field1966 < 25) {
            this.field1966 = 25;
        }
        if (this.field1966 > 256) {
            this.field1966 = 256;
            this.field1967 = (int) ((long) arg0 - (this.field1972 - this.field1968[this.field1970]) / 10L);
        }
        if (this.field1967 > arg0) {
            this.field1967 = arg0;
        }
        this.field1968[this.field1970] = this.field1972;
        this.field1970 = (this.field1970 + 1) % 10;
        if (this.field1967 > 1) {
            for (int var5 = 0; var5 < 10; var5++) {
                if (this.field1968[var5] != 0L) {
                    this.field1968[var5] += (long) this.field1967;
                }
            }
        }
        if (this.field1967 < arg1) {
            this.field1967 = arg1;
        }
        class194.method668((long) this.field1967);
        int var6 = 0;
        while (this.field1969 < 256) {
            var6++;
            this.field1969 += this.field1966;
        }
        this.field1969 &= 0xFF;
        return var6;
    }
}
