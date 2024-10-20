package deob;

@ObfuscatedName("bp")
public class class69 {

    @ObfuscatedName("bp.c")
    public int field1276;

    @ObfuscatedName("bp.h")
    public int field1274;

    @ObfuscatedName("bp.k")
    public int[] field1273;

    @ObfuscatedName("bp.t")
    public int[] field1275;

    public class69() {
        class71.method1417(16);
        this.field1276 = class71.method1440() == 0 ? 1 : class71.method1417(4) + 1;
        if (class71.method1440() != 0) {
            class71.method1417(8);
        }
        class71.method1417(2);
        if (this.field1276 > 1) {
            this.field1274 = class71.method1417(4);
        }
        this.field1273 = new int[this.field1276];
        this.field1275 = new int[this.field1276];
        for (int var1 = 0; var1 < this.field1276; var1++) {
            class71.method1417(8);
            this.field1273[var1] = class71.method1417(8);
            this.field1275[var1] = class71.method1417(8);
        }
    }
}
