package deob;

@ObfuscatedName("qh")
public final class class421 {

    @ObfuscatedName("qh.aj")
    public static class421[] field4607 = new class421[0];

    @ObfuscatedName("qh.al")
    public static int field4602 = 100;

    @ObfuscatedName("qh.ac")
    public static int field4601;

    @ObfuscatedName("qh.ab")
    public float field4603;

    @ObfuscatedName("qh.an")
    public float field4605;

    @ObfuscatedName("qh.ao")
    public float field4606;

    @ObfuscatedName("qh.av")
    public float field4604;

    static {
        field4607 = new class421[100];
        field4601 = 0;
        new class421();
    }

    @ObfuscatedName("lk.aj(B)Lqh;")
    public static class421 method4961() {
        class421[] var0 = field4607;
        synchronized (field4607) {
            if (field4601 == 0) {
                return new class421();
            } else {
                field4607[--field4601].method7157();
                return field4607[field4601];
            }
        }
    }

    @ObfuscatedName("qh.al(I)V")
    public void method7163() {
        class421[] var1 = field4607;
        synchronized (field4607) {
            if (field4601 < field4602 - 1) {
                field4607[++field4601 - 1] = this;
            }
        }
    }

    public class421() {
        this.method7157();
    }

    @ObfuscatedName("qh.ac(FFFFI)V")
    public void method7161(float arg0, float arg1, float arg2, float arg3) {
        this.field4603 = arg0;
        this.field4605 = arg1;
        this.field4606 = arg2;
        this.field4604 = arg3;
    }

    @ObfuscatedName("qh.ab(FFFFS)V")
    public void method7159(float arg0, float arg1, float arg2, float arg3) {
        float var5 = (float) Math.sin((double) (arg3 * 0.5F));
        float var6 = (float) Math.cos((double) (arg3 * 0.5F));
        this.field4603 = arg0 * var5;
        this.field4605 = arg1 * var5;
        this.field4606 = arg2 * var5;
        this.field4604 = var6;
    }

    @ObfuscatedName("qh.an(I)V")
    public final void method7157() {
        this.field4606 = 0.0F;
        this.field4605 = 0.0F;
        this.field4603 = 0.0F;
        this.field4604 = 1.0F;
    }

    @ObfuscatedName("qh.ao(Lqh;I)V")
    public final void method7158(class421 arg0) {
        this.method7161(this.field4606 * arg0.field4605 + this.field4604 * arg0.field4603 + this.field4603 * arg0.field4604 - this.field4605 * arg0.field4606, this.field4603 * arg0.field4606 + this.field4604 * arg0.field4605 + (this.field4605 * arg0.field4604 - this.field4606 * arg0.field4603), this.field4604 * arg0.field4606 + (this.field4606 * arg0.field4604 + this.field4605 * arg0.field4603 - this.field4603 * arg0.field4605), this.field4604 * arg0.field4604 - this.field4603 * arg0.field4603 - this.field4605 * arg0.field4605 - this.field4606 * arg0.field4606);
    }

    public boolean equals(Object arg0) {
        if ((arg0 instanceof class421)) {
            class421 var2 = (class421) arg0;
            return this.field4603 == var2.field4603 && this.field4605 == var2.field4605 && this.field4606 == var2.field4606 && this.field4604 == var2.field4604;
        } else {
            return false;
        }
    }

    public int hashCode() {
        boolean var1 = true;
        float var2 = 1.0F;
        float var3 = var2 * 31.0F + this.field4603;
        float var4 = var3 * 31.0F + this.field4605;
        float var5 = var4 * 31.0F + this.field4606;
        float var6 = var5 * 31.0F + this.field4604;
        return (int) var6;
    }

    public String toString() {
        return this.field4603 + "," + this.field4605 + "," + this.field4606 + "," + this.field4604;
    }
}
