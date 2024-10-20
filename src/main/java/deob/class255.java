package deob;

@ObfuscatedName("ie")
public final class class255 {

    @ObfuscatedName("ie.v")
    public int field2877;

    @ObfuscatedName("ie.c")
    public int field2875;

    @ObfuscatedName("ie.i")
    public class418 field2876;

    @ObfuscatedName("ie.f")
    public class340 field2874;

    @ObfuscatedName("ie.b")
    public class254 field2878;

    public class255(int arg0) {
        this(arg0, arg0);
    }

    public class255(int arg0, int arg1) {
        this.field2874 = new class340();
        this.field2877 = arg0;
        this.field2875 = arg0;
        int var3;
        for (var3 = 1; var3 + var3 < arg0 && var3 < arg1; var3 += var3) {
        }
        this.field2876 = new class418(var3);
    }

    @ObfuscatedName("ie.v(J)Ljava/lang/Object;")
    public Object method4615(long arg0) {
        class259 var3 = (class259) this.field2876.method6760(arg0);
        if (var3 == null) {
            return null;
        }
        Object var4 = var3.method4639();
        if (var4 == null) {
            var3.method6503();
            var3.method6500();
            this.field2875 += var3.field2886;
            return null;
        }
        if (var3.method4642()) {
            class258 var5 = new class258(var4, var3.field2886);
            this.field2876.method6757(var5, var3.field4410);
            this.field2874.method5660(var5);
            var5.field4404 = 0L;
            var3.method6503();
            var3.method6500();
        } else {
            this.field2874.method5660(var3);
            var3.field4404 = 0L;
        }
        return var4;
    }

    @ObfuscatedName("ie.c(J)V")
    public void method4616(long arg0) {
        class259 var3 = (class259) this.field2876.method6760(arg0);
        this.method4617(var3);
    }

    @ObfuscatedName("ie.i(Liz;)V")
    public void method4617(class259 arg0) {
        if (arg0 != null) {
            arg0.method6503();
            arg0.method6500();
            this.field2875 += arg0.field2886;
        }
    }

    @ObfuscatedName("ie.f(Ljava/lang/Object;J)V")
    public void method4622(Object arg0, long arg1) {
        this.method4618(arg0, arg1, 1);
    }

    @ObfuscatedName("ie.b(Ljava/lang/Object;JI)V")
    public void method4618(Object arg0, long arg1, int arg2) {
        if (arg2 > this.field2877) {
            throw new IllegalStateException();
        }
        this.method4616(arg1);
        this.field2875 -= arg2;
        while (this.field2875 < 0) {
            class259 var5 = (class259) this.field2874.method5662();
            if (var5 == null) {
                throw new RuntimeException("");
            }
            if (!var5.method4642()) {
            }
            this.method4617(var5);
            if (this.field2878 != null) {
                this.field2878.method4612(var5.method4639());
            }
        }
        class258 var6 = new class258(arg0, arg2);
        this.field2876.method6757(var6, arg1);
        this.field2874.method5660(var6);
        var6.field4404 = 0L;
    }

    @ObfuscatedName("ie.n(I)V")
    public void method4626(int arg0) {
        for (class259 var2 = (class259) this.field2874.method5681(); var2 != null; var2 = (class259) this.field2874.method5665()) {
            if (var2.method4642()) {
                if (var2.method4639() == null) {
                    var2.method6503();
                    var2.method6500();
                    this.field2875 += var2.field2886;
                }
            } else if (++var2.field4404 > (long) arg0) {
                class256 var3 = new class256(var2.method4639(), var2.field2886);
                this.field2876.method6757(var3, var2.field4410);
                class340.method5661(var3, var2);
                var2.method6503();
                var2.method6500();
            }
        }
    }

    @ObfuscatedName("ie.s()V")
    public void method4620() {
        this.field2874.method5659();
        this.field2876.method6767();
        this.field2875 = this.field2877;
    }
}
