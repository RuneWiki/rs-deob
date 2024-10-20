package deob;

@ObfuscatedName("bb")
public class class64 extends class67 {

    @ObfuscatedName("bb.c")
    public long[] field1239 = new long[10];

    @ObfuscatedName("bb.j")
    public int field1231 = 256;

    @ObfuscatedName("bb.f")
    public int field1232 = 1;

    @ObfuscatedName("bb.y")
    public long field1233 = class120.method774();

    @ObfuscatedName("bb.x")
    public int field1230 = 0;

    @ObfuscatedName("bb.e")
    public int field1235;

    public class64() {
        for (int var1 = 0; var1 < 10; var1++) {
            this.field1239[var1] = this.field1233;
        }
    }

    @ObfuscatedName("bb.c(B)V")
    public void method1298() {
        for (int var1 = 0; var1 < 10; var1++) {
            this.field1239[var1] = 0L;
        }
    }

    @ObfuscatedName("bb.j(III)I")
    public int method1299(int arg0, int arg1) {
        int var3 = this.field1231;
        int var4 = this.field1232;
        this.field1231 = 300;
        this.field1232 = 1;
        this.field1233 = class120.method774();
        if (this.field1239[this.field1235] == 0L) {
            this.field1231 = var3;
            this.field1232 = var4;
        } else if (this.field1233 > this.field1239[this.field1235]) {
            this.field1231 = (int) ((long) (arg0 * 2560) / (this.field1233 - this.field1239[this.field1235]));
        }
        if (this.field1231 < 25) {
            this.field1231 = 25;
        }
        if (this.field1231 > 256) {
            this.field1231 = 256;
            this.field1232 = (int) ((long) arg0 - (this.field1233 - this.field1239[this.field1235]) / 10L);
        }
        if (this.field1232 > arg0) {
            this.field1232 = arg0;
        }
        this.field1239[this.field1235] = this.field1233;
        this.field1235 = (this.field1235 + 1) % 10;
        if (this.field1232 > 1) {
            for (int var5 = 0; var5 < 10; var5++) {
                if (this.field1239[var5] != 0L) {
                    this.field1239[var5] += (long) this.field1232;
                }
            }
        }
        if (this.field1232 < arg1) {
            this.field1232 = arg1;
        }
        class126.method2308((long) this.field1232);
        int var6 = 0;
        while (this.field1230 < 256) {
            var6++;
            this.field1230 += this.field1231;
        }
        this.field1230 &= 0xFF;
        return var6;
    }
}
