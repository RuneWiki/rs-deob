package deob;

@ObfuscatedName("bd")
public class class64 {

    @ObfuscatedName("bd.n")
    public int field1238;

    @ObfuscatedName("bd.g")
    public int field1235;

    @ObfuscatedName("bd.a")
    public int[] field1236;

    @ObfuscatedName("bd.m")
    public int[] field1237;

    public class64() {
        class66.method1361(16);
        this.field1238 = class66.method1342() == 0 ? 1 : class66.method1361(4) + 1;
        if (class66.method1342() != 0) {
            class66.method1361(8);
        }
        class66.method1361(2);
        if (this.field1238 > 1) {
            this.field1235 = class66.method1361(4);
        }
        this.field1236 = new int[this.field1238];
        this.field1237 = new int[this.field1238];
        for (int var1 = 0; var1 < this.field1238; var1++) {
            class66.method1361(8);
            this.field1236[var1] = class66.method1361(8);
            this.field1237[var1] = class66.method1361(8);
        }
    }
}
