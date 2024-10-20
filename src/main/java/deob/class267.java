package deob;

@ObfuscatedName("jj")
public final class class267 {

    @ObfuscatedName("jj.h")
    public int field3027;

    @ObfuscatedName("jj.e")
    public int field3029;

    @ObfuscatedName("jj.v")
    public class443 field3028;

    @ObfuscatedName("jj.x")
    public class357 field3026;

    @ObfuscatedName("jj.m")
    public class266 field3030;

    public class267(int arg0) {
        this(arg0, arg0);
    }

    public class267(int arg0, int arg1) {
        this.field3026 = new class357();
        this.field3027 = arg0;
        this.field3029 = arg0;
        int var3;
        for (var3 = 1; var3 + var3 < arg0 && var3 < arg1; var3 += var3) {
        }
        this.field3028 = new class443(var3);
    }

    @ObfuscatedName("jj.h(J)Ljava/lang/Object;")
    public Object method4881(long arg0) {
        class271 var3 = (class271) this.field3028.method7525(arg0);
        if (var3 == null) {
            return null;
        }
        Object var4 = var3.method4908();
        if (var4 == null) {
            var3.method7230();
            var3.method7225();
            this.field3029 += var3.field3038;
            return null;
        }
        if (var3.method4910()) {
            class270 var5 = new class270(var4, var3.field3038);
            this.field3028.method7523(var5, var3.field4686);
            this.field3026.method6235(var5);
            var5.field4678 = 0L;
            var3.method7230();
            var3.method7225();
        } else {
            this.field3026.method6235(var3);
            var3.field4678 = 0L;
        }
        return var4;
    }

    @ObfuscatedName("jj.e(J)V")
    public void method4902(long arg0) {
        class271 var3 = (class271) this.field3028.method7525(arg0);
        this.method4883(var3);
    }

    @ObfuscatedName("jj.v(Ljd;)V")
    public void method4883(class271 arg0) {
        if (arg0 != null) {
            arg0.method7230();
            arg0.method7225();
            this.field3029 += arg0.field3038;
        }
    }

    @ObfuscatedName("jj.x(Ljava/lang/Object;J)V")
    public void method4884(Object arg0, long arg1) {
        this.method4885(arg0, arg1, 1);
    }

    @ObfuscatedName("jj.m(Ljava/lang/Object;JI)V")
    public void method4885(Object arg0, long arg1, int arg2) {
        if (arg2 > this.field3027) {
            throw new IllegalStateException();
        }
        this.method4902(arg1);
        this.field3029 -= arg2;
        while (this.field3029 < 0) {
            class271 var5 = (class271) this.field3026.method6237();
            if (var5 == null) {
                throw new RuntimeException("");
            }
            if (!var5.method4910()) {
            }
            this.method4883(var5);
            if (this.field3030 != null) {
                this.field3030.method4875(var5.method4908());
            }
        }
        class270 var6 = new class270(arg0, arg2);
        this.field3028.method7523(var6, arg1);
        this.field3026.method6235(var6);
        var6.field4678 = 0L;
    }

    @ObfuscatedName("jj.q(I)V")
    public void method4896(int arg0) {
        for (class271 var2 = (class271) this.field3026.method6238(); var2 != null; var2 = (class271) this.field3026.method6247()) {
            if (var2.method4910()) {
                if (var2.method4908() == null) {
                    var2.method7230();
                    var2.method7225();
                    this.field3029 += var2.field3038;
                }
            } else if (++var2.field4678 > (long) arg0) {
                class268 var3 = new class268(var2.method4908(), var2.field3038);
                this.field3028.method7523(var3, var2.field4686);
                class357.method6246(var3, var2);
                var2.method7230();
                var2.method7225();
            }
        }
    }

    @ObfuscatedName("jj.f()V")
    public void method4880() {
        this.field3026.method6234();
        this.field3028.method7512();
        this.field3029 = this.field3027;
    }
}
