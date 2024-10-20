package deob;

@ObfuscatedName("bc")
public class class64 {

    @ObfuscatedName("bc.q")
    public int field1183;

    @ObfuscatedName("bc.s")
    public int field1181;

    @ObfuscatedName("bc.h")
    public int[] field1182;

    @ObfuscatedName("bc.e")
    public int[] field1180;

    public class64() {
        class66.method1305(16);
        this.field1183 = class66.method1280() == 0 ? 1 : class66.method1305(4) + 1;
        if (class66.method1280() != 0) {
            class66.method1305(8);
        }
        class66.method1305(2);
        if (this.field1183 > 1) {
            this.field1181 = class66.method1305(4);
        }
        this.field1182 = new int[this.field1183];
        this.field1180 = new int[this.field1183];
        for (int var1 = 0; var1 < this.field1183; var1++) {
            class66.method1305(8);
            this.field1182[var1] = class66.method1305(8);
            this.field1180[var1] = class66.method1305(8);
        }
    }
}
