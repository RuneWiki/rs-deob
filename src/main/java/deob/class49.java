package deob;

@ObfuscatedName("ao")
public class class49 {

    @ObfuscatedName("ao.z")
    public int field1085;

    @ObfuscatedName("ao.h")
    public int field1084;

    @ObfuscatedName("ao.c")
    public int[] field1083;

    @ObfuscatedName("ao.p")
    public int[] field1086;

    public class49() {
        class52.method1200(16);
        this.field1085 = class52.method1185() == 0 ? 1 : class52.method1200(4) + 1;
        if (class52.method1185() != 0) {
            class52.method1200(8);
        }
        class52.method1200(2);
        if (this.field1085 > 1) {
            this.field1084 = class52.method1200(4);
        }
        this.field1083 = new int[this.field1085];
        this.field1086 = new int[this.field1085];
        for (int var1 = 0; var1 < this.field1085; var1++) {
            class52.method1200(8);
            this.field1083[var1] = class52.method1200(8);
            this.field1086[var1] = class52.method1200(8);
        }
    }
}
