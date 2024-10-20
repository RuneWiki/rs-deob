package deob;

@ObfuscatedName("bw")
public class class72 {

    @ObfuscatedName("bw.a")
    public int field1352;

    @ObfuscatedName("bw.d")
    public int field1353;

    @ObfuscatedName("bw.v")
    public int[] field1354;

    @ObfuscatedName("bw.r")
    public int[] field1355;

    public class72() {
        class74.method1512(16);
        this.field1352 = class74.method1495() == 0 ? 1 : class74.method1512(4) + 1;
        if (class74.method1495() != 0) {
            class74.method1512(8);
        }
        class74.method1512(2);
        if (this.field1352 > 1) {
            this.field1353 = class74.method1512(4);
        }
        this.field1354 = new int[this.field1352];
        this.field1355 = new int[this.field1352];
        for (int var1 = 0; var1 < this.field1352; var1++) {
            class74.method1512(8);
            this.field1354[var1] = class74.method1512(8);
            this.field1355[var1] = class74.method1512(8);
        }
    }
}
