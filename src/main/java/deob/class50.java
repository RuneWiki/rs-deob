package deob;

@ObfuscatedName("ai")
public class class50 {

    @ObfuscatedName("ai.a")
    public int field1070;

    @ObfuscatedName("ai.r")
    public int field1072;

    @ObfuscatedName("ai.u")
    public int[] field1071;

    @ObfuscatedName("ai.t")
    public int[] field1073;

    public class50() {
        class53.method1122(16);
        this.field1070 = class53.method1119() == 0 ? 1 : class53.method1122(4) + 1;
        if (class53.method1119() != 0) {
            class53.method1122(8);
        }
        class53.method1122(2);
        if (this.field1070 > 1) {
            this.field1072 = class53.method1122(4);
        }
        this.field1071 = new int[this.field1070];
        this.field1073 = new int[this.field1070];
        for (int var1 = 0; var1 < this.field1070; var1++) {
            class53.method1122(8);
            this.field1071[var1] = class53.method1122(8);
            this.field1073[var1] = class53.method1122(8);
        }
    }
}
