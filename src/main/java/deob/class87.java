package deob;

@ObfuscatedName("du")
public class class87 {

    @ObfuscatedName("du.aw")
    public final class389 field1055;

    @ObfuscatedName("du.ak")
    public final int field1059;

    @ObfuscatedName("du.aj")
    public int field1058 = 0;

    public class87(class389 arg0, String arg1) {
        this.field1055 = arg0;
        this.field1059 = arg0.method7047();
    }

    @ObfuscatedName("du.ap(I)Z")
    public boolean method2444() {
        this.field1058 = 0;
        for (int var1 = 0; var1 < this.field1059; var1++) {
            if (!this.field1055.method6972(var1) || this.field1055.method6956(var1)) {
                this.field1058++;
            }
        }
        return this.field1058 >= this.field1059;
    }
}
