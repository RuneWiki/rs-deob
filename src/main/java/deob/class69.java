package deob;

@ObfuscatedName("bv")
public class class69 {

    @ObfuscatedName("bv.h")
    public int field1287;

    @ObfuscatedName("bv.q")
    public int field1286;

    @ObfuscatedName("bv.v")
    public int[] field1285;

    @ObfuscatedName("bv.n")
    public int[] field1288;

    public class69() {
        class71.method1450(16);
        this.field1287 = class71.method1453() == 0 ? 1 : class71.method1450(4) + 1;
        if (class71.method1453() != 0) {
            class71.method1450(8);
        }
        class71.method1450(2);
        if (this.field1287 > 1) {
            this.field1286 = class71.method1450(4);
        }
        this.field1285 = new int[this.field1287];
        this.field1288 = new int[this.field1287];
        for (int var1 = 0; var1 < this.field1287; var1++) {
            class71.method1450(8);
            this.field1285[var1] = class71.method1450(8);
            this.field1288[var1] = class71.method1450(8);
        }
    }
}
