package deob;

@ObfuscatedName("es")
public final class class150 {

    @ObfuscatedName("es.s")
    public int field1942;

    @ObfuscatedName("es.j")
    public int field1943;

    @ObfuscatedName("es.i")
    public class316 field1944;

    @ObfuscatedName("es.k")
    public class266 field1946 = new class266();

    @ObfuscatedName("es.u")
    public class147 field1945;

    public class150(int arg0, int arg1) {
        this.field1942 = arg0;
        this.field1943 = arg0;
        int var3;
        for (var3 = 1; var3 + var3 < arg0 && var3 < arg1; var3 += var3) {
        }
        this.field1944 = new class316(var3);
    }

    @ObfuscatedName("es.s(J)Ljava/lang/Object;")
    public Object method3089(long arg0) {
        class149 var3 = (class149) this.field1944.method5405(arg0);
        if (var3 == null) {
            return null;
        }
        Object var4 = var3.method3082();
        if (var4 == null) {
            var3.method3304();
            var3.method3297();
            this.field1943 += var3.field1941;
            return null;
        }
        if (var3.method3083()) {
            class148 var5 = new class148(var4, var3.field1941);
            this.field1944.method5400(var5, var3.field2096);
            this.field1946.method4552(var5);
            var5.field2087 = 0L;
            var3.method3304();
            var3.method3297();
        } else {
            this.field1946.method4552(var3);
            var3.field2087 = 0L;
        }
        return var4;
    }

    @ObfuscatedName("es.j(J)V")
    public void method3090(long arg0) {
        class149 var3 = (class149) this.field1944.method5405(arg0);
        this.method3107(var3);
    }

    @ObfuscatedName("es.i(Led;)V")
    public void method3107(class149 arg0) {
        if (arg0 != null) {
            arg0.method3304();
            arg0.method3297();
            this.field1943 += arg0.field1941;
        }
    }

    @ObfuscatedName("es.k(Ljava/lang/Object;JI)V")
    public void method3092(Object arg0, long arg1, int arg2) {
        if (arg2 > this.field1942) {
            throw new IllegalStateException();
        }
        this.method3090(arg1);
        this.field1943 -= arg2;
        while (this.field1943 < 0) {
            class149 var5 = (class149) this.field1946.method4550();
            if (var5 == null) {
                throw new RuntimeException("");
            }
            if (!var5.method3083()) {
            }
            this.method3107(var5);
            if (this.field1945 != null) {
                this.field1945.method3078(var5.method3082());
            }
        }
        class148 var6 = new class148(arg0, arg2);
        this.field1944.method5400(var6, arg1);
        this.field1946.method4552(var6);
        var6.field2087 = 0L;
    }

    @ObfuscatedName("es.u(I)V")
    public void method3088(int arg0) {
        for (class149 var2 = (class149) this.field1946.method4555(); var2 != null; var2 = (class149) this.field1946.method4557()) {
            if (var2.method3083()) {
                if (var2.method3082() == null) {
                    var2.method3304();
                    var2.method3297();
                    this.field1943 += var2.field1941;
                }
            } else if (++var2.field2087 > (long) arg0) {
                class151 var3 = new class151(var2.method3082(), var2.field1941);
                this.field1944.method5400(var3, var2.field2096);
                class266.method4553(var3, var2);
                var2.method3304();
                var2.method3297();
            }
        }
    }

    @ObfuscatedName("es.n()V")
    public void method3108() {
        this.field1946.method4558();
        this.field1944.method5398();
        this.field1943 = this.field1942;
    }
}
