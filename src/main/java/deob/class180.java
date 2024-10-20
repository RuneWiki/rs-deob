package deob;

@ObfuscatedName("gr")
public class class180 extends class183 {

    @ObfuscatedName("gr.au")
    public long[] field1901 = new long[10];

    @ObfuscatedName("gr.ae")
    public int field1897 = 256;

    @ObfuscatedName("gr.ao")
    public int field1900 = 1;

    @ObfuscatedName("gr.at")
    public long field1899 = class302.method655();

    @ObfuscatedName("gr.ac")
    public int field1896 = 0;

    @ObfuscatedName("gr.ai")
    public int field1902;

    public class180() {
        for (int var1 = 0; var1 < 10; var1++) {
            this.field1901[var1] = this.field1899;
        }
    }

    @ObfuscatedName("gr.au(I)V")
    public void method3109() {
        for (int var1 = 0; var1 < 10; var1++) {
            this.field1901[var1] = 0L;
        }
    }

    @ObfuscatedName("gr.ae(IIB)I")
    public int method3105(int arg0, int arg1) {
        int var3 = this.field1897;
        int var4 = this.field1900;
        this.field1897 = 300;
        this.field1900 = 1;
        this.field1899 = class302.method655();
        if (this.field1901[this.field1902] == 0L) {
            this.field1897 = var3;
            this.field1900 = var4;
        } else if (this.field1899 > this.field1901[this.field1902]) {
            this.field1897 = (int) ((long) (arg0 * 2560) / (this.field1899 - this.field1901[this.field1902]));
        }
        if (this.field1897 < 25) {
            this.field1897 = 25;
        }
        if (this.field1897 > 256) {
            this.field1897 = 256;
            this.field1900 = (int) ((long) arg0 - (this.field1899 - this.field1901[this.field1902]) / 10L);
        }
        if (this.field1900 > arg0) {
            this.field1900 = arg0;
        }
        this.field1901[this.field1902] = this.field1899;
        this.field1902 = (this.field1902 + 1) % 10;
        if (this.field1900 > 1) {
            for (int var5 = 0; var5 < 10; var5++) {
                if (this.field1901[var5] != 0L) {
                    this.field1901[var5] += (long) this.field1900;
                }
            }
        }
        if (this.field1900 < arg1) {
            this.field1900 = arg1;
        }
        class303.method2265((long) this.field1900);
        int var6 = 0;
        while (this.field1896 < 256) {
            var6++;
            this.field1896 += this.field1897;
        }
        this.field1896 &= 0xFF;
        return var6;
    }
}
