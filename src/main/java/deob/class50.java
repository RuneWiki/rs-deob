package deob;

@ObfuscatedName("ay")
public class class50 {

    @ObfuscatedName("ay.y")
    public int field1069;

    @ObfuscatedName("ay.m")
    public int field1068;

    @ObfuscatedName("ay.d")
    public int[] field1070;

    @ObfuscatedName("ay.k")
    public int[] field1071;

    public class50() {
        class53.method1226(16);
        this.field1069 = class53.method1196() == 0 ? 1 : class53.method1226(4) + 1;
        if (class53.method1196() != 0) {
            class53.method1226(8);
        }
        class53.method1226(2);
        if (this.field1069 > 1) {
            this.field1068 = class53.method1226(4);
        }
        this.field1070 = new int[this.field1069];
        this.field1071 = new int[this.field1069];
        for (int var1 = 0; var1 < this.field1069; var1++) {
            class53.method1226(8);
            this.field1070[var1] = class53.method1226(8);
            this.field1071[var1] = class53.method1226(8);
        }
    }
}
