package deob;

@ObfuscatedName("bl")
public class class72 {

    @ObfuscatedName("bl.s")
    public int field1322;

    @ObfuscatedName("bl.z")
    public int field1323;

    @ObfuscatedName("bl.t")
    public int[] field1324;

    @ObfuscatedName("bl.y")
    public int[] field1325;

    public class72() {
        class74.method1470(16);
        this.field1322 = class74.method1469() == 0 ? 1 : class74.method1470(4) + 1;
        if (class74.method1469() != 0) {
            class74.method1470(8);
        }
        class74.method1470(2);
        if (this.field1322 > 1) {
            this.field1323 = class74.method1470(4);
        }
        this.field1324 = new int[this.field1322];
        this.field1325 = new int[this.field1322];
        for (int var1 = 0; var1 < this.field1322; var1++) {
            class74.method1470(8);
            this.field1324[var1] = class74.method1470(8);
            this.field1325[var1] = class74.method1470(8);
        }
    }
}
