package deob;

@ObfuscatedName("be")
public class class69 {

    @ObfuscatedName("be.a")
    public int field1288;

    @ObfuscatedName("be.w")
    public int field1290;

    @ObfuscatedName("be.d")
    public int[] field1289;

    @ObfuscatedName("be.c")
    public int[] field1291;

    public class69() {
        class71.method1535(16);
        this.field1288 = class71.method1532() == 0 ? 1 : class71.method1535(4) + 1;
        if (class71.method1532() != 0) {
            class71.method1535(8);
        }
        class71.method1535(2);
        if (this.field1288 > 1) {
            this.field1290 = class71.method1535(4);
        }
        this.field1289 = new int[this.field1288];
        this.field1291 = new int[this.field1288];
        for (int var1 = 0; var1 < this.field1288; var1++) {
            class71.method1535(8);
            this.field1289[var1] = class71.method1535(8);
            this.field1291[var1] = class71.method1535(8);
        }
    }
}
