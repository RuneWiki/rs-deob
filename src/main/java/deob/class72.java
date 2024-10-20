package deob;

@ObfuscatedName("bb")
public class class72 {

    @ObfuscatedName("bb.l")
    public int field1352;

    @ObfuscatedName("bb.g")
    public int field1353;

    @ObfuscatedName("bb.r")
    public int[] field1354;

    @ObfuscatedName("bb.e")
    public int[] field1351;

    public class72() {
        class74.method1579(16);
        this.field1352 = class74.method1557() == 0 ? 1 : class74.method1579(4) + 1;
        if (class74.method1557() != 0) {
            class74.method1579(8);
        }
        class74.method1579(2);
        if (this.field1352 > 1) {
            this.field1353 = class74.method1579(4);
        }
        this.field1354 = new int[this.field1352];
        this.field1351 = new int[this.field1352];
        for (int var1 = 0; var1 < this.field1352; var1++) {
            class74.method1579(8);
            this.field1354[var1] = class74.method1579(8);
            this.field1351[var1] = class74.method1579(8);
        }
    }
}
