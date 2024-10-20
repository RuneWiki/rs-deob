package deob;

@ObfuscatedName("bc")
public class class69 {

    @ObfuscatedName("bc.w")
    public int field1289;

    @ObfuscatedName("bc.x")
    public int field1287;

    @ObfuscatedName("bc.t")
    public int[] field1286;

    @ObfuscatedName("bc.p")
    public int[] field1288;

    public class69() {
        class71.method1438(16);
        this.field1289 = class71.method1432() == 0 ? 1 : class71.method1438(4) + 1;
        if (class71.method1432() != 0) {
            class71.method1438(8);
        }
        class71.method1438(2);
        if (this.field1289 > 1) {
            this.field1287 = class71.method1438(4);
        }
        this.field1286 = new int[this.field1289];
        this.field1288 = new int[this.field1289];
        for (int var1 = 0; var1 < this.field1289; var1++) {
            class71.method1438(8);
            this.field1286[var1] = class71.method1438(8);
            this.field1288[var1] = class71.method1438(8);
        }
    }
}
