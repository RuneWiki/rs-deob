package deob;

@ObfuscatedName("bq")
public class class69 {

    @ObfuscatedName("bq.h")
    public int field1290;

    @ObfuscatedName("bq.m")
    public int field1293;

    @ObfuscatedName("bq.i")
    public int[] field1292;

    @ObfuscatedName("bq.q")
    public int[] field1291;

    public class69() {
        class71.method1434(16);
        this.field1290 = class71.method1416() == 0 ? 1 : class71.method1434(4) + 1;
        if (class71.method1416() != 0) {
            class71.method1434(8);
        }
        class71.method1434(2);
        if (this.field1290 > 1) {
            this.field1293 = class71.method1434(4);
        }
        this.field1292 = new int[this.field1290];
        this.field1291 = new int[this.field1290];
        for (int var1 = 0; var1 < this.field1290; var1++) {
            class71.method1434(8);
            this.field1292[var1] = class71.method1434(8);
            this.field1291[var1] = class71.method1434(8);
        }
    }
}
