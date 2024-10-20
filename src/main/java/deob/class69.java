package deob;

@ObfuscatedName("bj")
public class class69 {

    @ObfuscatedName("bj.o")
    public int field1276;

    @ObfuscatedName("bj.e")
    public int field1274;

    @ObfuscatedName("bj.u")
    public int[] field1275;

    @ObfuscatedName("bj.b")
    public int[] field1277;

    public class69() {
        class71.method1404(16);
        this.field1276 = class71.method1406() == 0 ? 1 : class71.method1404(4) + 1;
        if (class71.method1406() != 0) {
            class71.method1404(8);
        }
        class71.method1404(2);
        if (this.field1276 > 1) {
            this.field1274 = class71.method1404(4);
        }
        this.field1275 = new int[this.field1276];
        this.field1277 = new int[this.field1276];
        for (int var1 = 0; var1 < this.field1276; var1++) {
            class71.method1404(8);
            this.field1275[var1] = class71.method1404(8);
            this.field1277[var1] = class71.method1404(8);
        }
    }
}
