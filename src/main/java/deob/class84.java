package deob;

@ObfuscatedName("dg")
public class class84 {

    @ObfuscatedName("dg.ae")
    public final class357 field1060;

    @ObfuscatedName("dg.ao")
    public final int field1061;

    @ObfuscatedName("dg.at")
    public int field1062 = 0;

    public class84(class357 arg0, String arg1) {
        this.field1060 = arg0;
        this.field1061 = arg0.method6139();
    }

    @ObfuscatedName("dg.au(I)Z")
    public boolean method2158() {
        this.field1062 = 0;
        for (int var1 = 0; var1 < this.field1061; var1++) {
            if (!this.field1060.method6093(var1) || this.field1060.method6092(var1)) {
                this.field1062++;
            }
        }
        return this.field1062 >= this.field1061;
    }
}
