package deob;

@ObfuscatedName("bp")
public class class64 {

    @ObfuscatedName("bp.n")
    public int field1231;

    @ObfuscatedName("bp.o")
    public int field1229;

    @ObfuscatedName("bp.a")
    public int[] field1232;

    @ObfuscatedName("bp.w")
    public int[] field1230;

    public class64() {
        class66.method1363(16);
        this.field1231 = class66.method1362() == 0 ? 1 : class66.method1363(4) + 1;
        if (class66.method1362() != 0) {
            class66.method1363(8);
        }
        class66.method1363(2);
        if (this.field1231 > 1) {
            this.field1229 = class66.method1363(4);
        }
        this.field1232 = new int[this.field1231];
        this.field1230 = new int[this.field1231];
        for (int var1 = 0; var1 < this.field1231; var1++) {
            class66.method1363(8);
            this.field1232[var1] = class66.method1363(8);
            this.field1230[var1] = class66.method1363(8);
        }
    }
}
