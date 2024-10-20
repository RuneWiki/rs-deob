package deob;

@ObfuscatedName("hb")
public class class212 {

    @ObfuscatedName("hb.em")
    public long field3176;

    @ObfuscatedName("hb.eq")
    public class212 field3174;

    @ObfuscatedName("hb.ef")
    public class212 field3175;

    @ObfuscatedName("hb.ii()V")
    public void method3815() {
        if (this.field3175 != null) {
            this.field3175.field3174 = this.field3174;
            this.field3174.field3175 = this.field3175;
            this.field3174 = null;
            this.field3175 = null;
        }
    }

    @ObfuscatedName("hb.jc()Z")
    public boolean method3816() {
        return this.field3175 != null;
    }
}
