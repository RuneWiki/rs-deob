package deob;

@ObfuscatedName("fa")
public class class171 extends class174 {

    @ObfuscatedName("fa.a")
    public long[] field1835 = new long[10];

    @ObfuscatedName("fa.f")
    public int field1837 = 256;

    @ObfuscatedName("fa.c")
    public int field1832 = 1;

    @ObfuscatedName("fa.x")
    public long field1833 = class280.method2629();

    @ObfuscatedName("fa.h")
    public int field1834 = 0;

    @ObfuscatedName("fa.j")
    public int field1831;

    public class171() {
        for (int var1 = 0; var1 < 10; var1++) {
            this.field1835[var1] = this.field1833;
        }
    }

    @ObfuscatedName("fa.a(I)V")
    public void method2982() {
        for (int var1 = 0; var1 < 10; var1++) {
            this.field1835[var1] = 0L;
        }
    }

    @ObfuscatedName("fa.f(III)I")
    public int method2983(int arg0, int arg1) {
        int var3 = this.field1837;
        int var4 = this.field1832;
        this.field1837 = 300;
        this.field1832 = 1;
        this.field1833 = class280.method2629();
        if (this.field1835[this.field1831] == 0L) {
            this.field1837 = var3;
            this.field1832 = var4;
        } else if (this.field1833 > this.field1835[this.field1831]) {
            this.field1837 = (int) ((long) (arg0 * 2560) / (this.field1833 - this.field1835[this.field1831]));
        }
        if (this.field1837 < 25) {
            this.field1837 = 25;
        }
        if (this.field1837 > 256) {
            this.field1837 = 256;
            this.field1832 = (int) ((long) arg0 - (this.field1833 - this.field1835[this.field1831]) / 10L);
        }
        if (this.field1832 > arg0) {
            this.field1832 = arg0;
        }
        this.field1835[this.field1831] = this.field1833;
        this.field1831 = (this.field1831 + 1) % 10;
        if (this.field1832 > 1) {
            for (int var5 = 0; var5 < 10; var5++) {
                if (this.field1835[var5] != 0L) {
                    this.field1835[var5] += (long) this.field1832;
                }
            }
        }
        if (this.field1832 < arg1) {
            this.field1832 = arg1;
        }
        class281.method3621((long) this.field1832);
        int var6 = 0;
        while (this.field1834 < 256) {
            var6++;
            this.field1834 += this.field1837;
        }
        this.field1834 &= 0xFF;
        return var6;
    }
}
