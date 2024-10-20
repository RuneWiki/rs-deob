package deob;

@ObfuscatedName("aa")
public class class50 {

    @ObfuscatedName("aa.j")
    public int field1078;

    @ObfuscatedName("aa.r")
    public int field1081;

    @ObfuscatedName("aa.v")
    public int[] field1080;

    @ObfuscatedName("aa.p")
    public int[] field1079;

    public class50() {
        class53.method1191(16);
        this.field1078 = class53.method1190() == 0 ? 1 : class53.method1191(4) + 1;
        if (class53.method1190() != 0) {
            class53.method1191(8);
        }
        class53.method1191(2);
        if (this.field1078 > 1) {
            this.field1081 = class53.method1191(4);
        }
        this.field1080 = new int[this.field1078];
        this.field1079 = new int[this.field1078];
        for (int var1 = 0; var1 < this.field1078; var1++) {
            class53.method1191(8);
            this.field1080[var1] = class53.method1191(8);
            this.field1079[var1] = class53.method1191(8);
        }
    }
}
