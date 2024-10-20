package deob;

@ObfuscatedName("aj")
public class class50 {

    @ObfuscatedName("aj.b")
    public int field1089;

    @ObfuscatedName("aj.c")
    public int field1087;

    @ObfuscatedName("aj.j")
    public int[] field1086;

    @ObfuscatedName("aj.i")
    public int[] field1088;

    public class50() {
        class53.method1179(16);
        this.field1089 = class53.method1202() == 0 ? 1 : class53.method1179(4) + 1;
        if (class53.method1202() != 0) {
            class53.method1179(8);
        }
        class53.method1179(2);
        if (this.field1089 > 1) {
            this.field1087 = class53.method1179(4);
        }
        this.field1086 = new int[this.field1089];
        this.field1088 = new int[this.field1089];
        for (int var1 = 0; var1 < this.field1089; var1++) {
            class53.method1179(8);
            this.field1086[var1] = class53.method1179(8);
            this.field1088[var1] = class53.method1179(8);
        }
    }
}
