package deob;

@ObfuscatedName("ex")
public class class142 extends class134 {

    @ObfuscatedName("ex.j")
    public long[] field2148 = new long[10];

    @ObfuscatedName("ex.h")
    public int field2149 = 256;

    @ObfuscatedName("ex.m")
    public int field2152 = 1;

    @ObfuscatedName("ex.z")
    public long field2146 = class116.method1579();

    @ObfuscatedName("ex.x")
    public int field2147 = 0;

    @ObfuscatedName("ex.e")
    public int field2144;

    public class142() {
        for (int var1 = 0; var1 < 10; var1++) {
            this.field2148[var1] = this.field2146;
        }
    }

    @ObfuscatedName("ex.j(B)V")
    public void method2677() {
        for (int var1 = 0; var1 < 10; var1++) {
            this.field2148[var1] = 0L;
        }
    }

    @ObfuscatedName("ex.h(III)I")
    public int method2678(int arg0, int arg1) {
        int var3 = this.field2149;
        int var4 = this.field2152;
        this.field2149 = 300;
        this.field2152 = 1;
        this.field2146 = class116.method1579();
        if (this.field2148[this.field2144] == 0L) {
            this.field2149 = var3;
            this.field2152 = var4;
        } else if (this.field2146 > this.field2148[this.field2144]) {
            this.field2149 = (int) ((long) (arg0 * 2560) / (this.field2146 - this.field2148[this.field2144]));
        }
        if (this.field2149 < 25) {
            this.field2149 = 25;
        }
        if (this.field2149 > 256) {
            this.field2149 = 256;
            this.field2152 = (int) ((long) arg0 - (this.field2146 - this.field2148[this.field2144]) / 10L);
        }
        if (this.field2152 > arg0) {
            this.field2152 = arg0;
        }
        this.field2148[this.field2144] = this.field2146;
        this.field2144 = (this.field2144 + 1) % 10;
        if (this.field2152 > 1) {
            for (int var5 = 0; var5 < 10; var5++) {
                if (this.field2148[var5] != 0L) {
                    this.field2148[var5] += (long) this.field2152;
                }
            }
        }
        if (this.field2152 < arg1) {
            this.field2152 = arg1;
        }
        class128.method167((long) this.field2152);
        int var6 = 0;
        while (this.field2147 < 256) {
            var6++;
            this.field2147 += this.field2149;
        }
        this.field2147 &= 0xFF;
        return var6;
    }
}
