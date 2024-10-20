package deob;

@ObfuscatedName("gx")
public class class204 extends class208 {

    @ObfuscatedName("gx.cu")
    public class204 field3092;

    @ObfuscatedName("gx.co")
    public class204 field3091;

    @ObfuscatedName("gx.el()V")
    public void method3565() {
        if (this.field3091 != null) {
            this.field3091.field3092 = this.field3092;
            this.field3092.field3091 = this.field3091;
            this.field3092 = null;
            this.field3091 = null;
        }
    }
}
