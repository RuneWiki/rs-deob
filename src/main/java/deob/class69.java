package deob;

@ObfuscatedName("bv")
public class class69 {

    @ObfuscatedName("bv.v")
    public int field1279;

    @ObfuscatedName("bv.f")
    public int field1277;

    @ObfuscatedName("bv.i")
    public int[] field1278;

    @ObfuscatedName("bv.d")
    public int[] field1280;

    public class69() {
        class71.method1435(16);
        this.field1279 = class71.method1434() == 0 ? 1 : class71.method1435(4) + 1;
        if (class71.method1434() != 0) {
            class71.method1435(8);
        }
        class71.method1435(2);
        if (this.field1279 > 1) {
            this.field1277 = class71.method1435(4);
        }
        this.field1278 = new int[this.field1279];
        this.field1280 = new int[this.field1279];
        for (int var1 = 0; var1 < this.field1279; var1++) {
            class71.method1435(8);
            this.field1278[var1] = class71.method1435(8);
            this.field1280[var1] = class71.method1435(8);
        }
    }
}
