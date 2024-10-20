package deob;

@ObfuscatedName("gc")
public class class198 {

    @ObfuscatedName("gc.y")
    public class198 field3005;

    @ObfuscatedName("gc.e")
    public class198 field3006;

    @ObfuscatedName("gc.n()V")
    public void method3559() {
        if (this.field3006 != null) {
            this.field3006.field3005 = this.field3005;
            this.field3005.field3006 = this.field3006;
            this.field3005 = null;
            this.field3006 = null;
        }
    }
}
