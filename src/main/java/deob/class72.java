package deob;

@ObfuscatedName("bp")
public class class72 {

    @ObfuscatedName("bp.k")
    public int field1339;

    @ObfuscatedName("bp.q")
    public int field1341;

    @ObfuscatedName("bp.f")
    public int[] field1340;

    @ObfuscatedName("bp.c")
    public int[] field1342;

    public class72() {
        class74.method1493(16);
        this.field1339 = class74.method1511() == 0 ? 1 : class74.method1493(4) + 1;
        if (class74.method1511() != 0) {
            class74.method1493(8);
        }
        class74.method1493(2);
        if (this.field1339 > 1) {
            this.field1341 = class74.method1493(4);
        }
        this.field1340 = new int[this.field1339];
        this.field1342 = new int[this.field1339];
        for (int var1 = 0; var1 < this.field1339; var1++) {
            class74.method1493(8);
            this.field1340[var1] = class74.method1493(8);
            this.field1342[var1] = class74.method1493(8);
        }
    }
}
