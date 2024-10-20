package deob;

@ObfuscatedName("bv")
public class class64 extends class67 {

    @ObfuscatedName("bv.g")
    public long[] field1239 = new long[10];

    @ObfuscatedName("bv.e")
    public int field1238 = 256;

    @ObfuscatedName("bv.n")
    public int field1244 = 1;

    @ObfuscatedName("bv.j")
    public long field1240 = class120.method8();

    @ObfuscatedName("bv.i")
    public int field1242 = 0;

    @ObfuscatedName("bv.o")
    public int field1237;

    public class64() {
        for (int var1 = 0; var1 < 10; var1++) {
            this.field1239[var1] = this.field1240;
        }
    }

    @ObfuscatedName("bv.g(B)V")
    public void method1335() {
        for (int var1 = 0; var1 < 10; var1++) {
            this.field1239[var1] = 0L;
        }
    }

    @ObfuscatedName("bv.e(III)I")
    public int method1338(int arg0, int arg1) {
        int var3 = this.field1238;
        int var4 = this.field1244;
        this.field1238 = 300;
        this.field1244 = 1;
        this.field1240 = class120.method8();
        if (this.field1239[this.field1237] == 0L) {
            this.field1238 = var3;
            this.field1244 = var4;
        } else if (this.field1240 > this.field1239[this.field1237]) {
            this.field1238 = (int) ((long) (arg0 * 2560) / (this.field1240 - this.field1239[this.field1237]));
        }
        if (this.field1238 < 25) {
            this.field1238 = 25;
        }
        if (this.field1238 > 256) {
            this.field1238 = 256;
            this.field1244 = (int) ((long) arg0 - (this.field1240 - this.field1239[this.field1237]) / 10L);
        }
        if (this.field1244 > arg0) {
            this.field1244 = arg0;
        }
        this.field1239[this.field1237] = this.field1240;
        this.field1237 = (this.field1237 + 1) % 10;
        if (this.field1244 > 1) {
            for (int var5 = 0; var5 < 10; var5++) {
                if (this.field1239[var5] != 0L) {
                    this.field1239[var5] += (long) this.field1244;
                }
            }
        }
        if (this.field1244 < arg1) {
            this.field1244 = arg1;
        }
        class125.method2058((long) this.field1244);
        int var6 = 0;
        while (this.field1242 < 256) {
            var6++;
            this.field1242 += this.field1238;
        }
        this.field1242 &= 0xFF;
        return var6;
    }
}
