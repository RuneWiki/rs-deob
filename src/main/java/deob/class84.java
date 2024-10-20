package deob;

@ObfuscatedName("dr")
public class class84 {

    @ObfuscatedName("dr.ay")
    public final class358 field1042;

    @ObfuscatedName("dr.ar")
    public final int field1041;

    @ObfuscatedName("dr.am")
    public int field1043 = 0;

    public class84(class358 arg0, String arg1) {
        this.field1042 = arg0;
        this.field1041 = arg0.method6128();
    }

    @ObfuscatedName("dr.aw(I)Z")
    public boolean method2161() {
        this.field1043 = 0;
        for (int var1 = 0; var1 < this.field1041; var1++) {
            if (!this.field1042.method6104(var1) || this.field1042.method6080(var1)) {
                this.field1043++;
            }
        }
        return this.field1043 >= this.field1041;
    }
}
