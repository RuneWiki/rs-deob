package deob;

@ObfuscatedName("aa")
public class class50 {

    @ObfuscatedName("aa.x")
    public int field1061;

    @ObfuscatedName("aa.p")
    public int field1060;

    @ObfuscatedName("aa.k")
    public int[] field1059;

    @ObfuscatedName("aa.a")
    public int[] field1062;

    public class50() {
        class53.method1161(16);
        this.field1061 = class53.method1160() == 0 ? 1 : class53.method1161(4) + 1;
        if (class53.method1160() != 0) {
            class53.method1161(8);
        }
        class53.method1161(2);
        if (this.field1061 > 1) {
            this.field1060 = class53.method1161(4);
        }
        this.field1059 = new int[this.field1061];
        this.field1062 = new int[this.field1061];
        for (int var1 = 0; var1 < this.field1061; var1++) {
            class53.method1161(8);
            this.field1059[var1] = class53.method1161(8);
            this.field1062[var1] = class53.method1161(8);
        }
    }
}
