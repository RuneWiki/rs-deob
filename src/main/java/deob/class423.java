package deob;

@ObfuscatedName("qx")
public class class423 {

    @ObfuscatedName("qx.aj")
    public float field4620;

    @ObfuscatedName("qx.al")
    public float field4625;

    @ObfuscatedName("qx.ac")
    public float field4616;

    @ObfuscatedName("qx.ab")
    public float field4617;

    @ObfuscatedName("qx.an")
    public float field4618;

    @ObfuscatedName("qx.ao")
    public float field4619;

    @ObfuscatedName("qx.av")
    public float field4614;

    @ObfuscatedName("qx.aq")
    public float field4621;

    @ObfuscatedName("qx.ap")
    public float field4622;

    @ObfuscatedName("qx.ar")
    public float field4623;

    @ObfuscatedName("qx.ak")
    public float field4615;

    @ObfuscatedName("qx.ax")
    public float field4624;

    static {
        new class423();
    }

    public class423() {
        this.method7242();
    }

    @ObfuscatedName("qx.aj(I)V")
    public void method7242() {
        this.field4624 = 0.0F;
        this.field4615 = 0.0F;
        this.field4623 = 0.0F;
        this.field4621 = 0.0F;
        this.field4614 = 0.0F;
        this.field4619 = 0.0F;
        this.field4617 = 0.0F;
        this.field4616 = 0.0F;
        this.field4625 = 0.0F;
        this.field4622 = 1.0F;
        this.field4618 = 1.0F;
        this.field4620 = 1.0F;
    }

    @ObfuscatedName("qx.al(FI)V")
    public void method7243(float arg0) {
        float var2 = (float) Math.cos((double) arg0);
        float var3 = (float) Math.sin((double) arg0);
        float var4 = this.field4625;
        float var5 = this.field4618;
        float var6 = this.field4621;
        float var7 = this.field4615;
        this.field4625 = var2 * var4 - this.field4616 * var3;
        this.field4616 = this.field4616 * var2 + var3 * var4;
        this.field4618 = var2 * var5 - this.field4619 * var3;
        this.field4619 = this.field4619 * var2 + var3 * var5;
        this.field4621 = var2 * var6 - this.field4622 * var3;
        this.field4622 = this.field4622 * var2 + var3 * var6;
        this.field4615 = var2 * var7 - this.field4624 * var3;
        this.field4624 = this.field4624 * var2 + var3 * var7;
    }

    @ObfuscatedName("qx.ac(FI)V")
    public void method7244(float arg0) {
        float var2 = (float) Math.cos((double) arg0);
        float var3 = (float) Math.sin((double) arg0);
        float var4 = this.field4620;
        float var5 = this.field4617;
        float var6 = this.field4614;
        float var7 = this.field4623;
        this.field4620 = this.field4616 * var3 + var2 * var4;
        this.field4616 = this.field4616 * var2 - var3 * var4;
        this.field4617 = this.field4619 * var3 + var2 * var5;
        this.field4619 = this.field4619 * var2 - var3 * var5;
        this.field4614 = this.field4622 * var3 + var2 * var6;
        this.field4622 = this.field4622 * var2 - var3 * var6;
        this.field4623 = this.field4624 * var3 + var2 * var7;
        this.field4624 = this.field4624 * var2 - var3 * var7;
    }

    @ObfuscatedName("qx.ab(FI)V")
    public void method7247(float arg0) {
        float var2 = (float) Math.cos((double) arg0);
        float var3 = (float) Math.sin((double) arg0);
        float var4 = this.field4620;
        float var5 = this.field4617;
        float var6 = this.field4614;
        float var7 = this.field4623;
        this.field4620 = var2 * var4 - this.field4625 * var3;
        this.field4625 = this.field4625 * var2 + var3 * var4;
        this.field4617 = var2 * var5 - this.field4618 * var3;
        this.field4618 = this.field4618 * var2 + var3 * var5;
        this.field4614 = var2 * var6 - this.field4621 * var3;
        this.field4621 = this.field4621 * var2 + var3 * var6;
        this.field4623 = var2 * var7 - this.field4615 * var3;
        this.field4615 = this.field4615 * var2 + var3 * var7;
    }

    @ObfuscatedName("qx.an(FFFI)V")
    public void method7252(float arg0, float arg1, float arg2) {
        this.field4623 += arg0;
        this.field4615 += arg1;
        this.field4624 += arg2;
    }

    public String toString() {
        return this.field4620 + "," + this.field4617 + "," + this.field4614 + "," + this.field4623 + "\n" + this.field4625 + "," + this.field4618 + "," + this.field4621 + "," + this.field4615 + "\n" + this.field4616 + "," + this.field4619 + "," + this.field4622 + "," + this.field4624;
    }
}
