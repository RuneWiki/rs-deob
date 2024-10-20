package deob;

@ObfuscatedName("bo")
public class class69 {

    @ObfuscatedName("bo.b")
    public int field1248;

    @ObfuscatedName("bo.g")
    public int field1249;

    @ObfuscatedName("bo.j")
    public int[] field1250;

    @ObfuscatedName("bo.d")
    public int[] field1251;

    public class69() {
        class71.method1431(16);
        this.field1248 = class71.method1433() == 0 ? 1 : class71.method1431(4) + 1;
        if (class71.method1433() != 0) {
            class71.method1431(8);
        }
        class71.method1431(2);
        if (this.field1248 > 1) {
            this.field1249 = class71.method1431(4);
        }
        this.field1250 = new int[this.field1248];
        this.field1251 = new int[this.field1248];
        for (int var1 = 0; var1 < this.field1248; var1++) {
            class71.method1431(8);
            this.field1250[var1] = class71.method1431(8);
            this.field1251[var1] = class71.method1431(8);
        }
    }
}
