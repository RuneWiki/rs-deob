package deob;

@ObfuscatedName("bl")
public class class64 extends class67 {

    @ObfuscatedName("bl.j")
    public long[] field1236 = new long[10];

    @ObfuscatedName("bl.y")
    public int field1232 = 256;

    @ObfuscatedName("bl.x")
    public int field1230 = 1;

    @ObfuscatedName("bl.z")
    public long field1231 = class120.method2616();

    @ObfuscatedName("bl.c")
    public int field1235 = 0;

    @ObfuscatedName("bl.e")
    public int field1233;

    public class64() {
        for (int var1 = 0; var1 < 10; var1++) {
            this.field1236[var1] = this.field1231;
        }
    }

    @ObfuscatedName("bl.j(I)V")
    public void method1314() {
        for (int var1 = 0; var1 < 10; var1++) {
            this.field1236[var1] = 0L;
        }
    }

    @ObfuscatedName("bl.y(III)I")
    public int method1315(int arg0, int arg1) {
        int var3 = this.field1232;
        int var4 = this.field1230;
        this.field1232 = 300;
        this.field1230 = 1;
        this.field1231 = class120.method2616();
        if (this.field1236[this.field1233] == 0L) {
            this.field1232 = var3;
            this.field1230 = var4;
        } else if (this.field1231 > this.field1236[this.field1233]) {
            this.field1232 = (int) ((long) (arg0 * 2560) / (this.field1231 - this.field1236[this.field1233]));
        }
        if (this.field1232 < 25) {
            this.field1232 = 25;
        }
        if (this.field1232 > 256) {
            this.field1232 = 256;
            this.field1230 = (int) ((long) arg0 - (this.field1231 - this.field1236[this.field1233]) / 10L);
        }
        if (this.field1230 > arg0) {
            this.field1230 = arg0;
        }
        this.field1236[this.field1233] = this.field1231;
        this.field1233 = (this.field1233 + 1) % 10;
        if (this.field1230 > 1) {
            for (int var5 = 0; var5 < 10; var5++) {
                if (this.field1236[var5] != 0L) {
                    this.field1236[var5] += (long) this.field1230;
                }
            }
        }
        if (this.field1230 < arg1) {
            this.field1230 = arg1;
        }
        class125.method112((long) this.field1230);
        int var6 = 0;
        while (this.field1235 < 256) {
            var6++;
            this.field1235 += this.field1232;
        }
        this.field1235 &= 0xFF;
        return var6;
    }
}
