package deob;

@ObfuscatedName("qc")
public class class427 {

    @ObfuscatedName("qc.af")
    public float field4687;

    @ObfuscatedName("qc.an")
    public float field4676;

    @ObfuscatedName("qc.aw")
    public float field4677;

    @ObfuscatedName("qc.ac")
    public float field4678;

    @ObfuscatedName("qc.au")
    public float field4679;

    @ObfuscatedName("qc.ab")
    public float field4680;

    @ObfuscatedName("qc.aq")
    public float field4681;

    @ObfuscatedName("qc.al")
    public float field4682;

    @ObfuscatedName("qc.at")
    public float field4683;

    @ObfuscatedName("qc.aa")
    public float field4684;

    @ObfuscatedName("qc.ay")
    public float field4685;

    @ObfuscatedName("qc.ao")
    public float field4686;

    static {
        new class427();
    }

    public class427() {
        this.method7538();
    }

    @ObfuscatedName("qc.af(S)V")
    public void method7538() {
        this.field4686 = 0.0F;
        this.field4685 = 0.0F;
        this.field4684 = 0.0F;
        this.field4682 = 0.0F;
        this.field4681 = 0.0F;
        this.field4680 = 0.0F;
        this.field4678 = 0.0F;
        this.field4677 = 0.0F;
        this.field4676 = 0.0F;
        this.field4683 = 1.0F;
        this.field4679 = 1.0F;
        this.field4687 = 1.0F;
    }

    @ObfuscatedName("qc.an(FI)V")
    public void method7529(float arg0) {
        float var2 = (float) Math.cos((double) arg0);
        float var3 = (float) Math.sin((double) arg0);
        float var4 = this.field4676;
        float var5 = this.field4679;
        float var6 = this.field4682;
        float var7 = this.field4685;
        this.field4676 = var2 * var4 - this.field4677 * var3;
        this.field4677 = this.field4677 * var2 + var3 * var4;
        this.field4679 = var2 * var5 - this.field4680 * var3;
        this.field4680 = this.field4680 * var2 + var3 * var5;
        this.field4682 = var2 * var6 - this.field4683 * var3;
        this.field4683 = this.field4683 * var2 + var3 * var6;
        this.field4685 = var2 * var7 - this.field4686 * var3;
        this.field4686 = this.field4686 * var2 + var3 * var7;
    }

    @ObfuscatedName("qc.aw(FI)V")
    public void method7530(float arg0) {
        float var2 = (float) Math.cos((double) arg0);
        float var3 = (float) Math.sin((double) arg0);
        float var4 = this.field4687;
        float var5 = this.field4678;
        float var6 = this.field4681;
        float var7 = this.field4684;
        this.field4687 = this.field4677 * var3 + var2 * var4;
        this.field4677 = this.field4677 * var2 - var3 * var4;
        this.field4678 = this.field4680 * var3 + var2 * var5;
        this.field4680 = this.field4680 * var2 - var3 * var5;
        this.field4681 = this.field4683 * var3 + var2 * var6;
        this.field4683 = this.field4683 * var2 - var3 * var6;
        this.field4684 = this.field4686 * var3 + var2 * var7;
        this.field4686 = this.field4686 * var2 - var3 * var7;
    }

    @ObfuscatedName("qc.ac(FB)V")
    public void method7531(float arg0) {
        float var2 = (float) Math.cos((double) arg0);
        float var3 = (float) Math.sin((double) arg0);
        float var4 = this.field4687;
        float var5 = this.field4678;
        float var6 = this.field4681;
        float var7 = this.field4684;
        this.field4687 = var2 * var4 - this.field4676 * var3;
        this.field4676 = this.field4676 * var2 + var3 * var4;
        this.field4678 = var2 * var5 - this.field4679 * var3;
        this.field4679 = this.field4679 * var2 + var3 * var5;
        this.field4681 = var2 * var6 - this.field4682 * var3;
        this.field4682 = this.field4682 * var2 + var3 * var6;
        this.field4684 = var2 * var7 - this.field4685 * var3;
        this.field4685 = this.field4685 * var2 + var3 * var7;
    }

    @ObfuscatedName("qc.au(FFFB)V")
    public void method7528(float arg0, float arg1, float arg2) {
        this.field4684 += arg0;
        this.field4685 += arg1;
        this.field4686 += arg2;
    }

    public String toString() {
        return this.field4687 + "," + this.field4678 + "," + this.field4681 + "," + this.field4684 + "\n" + this.field4676 + "," + this.field4679 + "," + this.field4682 + "," + this.field4685 + "\n" + this.field4677 + "," + this.field4680 + "," + this.field4683 + "," + this.field4686;
    }
}
