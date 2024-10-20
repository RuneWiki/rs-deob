package deob;

@ObfuscatedName("ad")
public class class50 {

    @ObfuscatedName("ad.i")
    public int field1089;

    @ObfuscatedName("ad.p")
    public int field1091;

    @ObfuscatedName("ad.a")
    public int[] field1090;

    @ObfuscatedName("ad.l")
    public int[] field1088;

    public class50() {
        class53.method1151(16);
        this.field1089 = class53.method1150() == 0 ? 1 : class53.method1151(4) + 1;
        if (class53.method1150() != 0) {
            class53.method1151(8);
        }
        class53.method1151(2);
        if (this.field1089 > 1) {
            this.field1091 = class53.method1151(4);
        }
        this.field1090 = new int[this.field1089];
        this.field1088 = new int[this.field1089];
        for (int var1 = 0; var1 < this.field1089; var1++) {
            class53.method1151(8);
            this.field1090[var1] = class53.method1151(8);
            this.field1088[var1] = class53.method1151(8);
        }
    }
}
