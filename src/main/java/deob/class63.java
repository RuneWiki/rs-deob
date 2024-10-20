package deob;

@ObfuscatedName("bo")
public class class63 {

    @ObfuscatedName("bo.b")
    public int field1182;

    @ObfuscatedName("bo.e")
    public int field1183;

    @ObfuscatedName("bo.i")
    public int[] field1184;

    @ObfuscatedName("bo.k")
    public int[] field1185;

    public class63() {
        class65.method1257(16);
        this.field1182 = class65.method1256() == 0 ? 1 : class65.method1257(4) + 1;
        if (class65.method1256() != 0) {
            class65.method1257(8);
        }
        class65.method1257(2);
        if (this.field1182 > 1) {
            this.field1183 = class65.method1257(4);
        }
        this.field1184 = new int[this.field1182];
        this.field1185 = new int[this.field1182];
        for (int var1 = 0; var1 < this.field1182; var1++) {
            class65.method1257(8);
            this.field1184[var1] = class65.method1257(8);
            this.field1185[var1] = class65.method1257(8);
        }
    }
}
