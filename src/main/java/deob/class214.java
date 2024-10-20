package deob;

@ObfuscatedName("hi")
public final class class214 {

    @ObfuscatedName("hi.o")
    public int field2641;

    @ObfuscatedName("hi.k")
    public int field2642;

    @ObfuscatedName("hi.t")
    public class210 field2643;

    @ObfuscatedName("hi.d")
    public class228 field2644 = new class228();

    public class214(int arg0, int arg1) {
        this.field2641 = arg0;
        this.field2642 = arg0;
        int var3;
        for (var3 = 1; var3 + var3 < arg0 && var3 < arg1; var3 += var3) {
        }
        this.field2643 = new class210(var3);
    }

    @ObfuscatedName("hi.o(J)Ljava/lang/Object;")
    public Object method3613(long arg0) {
        class225 var3 = (class225) this.field2643.method3575(arg0);
        if (var3 == null) {
            return null;
        }
        Object var4 = var3.method3560();
        if (var4 == null) {
            var3.method3681();
            var3.method3721();
            this.field2642 += var3.field2670;
            return null;
        }
        if (var3.method3564()) {
            class209 var5 = new class209(var4, var3.field2670);
            this.field2643.method3580(var5, var3.field2652);
            this.field2644.method3770(var5);
            var5.field2659 = 0L;
            var3.method3681();
            var3.method3721();
        } else {
            this.field2644.method3770(var3);
            var3.field2659 = 0L;
        }
        return var4;
    }

    @ObfuscatedName("hi.k(J)V")
    public void method3614(long arg0) {
        class225 var3 = (class225) this.field2643.method3575(arg0);
        this.method3612(var3);
    }

    @ObfuscatedName("hi.t(Lhv;)V")
    public void method3612(class225 arg0) {
        if (arg0 != null) {
            arg0.method3681();
            arg0.method3721();
            this.field2642 += arg0.field2670;
        }
    }

    @ObfuscatedName("hi.d(Ljava/lang/Object;J)V")
    public void method3616(Object arg0, long arg1) {
        this.method3617(arg0, arg1, 1);
    }

    @ObfuscatedName("hi.h(Ljava/lang/Object;JI)V")
    public void method3617(Object arg0, long arg1, int arg2) {
        if (arg2 > this.field2641) {
            throw new IllegalStateException();
        }
        this.method3614(arg1);
        this.field2642 -= arg2;
        while (this.field2642 < 0) {
            class225 var5 = (class225) this.field2644.method3771();
            this.method3612(var5);
        }
        class209 var6 = new class209(arg0, arg2);
        this.field2643.method3580(var6, arg1);
        this.field2644.method3770(var6);
        var6.field2659 = 0L;
    }

    @ObfuscatedName("hi.m(I)V")
    public void method3618(int arg0) {
        for (class225 var2 = (class225) this.field2644.method3785(); var2 != null; var2 = (class225) this.field2644.method3774()) {
            if (var2.method3564()) {
                if (var2.method3560() == null) {
                    var2.method3681();
                    var2.method3721();
                    this.field2642 += var2.field2670;
                }
            } else if (++var2.field2659 > (long) arg0) {
                class220 var3 = new class220(var2.method3560(), var2.field2670);
                this.field2643.method3580(var3, var2.field2652);
                class207.method3541(var3, var2);
                var2.method3681();
                var2.method3721();
            }
        }
    }

    @ObfuscatedName("hi.z()V")
    public void method3619() {
        this.field2644.method3769();
        this.field2643.method3569();
        this.field2642 = this.field2641;
    }
}
