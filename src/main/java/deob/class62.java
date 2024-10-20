package deob;

@ObfuscatedName("ba")
public class class62 {

    @ObfuscatedName("ba.e")
    public int field1173;

    @ObfuscatedName("ba.p")
    public int field1172;

    @ObfuscatedName("ba.a")
    public int[] field1174;

    @ObfuscatedName("ba.g")
    public int[] field1175;

    public class62() {
        class64.method1307(16);
        this.field1173 = class64.method1282() == 0 ? 1 : class64.method1307(4) + 1;
        if (class64.method1282() != 0) {
            class64.method1307(8);
        }
        class64.method1307(2);
        if (this.field1173 > 1) {
            this.field1172 = class64.method1307(4);
        }
        this.field1174 = new int[this.field1173];
        this.field1175 = new int[this.field1173];
        for (int var1 = 0; var1 < this.field1173; var1++) {
            class64.method1307(8);
            this.field1174[var1] = class64.method1307(8);
            this.field1175[var1] = class64.method1307(8);
        }
    }
}
