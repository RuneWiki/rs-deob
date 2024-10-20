package deob;

@ObfuscatedName("dn")
public class class86 {

    @ObfuscatedName("dn.al")
    public final class372 field1054;

    @ObfuscatedName("dn.ak")
    public final int field1055;

    @ObfuscatedName("dn.ax")
    public int field1053 = 0;

    public class86(class372 arg0, String arg1) {
        this.field1054 = arg0;
        this.field1055 = arg0.method6274();
    }

    @ObfuscatedName("dn.ac(I)Z")
    public boolean method2187() {
        this.field1053 = 0;
        for (int var1 = 0; var1 < this.field1055; var1++) {
            if (!this.field1054.method6228(var1) || this.field1054.method6227(var1)) {
                this.field1053++;
            }
        }
        return this.field1053 >= this.field1055;
    }
}
