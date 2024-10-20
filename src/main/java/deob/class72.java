package deob;

@ObfuscatedName("bt")
public class class72 {

    @ObfuscatedName("bt.x")
    public int field1325;

    @ObfuscatedName("bt.r")
    public int field1327;

    @ObfuscatedName("bt.j")
    public int[] field1324;

    @ObfuscatedName("bt.z")
    public int[] field1326;

    public class72() {
        class74.method1469(16);
        this.field1325 = class74.method1467() == 0 ? 1 : class74.method1469(4) + 1;
        if (class74.method1467() != 0) {
            class74.method1469(8);
        }
        class74.method1469(2);
        if (this.field1325 > 1) {
            this.field1327 = class74.method1469(4);
        }
        this.field1324 = new int[this.field1325];
        this.field1326 = new int[this.field1325];
        for (int var1 = 0; var1 < this.field1325; var1++) {
            class74.method1469(8);
            this.field1324[var1] = class74.method1469(8);
            this.field1326[var1] = class74.method1469(8);
        }
    }
}
