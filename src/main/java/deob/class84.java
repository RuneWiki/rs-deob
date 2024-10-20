package deob;

@ObfuscatedName("dn")
public class class84 {

    @ObfuscatedName("dn.an")
    public final class355 field1037;

    @ObfuscatedName("dn.av")
    public final int field1033;

    @ObfuscatedName("dn.as")
    public int field1035 = 0;

    public class84(class355 arg0, String arg1) {
        this.field1037 = arg0;
        this.field1033 = arg0.method6092();
    }

    @ObfuscatedName("dn.at(I)Z")
    public boolean method2122() {
        this.field1035 = 0;
        for (int var1 = 0; var1 < this.field1033; var1++) {
            if (!this.field1037.method6042(var1) || this.field1037.method6070(var1)) {
                this.field1035++;
            }
        }
        return this.field1035 >= this.field1033;
    }
}
