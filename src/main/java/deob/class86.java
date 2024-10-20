package deob;

@ObfuscatedName("dm")
public class class86 {

    @ObfuscatedName("dm.ad")
    public final class385 field1061;

    @ObfuscatedName("dm.ag")
    public final int field1056;

    @ObfuscatedName("dm.ak")
    public int field1057 = 0;

    public class86(class385 arg0, String arg1) {
        this.field1061 = arg0;
        this.field1056 = arg0.method6561();
    }

    @ObfuscatedName("dm.aq(I)Z")
    public boolean method2251() {
        this.field1057 = 0;
        for (int var1 = 0; var1 < this.field1056; var1++) {
            if (!this.field1061.method6507(var1) || this.field1061.method6497(var1)) {
                this.field1057++;
            }
        }
        return this.field1057 >= this.field1056;
    }
}
