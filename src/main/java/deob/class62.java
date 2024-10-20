package deob;

@ObfuscatedName("bx")
public class class62 {

    @ObfuscatedName("bx.b")
    public int field1175;

    @ObfuscatedName("bx.u")
    public int field1176;

    @ObfuscatedName("bx.x")
    public int[] field1174;

    @ObfuscatedName("bx.j")
    public int[] field1177;

    public class62() {
        class64.method1279(16);
        this.field1175 = class64.method1274() == 0 ? 1 : class64.method1279(4) + 1;
        if (class64.method1274() != 0) {
            class64.method1279(8);
        }
        class64.method1279(2);
        if (this.field1175 > 1) {
            this.field1176 = class64.method1279(4);
        }
        this.field1174 = new int[this.field1175];
        this.field1177 = new int[this.field1175];
        for (int var1 = 0; var1 < this.field1175; var1++) {
            class64.method1279(8);
            this.field1174[var1] = class64.method1279(8);
            this.field1177[var1] = class64.method1279(8);
        }
    }
}
