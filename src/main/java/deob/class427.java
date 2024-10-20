package deob;

@ObfuscatedName("qt")
public class class427 {

    @ObfuscatedName("qt.ap")
    public static final class427 field4768;

    @ObfuscatedName("qt.aw")
    public static final class427 field4774;

    @ObfuscatedName("qt.ak")
    public static class427[] field4769;

    @ObfuscatedName("qt.aj")
    public static int field4770;

    @ObfuscatedName("qt.ai")
    public static int field4771;

    @ObfuscatedName("qt.ay")
    public float field4772;

    @ObfuscatedName("qt.as")
    public float field4773;

    @ObfuscatedName("qt.ae")
    public float field4767;

    static {
        new class427(0.0F, 0.0F, 0.0F);
        new class427(1.0F, 1.0F, 1.0F);
        new class427(1.0F, 0.0F, 0.0F);
        field4768 = new class427(0.0F, 1.0F, 0.0F);
        new class427(0.0F, 0.0F, 1.0F);
        new class427(1.0F, 0.0F, 0.0F);
        new class427(-1.0F, 0.0F, 0.0F);
        new class427(0.0F, 0.0F, 1.0F);
        field4774 = new class427(0.0F, 0.0F, -1.0F);
        new class427(0.0F, 1.0F, 0.0F);
        new class427(0.0F, -1.0F, 0.0F);
        field4769 = new class427[0];
        field4770 = 100;
        field4769 = new class427[100];
        field4771 = 0;
    }

    @ObfuscatedName("lc.ap(I)Lqt;")
    public static class427 method5841() {
        class427[] var0 = field4769;
        synchronized (field4769) {
            if (field4771 == 0) {
                return new class427();
            } else {
                field4769[--field4771].method7568();
                return field4769[field4771];
            }
        }
    }

    @ObfuscatedName("ch.aw(FFFI)Lqt;")
    public static class427 method1235(float arg0, float arg1, float arg2) {
        class427[] var3 = field4769;
        synchronized (field4769) {
            if (field4771 == 0) {
                return new class427(arg0, arg1, arg2);
            } else {
                field4769[--field4771].method7566(arg0, arg1, arg2);
                return field4769[field4771];
            }
        }
    }

    @ObfuscatedName("qt.ak(I)V")
    public void method7534() {
        class427[] var1 = field4769;
        synchronized (field4769) {
            if (field4771 < field4770 - 1) {
                field4769[++field4771 - 1] = this;
            }
        }
    }

    public class427() {
    }

    public class427(float arg0, float arg1, float arg2) {
        this.field4772 = arg0;
        this.field4773 = arg1;
        this.field4767 = arg2;
    }

    public class427(class427 arg0) {
        this.field4772 = arg0.field4772;
        this.field4773 = arg0.field4773;
        this.field4767 = arg0.field4767;
    }

    @ObfuscatedName("qt.aj(FFFI)V")
    public void method7566(float arg0, float arg1, float arg2) {
        this.field4772 = arg0;
        this.field4773 = arg1;
        this.field4767 = arg2;
    }

    @ObfuscatedName("qt.ai(Lqt;I)V")
    public void method7535(class427 arg0) {
        this.method7566(arg0.field4772, arg0.field4773, arg0.field4767);
    }

    @ObfuscatedName("qt.ay(I)V")
    public final void method7568() {
        this.field4767 = 0.0F;
        this.field4773 = 0.0F;
        this.field4772 = 0.0F;
    }

    @ObfuscatedName("qt.as(Lqt;B)Z")
    public boolean method7537(class427 arg0) {
        return this.field4772 == arg0.field4772 && this.field4773 == arg0.field4773 && this.field4767 == arg0.field4767;
    }

    @ObfuscatedName("qt.ae(I)V")
    public final void method7538() {
        float var1 = 1.0F / this.method7552();
        this.field4772 *= var1;
        this.field4773 *= var1;
        this.field4767 *= var1;
    }

    @ObfuscatedName("qt.am(Lqt;I)V")
    public final void method7539(class427 arg0) {
        this.field4772 += arg0.field4772;
        this.field4773 += arg0.field4773;
        this.field4767 += arg0.field4767;
    }

    @ObfuscatedName("jf.at(Lqt;Lqt;I)Lqt;")
    public static final class427 method4942(class427 arg0, class427 arg1) {
        class427[] var2 = field4769;
        class427 var3;
        synchronized (field4769) {
            if (field4771 == 0) {
                var3 = new class427(arg0);
            } else {
                field4769[--field4771].method7535(arg0);
                var3 = field4769[field4771];
            }
        }
        var3.method7539(arg1);
        return var3;
    }

    @ObfuscatedName("qt.au(Lqt;B)V")
    public final void method7562(class427 arg0) {
        this.field4772 -= arg0.field4772;
        this.field4773 -= arg0.field4773;
        this.field4767 -= arg0.field4767;
    }

    @ObfuscatedName("qt.an(Lqt;I)F")
    public final float method7542(class427 arg0) {
        return this.field4767 * arg0.field4767 + this.field4773 * arg0.field4773 + this.field4772 * arg0.field4772;
    }

    @ObfuscatedName("io.ao(Lqt;Lqt;I)F")
    public static final float method4240(class427 arg0, class427 arg1) {
        return arg0.method7542(arg1);
    }

    @ObfuscatedName("qt.af(Lqt;B)V")
    public final void method7541(class427 arg0) {
        this.method7566(this.field4773 * arg0.field4767 - this.field4767 * arg0.field4773, this.field4767 * arg0.field4772 - this.field4772 * arg0.field4767, this.field4772 * arg0.field4773 - this.field4773 * arg0.field4772);
    }

    @ObfuscatedName("qt.ar(S)F")
    public final float method7552() {
        return (float) Math.sqrt((double) (this.field4767 * this.field4767 + this.field4773 * this.field4773 + this.field4772 * this.field4772));
    }

    @ObfuscatedName("qt.ab(FI)V")
    public final void method7543(float arg0) {
        this.field4772 *= arg0;
        this.field4773 *= arg0;
        this.field4767 *= arg0;
    }

    @ObfuscatedName("oz.az(Lqt;FI)Lqt;")
    public static final class427 method6987(class427 arg0, float arg1) {
        class427[] var2 = field4769;
        class427 var3;
        synchronized (field4769) {
            if (field4771 == 0) {
                var3 = new class427(arg0);
            } else {
                field4769[--field4771].method7535(arg0);
                var3 = field4769[field4771];
            }
        }
        var3.method7543(arg1);
        return var3;
    }

    public String toString() {
        return this.field4772 + ", " + this.field4773 + ", " + this.field4767;
    }
}
