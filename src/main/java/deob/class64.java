package deob;

@ObfuscatedName("bg")
public class class64 extends class67 {

    @ObfuscatedName("bg.p")
    public long[] field1248 = new long[10];

    @ObfuscatedName("bg.j")
    public int field1245 = 256;

    @ObfuscatedName("bg.w")
    public int field1246 = 1;

    @ObfuscatedName("bg.h")
    public long field1247 = class120.method1322();

    @ObfuscatedName("bg.v")
    public int field1244 = 0;

    @ObfuscatedName("bg.k")
    public int field1249;

    public class64() {
        for (int var1 = 0; var1 < 10; var1++) {
            this.field1248[var1] = this.field1247;
        }
    }

    @ObfuscatedName("bg.p(I)V")
    public void method1303() {
        for (int var1 = 0; var1 < 10; var1++) {
            this.field1248[var1] = 0L;
        }
    }

    @ObfuscatedName("bg.j(IIB)I")
    public int method1304(int arg0, int arg1) {
        int var3 = this.field1245;
        int var4 = this.field1246;
        this.field1245 = 300;
        this.field1246 = 1;
        this.field1247 = class120.method1322();
        if (this.field1248[this.field1249] == 0L) {
            this.field1245 = var3;
            this.field1246 = var4;
        } else if (this.field1247 > this.field1248[this.field1249]) {
            this.field1245 = (int) ((long) (arg0 * 2560) / (this.field1247 - this.field1248[this.field1249]));
        }
        if (this.field1245 < 25) {
            this.field1245 = 25;
        }
        if (this.field1245 > 256) {
            this.field1245 = 256;
            this.field1246 = (int) ((long) arg0 - (this.field1247 - this.field1248[this.field1249]) / 10L);
        }
        if (this.field1246 > arg0) {
            this.field1246 = arg0;
        }
        this.field1248[this.field1249] = this.field1247;
        this.field1249 = (this.field1249 + 1) % 10;
        if (this.field1246 > 1) {
            for (int var5 = 0; var5 < 10; var5++) {
                if (this.field1248[var5] != 0L) {
                    this.field1248[var5] += (long) this.field1246;
                }
            }
        }
        if (this.field1246 < arg1) {
            this.field1246 = arg1;
        }
        class125.method123((long) this.field1246);
        int var6 = 0;
        while (this.field1244 < 256) {
            var6++;
            this.field1244 += this.field1245;
        }
        this.field1244 &= 0xFF;
        return var6;
    }
}
