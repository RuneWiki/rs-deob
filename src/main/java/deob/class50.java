package deob;

@ObfuscatedName("ai")
public class class50 {

    @ObfuscatedName("ai.l")
    public int field1075;

    @ObfuscatedName("ai.b")
    public int field1076;

    @ObfuscatedName("ai.o")
    public int[] field1077;

    @ObfuscatedName("ai.w")
    public int[] field1078;

    public class50() {
        class53.method1195(16);
        this.field1075 = class53.method1194() == 0 ? 1 : class53.method1195(4) + 1;
        if (class53.method1194() != 0) {
            class53.method1195(8);
        }
        class53.method1195(2);
        if (this.field1075 > 1) {
            this.field1076 = class53.method1195(4);
        }
        this.field1077 = new int[this.field1075];
        this.field1078 = new int[this.field1075];
        for (int var1 = 0; var1 < this.field1075; var1++) {
            class53.method1195(8);
            this.field1077[var1] = class53.method1195(8);
            this.field1078[var1] = class53.method1195(8);
        }
    }
}
