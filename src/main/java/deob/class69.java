package deob;

@ObfuscatedName("bb")
public class class69 {

    @ObfuscatedName("bb.s")
    public int field1286;

    @ObfuscatedName("bb.j")
    public int field1288;

    @ObfuscatedName("bb.p")
    public int[] field1287;

    @ObfuscatedName("bb.x")
    public int[] field1289;

    public class69() {
        class71.method1419(16);
        this.field1286 = class71.method1439() == 0 ? 1 : class71.method1419(4) + 1;
        if (class71.method1439() != 0) {
            class71.method1419(8);
        }
        class71.method1419(2);
        if (this.field1286 > 1) {
            this.field1288 = class71.method1419(4);
        }
        this.field1287 = new int[this.field1286];
        this.field1289 = new int[this.field1286];
        for (int var1 = 0; var1 < this.field1286; var1++) {
            class71.method1419(8);
            this.field1287[var1] = class71.method1419(8);
            this.field1289[var1] = class71.method1419(8);
        }
    }
}
