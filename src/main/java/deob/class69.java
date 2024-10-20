package deob;

@ObfuscatedName("bd")
public class class69 {

    @ObfuscatedName("bd.f")
    public int field1288;

    @ObfuscatedName("bd.s")
    public int field1285;

    @ObfuscatedName("bd.q")
    public int[] field1286;

    @ObfuscatedName("bd.g")
    public int[] field1287;

    public class69() {
        class71.method1450(16);
        this.field1288 = class71.method1449() == 0 ? 1 : class71.method1450(4) + 1;
        if (class71.method1449() != 0) {
            class71.method1450(8);
        }
        class71.method1450(2);
        if (this.field1288 > 1) {
            this.field1285 = class71.method1450(4);
        }
        this.field1286 = new int[this.field1288];
        this.field1287 = new int[this.field1288];
        for (int var1 = 0; var1 < this.field1288; var1++) {
            class71.method1450(8);
            this.field1286[var1] = class71.method1450(8);
            this.field1287[var1] = class71.method1450(8);
        }
    }
}
