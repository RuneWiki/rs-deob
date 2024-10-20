package deob;

@ObfuscatedName("bc")
public class class69 {

    @ObfuscatedName("bc.a")
    public int field1280;

    @ObfuscatedName("bc.r")
    public int field1281;

    @ObfuscatedName("bc.f")
    public int[] field1282;

    @ObfuscatedName("bc.s")
    public int[] field1283;

    public class69() {
        class71.method1451(16);
        this.field1280 = class71.method1450() == 0 ? 1 : class71.method1451(4) + 1;
        if (class71.method1450() != 0) {
            class71.method1451(8);
        }
        class71.method1451(2);
        if (this.field1280 > 1) {
            this.field1281 = class71.method1451(4);
        }
        this.field1282 = new int[this.field1280];
        this.field1283 = new int[this.field1280];
        for (int var1 = 0; var1 < this.field1280; var1++) {
            class71.method1451(8);
            this.field1282[var1] = class71.method1451(8);
            this.field1283[var1] = class71.method1451(8);
        }
    }
}
