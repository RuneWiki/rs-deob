package deob;

@ObfuscatedName("ek")
public final class class150 {

    @ObfuscatedName("ek.c")
    public int field1957;

    @ObfuscatedName("ek.t")
    public int field1955;

    @ObfuscatedName("ek.o")
    public class317 field1956;

    @ObfuscatedName("ek.e")
    public class267 field1958 = new class267();

    @ObfuscatedName("ek.i")
    public class147 field1954;

    public class150(int arg0, int arg1) {
        this.field1957 = arg0;
        this.field1955 = arg0;
        int var3;
        for (var3 = 1; var3 + var3 < arg0 && var3 < arg1; var3 += var3) {
        }
        this.field1956 = new class317(var3);
    }

    @ObfuscatedName("ek.c(J)Ljava/lang/Object;")
    public Object method3140(long arg0) {
        class149 var3 = (class149) this.field1956.method5510(arg0);
        if (var3 == null) {
            return null;
        }
        Object var4 = var3.method3115();
        if (var4 == null) {
            var3.method3351();
            var3.method3342();
            this.field1955 += var3.field1953;
            return null;
        }
        if (var3.method3116()) {
            class148 var5 = new class148(var4, var3.field1953);
            this.field1956.method5496(var5, var3.field2115);
            this.field1958.method4629(var5);
            var5.field2105 = 0L;
            var3.method3351();
            var3.method3342();
        } else {
            this.field1958.method4629(var3);
            var3.field2105 = 0L;
        }
        return var4;
    }

    @ObfuscatedName("ek.t(J)V")
    public void method3122(long arg0) {
        class149 var3 = (class149) this.field1956.method5510(arg0);
        this.method3124(var3);
    }

    @ObfuscatedName("ek.o(Lef;)V")
    public void method3124(class149 arg0) {
        if (arg0 != null) {
            arg0.method3351();
            arg0.method3342();
            this.field1955 += arg0.field1953;
        }
    }

    @ObfuscatedName("ek.e(Ljava/lang/Object;JI)V")
    public void method3121(Object arg0, long arg1, int arg2) {
        if (arg2 > this.field1957) {
            throw new IllegalStateException();
        }
        this.method3122(arg1);
        this.field1955 -= arg2;
        while (this.field1955 < 0) {
            class149 var5 = (class149) this.field1958.method4613();
            if (var5 == null) {
                throw new RuntimeException("");
            }
            if (!var5.method3116()) {
            }
            this.method3124(var5);
            if (this.field1954 != null) {
                this.field1954.method3112(var5.method3115());
            }
        }
        class148 var6 = new class148(arg0, arg2);
        this.field1956.method5496(var6, arg1);
        this.field1958.method4629(var6);
        var6.field2105 = 0L;
    }

    @ObfuscatedName("ek.i(I)V")
    public void method3125(int arg0) {
        for (class149 var2 = (class149) this.field1958.method4620(); var2 != null; var2 = (class149) this.field1958.method4618()) {
            if (var2.method3116()) {
                if (var2.method3115() == null) {
                    var2.method3351();
                    var2.method3342();
                    this.field1955 += var2.field1953;
                }
            } else if (++var2.field2105 > (long) arg0) {
                class151 var3 = new class151(var2.method3115(), var2.field1953);
                this.field1956.method5496(var3, var2.field2115);
                class267.method4616(var3, var2);
                var2.method3351();
                var2.method3342();
            }
        }
    }

    @ObfuscatedName("ek.g()V")
    public void method3130() {
        this.field1958.method4614();
        this.field1956.method5497();
        this.field1955 = this.field1957;
    }
}
