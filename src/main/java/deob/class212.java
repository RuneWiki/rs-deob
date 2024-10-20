package deob;

@ObfuscatedName("hk")
public class class212 {

    @ObfuscatedName("hk.em")
    public long field3176;

    @ObfuscatedName("hk.et")
    public class212 field3174;

    @ObfuscatedName("hk.ew")
    public class212 field3175;

    @ObfuscatedName("hk.iv()V")
    public void method3706() {
        if (this.field3175 != null) {
            this.field3175.field3174 = this.field3174;
            this.field3174.field3175 = this.field3175;
            this.field3174 = null;
            this.field3175 = null;
        }
    }

    @ObfuscatedName("hk.is()Z")
    public boolean method3700() {
        return this.field3175 != null;
    }
}
