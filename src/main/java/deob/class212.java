package deob;

@ObfuscatedName("hn")
public class class212 {

    @ObfuscatedName("hn.ep")
    public long field3174;

    @ObfuscatedName("hn.em")
    public class212 field3175;

    @ObfuscatedName("hn.ey")
    public class212 field3173;

    @ObfuscatedName("hn.ip()V")
    public void method3695() {
        if (this.field3173 != null) {
            this.field3173.field3175 = this.field3175;
            this.field3175.field3173 = this.field3173;
            this.field3175 = null;
            this.field3173 = null;
        }
    }

    @ObfuscatedName("hn.im()Z")
    public boolean method3697() {
        return this.field3173 != null;
    }
}
