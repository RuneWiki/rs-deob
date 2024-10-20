package deob;

@ObfuscatedName("ad")
public class class50 {

    @ObfuscatedName("ad.d")
    public int field1083;

    @ObfuscatedName("ad.g")
    public int field1082;

    @ObfuscatedName("ad.a")
    public int[] field1084;

    @ObfuscatedName("ad.t")
    public int[] field1085;

    public class50() {
        class53.method1179(16);
        this.field1083 = class53.method1167() == 0 ? 1 : class53.method1179(4) + 1;
        if (class53.method1167() != 0) {
            class53.method1179(8);
        }
        class53.method1179(2);
        if (this.field1083 > 1) {
            this.field1082 = class53.method1179(4);
        }
        this.field1084 = new int[this.field1083];
        this.field1085 = new int[this.field1083];
        for (int var1 = 0; var1 < this.field1083; var1++) {
            class53.method1179(8);
            this.field1084[var1] = class53.method1179(8);
            this.field1085[var1] = class53.method1179(8);
        }
    }
}
