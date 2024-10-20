package deob;

@ObfuscatedName("bf")
public class class63 {

    @ObfuscatedName("bf.c")
    public int field1181;

    @ObfuscatedName("bf.j")
    public int field1178;

    @ObfuscatedName("bf.y")
    public int[] field1179;

    @ObfuscatedName("bf.r")
    public int[] field1180;

    public class63() {
        class65.method1268(16);
        this.field1181 = class65.method1267() == 0 ? 1 : class65.method1268(4) + 1;
        if (class65.method1267() != 0) {
            class65.method1268(8);
        }
        class65.method1268(2);
        if (this.field1181 > 1) {
            this.field1178 = class65.method1268(4);
        }
        this.field1179 = new int[this.field1181];
        this.field1180 = new int[this.field1181];
        for (int var1 = 0; var1 < this.field1181; var1++) {
            class65.method1268(8);
            this.field1179[var1] = class65.method1268(8);
            this.field1180[var1] = class65.method1268(8);
        }
    }
}
