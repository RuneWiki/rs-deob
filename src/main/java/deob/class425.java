package deob;

@ObfuscatedName("qx")
public class class425 {

    @ObfuscatedName("qx.ak")
    public float field4701;

    @ObfuscatedName("qx.al")
    public float field4709;

    @ObfuscatedName("qx.aj")
    public float field4698;

    @ObfuscatedName("qx.az")
    public float field4700;

    @ObfuscatedName("qx.af")
    public float field4702;

    @ObfuscatedName("qx.aa")
    public float field4703;

    @ObfuscatedName("qx.at")
    public float field4704;

    @ObfuscatedName("qx.ab")
    public float field4705;

    @ObfuscatedName("qx.ac")
    public float field4706;

    @ObfuscatedName("qx.ao")
    public float field4707;

    @ObfuscatedName("qx.ah")
    public float field4708;

    @ObfuscatedName("qx.av")
    public float field4699;

    static {
        new class425();
    }

    public class425() {
        this.method7250();
    }

    @ObfuscatedName("qx.ak(I)V")
    public void method7250() {
        this.field4699 = 0.0F;
        this.field4708 = 0.0F;
        this.field4707 = 0.0F;
        this.field4705 = 0.0F;
        this.field4704 = 0.0F;
        this.field4703 = 0.0F;
        this.field4700 = 0.0F;
        this.field4698 = 0.0F;
        this.field4709 = 0.0F;
        this.field4706 = 1.0F;
        this.field4702 = 1.0F;
        this.field4701 = 1.0F;
    }

    @ObfuscatedName("qx.al(FB)V")
    public void method7251(float arg0) {
        float var2 = (float) Math.cos((double) arg0);
        float var3 = (float) Math.sin((double) arg0);
        float var4 = this.field4709;
        float var5 = this.field4702;
        float var6 = this.field4705;
        float var7 = this.field4708;
        this.field4709 = var2 * var4 - this.field4698 * var3;
        this.field4698 = this.field4698 * var2 + var3 * var4;
        this.field4702 = var2 * var5 - this.field4703 * var3;
        this.field4703 = this.field4703 * var2 + var3 * var5;
        this.field4705 = var2 * var6 - this.field4706 * var3;
        this.field4706 = this.field4706 * var2 + var3 * var6;
        this.field4708 = var2 * var7 - this.field4699 * var3;
        this.field4699 = this.field4699 * var2 + var3 * var7;
    }

    @ObfuscatedName("qx.aj(FS)V")
    public void method7252(float arg0) {
        float var2 = (float) Math.cos((double) arg0);
        float var3 = (float) Math.sin((double) arg0);
        float var4 = this.field4701;
        float var5 = this.field4700;
        float var6 = this.field4704;
        float var7 = this.field4707;
        this.field4701 = this.field4698 * var3 + var2 * var4;
        this.field4698 = this.field4698 * var2 - var3 * var4;
        this.field4700 = this.field4703 * var3 + var2 * var5;
        this.field4703 = this.field4703 * var2 - var3 * var5;
        this.field4704 = this.field4706 * var3 + var2 * var6;
        this.field4706 = this.field4706 * var2 - var3 * var6;
        this.field4707 = this.field4699 * var3 + var2 * var7;
        this.field4699 = this.field4699 * var2 - var3 * var7;
    }

    @ObfuscatedName("qx.az(FI)V")
    public void method7253(float arg0) {
        float var2 = (float) Math.cos((double) arg0);
        float var3 = (float) Math.sin((double) arg0);
        float var4 = this.field4701;
        float var5 = this.field4700;
        float var6 = this.field4704;
        float var7 = this.field4707;
        this.field4701 = var2 * var4 - this.field4709 * var3;
        this.field4709 = this.field4709 * var2 + var3 * var4;
        this.field4700 = var2 * var5 - this.field4702 * var3;
        this.field4702 = this.field4702 * var2 + var3 * var5;
        this.field4704 = var2 * var6 - this.field4705 * var3;
        this.field4705 = this.field4705 * var2 + var3 * var6;
        this.field4707 = var2 * var7 - this.field4708 * var3;
        this.field4708 = this.field4708 * var2 + var3 * var7;
    }

    @ObfuscatedName("qx.af(FFFI)V")
    public void method7254(float arg0, float arg1, float arg2) {
        this.field4707 += arg0;
        this.field4708 += arg1;
        this.field4699 += arg2;
    }

    public String toString() {
        return this.field4701 + "," + this.field4700 + "," + this.field4704 + "," + this.field4707 + "\n" + this.field4709 + "," + this.field4702 + "," + this.field4705 + "," + this.field4708 + "\n" + this.field4698 + "," + this.field4703 + "," + this.field4706 + "," + this.field4699;
    }
}
