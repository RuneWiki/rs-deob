package deob;

@ObfuscatedName("aq")
public class class49 {

    @ObfuscatedName("aq.v")
    public int field1066;

    @ObfuscatedName("aq.f")
    public int field1065;

    @ObfuscatedName("aq.n")
    public int[] field1064;

    @ObfuscatedName("aq.c")
    public int[] field1067;

    public class49() {
        class52.method1215(16);
        this.field1066 = class52.method1247() == 0 ? 1 : class52.method1215(4) + 1;
        if (class52.method1247() != 0) {
            class52.method1215(8);
        }
        class52.method1215(2);
        if (this.field1066 > 1) {
            this.field1065 = class52.method1215(4);
        }
        this.field1064 = new int[this.field1066];
        this.field1067 = new int[this.field1066];
        for (int var1 = 0; var1 < this.field1066; var1++) {
            class52.method1215(8);
            this.field1064[var1] = class52.method1215(8);
            this.field1067[var1] = class52.method1215(8);
        }
    }
}
