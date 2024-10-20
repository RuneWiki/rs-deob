package deob;

@ObfuscatedName("aq")
public class class50 {

    @ObfuscatedName("aq.j")
    public int field1089;

    @ObfuscatedName("aq.f")
    public int field1088;

    @ObfuscatedName("aq.o")
    public int[] field1090;

    @ObfuscatedName("aq.h")
    public int[] field1091;

    public class50() {
        class53.method1196(16);
        this.field1089 = class53.method1195() == 0 ? 1 : class53.method1196(4) + 1;
        if (class53.method1195() != 0) {
            class53.method1196(8);
        }
        class53.method1196(2);
        if (this.field1089 > 1) {
            this.field1088 = class53.method1196(4);
        }
        this.field1090 = new int[this.field1089];
        this.field1091 = new int[this.field1089];
        for (int var1 = 0; var1 < this.field1089; var1++) {
            class53.method1196(8);
            this.field1090[var1] = class53.method1196(8);
            this.field1091[var1] = class53.method1196(8);
        }
    }
}
