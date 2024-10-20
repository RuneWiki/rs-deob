package deob;

@ObfuscatedName("bc")
public class class62 {

    @ObfuscatedName("bc.t")
    public int field1169;

    @ObfuscatedName("bc.s")
    public int field1168;

    @ObfuscatedName("bc.f")
    public int[] field1167;

    @ObfuscatedName("bc.e")
    public int[] field1170;

    public class62() {
        class64.method1257(16);
        this.field1169 = class64.method1254() == 0 ? 1 : class64.method1257(4) + 1;
        if (class64.method1254() != 0) {
            class64.method1257(8);
        }
        class64.method1257(2);
        if (this.field1169 > 1) {
            this.field1168 = class64.method1257(4);
        }
        this.field1167 = new int[this.field1169];
        this.field1170 = new int[this.field1169];
        for (int var1 = 0; var1 < this.field1169; var1++) {
            class64.method1257(8);
            this.field1167[var1] = class64.method1257(8);
            this.field1170[var1] = class64.method1257(8);
        }
    }
}
