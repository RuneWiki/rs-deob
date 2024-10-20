package deob;

@ObfuscatedName("bo")
public class class64 {

    @ObfuscatedName("bo.b")
    public int field1215;

    @ObfuscatedName("bo.e")
    public int field1218;

    @ObfuscatedName("bo.a")
    public int[] field1217;

    @ObfuscatedName("bo.k")
    public int[] field1216;

    public class64() {
        class66.method1274(16);
        this.field1215 = class66.method1291() == 0 ? 1 : class66.method1274(4) + 1;
        if (class66.method1291() != 0) {
            class66.method1274(8);
        }
        class66.method1274(2);
        if (this.field1215 > 1) {
            this.field1218 = class66.method1274(4);
        }
        this.field1217 = new int[this.field1215];
        this.field1216 = new int[this.field1215];
        for (int var1 = 0; var1 < this.field1215; var1++) {
            class66.method1274(8);
            this.field1217[var1] = class66.method1274(8);
            this.field1216[var1] = class66.method1274(8);
        }
    }
}
