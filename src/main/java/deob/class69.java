package deob;

@ObfuscatedName("bh")
public class class69 {

    @ObfuscatedName("bh.z")
    public int field1278;

    @ObfuscatedName("bh.q")
    public int field1277;

    @ObfuscatedName("bh.k")
    public int[] field1276;

    @ObfuscatedName("bh.f")
    public int[] field1279;

    public class69() {
        class71.method1400(16);
        this.field1278 = class71.method1399() == 0 ? 1 : class71.method1400(4) + 1;
        if (class71.method1399() != 0) {
            class71.method1400(8);
        }
        class71.method1400(2);
        if (this.field1278 > 1) {
            this.field1277 = class71.method1400(4);
        }
        this.field1276 = new int[this.field1278];
        this.field1279 = new int[this.field1278];
        for (int var1 = 0; var1 < this.field1278; var1++) {
            class71.method1400(8);
            this.field1276[var1] = class71.method1400(8);
            this.field1279[var1] = class71.method1400(8);
        }
    }
}
