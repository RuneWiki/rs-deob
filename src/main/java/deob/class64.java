package deob;

@ObfuscatedName("bf")
public class class64 {

    @ObfuscatedName("bf.e")
    public int field1159;

    @ObfuscatedName("bf.a")
    public int field1160;

    @ObfuscatedName("bf.l")
    public int[] field1161;

    @ObfuscatedName("bf.c")
    public int[] field1162;

    public class64() {
        class66.method1317(16);
        this.field1159 = class66.method1319() == 0 ? 1 : class66.method1317(4) + 1;
        if (class66.method1319() != 0) {
            class66.method1317(8);
        }
        class66.method1317(2);
        if (this.field1159 > 1) {
            this.field1160 = class66.method1317(4);
        }
        this.field1161 = new int[this.field1159];
        this.field1162 = new int[this.field1159];
        for (int var1 = 0; var1 < this.field1159; var1++) {
            class66.method1317(8);
            this.field1161[var1] = class66.method1317(8);
            this.field1162[var1] = class66.method1317(8);
        }
    }
}
