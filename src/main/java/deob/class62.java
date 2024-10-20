package deob;

@ObfuscatedName("bw")
public class class62 {

    @ObfuscatedName("bw.e")
    public int field1174;

    @ObfuscatedName("bw.v")
    public int field1173;

    @ObfuscatedName("bw.i")
    public int[] field1175;

    @ObfuscatedName("bw.g")
    public int[] field1176;

    public class62() {
        class64.method1287(16);
        this.field1174 = class64.method1256() == 0 ? 1 : class64.method1287(4) + 1;
        if (class64.method1256() != 0) {
            class64.method1287(8);
        }
        class64.method1287(2);
        if (this.field1174 > 1) {
            this.field1173 = class64.method1287(4);
        }
        this.field1175 = new int[this.field1174];
        this.field1176 = new int[this.field1174];
        for (int var1 = 0; var1 < this.field1174; var1++) {
            class64.method1287(8);
            this.field1175[var1] = class64.method1287(8);
            this.field1176[var1] = class64.method1287(8);
        }
    }
}
