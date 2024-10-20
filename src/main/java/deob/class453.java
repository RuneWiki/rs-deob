package deob;

@ObfuscatedName("rv")
public class class453 {

    @ObfuscatedName("rv.aw")
    public float field4751;

    @ObfuscatedName("rv.ay")
    public float field4747;

    @ObfuscatedName("rv.ar")
    public float field4748;

    @ObfuscatedName("rv.am")
    public float field4755;

    @ObfuscatedName("rv.as")
    public float field4749;

    @ObfuscatedName("rv.aj")
    public float field4750;

    @ObfuscatedName("rv.ag")
    public float field4753;

    @ObfuscatedName("rv.az")
    public float field4746;

    @ObfuscatedName("rv.av")
    public float field4754;

    @ObfuscatedName("rv.ap")
    public float field4752;

    @ObfuscatedName("rv.aq")
    public float field4756;

    @ObfuscatedName("rv.at")
    public float field4757;

    static {
        new class453();
    }

    public class453() {
        this.method7571();
    }

    @ObfuscatedName("rv.aw(B)V")
    public void method7571() {
        this.field4757 = 0.0F;
        this.field4756 = 0.0F;
        this.field4752 = 0.0F;
        this.field4746 = 0.0F;
        this.field4753 = 0.0F;
        this.field4750 = 0.0F;
        this.field4755 = 0.0F;
        this.field4748 = 0.0F;
        this.field4747 = 0.0F;
        this.field4754 = 1.0F;
        this.field4749 = 1.0F;
        this.field4751 = 1.0F;
    }

    @ObfuscatedName("rv.ay(FB)V")
    public void method7555(float arg0) {
        float var2 = (float) Math.cos((double) arg0);
        float var3 = (float) Math.sin((double) arg0);
        float var4 = this.field4747;
        float var5 = this.field4749;
        float var6 = this.field4746;
        float var7 = this.field4756;
        this.field4747 = var2 * var4 - this.field4748 * var3;
        this.field4748 = this.field4748 * var2 + var3 * var4;
        this.field4749 = var2 * var5 - this.field4750 * var3;
        this.field4750 = this.field4750 * var2 + var3 * var5;
        this.field4746 = var2 * var6 - this.field4754 * var3;
        this.field4754 = this.field4754 * var2 + var3 * var6;
        this.field4756 = var2 * var7 - this.field4757 * var3;
        this.field4757 = this.field4757 * var2 + var3 * var7;
    }

    @ObfuscatedName("rv.ar(FI)V")
    public void method7556(float arg0) {
        float var2 = (float) Math.cos((double) arg0);
        float var3 = (float) Math.sin((double) arg0);
        float var4 = this.field4751;
        float var5 = this.field4755;
        float var6 = this.field4753;
        float var7 = this.field4752;
        this.field4751 = this.field4748 * var3 + var2 * var4;
        this.field4748 = this.field4748 * var2 - var3 * var4;
        this.field4755 = this.field4750 * var3 + var2 * var5;
        this.field4750 = this.field4750 * var2 - var3 * var5;
        this.field4753 = this.field4754 * var3 + var2 * var6;
        this.field4754 = this.field4754 * var2 - var3 * var6;
        this.field4752 = this.field4757 * var3 + var2 * var7;
        this.field4757 = this.field4757 * var2 - var3 * var7;
    }

    @ObfuscatedName("rv.am(FI)V")
    public void method7569(float arg0) {
        float var2 = (float) Math.cos((double) arg0);
        float var3 = (float) Math.sin((double) arg0);
        float var4 = this.field4751;
        float var5 = this.field4755;
        float var6 = this.field4753;
        float var7 = this.field4752;
        this.field4751 = var2 * var4 - this.field4747 * var3;
        this.field4747 = this.field4747 * var2 + var3 * var4;
        this.field4755 = var2 * var5 - this.field4749 * var3;
        this.field4749 = this.field4749 * var2 + var3 * var5;
        this.field4753 = var2 * var6 - this.field4746 * var3;
        this.field4746 = this.field4746 * var2 + var3 * var6;
        this.field4752 = var2 * var7 - this.field4756 * var3;
        this.field4756 = this.field4756 * var2 + var3 * var7;
    }

    @ObfuscatedName("rv.as(FFFI)V")
    public void method7558(float arg0, float arg1, float arg2) {
        this.field4752 += arg0;
        this.field4756 += arg1;
        this.field4757 += arg2;
    }

    public String toString() {
        return this.field4751 + "," + this.field4755 + "," + this.field4753 + "," + this.field4752 + "\n" + this.field4747 + "," + this.field4749 + "," + this.field4746 + "," + this.field4756 + "\n" + this.field4748 + "," + this.field4750 + "," + this.field4754 + "," + this.field4757;
    }
}
