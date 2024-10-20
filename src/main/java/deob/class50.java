package deob;

@ObfuscatedName("ag")
public class class50 {

    @ObfuscatedName("ag.g")
    public int field1080;

    @ObfuscatedName("ag.m")
    public int field1078;

    @ObfuscatedName("ag.v")
    public int[] field1077;

    @ObfuscatedName("ag.r")
    public int[] field1079;

    public class50() {
        class53.method1215(16);
        this.field1080 = class53.method1195() == 0 ? 1 : class53.method1215(4) + 1;
        if (class53.method1195() != 0) {
            class53.method1215(8);
        }
        class53.method1215(2);
        if (this.field1080 > 1) {
            this.field1078 = class53.method1215(4);
        }
        this.field1077 = new int[this.field1080];
        this.field1079 = new int[this.field1080];
        for (int var1 = 0; var1 < this.field1080; var1++) {
            class53.method1215(8);
            this.field1077[var1] = class53.method1215(8);
            this.field1079[var1] = class53.method1215(8);
        }
    }
}
