package deob;

@ObfuscatedName("qx")
public class class426 {

    @ObfuscatedName("qx.aq")
    public float field4712;

    @ObfuscatedName("qx.ad")
    public float field4711;

    @ObfuscatedName("qx.ag")
    public float field4713;

    @ObfuscatedName("qx.ak")
    public float field4714;

    @ObfuscatedName("qx.ap")
    public float field4715;

    @ObfuscatedName("qx.an")
    public float field4716;

    @ObfuscatedName("qx.aj")
    public float field4720;

    @ObfuscatedName("qx.av")
    public float field4718;

    @ObfuscatedName("qx.ab")
    public float field4717;

    @ObfuscatedName("qx.ai")
    public float field4721;

    @ObfuscatedName("qx.ae")
    public float field4719;

    @ObfuscatedName("qx.au")
    public float field4722;

    static {
        new class426();
    }

    public class426() {
        this.method7207();
    }

    @ObfuscatedName("qx.aq(B)V")
    public void method7207() {
        this.field4722 = 0.0F;
        this.field4719 = 0.0F;
        this.field4721 = 0.0F;
        this.field4718 = 0.0F;
        this.field4720 = 0.0F;
        this.field4716 = 0.0F;
        this.field4714 = 0.0F;
        this.field4713 = 0.0F;
        this.field4711 = 0.0F;
        this.field4717 = 1.0F;
        this.field4715 = 1.0F;
        this.field4712 = 1.0F;
    }

    @ObfuscatedName("qx.ad(FI)V")
    public void method7206(float arg0) {
        float var2 = (float) Math.cos((double) arg0);
        float var3 = (float) Math.sin((double) arg0);
        float var4 = this.field4711;
        float var5 = this.field4715;
        float var6 = this.field4718;
        float var7 = this.field4719;
        this.field4711 = var2 * var4 - this.field4713 * var3;
        this.field4713 = this.field4713 * var2 + var3 * var4;
        this.field4715 = var2 * var5 - this.field4716 * var3;
        this.field4716 = this.field4716 * var2 + var3 * var5;
        this.field4718 = var2 * var6 - this.field4717 * var3;
        this.field4717 = this.field4717 * var2 + var3 * var6;
        this.field4719 = var2 * var7 - this.field4722 * var3;
        this.field4722 = this.field4722 * var2 + var3 * var7;
    }

    @ObfuscatedName("qx.ag(FI)V")
    public void method7216(float arg0) {
        float var2 = (float) Math.cos((double) arg0);
        float var3 = (float) Math.sin((double) arg0);
        float var4 = this.field4712;
        float var5 = this.field4714;
        float var6 = this.field4720;
        float var7 = this.field4721;
        this.field4712 = this.field4713 * var3 + var2 * var4;
        this.field4713 = this.field4713 * var2 - var3 * var4;
        this.field4714 = this.field4716 * var3 + var2 * var5;
        this.field4716 = this.field4716 * var2 - var3 * var5;
        this.field4720 = this.field4717 * var3 + var2 * var6;
        this.field4717 = this.field4717 * var2 - var3 * var6;
        this.field4721 = this.field4722 * var3 + var2 * var7;
        this.field4722 = this.field4722 * var2 - var3 * var7;
    }

    @ObfuscatedName("qx.ak(FI)V")
    public void method7208(float arg0) {
        float var2 = (float) Math.cos((double) arg0);
        float var3 = (float) Math.sin((double) arg0);
        float var4 = this.field4712;
        float var5 = this.field4714;
        float var6 = this.field4720;
        float var7 = this.field4721;
        this.field4712 = var2 * var4 - this.field4711 * var3;
        this.field4711 = this.field4711 * var2 + var3 * var4;
        this.field4714 = var2 * var5 - this.field4715 * var3;
        this.field4715 = this.field4715 * var2 + var3 * var5;
        this.field4720 = var2 * var6 - this.field4718 * var3;
        this.field4718 = this.field4718 * var2 + var3 * var6;
        this.field4721 = var2 * var7 - this.field4719 * var3;
        this.field4719 = this.field4719 * var2 + var3 * var7;
    }

    @ObfuscatedName("qx.ap(FFFB)V")
    public void method7209(float arg0, float arg1, float arg2) {
        this.field4721 += arg0;
        this.field4719 += arg1;
        this.field4722 += arg2;
    }

    public String toString() {
        return this.field4712 + "," + this.field4714 + "," + this.field4720 + "," + this.field4721 + "\n" + this.field4711 + "," + this.field4715 + "," + this.field4718 + "," + this.field4719 + "\n" + this.field4713 + "," + this.field4716 + "," + this.field4717 + "," + this.field4722;
    }
}
