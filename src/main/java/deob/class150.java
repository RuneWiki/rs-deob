package deob;

@ObfuscatedName("ed")
public final class class150 {

    @ObfuscatedName("ed.a")
    public int field1946;

    @ObfuscatedName("ed.t")
    public int field1945;

    @ObfuscatedName("ed.n")
    public class316 field1948;

    @ObfuscatedName("ed.q")
    public class266 field1947 = new class266();

    @ObfuscatedName("ed.v")
    public class147 field1944;

    public class150(int arg0, int arg1) {
        this.field1946 = arg0;
        this.field1945 = arg0;
        int var3;
        for (var3 = 1; var3 + var3 < arg0 && var3 < arg1; var3 += var3) {
        }
        this.field1948 = new class316(var3);
    }

    @ObfuscatedName("ed.a(J)Ljava/lang/Object;")
    public Object method3152(long arg0) {
        class149 var3 = (class149) this.field1948.method5494(arg0);
        if (var3 == null) {
            return null;
        }
        Object var4 = var3.method3137();
        if (var4 == null) {
            var3.method3386();
            var3.method3378();
            this.field1945 += var3.field1943;
            return null;
        }
        if (var3.method3140()) {
            class148 var5 = new class148(var4, var3.field1943);
            this.field1948.method5495(var5, var3.field2091);
            this.field1947.method4639(var5);
            var5.field2081 = 0L;
            var3.method3386();
            var3.method3378();
        } else {
            this.field1947.method4639(var3);
            var3.field2081 = 0L;
        }
        return var4;
    }

    @ObfuscatedName("ed.t(J)V")
    public void method3159(long arg0) {
        class149 var3 = (class149) this.field1948.method5494(arg0);
        this.method3161(var3);
    }

    @ObfuscatedName("ed.n(Leo;)V")
    public void method3161(class149 arg0) {
        if (arg0 != null) {
            arg0.method3386();
            arg0.method3378();
            this.field1945 += arg0.field1943;
        }
    }

    @ObfuscatedName("ed.q(Ljava/lang/Object;JI)V")
    public void method3149(Object arg0, long arg1, int arg2) {
        if (arg2 > this.field1946) {
            throw new IllegalStateException();
        }
        this.method3159(arg1);
        this.field1945 -= arg2;
        while (this.field1945 < 0) {
            class149 var5 = (class149) this.field1947.method4653();
            if (var5 == null) {
                throw new RuntimeException("");
            }
            if (!var5.method3140()) {
            }
            this.method3161(var5);
            if (this.field1944 != null) {
                this.field1944.method3135(var5.method3137());
            }
        }
        class148 var6 = new class148(arg0, arg2);
        this.field1948.method5495(var6, arg1);
        this.field1947.method4639(var6);
        var6.field2081 = 0L;
    }

    @ObfuscatedName("ed.v(I)V")
    public void method3150(int arg0) {
        for (class149 var2 = (class149) this.field1947.method4661(); var2 != null; var2 = (class149) this.field1947.method4650()) {
            if (var2.method3140()) {
                if (var2.method3137() == null) {
                    var2.method3386();
                    var2.method3378();
                    this.field1945 += var2.field1943;
                }
            } else if (++var2.field2081 > (long) arg0) {
                class151 var3 = new class151(var2.method3137(), var2.field1943);
                this.field1948.method5495(var3, var2.field2091);
                class266.method4640(var3, var2);
                var2.method3386();
                var2.method3378();
            }
        }
    }

    @ObfuscatedName("ed.l()V")
    public void method3151() {
        this.field1947.method4638();
        this.field1948.method5505();
        this.field1945 = this.field1946;
    }
}
