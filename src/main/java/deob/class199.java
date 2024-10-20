package deob;

@ObfuscatedName("gv")
public class class199 {

    @ObfuscatedName("gv.ef")
    public long field3006;

    @ObfuscatedName("gv.ek")
    public class199 field3005;

    @ObfuscatedName("gv.ex")
    public class199 field3007;

    @ObfuscatedName("gv.ik()V")
    public void method3414() {
        if (this.field3007 != null) {
            this.field3007.field3005 = this.field3005;
            this.field3005.field3007 = this.field3007;
            this.field3005 = null;
            this.field3007 = null;
        }
    }

    @ObfuscatedName("gv.ij()Z")
    public boolean method3411() {
        return this.field3007 != null;
    }
}
