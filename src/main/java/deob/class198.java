package deob;

@ObfuscatedName("gx")
public class class198 {

    @ObfuscatedName("gx.k")
    public class198 field3004;

    @ObfuscatedName("gx.p")
    public class198 field3003;

    @ObfuscatedName("gx.b()V")
    public void method3408() {
        if (this.field3003 != null) {
            this.field3003.field3004 = this.field3004;
            this.field3004.field3003 = this.field3003;
            this.field3004 = null;
            this.field3003 = null;
        }
    }
}
