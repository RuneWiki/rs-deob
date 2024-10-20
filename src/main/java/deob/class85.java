package deob;

@ObfuscatedName("dw")
public class class85 {

    @ObfuscatedName("dw.aw")
    public final class376 field1072;

    @ObfuscatedName("dw.al")
    public final int field1067;

    @ObfuscatedName("dw.ai")
    public int field1068 = 0;

    public class85(class376 arg0, String arg1) {
        this.field1072 = arg0;
        this.field1067 = arg0.method6454();
    }

    @ObfuscatedName("dw.aq(S)Z")
    public boolean method2221() {
        this.field1068 = 0;
        for (int var1 = 0; var1 < this.field1067; var1++) {
            if (!this.field1072.method6375(var1) || this.field1072.method6374(var1)) {
                this.field1068++;
            }
        }
        return this.field1068 >= this.field1067;
    }
}
