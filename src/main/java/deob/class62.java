package deob;

@ObfuscatedName("br")
public class class62 {

    @ObfuscatedName("br.n")
    public int field1176;

    @ObfuscatedName("br.x")
    public int field1177;

    @ObfuscatedName("br.k")
    public int[] field1178;

    @ObfuscatedName("br.i")
    public int[] field1175;

    public class62() {
        class64.method1281(16);
        this.field1176 = class64.method1291() == 0 ? 1 : class64.method1281(4) + 1;
        if (class64.method1291() != 0) {
            class64.method1281(8);
        }
        class64.method1281(2);
        if (this.field1176 > 1) {
            this.field1177 = class64.method1281(4);
        }
        this.field1178 = new int[this.field1176];
        this.field1175 = new int[this.field1176];
        for (int var1 = 0; var1 < this.field1176; var1++) {
            class64.method1281(8);
            this.field1178[var1] = class64.method1281(8);
            this.field1175[var1] = class64.method1281(8);
        }
    }
}
