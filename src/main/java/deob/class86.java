package deob;

@ObfuscatedName("dn")
public class class86 {

    @ObfuscatedName("dn.ay")
    public final class386 field1036;

    @ObfuscatedName("dn.an")
    public final int field1035;

    @ObfuscatedName("dn.au")
    public int field1037 = 0;

    public class86(class386 arg0, String arg1) {
        this.field1036 = arg0;
        this.field1035 = arg0.method6649();
    }

    @ObfuscatedName("dn.ab(B)Z")
    public boolean method2293() {
        this.field1037 = 0;
        for (int var1 = 0; var1 < this.field1035; var1++) {
            if (!this.field1036.method6594(var1) || this.field1036.method6600(var1)) {
                this.field1037++;
            }
        }
        return this.field1037 >= this.field1035;
    }
}
