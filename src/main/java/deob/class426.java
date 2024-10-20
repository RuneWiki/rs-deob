package deob;

@ObfuscatedName("qv")
public class class426 {

    @ObfuscatedName("qv.ac")
    public static class426[] field4722;

    @ObfuscatedName("qv.am")
    public float field4717;

    @ObfuscatedName("qv.ax")
    public float field4720;

    @ObfuscatedName("qv.aq")
    public float field4721;

    static {
        new class426(0.0F, 0.0F, 0.0F);
        new class426(1.0F, 1.0F, 1.0F);
        new class426(1.0F, 0.0F, 0.0F);
        new class426(0.0F, 1.0F, 0.0F);
        new class426(0.0F, 0.0F, 1.0F);
        field4722 = new class426[0];
        method5070(100);
    }

    @ObfuscatedName("ki.ac(II)V")
    public static void method5070(int arg0) {
        Statics.field4718 = arg0;
        field4722 = new class426[arg0];
        Statics.field4719 = 0;
    }

    @ObfuscatedName("qy.ae(B)Lqv;")
    public static class426 method7267() {
        class426[] var0 = field4722;
        synchronized (field4722) {
            if (Statics.field4719 == 0) {
                return new class426();
            } else {
                field4722[--Statics.field4719].method7326();
                return field4722[Statics.field4719];
            }
        }
    }

    @ObfuscatedName("ks.ag(FFFI)Lqv;")
    public static class426 method5154(float arg0, float arg1, float arg2) {
        class426[] var3 = field4722;
        synchronized (field4722) {
            if (Statics.field4719 == 0) {
                return new class426(arg0, arg1, arg2);
            } else {
                field4722[--Statics.field4719].method7310(arg0, arg1, arg2);
                return field4722[Statics.field4719];
            }
        }
    }

    @ObfuscatedName("qv.am(S)V")
    public void method7316() {
        class426[] var1 = field4722;
        synchronized (field4722) {
            if (Statics.field4719 < Statics.field4718 - 1) {
                field4722[++Statics.field4719 - 1] = this;
            }
        }
    }

    public class426() {
    }

    public class426(float arg0, float arg1, float arg2) {
        this.field4717 = arg0;
        this.field4720 = arg1;
        this.field4721 = arg2;
    }

    @ObfuscatedName("qv.ax(FFFI)V")
    public void method7310(float arg0, float arg1, float arg2) {
        this.field4717 = arg0;
        this.field4720 = arg1;
        this.field4721 = arg2;
    }

    @ObfuscatedName("qv.aq(S)V")
    public final void method7326() {
        this.field4721 = 0.0F;
        this.field4720 = 0.0F;
        this.field4717 = 0.0F;
    }

    @ObfuscatedName("qv.af(Lqv;B)Z")
    public boolean method7306(class426 arg0) {
        return this.field4717 == arg0.field4717 && this.field4720 == arg0.field4720 && this.field4721 == arg0.field4721;
    }

    @ObfuscatedName("qv.at(B)F")
    public final float method7305() {
        return (float) Math.sqrt((double) (this.field4721 * this.field4721 + this.field4720 * this.field4720 + this.field4717 * this.field4717));
    }

    public String toString() {
        return this.field4717 + ", " + this.field4720 + ", " + this.field4721;
    }
}
