package deob;

@ObfuscatedName("bi")
public class class69 {

    @ObfuscatedName("bi.n")
    public int field1269;

    @ObfuscatedName("bi.d")
    public int field1266;

    @ObfuscatedName("bi.s")
    public int[] field1268;

    @ObfuscatedName("bi.q")
    public int[] field1267;

    public class69() {
        class71.method1426(16);
        this.field1269 = class71.method1434() == 0 ? 1 : class71.method1426(4) + 1;
        if (class71.method1434() != 0) {
            class71.method1426(8);
        }
        class71.method1426(2);
        if (this.field1269 > 1) {
            this.field1266 = class71.method1426(4);
        }
        this.field1268 = new int[this.field1269];
        this.field1267 = new int[this.field1269];
        for (int var1 = 0; var1 < this.field1269; var1++) {
            class71.method1426(8);
            this.field1268[var1] = class71.method1426(8);
            this.field1267[var1] = class71.method1426(8);
        }
    }
}
