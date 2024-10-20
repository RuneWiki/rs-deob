package deob;

@ObfuscatedName("bo")
public class class62 {

    @ObfuscatedName("bo.z")
    public int field1151;

    @ObfuscatedName("bo.j")
    public int field1149;

    @ObfuscatedName("bo.a")
    public int[] field1150;

    @ObfuscatedName("bo.y")
    public int[] field1148;

    public class62() {
        class64.method1243(16);
        this.field1151 = class64.method1242() == 0 ? 1 : class64.method1243(4) + 1;
        if (class64.method1242() != 0) {
            class64.method1243(8);
        }
        class64.method1243(2);
        if (this.field1151 > 1) {
            this.field1149 = class64.method1243(4);
        }
        this.field1150 = new int[this.field1151];
        this.field1148 = new int[this.field1151];
        for (int var1 = 0; var1 < this.field1151; var1++) {
            class64.method1243(8);
            this.field1150[var1] = class64.method1243(8);
            this.field1148[var1] = class64.method1243(8);
        }
    }
}
