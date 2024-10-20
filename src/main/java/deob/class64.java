package deob;

@ObfuscatedName("bk")
public class class64 {

    @ObfuscatedName("bk.t")
    public int field1191;

    @ObfuscatedName("bk.b")
    public int field1190;

    @ObfuscatedName("bk.p")
    public int[] field1192;

    @ObfuscatedName("bk.e")
    public int[] field1193;

    public class64() {
        class66.method1347(16);
        this.field1191 = class66.method1346() == 0 ? 1 : class66.method1347(4) + 1;
        if (class66.method1346() != 0) {
            class66.method1347(8);
        }
        class66.method1347(2);
        if (this.field1191 > 1) {
            this.field1190 = class66.method1347(4);
        }
        this.field1192 = new int[this.field1191];
        this.field1193 = new int[this.field1191];
        for (int var1 = 0; var1 < this.field1191; var1++) {
            class66.method1347(8);
            this.field1192[var1] = class66.method1347(8);
            this.field1193[var1] = class66.method1347(8);
        }
    }
}
