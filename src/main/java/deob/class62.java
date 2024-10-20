package deob;

@ObfuscatedName("bn")
public class class62 {

    @ObfuscatedName("bn.k")
    public int field1158;

    @ObfuscatedName("bn.y")
    public int field1159;

    @ObfuscatedName("bn.s")
    public int[] field1160;

    @ObfuscatedName("bn.g")
    public int[] field1161;

    public class62() {
        class64.method1294(16);
        this.field1158 = class64.method1268() == 0 ? 1 : class64.method1294(4) + 1;
        if (class64.method1268() != 0) {
            class64.method1294(8);
        }
        class64.method1294(2);
        if (this.field1158 > 1) {
            this.field1159 = class64.method1294(4);
        }
        this.field1160 = new int[this.field1158];
        this.field1161 = new int[this.field1158];
        for (int var1 = 0; var1 < this.field1158; var1++) {
            class64.method1294(8);
            this.field1160[var1] = class64.method1294(8);
            this.field1161[var1] = class64.method1294(8);
        }
    }
}
