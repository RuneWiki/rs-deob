package deob;

@ObfuscatedName("oy")
public final class class407 {

    @ObfuscatedName("oy.a")
    public static class407[] field4562 = new class407[0];

    @ObfuscatedName("oy.f")
    public static int field4557 = 100;

    @ObfuscatedName("oy.c")
    public static int field4561;

    @ObfuscatedName("oy.x")
    public float field4556;

    @ObfuscatedName("oy.h")
    public float field4559;

    @ObfuscatedName("oy.j")
    public float field4560;

    @ObfuscatedName("oy.y")
    public float field4558;

    static {
        field4562 = new class407[100];
        field4561 = 0;
        new class407();
    }

    @ObfuscatedName("ba.a(S)Loy;")
    public static class407 method1764() {
        class407[] var0 = field4562;
        synchronized (field4562) {
            if (field4561 == 0) {
                return new class407();
            } else {
                field4562[--field4561].method6993();
                return field4562[field4561];
            }
        }
    }

    @ObfuscatedName("oy.f(B)V")
    public void method6983() {
        class407[] var1 = field4562;
        synchronized (field4562) {
            if (field4561 < field4557 - 1) {
                field4562[++field4561 - 1] = this;
            }
        }
    }

    public class407() {
        this.method6993();
    }

    @ObfuscatedName("oy.c(FFFFI)V")
    public void method6977(float arg0, float arg1, float arg2, float arg3) {
        this.field4559 = arg0;
        this.field4556 = arg1;
        this.field4560 = arg2;
        this.field4558 = arg3;
    }

    @ObfuscatedName("oy.x(FFFFI)V")
    public void method6998(float arg0, float arg1, float arg2, float arg3) {
        float var5 = (float) Math.sin((double) (arg3 * 0.5F));
        float var6 = (float) Math.cos((double) (arg3 * 0.5F));
        this.field4559 = arg0 * var5;
        this.field4556 = arg1 * var5;
        this.field4560 = arg2 * var5;
        this.field4558 = var6;
    }

    @ObfuscatedName("oy.h(B)V")
    public final void method6993() {
        this.field4560 = 0.0F;
        this.field4556 = 0.0F;
        this.field4559 = 0.0F;
        this.field4558 = 1.0F;
    }

    @ObfuscatedName("oy.j(Loy;I)V")
    public final void method6975(class407 arg0) {
        this.method6977(this.field4560 * arg0.field4556 + this.field4559 * arg0.field4558 + this.field4558 * arg0.field4559 - this.field4556 * arg0.field4560, this.field4559 * arg0.field4560 + this.field4558 * arg0.field4556 + (this.field4556 * arg0.field4558 - this.field4560 * arg0.field4559), this.field4558 * arg0.field4560 + (this.field4560 * arg0.field4558 + this.field4556 * arg0.field4559 - this.field4559 * arg0.field4556), this.field4558 * arg0.field4558 - this.field4559 * arg0.field4559 - this.field4556 * arg0.field4556 - this.field4560 * arg0.field4560);
    }

    public boolean equals(Object arg0) {
        if ((arg0 instanceof class407)) {
            class407 var2 = (class407) arg0;
            return this.field4559 == var2.field4559 && this.field4556 == var2.field4556 && this.field4560 == var2.field4560 && this.field4558 == var2.field4558;
        } else {
            return false;
        }
    }

    public int hashCode() {
        boolean var1 = true;
        float var2 = 1.0F;
        float var3 = var2 * 31.0F + this.field4559;
        float var4 = var3 * 31.0F + this.field4556;
        float var5 = var4 * 31.0F + this.field4560;
        float var6 = var5 * 31.0F + this.field4558;
        return (int) var6;
    }

    public String toString() {
        return this.field4559 + "," + this.field4556 + "," + this.field4560 + "," + this.field4558;
    }
}
