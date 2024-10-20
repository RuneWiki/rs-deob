package deob;

@ObfuscatedName("bv")
public class class62 {

    @ObfuscatedName("bv.t")
    public int field1183;

    @ObfuscatedName("bv.o")
    public int field1182;

    @ObfuscatedName("bv.i")
    public int[] field1184;

    @ObfuscatedName("bv.p")
    public int[] field1185;

    public class62() {
        class64.method1256(16);
        this.field1183 = class64.method1272() == 0 ? 1 : class64.method1256(4) + 1;
        if (class64.method1272() != 0) {
            class64.method1256(8);
        }
        class64.method1256(2);
        if (this.field1183 > 1) {
            this.field1182 = class64.method1256(4);
        }
        this.field1184 = new int[this.field1183];
        this.field1185 = new int[this.field1183];
        for (int var1 = 0; var1 < this.field1183; var1++) {
            class64.method1256(8);
            this.field1184[var1] = class64.method1256(8);
            this.field1185[var1] = class64.method1256(8);
        }
    }
}
