package deob;

@ObfuscatedName("ay")
public class class49 {

    @ObfuscatedName("ay.c")
    public int field1068;

    @ObfuscatedName("ay.j")
    public int field1069;

    @ObfuscatedName("ay.f")
    public int[] field1070;

    @ObfuscatedName("ay.y")
    public int[] field1071;

    public class49() {
        class52.method1144(16);
        this.field1068 = class52.method1173() == 0 ? 1 : class52.method1144(4) + 1;
        if (class52.method1173() != 0) {
            class52.method1144(8);
        }
        class52.method1144(2);
        if (this.field1068 > 1) {
            this.field1069 = class52.method1144(4);
        }
        this.field1070 = new int[this.field1068];
        this.field1071 = new int[this.field1068];
        for (int var1 = 0; var1 < this.field1068; var1++) {
            class52.method1144(8);
            this.field1070[var1] = class52.method1144(8);
            this.field1071[var1] = class52.method1144(8);
        }
    }
}
