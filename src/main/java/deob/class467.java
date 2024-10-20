package deob;

@ObfuscatedName("rz")
public class class467 {

    @ObfuscatedName("rz.ac")
    public float field4798;

    @ObfuscatedName("rz.al")
    public float field4791;

    @ObfuscatedName("rz.ak")
    public float field4799;

    @ObfuscatedName("rz.ax")
    public float field4793;

    @ObfuscatedName("rz.ao")
    public float field4794;

    @ObfuscatedName("rz.ah")
    public float field4790;

    @ObfuscatedName("rz.ar")
    public float field4796;

    @ObfuscatedName("rz.ab")
    public float field4797;

    @ObfuscatedName("rz.am")
    public float field4801;

    @ObfuscatedName("rz.av")
    public float field4795;

    @ObfuscatedName("rz.ag")
    public float field4800;

    @ObfuscatedName("rz.aa")
    public float field4792;

    static {
        new class467();
    }

    public class467() {
        this.method7665();
    }

    @ObfuscatedName("rz.ac(I)V")
    public void method7665() {
        this.field4792 = 0.0F;
        this.field4800 = 0.0F;
        this.field4795 = 0.0F;
        this.field4797 = 0.0F;
        this.field4796 = 0.0F;
        this.field4790 = 0.0F;
        this.field4793 = 0.0F;
        this.field4799 = 0.0F;
        this.field4791 = 0.0F;
        this.field4801 = 1.0F;
        this.field4794 = 1.0F;
        this.field4798 = 1.0F;
    }

    @ObfuscatedName("rz.al(FB)V")
    public void method7664(float arg0) {
        float var2 = (float) Math.cos((double) arg0);
        float var3 = (float) Math.sin((double) arg0);
        float var4 = this.field4791;
        float var5 = this.field4794;
        float var6 = this.field4797;
        float var7 = this.field4800;
        this.field4791 = var2 * var4 - this.field4799 * var3;
        this.field4799 = this.field4799 * var2 + var3 * var4;
        this.field4794 = var2 * var5 - this.field4790 * var3;
        this.field4790 = this.field4790 * var2 + var3 * var5;
        this.field4797 = var2 * var6 - this.field4801 * var3;
        this.field4801 = this.field4801 * var2 + var3 * var6;
        this.field4800 = var2 * var7 - this.field4792 * var3;
        this.field4792 = this.field4792 * var2 + var3 * var7;
    }

    @ObfuscatedName("rz.ak(FB)V")
    public void method7659(float arg0) {
        float var2 = (float) Math.cos((double) arg0);
        float var3 = (float) Math.sin((double) arg0);
        float var4 = this.field4798;
        float var5 = this.field4793;
        float var6 = this.field4796;
        float var7 = this.field4795;
        this.field4798 = this.field4799 * var3 + var2 * var4;
        this.field4799 = this.field4799 * var2 - var3 * var4;
        this.field4793 = this.field4790 * var3 + var2 * var5;
        this.field4790 = this.field4790 * var2 - var3 * var5;
        this.field4796 = this.field4801 * var3 + var2 * var6;
        this.field4801 = this.field4801 * var2 - var3 * var6;
        this.field4795 = this.field4792 * var3 + var2 * var7;
        this.field4792 = this.field4792 * var2 - var3 * var7;
    }

    @ObfuscatedName("rz.ax(FI)V")
    public void method7660(float arg0) {
        float var2 = (float) Math.cos((double) arg0);
        float var3 = (float) Math.sin((double) arg0);
        float var4 = this.field4798;
        float var5 = this.field4793;
        float var6 = this.field4796;
        float var7 = this.field4795;
        this.field4798 = var2 * var4 - this.field4791 * var3;
        this.field4791 = this.field4791 * var2 + var3 * var4;
        this.field4793 = var2 * var5 - this.field4794 * var3;
        this.field4794 = this.field4794 * var2 + var3 * var5;
        this.field4796 = var2 * var6 - this.field4797 * var3;
        this.field4797 = this.field4797 * var2 + var3 * var6;
        this.field4795 = var2 * var7 - this.field4800 * var3;
        this.field4800 = this.field4800 * var2 + var3 * var7;
    }

    @ObfuscatedName("rz.ao(FFFI)V")
    public void method7661(float arg0, float arg1, float arg2) {
        this.field4795 += arg0;
        this.field4800 += arg1;
        this.field4792 += arg2;
    }

    public String toString() {
        return this.field4798 + "," + this.field4793 + "," + this.field4796 + "," + this.field4795 + "\n" + this.field4791 + "," + this.field4794 + "," + this.field4797 + "," + this.field4800 + "\n" + this.field4799 + "," + this.field4790 + "," + this.field4801 + "," + this.field4792;
    }
}
