package deob;

@ObfuscatedName("bb")
public class class69 {

    @ObfuscatedName("bb.f")
    public int field1297;

    @ObfuscatedName("bb.u")
    public int field1296;

    @ObfuscatedName("bb.x")
    public int[] field1298;

    @ObfuscatedName("bb.b")
    public int[] field1299;

    public class69() {
        class71.method1482(16);
        this.field1297 = class71.method1474() == 0 ? 1 : class71.method1482(4) + 1;
        if (class71.method1474() != 0) {
            class71.method1482(8);
        }
        class71.method1482(2);
        if (this.field1297 > 1) {
            this.field1296 = class71.method1482(4);
        }
        this.field1298 = new int[this.field1297];
        this.field1299 = new int[this.field1297];
        for (int var1 = 0; var1 < this.field1297; var1++) {
            class71.method1482(8);
            this.field1298[var1] = class71.method1482(8);
            this.field1299[var1] = class71.method1482(8);
        }
    }
}
