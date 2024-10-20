package deob;

@ObfuscatedName("ao")
public class class50 {

    @ObfuscatedName("ao.p")
    public int field1074;

    @ObfuscatedName("ao.e")
    public int field1075;

    @ObfuscatedName("ao.a")
    public int[] field1076;

    @ObfuscatedName("ao.h")
    public int[] field1077;

    public class50() {
        class53.method1209(16);
        this.field1074 = class53.method1230() == 0 ? 1 : class53.method1209(4) + 1;
        if (class53.method1230() != 0) {
            class53.method1209(8);
        }
        class53.method1209(2);
        if (this.field1074 > 1) {
            this.field1075 = class53.method1209(4);
        }
        this.field1076 = new int[this.field1074];
        this.field1077 = new int[this.field1074];
        for (int var1 = 0; var1 < this.field1074; var1++) {
            class53.method1209(8);
            this.field1076[var1] = class53.method1209(8);
            this.field1077[var1] = class53.method1209(8);
        }
    }
}
