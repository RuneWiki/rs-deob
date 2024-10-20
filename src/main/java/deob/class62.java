package deob;

@ObfuscatedName("bc")
public class class62 {

    @ObfuscatedName("bc.k")
    public int field1178;

    @ObfuscatedName("bc.b")
    public int field1177;

    @ObfuscatedName("bc.e")
    public int[] field1179;

    @ObfuscatedName("bc.i")
    public int[] field1180;

    public class62() {
        class64.method1265(16);
        this.field1178 = class64.method1291() == 0 ? 1 : class64.method1265(4) + 1;
        if (class64.method1291() != 0) {
            class64.method1265(8);
        }
        class64.method1265(2);
        if (this.field1178 > 1) {
            this.field1177 = class64.method1265(4);
        }
        this.field1179 = new int[this.field1178];
        this.field1180 = new int[this.field1178];
        for (int var1 = 0; var1 < this.field1178; var1++) {
            class64.method1265(8);
            this.field1179[var1] = class64.method1265(8);
            this.field1180[var1] = class64.method1265(8);
        }
    }
}
