package deob;

@ObfuscatedName("ba")
public class class69 {

    @ObfuscatedName("ba.g")
    public int field1275;

    @ObfuscatedName("ba.b")
    public int field1276;

    @ObfuscatedName("ba.w")
    public int[] field1274;

    @ObfuscatedName("ba.d")
    public int[] field1273;

    public class69() {
        class71.method1477(16);
        this.field1275 = class71.method1476() == 0 ? 1 : class71.method1477(4) + 1;
        if (class71.method1476() != 0) {
            class71.method1477(8);
        }
        class71.method1477(2);
        if (this.field1275 > 1) {
            this.field1276 = class71.method1477(4);
        }
        this.field1274 = new int[this.field1275];
        this.field1273 = new int[this.field1275];
        for (int var1 = 0; var1 < this.field1275; var1++) {
            class71.method1477(8);
            this.field1274[var1] = class71.method1477(8);
            this.field1273[var1] = class71.method1477(8);
        }
    }
}
