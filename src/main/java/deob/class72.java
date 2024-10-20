package deob;

@ObfuscatedName("bm")
public class class72 {

    @ObfuscatedName("bm.f")
    public int field1328;

    @ObfuscatedName("bm.e")
    public int field1330;

    @ObfuscatedName("bm.n")
    public int[] field1329;

    @ObfuscatedName("bm.t")
    public int[] field1327;

    public class72() {
        class74.method1502(16);
        this.field1328 = class74.method1499() == 0 ? 1 : class74.method1502(4) + 1;
        if (class74.method1499() != 0) {
            class74.method1502(8);
        }
        class74.method1502(2);
        if (this.field1328 > 1) {
            this.field1330 = class74.method1502(4);
        }
        this.field1329 = new int[this.field1328];
        this.field1327 = new int[this.field1328];
        for (int var1 = 0; var1 < this.field1328; var1++) {
            class74.method1502(8);
            this.field1329[var1] = class74.method1502(8);
            this.field1327[var1] = class74.method1502(8);
        }
    }
}
