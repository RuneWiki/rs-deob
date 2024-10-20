package deob;

@ObfuscatedName("ay")
public class class50 {

    @ObfuscatedName("ay.q")
    public int field1079;

    @ObfuscatedName("ay.c")
    public int field1078;

    @ObfuscatedName("ay.p")
    public int[] field1080;

    @ObfuscatedName("ay.z")
    public int[] field1077;

    public class50() {
        class53.method1209(16);
        this.field1079 = class53.method1208() == 0 ? 1 : class53.method1209(4) + 1;
        if (class53.method1208() != 0) {
            class53.method1209(8);
        }
        class53.method1209(2);
        if (this.field1079 > 1) {
            this.field1078 = class53.method1209(4);
        }
        this.field1080 = new int[this.field1079];
        this.field1077 = new int[this.field1079];
        for (int var1 = 0; var1 < this.field1079; var1++) {
            class53.method1209(8);
            this.field1080[var1] = class53.method1209(8);
            this.field1077[var1] = class53.method1209(8);
        }
    }
}
