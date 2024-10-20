package deob;

@ObfuscatedName("bt")
public class class69 {

    @ObfuscatedName("bt.d")
    public int field1281;

    @ObfuscatedName("bt.p")
    public int field1283;

    @ObfuscatedName("bt.v")
    public int[] field1282;

    @ObfuscatedName("bt.l")
    public int[] field1284;

    public class69() {
        class71.method1439(16);
        this.field1281 = class71.method1435() == 0 ? 1 : class71.method1439(4) + 1;
        if (class71.method1435() != 0) {
            class71.method1439(8);
        }
        class71.method1439(2);
        if (this.field1281 > 1) {
            this.field1283 = class71.method1439(4);
        }
        this.field1282 = new int[this.field1281];
        this.field1284 = new int[this.field1281];
        for (int var1 = 0; var1 < this.field1281; var1++) {
            class71.method1439(8);
            this.field1282[var1] = class71.method1439(8);
            this.field1284[var1] = class71.method1439(8);
        }
    }
}
