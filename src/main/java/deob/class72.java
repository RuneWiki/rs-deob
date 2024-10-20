package deob;

@ObfuscatedName("bl")
public class class72 {

    @ObfuscatedName("bl.m")
    public int field1354;

    @ObfuscatedName("bl.w")
    public int field1355;

    @ObfuscatedName("bl.e")
    public int[] field1356;

    @ObfuscatedName("bl.o")
    public int[] field1357;

    public class72() {
        class74.method1523(16);
        this.field1354 = class74.method1521() == 0 ? 1 : class74.method1523(4) + 1;
        if (class74.method1521() != 0) {
            class74.method1523(8);
        }
        class74.method1523(2);
        if (this.field1354 > 1) {
            this.field1355 = class74.method1523(4);
        }
        this.field1356 = new int[this.field1354];
        this.field1357 = new int[this.field1354];
        for (int var1 = 0; var1 < this.field1354; var1++) {
            class74.method1523(8);
            this.field1356[var1] = class74.method1523(8);
            this.field1357[var1] = class74.method1523(8);
        }
    }
}
