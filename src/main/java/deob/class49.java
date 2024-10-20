package deob;

@ObfuscatedName("ar")
public class class49 {

    @ObfuscatedName("ar.p")
    public int field1077;

    @ObfuscatedName("ar.j")
    public int field1079;

    @ObfuscatedName("ar.w")
    public int[] field1078;

    @ObfuscatedName("ar.h")
    public int[] field1076;

    public class49() {
        class52.method1154(16);
        this.field1077 = class52.method1153() == 0 ? 1 : class52.method1154(4) + 1;
        if (class52.method1153() != 0) {
            class52.method1154(8);
        }
        class52.method1154(2);
        if (this.field1077 > 1) {
            this.field1079 = class52.method1154(4);
        }
        this.field1078 = new int[this.field1077];
        this.field1076 = new int[this.field1077];
        for (int var1 = 0; var1 < this.field1077; var1++) {
            class52.method1154(8);
            this.field1078[var1] = class52.method1154(8);
            this.field1076[var1] = class52.method1154(8);
        }
    }
}
