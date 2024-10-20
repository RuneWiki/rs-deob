package deob;

@ObfuscatedName("be")
public class class62 {

    @ObfuscatedName("be.g")
    public int field1176;

    @ObfuscatedName("be.s")
    public int field1177;

    @ObfuscatedName("be.v")
    public int[] field1178;

    @ObfuscatedName("be.o")
    public int[] field1179;

    public class62() {
        class64.method1246(16);
        this.field1176 = class64.method1245() == 0 ? 1 : class64.method1246(4) + 1;
        if (class64.method1245() != 0) {
            class64.method1246(8);
        }
        class64.method1246(2);
        if (this.field1176 > 1) {
            this.field1177 = class64.method1246(4);
        }
        this.field1178 = new int[this.field1176];
        this.field1179 = new int[this.field1176];
        for (int var1 = 0; var1 < this.field1176; var1++) {
            class64.method1246(8);
            this.field1178[var1] = class64.method1246(8);
            this.field1179[var1] = class64.method1246(8);
        }
    }
}
