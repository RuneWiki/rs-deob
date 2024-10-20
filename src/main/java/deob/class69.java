package deob;

@ObfuscatedName("be")
public class class69 {

    @ObfuscatedName("be.n")
    public int field1273;

    @ObfuscatedName("be.q")
    public int field1274;

    @ObfuscatedName("be.c")
    public int[] field1272;

    @ObfuscatedName("be.l")
    public int[] field1275;

    public class69() {
        class71.method1445(16);
        this.field1273 = class71.method1444() == 0 ? 1 : class71.method1445(4) + 1;
        if (class71.method1444() != 0) {
            class71.method1445(8);
        }
        class71.method1445(2);
        if (this.field1273 > 1) {
            this.field1274 = class71.method1445(4);
        }
        this.field1272 = new int[this.field1273];
        this.field1275 = new int[this.field1273];
        for (int var1 = 0; var1 < this.field1273; var1++) {
            class71.method1445(8);
            this.field1272[var1] = class71.method1445(8);
            this.field1275[var1] = class71.method1445(8);
        }
    }
}
