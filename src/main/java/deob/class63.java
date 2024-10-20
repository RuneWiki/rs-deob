package deob;

@ObfuscatedName("bu")
public class class63 {

    @ObfuscatedName("bu.e")
    public int field1202;

    @ObfuscatedName("bu.v")
    public int field1203;

    @ObfuscatedName("bu.k")
    public int[] field1205;

    @ObfuscatedName("bu.g")
    public int[] field1204;

    public class63() {
        class65.method1280(16);
        this.field1202 = class65.method1279() == 0 ? 1 : class65.method1280(4) + 1;
        if (class65.method1279() != 0) {
            class65.method1280(8);
        }
        class65.method1280(2);
        if (this.field1202 > 1) {
            this.field1203 = class65.method1280(4);
        }
        this.field1205 = new int[this.field1202];
        this.field1204 = new int[this.field1202];
        for (int var1 = 0; var1 < this.field1202; var1++) {
            class65.method1280(8);
            this.field1205[var1] = class65.method1280(8);
            this.field1204[var1] = class65.method1280(8);
        }
    }
}
