package deob;

@ObfuscatedName("ab")
public class class50 {

    @ObfuscatedName("ab.g")
    public int field1086;

    @ObfuscatedName("ab.h")
    public int field1084;

    @ObfuscatedName("ab.s")
    public int[] field1083;

    @ObfuscatedName("ab.o")
    public int[] field1085;

    public class50() {
        class53.method1219(16);
        this.field1086 = class53.method1236() == 0 ? 1 : class53.method1219(4) + 1;
        if (class53.method1236() != 0) {
            class53.method1219(8);
        }
        class53.method1219(2);
        if (this.field1086 > 1) {
            this.field1084 = class53.method1219(4);
        }
        this.field1083 = new int[this.field1086];
        this.field1085 = new int[this.field1086];
        for (int var1 = 0; var1 < this.field1086; var1++) {
            class53.method1219(8);
            this.field1083[var1] = class53.method1219(8);
            this.field1085[var1] = class53.method1219(8);
        }
    }
}
