package deob;

@ObfuscatedName("kg")
public final class class286 {

    @ObfuscatedName("kg.au")
    public int field3088;

    @ObfuscatedName("kg.ae")
    public int field3084;

    @ObfuscatedName("kg.ao")
    public class488 field3086;

    @ObfuscatedName("kg.at")
    public class383 field3087;

    @ObfuscatedName("kg.ac")
    public class285 field3085;

    public class286(int arg0) {
        this(arg0, arg0);
    }

    public class286(int arg0, int arg1) {
        this.field3087 = new class383();
        this.field3088 = arg0;
        this.field3084 = arg0;
        int var3;
        for (var3 = 1; var3 + var3 < arg0 && var3 < arg1; var3 += var3) {
        }
        this.field3086 = new class488(var3);
    }

    @ObfuscatedName("kg.au(J)Ljava/lang/Object;")
    public Object method5146(long arg0) {
        class290 var3 = (class290) this.field3086.method8008(arg0);
        if (var3 == null) {
            return null;
        }
        Object var4 = var3.method5168();
        if (var4 == null) {
            var3.method7700();
            var3.method7697();
            this.field3084 += var3.field3096;
            return null;
        }
        if (var3.method5169()) {
            class289 var5 = new class289(var4, var3.field3096);
            this.field3086.method8016(var5, var3.field4814);
            this.field3087.method6532(var5);
            var5.field4809 = 0L;
            var3.method7700();
            var3.method7697();
        } else {
            this.field3087.method6532(var3);
            var3.field4809 = 0L;
        }
        return var4;
    }

    @ObfuscatedName("kg.ae(J)V")
    public void method5154(long arg0) {
        class290 var3 = (class290) this.field3086.method8008(arg0);
        this.method5147(var3);
    }

    @ObfuscatedName("kg.ao(Llo;)V")
    public void method5147(class290 arg0) {
        if (arg0 != null) {
            arg0.method7700();
            arg0.method7697();
            this.field3084 += arg0.field3096;
        }
    }

    @ObfuscatedName("kg.at(Ljava/lang/Object;J)V")
    public void method5149(Object arg0, long arg1) {
        this.method5150(arg0, arg1, 1);
    }

    @ObfuscatedName("kg.ac(Ljava/lang/Object;JI)V")
    public void method5150(Object arg0, long arg1, int arg2) {
        if (arg2 > this.field3088) {
            throw new IllegalStateException();
        }
        this.method5154(arg1);
        this.field3084 -= arg2;
        while (this.field3084 < 0) {
            class290 var5 = (class290) this.field3087.method6534();
            if (var5 == null) {
                throw new RuntimeException("");
            }
            if (!var5.method5169()) {
            }
            this.method5147(var5);
            if (this.field3085 != null) {
                this.field3085.method5143(var5.method5168());
            }
        }
        class289 var6 = new class289(arg0, arg2);
        this.field3086.method8016(var6, arg1);
        this.field3087.method6532(var6);
        var6.field4809 = 0L;
    }

    @ObfuscatedName("kg.ai(I)V")
    public void method5151(int arg0) {
        for (class290 var2 = (class290) this.field3087.method6535(); var2 != null; var2 = (class290) this.field3087.method6541()) {
            if (var2.method5169()) {
                if (var2.method5168() == null) {
                    var2.method7700();
                    var2.method7697();
                    this.field3084 += var2.field3096;
                }
            } else if (++var2.field4809 > (long) arg0) {
                class287 var3 = new class287(var2.method5168(), var2.field3096);
                this.field3086.method8016(var3, var2.field4814);
                class383.method6533(var3, var2);
                var2.method7700();
                var2.method7697();
            }
        }
    }

    @ObfuscatedName("kg.az()V")
    public void method5152() {
        this.field3087.method6557();
        this.field3086.method8010();
        this.field3084 = this.field3088;
    }
}
