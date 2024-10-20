package deob;

@ObfuscatedName("bm")
public class class69 {

    @ObfuscatedName("bm.i")
    public int field1275;

    @ObfuscatedName("bm.v")
    public int field1274;

    @ObfuscatedName("bm.f")
    public int[] field1276;

    @ObfuscatedName("bm.h")
    public int[] field1277;

    public class69() {
        class71.method1400(16);
        this.field1275 = class71.method1399() == 0 ? 1 : class71.method1400(4) + 1;
        if (class71.method1399() != 0) {
            class71.method1400(8);
        }
        class71.method1400(2);
        if (this.field1275 > 1) {
            this.field1274 = class71.method1400(4);
        }
        this.field1276 = new int[this.field1275];
        this.field1277 = new int[this.field1275];
        for (int var1 = 0; var1 < this.field1275; var1++) {
            class71.method1400(8);
            this.field1276[var1] = class71.method1400(8);
            this.field1277[var1] = class71.method1400(8);
        }
    }
}
