package deob;

@ObfuscatedName("op")
public final class class410 {

    @ObfuscatedName("op.h")
    public static class410[] field4602 = new class410[0];

    @ObfuscatedName("op.e")
    public static int field4603 = 100;

    @ObfuscatedName("op.v")
    public static int field4605;

    @ObfuscatedName("op.x")
    public float field4601;

    @ObfuscatedName("op.m")
    public float field4604;

    @ObfuscatedName("op.q")
    public float field4606;

    @ObfuscatedName("op.f")
    public float field4607;

    static {
        field4602 = new class410[100];
        field4605 = 0;
        new class410();
    }

    @ObfuscatedName("gq.h(I)Lop;")
    public static class410 method3402() {
        class410[] var0 = field4602;
        synchronized (field4602) {
            if (field4605 == 0) {
                return new class410();
            } else {
                field4602[--field4605].method7061();
                return field4602[field4605];
            }
        }
    }

    @ObfuscatedName("op.e(I)V")
    public void method7073() {
        class410[] var1 = field4602;
        synchronized (field4602) {
            if (field4605 < field4603 - 1) {
                field4602[++field4605 - 1] = this;
            }
        }
    }

    public class410() {
        this.method7061();
    }

    @ObfuscatedName("op.v(FFFFI)V")
    public void method7055(float arg0, float arg1, float arg2, float arg3) {
        this.field4604 = arg0;
        this.field4601 = arg1;
        this.field4606 = arg2;
        this.field4607 = arg3;
    }

    @ObfuscatedName("op.x(FFFFI)V")
    public void method7056(float arg0, float arg1, float arg2, float arg3) {
        float var5 = (float) Math.sin((double) (arg3 * 0.5F));
        float var6 = (float) Math.cos((double) (arg3 * 0.5F));
        this.field4604 = arg0 * var5;
        this.field4601 = arg1 * var5;
        this.field4606 = arg2 * var5;
        this.field4607 = var6;
    }

    @ObfuscatedName("op.m(B)V")
    public final void method7061() {
        this.field4606 = 0.0F;
        this.field4601 = 0.0F;
        this.field4604 = 0.0F;
        this.field4607 = 1.0F;
    }

    @ObfuscatedName("op.q(Lop;I)V")
    public final void method7058(class410 arg0) {
        this.method7055(this.field4606 * arg0.field4601 + this.field4607 * arg0.field4604 + this.field4604 * arg0.field4607 - this.field4601 * arg0.field4606, this.field4604 * arg0.field4606 + this.field4607 * arg0.field4601 + (this.field4601 * arg0.field4607 - this.field4606 * arg0.field4604), this.field4607 * arg0.field4606 + (this.field4606 * arg0.field4607 + this.field4601 * arg0.field4604 - this.field4604 * arg0.field4601), this.field4607 * arg0.field4607 - this.field4604 * arg0.field4604 - this.field4601 * arg0.field4601 - this.field4606 * arg0.field4606);
    }

    public boolean equals(Object arg0) {
        if ((arg0 instanceof class410)) {
            class410 var2 = (class410) arg0;
            return this.field4604 == var2.field4604 && this.field4601 == var2.field4601 && this.field4606 == var2.field4606 && this.field4607 == var2.field4607;
        } else {
            return false;
        }
    }

    public int hashCode() {
        boolean var1 = true;
        float var2 = 1.0F;
        float var3 = var2 * 31.0F + this.field4604;
        float var4 = var3 * 31.0F + this.field4601;
        float var5 = var4 * 31.0F + this.field4606;
        float var6 = var5 * 31.0F + this.field4607;
        return (int) var6;
    }

    public String toString() {
        return this.field4604 + "," + this.field4601 + "," + this.field4606 + "," + this.field4607;
    }
}
