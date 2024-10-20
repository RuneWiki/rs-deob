package deob;

@ObfuscatedName("dd")
public class class86 {

    @ObfuscatedName("dd.al")
    public final class384 field1068;

    @ObfuscatedName("dd.aj")
    public final int field1069;

    @ObfuscatedName("dd.az")
    public int field1067 = 0;

    public class86(class384 arg0, String arg1) {
        this.field1068 = arg0;
        this.field1069 = arg0.method6582();
    }

    @ObfuscatedName("dd.ak(S)Z")
    public boolean method2198() {
        this.field1067 = 0;
        for (int var1 = 0; var1 < this.field1069; var1++) {
            if (!this.field1068.method6522(var1) || this.field1068.method6533(var1)) {
                this.field1067++;
            }
        }
        return this.field1067 >= this.field1069;
    }
}
