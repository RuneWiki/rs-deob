package deob;

@ObfuscatedName("sc")
public class class485 extends class489 {

    @ObfuscatedName("sc.ev")
    public long field4884;

    @ObfuscatedName("sc.ew")
    public class485 field4883;

    @ObfuscatedName("sc.ed")
    public class485 field4882;

    @ObfuscatedName("sc.ez()V")
    public void method7986() {
        if (this.field4882 != null) {
            this.field4882.field4883 = this.field4883;
            this.field4883.field4882 = this.field4882;
            this.field4883 = null;
            this.field4882 = null;
        }
    }
}
