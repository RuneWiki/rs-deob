package deob;

@ObfuscatedName("iy")
public final class class247 {

    @ObfuscatedName("iy.c")
    public int field2811;

    @ObfuscatedName("iy.l")
    public int field2814;

    @ObfuscatedName("iy.s")
    public class401 field2812;

    @ObfuscatedName("iy.e")
    public class331 field2813;

    @ObfuscatedName("iy.r")
    public class246 field2810;

    public class247(int arg0) {
        this(arg0, arg0);
    }

    public class247(int arg0, int arg1) {
        this.field2813 = new class331();
        this.field2811 = arg0;
        this.field2814 = arg0;
        int var3;
        for (var3 = 1; var3 + var3 < arg0 && var3 < arg1; var3 += var3) {
        }
        this.field2812 = new class401(var3);
    }

    @ObfuscatedName("iy.c(J)Ljava/lang/Object;")
    public Object method4441(long arg0) {
        class251 var3 = (class251) this.field2812.method6448(arg0);
        if (var3 == null) {
            return null;
        }
        Object var4 = var3.method4465();
        if (var4 == null) {
            var3.method6167();
            var3.method6163();
            this.field2814 += var3.field2822;
            return null;
        }
        if (var3.method4470()) {
            class250 var5 = new class250(var4, var3.field2822);
            this.field2812.method6432(var5, var3.field4301);
            this.field2813.method5428(var5);
            var5.field4295 = 0L;
            var3.method6167();
            var3.method6163();
        } else {
            this.field2813.method5428(var3);
            var3.field4295 = 0L;
        }
        return var4;
    }

    @ObfuscatedName("iy.l(J)V")
    public void method4442(long arg0) {
        class251 var3 = (class251) this.field2812.method6448(arg0);
        this.method4443(var3);
    }

    @ObfuscatedName("iy.s(Liv;)V")
    public void method4443(class251 arg0) {
        if (arg0 != null) {
            arg0.method6167();
            arg0.method6163();
            this.field2814 += arg0.field2822;
        }
    }

    @ObfuscatedName("iy.e(Ljava/lang/Object;J)V")
    public void method4444(Object arg0, long arg1) {
        this.method4440(arg0, arg1, 1);
    }

    @ObfuscatedName("iy.r(Ljava/lang/Object;JI)V")
    public void method4440(Object arg0, long arg1, int arg2) {
        if (arg2 > this.field2811) {
            throw new IllegalStateException();
        }
        this.method4442(arg1);
        this.field2814 -= arg2;
        while (this.field2814 < 0) {
            class251 var5 = (class251) this.field2813.method5407();
            if (var5 == null) {
                throw new RuntimeException("");
            }
            if (!var5.method4470()) {
            }
            this.method4443(var5);
            if (this.field2810 != null) {
                this.field2810.method4439(var5.method4465());
            }
        }
        class250 var6 = new class250(arg0, arg2);
        this.field2812.method6432(var6, arg1);
        this.field2813.method5428(var6);
        var6.field4295 = 0L;
    }

    @ObfuscatedName("iy.o(I)V")
    public void method4446(int arg0) {
        for (class251 var2 = (class251) this.field2813.method5408(); var2 != null; var2 = (class251) this.field2813.method5426()) {
            if (var2.method4470()) {
                if (var2.method4465() == null) {
                    var2.method6167();
                    var2.method6163();
                    this.field2814 += var2.field2822;
                }
            } else if (++var2.field4295 > (long) arg0) {
                class248 var3 = new class248(var2.method4465(), var2.field2822);
                this.field2812.method6432(var3, var2.field4301);
                class331.method5406(var3, var2);
                var2.method6167();
                var2.method6163();
            }
        }
    }

    @ObfuscatedName("iy.i()V")
    public void method4447() {
        this.field2813.method5404();
        this.field2812.method6433();
        this.field2814 = this.field2811;
    }
}
