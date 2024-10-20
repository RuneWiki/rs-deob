package deob;

@ObfuscatedName("bm")
public class class63 {

    @ObfuscatedName("bm.f")
    public int field1195;

    @ObfuscatedName("bm.k")
    public int field1198;

    @ObfuscatedName("bm.y")
    public int[] field1197;

    @ObfuscatedName("bm.e")
    public int[] field1196;

    public class63() {
        class65.method1310(16);
        this.field1195 = class65.method1309() == 0 ? 1 : class65.method1310(4) + 1;
        if (class65.method1309() != 0) {
            class65.method1310(8);
        }
        class65.method1310(2);
        if (this.field1195 > 1) {
            this.field1198 = class65.method1310(4);
        }
        this.field1197 = new int[this.field1195];
        this.field1196 = new int[this.field1195];
        for (int var1 = 0; var1 < this.field1195; var1++) {
            class65.method1310(8);
            this.field1197[var1] = class65.method1310(8);
            this.field1196[var1] = class65.method1310(8);
        }
    }
}
