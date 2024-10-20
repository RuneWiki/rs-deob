package deob;

@ObfuscatedName("bz")
public class class69 {

    @ObfuscatedName("bz.j")
    public int field1288;

    @ObfuscatedName("bz.l")
    public int field1289;

    @ObfuscatedName("bz.a")
    public int[] field1290;

    @ObfuscatedName("bz.i")
    public int[] field1291;

    public class69() {
        class71.method1456(16);
        this.field1288 = class71.method1434() == 0 ? 1 : class71.method1456(4) + 1;
        if (class71.method1434() != 0) {
            class71.method1456(8);
        }
        class71.method1456(2);
        if (this.field1288 > 1) {
            this.field1289 = class71.method1456(4);
        }
        this.field1290 = new int[this.field1288];
        this.field1291 = new int[this.field1288];
        for (int var1 = 0; var1 < this.field1288; var1++) {
            class71.method1456(8);
            this.field1290[var1] = class71.method1456(8);
            this.field1291[var1] = class71.method1456(8);
        }
    }
}
