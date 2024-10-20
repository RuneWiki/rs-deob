package deob;

@ObfuscatedName("eo")
public final class class150 {

    @ObfuscatedName("eo.u")
    public int field1957;

    @ObfuscatedName("eo.f")
    public int field1958;

    @ObfuscatedName("eo.b")
    public class316 field1959;

    @ObfuscatedName("eo.g")
    public class266 field1960 = new class266();

    @ObfuscatedName("eo.z")
    public class147 field1961;

    public class150(int arg0, int arg1) {
        this.field1957 = arg0;
        this.field1958 = arg0;
        int var3;
        for (var3 = 1; var3 + var3 < arg0 && var3 < arg1; var3 += var3) {
        }
        this.field1959 = new class316(var3);
    }

    @ObfuscatedName("eo.u(J)Ljava/lang/Object;")
    public Object method3101(long arg0) {
        class149 var3 = (class149) this.field1959.method5521(arg0);
        if (var3 == null) {
            return null;
        }
        Object var4 = var3.method3095();
        if (var4 == null) {
            var3.method3332();
            var3.method3319();
            this.field1958 += var3.field1956;
            return null;
        }
        if (var3.method3099()) {
            class148 var5 = new class148(var4, var3.field1956);
            this.field1959.method5531(var5, var3.field2126);
            this.field1960.method4631(var5);
            var5.field2118 = 0L;
            var3.method3332();
            var3.method3319();
        } else {
            this.field1960.method4631(var3);
            var3.field2118 = 0L;
        }
        return var4;
    }

    @ObfuscatedName("eo.f(J)V")
    public void method3102(long arg0) {
        class149 var3 = (class149) this.field1959.method5521(arg0);
        this.method3103(var3);
    }

    @ObfuscatedName("eo.b(Lev;)V")
    public void method3103(class149 arg0) {
        if (arg0 != null) {
            arg0.method3332();
            arg0.method3319();
            this.field1958 += arg0.field1956;
        }
    }

    @ObfuscatedName("eo.g(Ljava/lang/Object;JI)V")
    public void method3104(Object arg0, long arg1, int arg2) {
        if (arg2 > this.field1957) {
            throw new IllegalStateException();
        }
        this.method3102(arg1);
        this.field1958 -= arg2;
        while (this.field1958 < 0) {
            class149 var5 = (class149) this.field1960.method4640();
            if (var5 == null) {
                throw new RuntimeException("");
            }
            if (!var5.method3099()) {
            }
            this.method3103(var5);
            if (this.field1961 != null) {
                this.field1961.method3093(var5.method3095());
            }
        }
        class148 var6 = new class148(arg0, arg2);
        this.field1959.method5531(var6, arg1);
        this.field1960.method4631(var6);
        var6.field2118 = 0L;
    }

    @ObfuscatedName("eo.z(I)V")
    public void method3100(int arg0) {
        for (class149 var2 = (class149) this.field1960.method4634(); var2 != null; var2 = (class149) this.field1960.method4649()) {
            if (var2.method3099()) {
                if (var2.method3095() == null) {
                    var2.method3332();
                    var2.method3319();
                    this.field1958 += var2.field1956;
                }
            } else if (++var2.field2118 > (long) arg0) {
                class151 var3 = new class151(var2.method3095(), var2.field1956);
                this.field1959.method5531(var3, var2.field2126);
                class266.method4637(var3, var2);
                var2.method3332();
                var2.method3319();
            }
        }
    }

    @ObfuscatedName("eo.p()V")
    public void method3106() {
        this.field1960.method4632();
        this.field1959.method5525();
        this.field1958 = this.field1957;
    }
}
