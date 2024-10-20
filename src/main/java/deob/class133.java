package deob;

@ObfuscatedName("ej")
public class class133 extends class125 {

    @ObfuscatedName("ej.b")
    public long[] field2072 = new long[10];

    @ObfuscatedName("ej.e")
    public int field2067 = 256;

    @ObfuscatedName("ej.a")
    public int field2068 = 1;

    @ObfuscatedName("ej.k")
    public long field2066 = class107.method3468();

    @ObfuscatedName("ej.p")
    public int field2070 = 0;

    @ObfuscatedName("ej.l")
    public int field2071;

    public class133() {
        for (int var1 = 0; var1 < 10; var1++) {
            this.field2072[var1] = this.field2066;
        }
    }

    @ObfuscatedName("ej.b(I)V")
    public void method2474() {
        for (int var1 = 0; var1 < 10; var1++) {
            this.field2072[var1] = 0L;
        }
    }

    @ObfuscatedName("ej.e(IIB)I")
    public int method2475(int arg0, int arg1) {
        int var3 = this.field2067;
        int var4 = this.field2068;
        this.field2067 = 300;
        this.field2068 = 1;
        this.field2066 = class107.method3468();
        if (this.field2072[this.field2071] == 0L) {
            this.field2067 = var3;
            this.field2068 = var4;
        } else if (this.field2066 > this.field2072[this.field2071]) {
            this.field2067 = (int) ((long) (arg0 * 2560) / (this.field2066 - this.field2072[this.field2071]));
        }
        if (this.field2067 < 25) {
            this.field2067 = 25;
        }
        if (this.field2067 > 256) {
            this.field2067 = 256;
            this.field2068 = (int) ((long) arg0 - (this.field2066 - this.field2072[this.field2071]) / 10L);
        }
        if (this.field2068 > arg0) {
            this.field2068 = arg0;
        }
        this.field2072[this.field2071] = this.field2066;
        this.field2071 = (this.field2071 + 1) % 10;
        if (this.field2068 > 1) {
            for (int var5 = 0; var5 < 10; var5++) {
                if (this.field2072[var5] != 0L) {
                    this.field2072[var5] += (long) this.field2068;
                }
            }
        }
        if (this.field2068 < arg1) {
            this.field2068 = arg1;
        }
        class119.method555((long) this.field2068);
        int var6 = 0;
        while (this.field2070 < 256) {
            var6++;
            this.field2070 += this.field2067;
        }
        this.field2070 &= 0xFF;
        return var6;
    }
}
