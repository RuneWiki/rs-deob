package deob;

@ObfuscatedName("gc")
public class class208 extends class212 {

    @ObfuscatedName("gc.cl")
    public class208 field3156;

    @ObfuscatedName("gc.cy")
    public class208 field3157;

    @ObfuscatedName("gc.fu()V")
    public void method3674() {
        if (this.field3157 != null) {
            this.field3157.field3156 = this.field3156;
            this.field3156.field3157 = this.field3157;
            this.field3156 = null;
            this.field3157 = null;
        }
    }
}
