package deob;

@ObfuscatedName("by")
public class class65 extends class68 {

    @ObfuscatedName("by.i")
    public long[] field1256 = new long[10];

    @ObfuscatedName("by.w")
    public int field1257 = 256;

    @ObfuscatedName("by.f")
    public int field1263 = 1;

    @ObfuscatedName("by.e")
    public long field1258 = class121.method145();

    @ObfuscatedName("by.t")
    public int field1255 = 0;

    @ObfuscatedName("by.d")
    public int field1260;

    public class65() {
        for (int var1 = 0; var1 < 10; var1++) {
            this.field1256[var1] = this.field1258;
        }
    }

    @ObfuscatedName("by.i(I)V")
    public void method1333() {
        for (int var1 = 0; var1 < 10; var1++) {
            this.field1256[var1] = 0L;
        }
    }

    @ObfuscatedName("by.w(IIB)I")
    public int method1340(int arg0, int arg1) {
        int var3 = this.field1257;
        int var4 = this.field1263;
        this.field1257 = 300;
        this.field1263 = 1;
        this.field1258 = class121.method145();
        if (this.field1256[this.field1260] == 0L) {
            this.field1257 = var3;
            this.field1263 = var4;
        } else if (this.field1258 > this.field1256[this.field1260]) {
            this.field1257 = (int) ((long) (arg0 * 2560) / (this.field1258 - this.field1256[this.field1260]));
        }
        if (this.field1257 < 25) {
            this.field1257 = 25;
        }
        if (this.field1257 > 256) {
            this.field1257 = 256;
            this.field1263 = (int) ((long) arg0 - (this.field1258 - this.field1256[this.field1260]) / 10L);
        }
        if (this.field1263 > arg0) {
            this.field1263 = arg0;
        }
        this.field1256[this.field1260] = this.field1258;
        this.field1260 = (this.field1260 + 1) % 10;
        if (this.field1263 > 1) {
            for (int var5 = 0; var5 < 10; var5++) {
                if (this.field1256[var5] != 0L) {
                    this.field1256[var5] += (long) this.field1263;
                }
            }
        }
        if (this.field1263 < arg1) {
            this.field1263 = arg1;
        }
        class126.method738((long) this.field1263);
        int var6 = 0;
        while (this.field1255 < 256) {
            var6++;
            this.field1255 += this.field1257;
        }
        this.field1255 &= 0xFF;
        return var6;
    }
}
