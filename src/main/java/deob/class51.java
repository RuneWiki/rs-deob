package deob;

@ObfuscatedName("ab")
public class class51 {

    @ObfuscatedName("ab.e")
    public int field1101;

    @ObfuscatedName("ab.i")
    public int field1104;

    @ObfuscatedName("ab.k")
    public int[] field1103;

    @ObfuscatedName("ab.q")
    public int[] field1102;

    public class51() {
        class54.method1268(16);
        this.field1101 = class54.method1238() == 0 ? 1 : class54.method1268(4) + 1;
        if (class54.method1238() != 0) {
            class54.method1268(8);
        }
        class54.method1268(2);
        if (this.field1101 > 1) {
            this.field1104 = class54.method1268(4);
        }
        this.field1103 = new int[this.field1101];
        this.field1102 = new int[this.field1101];
        for (int var1 = 0; var1 < this.field1101; var1++) {
            class54.method1268(8);
            this.field1103[var1] = class54.method1268(8);
            this.field1102[var1] = class54.method1268(8);
        }
    }
}
