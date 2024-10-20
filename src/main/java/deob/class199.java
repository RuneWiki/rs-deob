package deob;

@ObfuscatedName("gl")
public class class199 {

    @ObfuscatedName("gl.ek")
    public long field3015;

    @ObfuscatedName("gl.ey")
    public class199 field3014;

    @ObfuscatedName("gl.eb")
    public class199 field3016;

    @ObfuscatedName("gl.iq()V")
    public void method3533() {
        if (this.field3016 != null) {
            this.field3016.field3014 = this.field3014;
            this.field3014.field3016 = this.field3016;
            this.field3014 = null;
            this.field3016 = null;
        }
    }

    @ObfuscatedName("gl.ii()Z")
    public boolean method3534() {
        return this.field3016 != null;
    }
}
