package deob;

@ObfuscatedName("gr")
public class class208 {

    @ObfuscatedName("gr.eo")
    public long field3100;

    @ObfuscatedName("gr.eu")
    public class208 field3101;

    @ObfuscatedName("gr.ej")
    public class208 field3102;

    @ObfuscatedName("gr.in()V")
    public void method3625() {
        if (this.field3102 != null) {
            this.field3102.field3101 = this.field3101;
            this.field3101.field3102 = this.field3102;
            this.field3101 = null;
            this.field3102 = null;
        }
    }

    @ObfuscatedName("gr.it()Z")
    public boolean method3633() {
        return this.field3102 != null;
    }
}
