package deob;

@ObfuscatedName("by")
public class class62 {

    @ObfuscatedName("by.g")
    public int field1176;

    @ObfuscatedName("by.v")
    public int field1174;

    @ObfuscatedName("by.z")
    public int[] field1175;

    @ObfuscatedName("by.h")
    public int[] field1173;

    public class62() {
        class64.method1295(16);
        this.field1176 = class64.method1270() == 0 ? 1 : class64.method1295(4) + 1;
        if (class64.method1270() != 0) {
            class64.method1295(8);
        }
        class64.method1295(2);
        if (this.field1176 > 1) {
            this.field1174 = class64.method1295(4);
        }
        this.field1175 = new int[this.field1176];
        this.field1173 = new int[this.field1176];
        for (int var1 = 0; var1 < this.field1176; var1++) {
            class64.method1295(8);
            this.field1175[var1] = class64.method1295(8);
            this.field1173[var1] = class64.method1295(8);
        }
    }
}
