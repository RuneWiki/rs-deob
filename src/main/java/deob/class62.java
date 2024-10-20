package deob;

@ObfuscatedName("bz")
public class class62 {

    @ObfuscatedName("bz.p")
    public int field1173;

    @ObfuscatedName("bz.g")
    public int field1171;

    @ObfuscatedName("bz.x")
    public int[] field1172;

    @ObfuscatedName("bz.c")
    public int[] field1170;

    public class62() {
        class64.method1330(16);
        this.field1173 = class64.method1317() == 0 ? 1 : class64.method1330(4) + 1;
        if (class64.method1317() != 0) {
            class64.method1330(8);
        }
        class64.method1330(2);
        if (this.field1173 > 1) {
            this.field1171 = class64.method1330(4);
        }
        this.field1172 = new int[this.field1173];
        this.field1170 = new int[this.field1173];
        for (int var1 = 0; var1 < this.field1173; var1++) {
            class64.method1330(8);
            this.field1172[var1] = class64.method1330(8);
            this.field1170[var1] = class64.method1330(8);
        }
    }
}
