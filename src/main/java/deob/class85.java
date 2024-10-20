package deob;

@ObfuscatedName("do")
public class class85 {

    @ObfuscatedName("do.ah")
    public final class376 field1052;

    @ObfuscatedName("do.af")
    public final int field1053;

    @ObfuscatedName("do.at")
    public int field1054 = 0;

    public class85(class376 arg0, String arg1) {
        this.field1052 = arg0;
        this.field1053 = arg0.method6339();
    }

    @ObfuscatedName("do.az(B)Z")
    public boolean method2179() {
        this.field1054 = 0;
        for (int var1 = 0; var1 < this.field1053; var1++) {
            if (!this.field1052.method6313(var1) || this.field1052.method6287(var1)) {
                this.field1054++;
            }
        }
        return this.field1054 >= this.field1053;
    }
}
