package deob;

@ObfuscatedName("dv")
public class class84 {

    @ObfuscatedName("dv.ap")
    public final class373 field1032;

    @ObfuscatedName("dv.af")
    public final int field1033;

    @ObfuscatedName("dv.aj")
    public int field1035 = 0;

    public class84(class373 arg0, String arg1) {
        this.field1032 = arg0;
        this.field1033 = arg0.method6398();
    }

    @ObfuscatedName("dv.am(I)Z")
    public boolean method2237() {
        this.field1035 = 0;
        for (int var1 = 0; var1 < this.field1033; var1++) {
            if (!this.field1032.method6349(var1) || this.field1032.method6360(var1)) {
                this.field1035++;
            }
        }
        return this.field1035 >= this.field1033;
    }
}
