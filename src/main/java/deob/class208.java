package deob;

@ObfuscatedName("gk")
public class class208 {

    @ObfuscatedName("gk.ef")
    public long field3102;

    @ObfuscatedName("gk.eh")
    public class208 field3101;

    @ObfuscatedName("gk.ev")
    public class208 field3103;

    @ObfuscatedName("gk.ih()V")
    public void method3583() {
        if (this.field3103 != null) {
            this.field3103.field3101 = this.field3101;
            this.field3101.field3103 = this.field3103;
            this.field3101 = null;
            this.field3103 = null;
        }
    }

    @ObfuscatedName("gk.iz()Z")
    public boolean method3586() {
        return this.field3103 != null;
    }
}
