package deob;

@ObfuscatedName("by")
public class class62 {

    @ObfuscatedName("by.e")
    public int field1186;

    @ObfuscatedName("by.o")
    public int field1184;

    @ObfuscatedName("by.y")
    public int[] field1187;

    @ObfuscatedName("by.b")
    public int[] field1185;

    public class62() {
        class64.method1257(16);
        this.field1186 = class64.method1245() == 0 ? 1 : class64.method1257(4) + 1;
        if (class64.method1245() != 0) {
            class64.method1257(8);
        }
        class64.method1257(2);
        if (this.field1186 > 1) {
            this.field1184 = class64.method1257(4);
        }
        this.field1187 = new int[this.field1186];
        this.field1185 = new int[this.field1186];
        for (int var1 = 0; var1 < this.field1186; var1++) {
            class64.method1257(8);
            this.field1187[var1] = class64.method1257(8);
            this.field1185[var1] = class64.method1257(8);
        }
    }
}
