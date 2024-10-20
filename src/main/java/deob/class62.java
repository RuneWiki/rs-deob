package deob;

@ObfuscatedName("bs")
public class class62 {

    @ObfuscatedName("bs.j")
    public int field1188;

    @ObfuscatedName("bs.z")
    public int field1185;

    @ObfuscatedName("bs.y")
    public int[] field1187;

    @ObfuscatedName("bs.h")
    public int[] field1186;

    public class62() {
        class64.method1272(16);
        this.field1188 = class64.method1267() == 0 ? 1 : class64.method1272(4) + 1;
        if (class64.method1267() != 0) {
            class64.method1272(8);
        }
        class64.method1272(2);
        if (this.field1188 > 1) {
            this.field1185 = class64.method1272(4);
        }
        this.field1187 = new int[this.field1188];
        this.field1186 = new int[this.field1188];
        for (int var1 = 0; var1 < this.field1188; var1++) {
            class64.method1272(8);
            this.field1187[var1] = class64.method1272(8);
            this.field1186[var1] = class64.method1272(8);
        }
    }
}
