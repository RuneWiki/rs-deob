package deob;

@ObfuscatedName("bd")
public class class69 {

    @ObfuscatedName("bd.j")
    public int field1271;

    @ObfuscatedName("bd.m")
    public int field1269;

    @ObfuscatedName("bd.f")
    public int[] field1270;

    @ObfuscatedName("bd.l")
    public int[] field1268;

    public class69() {
        class71.method1444(16);
        this.field1271 = class71.method1442() == 0 ? 1 : class71.method1444(4) + 1;
        if (class71.method1442() != 0) {
            class71.method1444(8);
        }
        class71.method1444(2);
        if (this.field1271 > 1) {
            this.field1269 = class71.method1444(4);
        }
        this.field1270 = new int[this.field1271];
        this.field1268 = new int[this.field1271];
        for (int var1 = 0; var1 < this.field1271; var1++) {
            class71.method1444(8);
            this.field1270[var1] = class71.method1444(8);
            this.field1268[var1] = class71.method1444(8);
        }
    }
}
