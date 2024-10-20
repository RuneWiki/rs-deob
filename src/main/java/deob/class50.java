package deob;

@ObfuscatedName("aj")
public class class50 {

    @ObfuscatedName("aj.b")
    public int field1070;

    @ObfuscatedName("aj.e")
    public int field1069;

    @ObfuscatedName("aj.g")
    public int[] field1071;

    @ObfuscatedName("aj.o")
    public int[] field1072;

    public class50() {
        class53.method1173(16);
        this.field1070 = class53.method1172() == 0 ? 1 : class53.method1173(4) + 1;
        if (class53.method1172() != 0) {
            class53.method1173(8);
        }
        class53.method1173(2);
        if (this.field1070 > 1) {
            this.field1069 = class53.method1173(4);
        }
        this.field1071 = new int[this.field1070];
        this.field1072 = new int[this.field1070];
        for (int var1 = 0; var1 < this.field1070; var1++) {
            class53.method1173(8);
            this.field1071[var1] = class53.method1173(8);
            this.field1072[var1] = class53.method1173(8);
        }
    }
}
