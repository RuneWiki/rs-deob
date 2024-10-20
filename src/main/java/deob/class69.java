package deob;

@ObfuscatedName("bm")
public class class69 {

    @ObfuscatedName("bm.t")
    public int field1287;

    @ObfuscatedName("bm.i")
    public int field1285;

    @ObfuscatedName("bm.g")
    public int[] field1286;

    @ObfuscatedName("bm.h")
    public int[] field1284;

    public class69() {
        class71.method1380(16);
        this.field1287 = class71.method1398() == 0 ? 1 : class71.method1380(4) + 1;
        if (class71.method1398() != 0) {
            class71.method1380(8);
        }
        class71.method1380(2);
        if (this.field1287 > 1) {
            this.field1285 = class71.method1380(4);
        }
        this.field1286 = new int[this.field1287];
        this.field1284 = new int[this.field1287];
        for (int var1 = 0; var1 < this.field1287; var1++) {
            class71.method1380(8);
            this.field1286[var1] = class71.method1380(8);
            this.field1284[var1] = class71.method1380(8);
        }
    }
}
