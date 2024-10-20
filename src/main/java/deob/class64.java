package deob;

@ObfuscatedName("bp")
public class class64 {

    @ObfuscatedName("bp.n")
    public int field1214;

    @ObfuscatedName("bp.d")
    public int field1216;

    @ObfuscatedName("bp.z")
    public int[] field1215;

    @ObfuscatedName("bp.y")
    public int[] field1217;

    public class64() {
        class66.method1340(16);
        this.field1214 = class66.method1339() == 0 ? 1 : class66.method1340(4) + 1;
        if (class66.method1339() != 0) {
            class66.method1340(8);
        }
        class66.method1340(2);
        if (this.field1214 > 1) {
            this.field1216 = class66.method1340(4);
        }
        this.field1215 = new int[this.field1214];
        this.field1217 = new int[this.field1214];
        for (int var1 = 0; var1 < this.field1214; var1++) {
            class66.method1340(8);
            this.field1215[var1] = class66.method1340(8);
            this.field1217[var1] = class66.method1340(8);
        }
    }
}
