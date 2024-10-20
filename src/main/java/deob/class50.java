package deob;

@ObfuscatedName("az")
public class class50 {

    @ObfuscatedName("az.p")
    public int field1086;

    @ObfuscatedName("az.i")
    public int field1087;

    @ObfuscatedName("az.o")
    public int[] field1088;

    @ObfuscatedName("az.n")
    public int[] field1089;

    public class50() {
        class53.method1223(16);
        this.field1086 = class53.method1243() == 0 ? 1 : class53.method1223(4) + 1;
        if (class53.method1243() != 0) {
            class53.method1223(8);
        }
        class53.method1223(2);
        if (this.field1086 > 1) {
            this.field1087 = class53.method1223(4);
        }
        this.field1088 = new int[this.field1086];
        this.field1089 = new int[this.field1086];
        for (int var1 = 0; var1 < this.field1086; var1++) {
            class53.method1223(8);
            this.field1088[var1] = class53.method1223(8);
            this.field1089[var1] = class53.method1223(8);
        }
    }
}
