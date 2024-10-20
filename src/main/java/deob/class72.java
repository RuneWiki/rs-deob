package deob;

@ObfuscatedName("br")
public class class72 {

    @ObfuscatedName("br.e")
    public int field1351;

    @ObfuscatedName("br.l")
    public int field1350;

    @ObfuscatedName("br.c")
    public int[] field1352;

    @ObfuscatedName("br.h")
    public int[] field1353;

    public class72() {
        class74.method1538(16);
        this.field1351 = class74.method1542() == 0 ? 1 : class74.method1538(4) + 1;
        if (class74.method1542() != 0) {
            class74.method1538(8);
        }
        class74.method1538(2);
        if (this.field1351 > 1) {
            this.field1350 = class74.method1538(4);
        }
        this.field1352 = new int[this.field1351];
        this.field1353 = new int[this.field1351];
        for (int var1 = 0; var1 < this.field1351; var1++) {
            class74.method1538(8);
            this.field1352[var1] = class74.method1538(8);
            this.field1353[var1] = class74.method1538(8);
        }
    }
}
