package deob;

@ObfuscatedName("br")
public class class62 {

    @ObfuscatedName("br.i")
    public int field1191;

    @ObfuscatedName("br.c")
    public int field1188;

    @ObfuscatedName("br.h")
    public int[] field1189;

    @ObfuscatedName("br.v")
    public int[] field1190;

    public class62() {
        class64.method1276(16);
        this.field1191 = class64.method1274() == 0 ? 1 : class64.method1276(4) + 1;
        if (class64.method1274() != 0) {
            class64.method1276(8);
        }
        class64.method1276(2);
        if (this.field1191 > 1) {
            this.field1188 = class64.method1276(4);
        }
        this.field1189 = new int[this.field1191];
        this.field1190 = new int[this.field1191];
        for (int var1 = 0; var1 < this.field1191; var1++) {
            class64.method1276(8);
            this.field1189[var1] = class64.method1276(8);
            this.field1190[var1] = class64.method1276(8);
        }
    }
}
