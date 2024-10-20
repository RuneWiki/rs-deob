package deob;

@ObfuscatedName("au")
public class class49 {

    @ObfuscatedName("au.g")
    public int field1079;

    @ObfuscatedName("au.e")
    public int field1076;

    @ObfuscatedName("au.n")
    public int[] field1077;

    @ObfuscatedName("au.j")
    public int[] field1078;

    public class49() {
        class52.method1183(16);
        this.field1079 = class52.method1182() == 0 ? 1 : class52.method1183(4) + 1;
        if (class52.method1182() != 0) {
            class52.method1183(8);
        }
        class52.method1183(2);
        if (this.field1079 > 1) {
            this.field1076 = class52.method1183(4);
        }
        this.field1077 = new int[this.field1079];
        this.field1078 = new int[this.field1079];
        for (int var1 = 0; var1 < this.field1079; var1++) {
            class52.method1183(8);
            this.field1077[var1] = class52.method1183(8);
            this.field1078[var1] = class52.method1183(8);
        }
    }
}
