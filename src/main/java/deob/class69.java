package deob;

@ObfuscatedName("bm")
public class class69 {

    @ObfuscatedName("bm.m")
    public int field1239;

    @ObfuscatedName("bm.l")
    public int field1237;

    @ObfuscatedName("bm.y")
    public int[] field1236;

    @ObfuscatedName("bm.u")
    public int[] field1238;

    public class69() {
        class71.method1475(16);
        this.field1239 = class71.method1474() == 0 ? 1 : class71.method1475(4) + 1;
        if (class71.method1474() != 0) {
            class71.method1475(8);
        }
        class71.method1475(2);
        if (this.field1239 > 1) {
            this.field1237 = class71.method1475(4);
        }
        this.field1236 = new int[this.field1239];
        this.field1238 = new int[this.field1239];
        for (int var1 = 0; var1 < this.field1239; var1++) {
            class71.method1475(8);
            this.field1236[var1] = class71.method1475(8);
            this.field1238[var1] = class71.method1475(8);
        }
    }
}
