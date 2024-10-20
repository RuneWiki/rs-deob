package deob;

@ObfuscatedName("qo")
public class class423 {

    @ObfuscatedName("qo.aq")
    public float field4696;

    @ObfuscatedName("qo.ad")
    public float field4693;

    @ObfuscatedName("qo.ag")
    public float field4694;

    static {
        new class423(0.0F, 0.0F, 0.0F);
        new class423(1.0F, 1.0F, 1.0F);
        new class423(1.0F, 0.0F, 0.0F);
        new class423(0.0F, 1.0F, 0.0F);
        new class423(0.0F, 0.0F, 1.0F);
    }

    public class423() {
    }

    public class423(float arg0, float arg1, float arg2) {
        this.field4696 = arg0;
        this.field4693 = arg1;
        this.field4694 = arg2;
    }

    @ObfuscatedName("qo.aq(Lqo;I)Z")
    public boolean method7069(class423 arg0) {
        return this.field4696 == arg0.field4696 && this.field4693 == arg0.field4693 && this.field4694 == arg0.field4694;
    }

    @ObfuscatedName("qo.ad(I)F")
    public final float method7068() {
        return (float) Math.sqrt((double) (this.field4694 * this.field4694 + this.field4696 * this.field4696 + this.field4693 * this.field4693));
    }

    public String toString() {
        return this.field4696 + ", " + this.field4693 + ", " + this.field4694;
    }
}
