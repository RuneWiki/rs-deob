package deob;

@ObfuscatedName("be")
public class class62 {

    @ObfuscatedName("be.g")
    public int field1178;

    @ObfuscatedName("be.s")
    public int field1177;

    @ObfuscatedName("be.h")
    public int[] field1176;

    @ObfuscatedName("be.m")
    public int[] field1179;

    public class62() {
        class64.method1271(16);
        this.field1178 = class64.method1270() == 0 ? 1 : class64.method1271(4) + 1;
        if (class64.method1270() != 0) {
            class64.method1271(8);
        }
        class64.method1271(2);
        if (this.field1178 > 1) {
            this.field1177 = class64.method1271(4);
        }
        this.field1176 = new int[this.field1178];
        this.field1179 = new int[this.field1178];
        for (int var1 = 0; var1 < this.field1178; var1++) {
            class64.method1271(8);
            this.field1176[var1] = class64.method1271(8);
            this.field1179[var1] = class64.method1271(8);
        }
    }
}
