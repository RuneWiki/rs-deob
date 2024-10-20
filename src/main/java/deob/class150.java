package deob;

@ObfuscatedName("ez")
public final class class150 {

    @ObfuscatedName("ez.c")
    public int field1931;

    @ObfuscatedName("ez.x")
    public int field1935;

    @ObfuscatedName("ez.t")
    public class316 field1933;

    @ObfuscatedName("ez.g")
    public class266 field1934 = new class266();

    @ObfuscatedName("ez.l")
    public class147 field1932;

    public class150(int arg0, int arg1) {
        this.field1931 = arg0;
        this.field1935 = arg0;
        int var3;
        for (var3 = 1; var3 + var3 < arg0 && var3 < arg1; var3 += var3) {
        }
        this.field1933 = new class316(var3);
    }

    @ObfuscatedName("ez.c(J)Ljava/lang/Object;")
    public Object method3086(long arg0) {
        class149 var3 = (class149) this.field1933.method5493(arg0);
        if (var3 == null) {
            return null;
        }
        Object var4 = var3.method3083();
        if (var4 == null) {
            var3.method3326();
            var3.method3320();
            this.field1935 += var3.field1930;
            return null;
        }
        if (var3.method3082()) {
            class148 var5 = new class148(var4, var3.field1930);
            this.field1933.method5497(var5, var3.field2096);
            this.field1934.method4607(var5);
            var5.field2088 = 0L;
            var3.method3326();
            var3.method3320();
        } else {
            this.field1934.method4607(var3);
            var3.field2088 = 0L;
        }
        return var4;
    }

    @ObfuscatedName("ez.x(J)V")
    public void method3087(long arg0) {
        class149 var3 = (class149) this.field1933.method5493(arg0);
        this.method3088(var3);
    }

    @ObfuscatedName("ez.t(Ley;)V")
    public void method3088(class149 arg0) {
        if (arg0 != null) {
            arg0.method3326();
            arg0.method3320();
            this.field1935 += arg0.field1930;
        }
    }

    @ObfuscatedName("ez.g(Ljava/lang/Object;JI)V")
    public void method3089(Object arg0, long arg1, int arg2) {
        if (arg2 > this.field1931) {
            throw new IllegalStateException();
        }
        this.method3087(arg1);
        this.field1935 -= arg2;
        while (this.field1935 < 0) {
            class149 var5 = (class149) this.field1934.method4608();
            if (var5 == null) {
                throw new RuntimeException("");
            }
            if (!var5.method3082()) {
            }
            this.method3088(var5);
            if (this.field1932 != null) {
                this.field1932.method3076(var5.method3083());
            }
        }
        class148 var6 = new class148(arg0, arg2);
        this.field1933.method5497(var6, arg1);
        this.field1934.method4607(var6);
        var6.field2088 = 0L;
    }

    @ObfuscatedName("ez.l(I)V")
    public void method3097(int arg0) {
        for (class149 var2 = (class149) this.field1934.method4609(); var2 != null; var2 = (class149) this.field1934.method4626()) {
            if (var2.method3082()) {
                if (var2.method3083() == null) {
                    var2.method3326();
                    var2.method3320();
                    this.field1935 += var2.field1930;
                }
            } else if (++var2.field2088 > (long) arg0) {
                class151 var3 = new class151(var2.method3083(), var2.field1930);
                this.field1933.method5497(var3, var2.field2096);
                class266.method4612(var3, var2);
                var2.method3326();
                var2.method3320();
            }
        }
    }

    @ObfuscatedName("ez.u()V")
    public void method3090() {
        this.field1934.method4606();
        this.field1933.method5494();
        this.field1935 = this.field1931;
    }
}
