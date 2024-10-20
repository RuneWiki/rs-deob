package deob;

@ObfuscatedName("ad")
public class class50 {

    @ObfuscatedName("ad.p")
    public int field1082;

    @ObfuscatedName("ad.l")
    public int field1083;

    @ObfuscatedName("ad.d")
    public int[] field1084;

    @ObfuscatedName("ad.x")
    public int[] field1085;

    public class50() {
        class53.method1259(16);
        this.field1082 = class53.method1241() == 0 ? 1 : class53.method1259(4) + 1;
        if (class53.method1241() != 0) {
            class53.method1259(8);
        }
        class53.method1259(2);
        if (this.field1082 > 1) {
            this.field1083 = class53.method1259(4);
        }
        this.field1084 = new int[this.field1082];
        this.field1085 = new int[this.field1082];
        for (int var1 = 0; var1 < this.field1082; var1++) {
            class53.method1259(8);
            this.field1084[var1] = class53.method1259(8);
            this.field1085[var1] = class53.method1259(8);
        }
    }
}
