package deob;

@ObfuscatedName("bm")
public class class65 extends class68 {

    @ObfuscatedName("bm.x")
    public long[] field1224 = new long[10];

    @ObfuscatedName("bm.p")
    public int field1229 = 256;

    @ObfuscatedName("bm.k")
    public int field1225 = 1;

    @ObfuscatedName("bm.a")
    public long field1226 = class121.method2636();

    @ObfuscatedName("bm.q")
    public int field1227 = 0;

    @ObfuscatedName("bm.j")
    public int field1228;

    public class65() {
        for (int var1 = 0; var1 < 10; var1++) {
            this.field1224[var1] = this.field1226;
        }
    }

    @ObfuscatedName("bm.x(B)V")
    public void method1318() {
        for (int var1 = 0; var1 < 10; var1++) {
            this.field1224[var1] = 0L;
        }
    }

    @ObfuscatedName("bm.p(III)I")
    public int method1319(int arg0, int arg1) {
        int var3 = this.field1229;
        int var4 = this.field1225;
        this.field1229 = 300;
        this.field1225 = 1;
        this.field1226 = class121.method2636();
        if (this.field1224[this.field1228] == 0L) {
            this.field1229 = var3;
            this.field1225 = var4;
        } else if (this.field1226 > this.field1224[this.field1228]) {
            this.field1229 = (int) ((long) (arg0 * 2560) / (this.field1226 - this.field1224[this.field1228]));
        }
        if (this.field1229 < 25) {
            this.field1229 = 25;
        }
        if (this.field1229 > 256) {
            this.field1229 = 256;
            this.field1225 = (int) ((long) arg0 - (this.field1226 - this.field1224[this.field1228]) / 10L);
        }
        if (this.field1225 > arg0) {
            this.field1225 = arg0;
        }
        this.field1224[this.field1228] = this.field1226;
        this.field1228 = (this.field1228 + 1) % 10;
        if (this.field1225 > 1) {
            for (int var5 = 0; var5 < 10; var5++) {
                if (this.field1224[var5] != 0L) {
                    this.field1224[var5] += (long) this.field1225;
                }
            }
        }
        if (this.field1225 < arg1) {
            this.field1225 = arg1;
        }
        class126.method731((long) this.field1225);
        int var6 = 0;
        while (this.field1227 < 256) {
            var6++;
            this.field1227 += this.field1229;
        }
        this.field1227 &= 0xFF;
        return var6;
    }
}
