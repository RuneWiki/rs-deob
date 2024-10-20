package deob;

@ObfuscatedName("bi")
public class class64 {

    @ObfuscatedName("bi.y")
    public int field1211;

    @ObfuscatedName("bi.k")
    public int field1210;

    @ObfuscatedName("bi.g")
    public int[] field1209;

    @ObfuscatedName("bi.n")
    public int[] field1212;

    public class64() {
        class66.method1320(16);
        this.field1211 = class66.method1319() == 0 ? 1 : class66.method1320(4) + 1;
        if (class66.method1319() != 0) {
            class66.method1320(8);
        }
        class66.method1320(2);
        if (this.field1211 > 1) {
            this.field1210 = class66.method1320(4);
        }
        this.field1209 = new int[this.field1211];
        this.field1212 = new int[this.field1211];
        for (int var1 = 0; var1 < this.field1211; var1++) {
            class66.method1320(8);
            this.field1209[var1] = class66.method1320(8);
            this.field1212[var1] = class66.method1320(8);
        }
    }
}
