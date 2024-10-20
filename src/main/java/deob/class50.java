package deob;

@ObfuscatedName("ad")
public class class50 {

    @ObfuscatedName("ad.i")
    public int field1091;

    @ObfuscatedName("ad.w")
    public int field1092;

    @ObfuscatedName("ad.f")
    public int[] field1093;

    @ObfuscatedName("ad.e")
    public int[] field1090;

    public class50() {
        class53.method1179(16);
        this.field1091 = class53.method1206() == 0 ? 1 : class53.method1179(4) + 1;
        if (class53.method1206() != 0) {
            class53.method1179(8);
        }
        class53.method1179(2);
        if (this.field1091 > 1) {
            this.field1092 = class53.method1179(4);
        }
        this.field1093 = new int[this.field1091];
        this.field1090 = new int[this.field1091];
        for (int var1 = 0; var1 < this.field1091; var1++) {
            class53.method1179(8);
            this.field1093[var1] = class53.method1179(8);
            this.field1090[var1] = class53.method1179(8);
        }
    }
}
