package deob;

@ObfuscatedName("bq")
public class class69 {

    @ObfuscatedName("bq.y")
    public int field1281;

    @ObfuscatedName("bq.d")
    public int field1280;

    @ObfuscatedName("bq.g")
    public int[] field1282;

    @ObfuscatedName("bq.w")
    public int[] field1283;

    public class69() {
        class71.method1436(16);
        this.field1281 = class71.method1435() == 0 ? 1 : class71.method1436(4) + 1;
        if (class71.method1435() != 0) {
            class71.method1436(8);
        }
        class71.method1436(2);
        if (this.field1281 > 1) {
            this.field1280 = class71.method1436(4);
        }
        this.field1282 = new int[this.field1281];
        this.field1283 = new int[this.field1281];
        for (int var1 = 0; var1 < this.field1281; var1++) {
            class71.method1436(8);
            this.field1282[var1] = class71.method1436(8);
            this.field1283[var1] = class71.method1436(8);
        }
    }
}
