package deob;

@ObfuscatedName("qd")
public final class class427 {

    @ObfuscatedName("qd.ac")
    public static class427[] field4728 = new class427[0];

    @ObfuscatedName("qd.ae")
    public static int field4730 = 100;

    @ObfuscatedName("qd.ag")
    public static int field4726;

    @ObfuscatedName("qd.am")
    public float field4729;

    @ObfuscatedName("qd.ax")
    public float field4733;

    @ObfuscatedName("qd.aq")
    public float field4731;

    @ObfuscatedName("qd.af")
    public float field4732;

    static {
        field4728 = new class427[100];
        field4726 = 0;
        new class427();
    }

    @ObfuscatedName("gd.ac(I)Lqd;")
    public static class427 method3295() {
        class427[] var0 = field4728;
        synchronized (field4728) {
            if (field4726 == 0) {
                return new class427();
            } else {
                field4728[--field4726].method7332();
                return field4728[field4726];
            }
        }
    }

    @ObfuscatedName("qd.ae(I)V")
    public void method7330() {
        class427[] var1 = field4728;
        synchronized (field4728) {
            if (field4726 < field4730 - 1) {
                field4728[++field4726 - 1] = this;
            }
        }
    }

    public class427() {
        this.method7332();
    }

    public class427(float arg0, float arg1, float arg2) {
        this.method7350(arg0, arg1, arg2);
    }

    @ObfuscatedName("qd.ag(FFFFI)V")
    public void method7331(float arg0, float arg1, float arg2, float arg3) {
        this.field4729 = arg0;
        this.field4733 = arg1;
        this.field4731 = arg2;
        this.field4732 = arg3;
    }

    @ObfuscatedName("qd.am(FFFFI)V")
    public void method7339(float arg0, float arg1, float arg2, float arg3) {
        float var5 = (float) Math.sin((double) (arg3 * 0.5F));
        float var6 = (float) Math.cos((double) (arg3 * 0.5F));
        this.field4729 = arg0 * var5;
        this.field4733 = arg1 * var5;
        this.field4731 = arg2 * var5;
        this.field4732 = var6;
    }

    @ObfuscatedName("qd.ax(FFFB)V")
    public void method7350(float arg0, float arg1, float arg2) {
        this.method7339(0.0F, 1.0F, 0.0F, arg0);
        class427 var4 = method3295();
        var4.method7339(1.0F, 0.0F, 0.0F, arg1);
        this.method7335(var4);
        var4.method7339(0.0F, 0.0F, 1.0F, arg2);
        this.method7335(var4);
        var4.method7330();
    }

    @ObfuscatedName("qd.aq(I)V")
    public final void method7332() {
        this.field4731 = 0.0F;
        this.field4733 = 0.0F;
        this.field4729 = 0.0F;
        this.field4732 = 1.0F;
    }

    @ObfuscatedName("qd.af(Lqd;B)V")
    public final void method7335(class427 arg0) {
        this.method7331(this.field4731 * arg0.field4733 + this.field4732 * arg0.field4729 + this.field4729 * arg0.field4732 - this.field4733 * arg0.field4731, this.field4729 * arg0.field4731 + this.field4732 * arg0.field4733 + (this.field4733 * arg0.field4732 - this.field4731 * arg0.field4729), this.field4732 * arg0.field4731 + (this.field4733 * arg0.field4729 + this.field4731 * arg0.field4732 - this.field4729 * arg0.field4733), this.field4732 * arg0.field4732 - this.field4729 * arg0.field4729 - this.field4733 * arg0.field4733 - this.field4731 * arg0.field4731);
    }

    public boolean equals(Object arg0) {
        if ((arg0 instanceof class427)) {
            class427 var2 = (class427) arg0;
            return this.field4729 == var2.field4729 && this.field4733 == var2.field4733 && this.field4731 == var2.field4731 && this.field4732 == var2.field4732;
        } else {
            return false;
        }
    }

    public int hashCode() {
        boolean var1 = true;
        float var2 = 1.0F;
        float var3 = var2 * 31.0F + this.field4729;
        float var4 = var3 * 31.0F + this.field4733;
        float var5 = var4 * 31.0F + this.field4731;
        float var6 = var5 * 31.0F + this.field4732;
        return (int) var6;
    }

    public String toString() {
        return this.field4729 + "," + this.field4733 + "," + this.field4731 + "," + this.field4732;
    }
}
