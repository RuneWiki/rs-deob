package deob;

@ObfuscatedName("dh")
public class class84 {

    @ObfuscatedName("dh.ah")
    public final class369 field1017;

    @ObfuscatedName("dh.ar")
    public final int field1018;

    @ObfuscatedName("dh.ao")
    public int field1016 = 0;

    public class84(class369 arg0, String arg1) {
        this.field1017 = arg0;
        this.field1018 = arg0.method6351();
    }

    @ObfuscatedName("dh.at(I)Z")
    public boolean method2211() {
        this.field1016 = 0;
        for (int var1 = 0; var1 < this.field1018; var1++) {
            if (!this.field1017.method6243(var1) || this.field1017.method6242(var1)) {
                this.field1016++;
            }
        }
        return this.field1016 >= this.field1018;
    }
}
