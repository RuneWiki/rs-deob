package deob;

@ObfuscatedName("hs")
public final class class234 {

    @ObfuscatedName("hs.l")
    public int field2650;

    @ObfuscatedName("hs.q")
    public int field2648;

    @ObfuscatedName("hs.f")
    public class379 field2649;

    @ObfuscatedName("hs.j")
    public class314 field2647;

    @ObfuscatedName("hs.m")
    public class233 field2651;

    public class234(int arg0) {
        this(arg0, arg0);
    }

    public class234(int arg0, int arg1) {
        this.field2647 = new class314();
        this.field2650 = arg0;
        this.field2648 = arg0;
        int var3;
        for (var3 = 1; var3 + var3 < arg0 && var3 < arg1; var3 += var3) {
        }
        this.field2649 = new class379(var3);
    }

    @ObfuscatedName("hs.l(J)Ljava/lang/Object;")
    public Object method4201(long arg0) {
        class238 var3 = (class238) this.field2649.method6049(arg0);
        if (var3 == null) {
            return null;
        }
        Object var4 = var3.method4215();
        if (var4 == null) {
            var3.method5775();
            var3.method5771();
            this.field2648 += var3.field2659;
            return null;
        }
        if (var3.method4217()) {
            class237 var5 = new class237(var4, var3.field2659);
            this.field2649.method6043(var5, var3.field4075);
            this.field2647.method5168(var5);
            var5.field4068 = 0L;
            var3.method5775();
            var3.method5771();
        } else {
            this.field2647.method5168(var3);
            var3.field4068 = 0L;
        }
        return var4;
    }

    @ObfuscatedName("hs.q(J)V")
    public void method4191(long arg0) {
        class238 var3 = (class238) this.field2649.method6049(arg0);
        this.method4192(var3);
    }

    @ObfuscatedName("hs.f(Lik;)V")
    public void method4192(class238 arg0) {
        if (arg0 != null) {
            arg0.method5775();
            arg0.method5771();
            this.field2648 += arg0.field2659;
        }
    }

    @ObfuscatedName("hs.j(Ljava/lang/Object;J)V")
    public void method4193(Object arg0, long arg1) {
        this.method4194(arg0, arg1, 1);
    }

    @ObfuscatedName("hs.m(Ljava/lang/Object;JI)V")
    public void method4194(Object arg0, long arg1, int arg2) {
        if (arg2 > this.field2650) {
            throw new IllegalStateException();
        }
        this.method4191(arg1);
        this.field2648 -= arg2;
        while (this.field2648 < 0) {
            class238 var5 = (class238) this.field2647.method5163();
            if (var5 == null) {
                throw new RuntimeException("");
            }
            if (!var5.method4217()) {
            }
            this.method4192(var5);
            if (this.field2651 != null) {
                this.field2651.method4187(var5.method4215());
            }
        }
        class237 var6 = new class237(arg0, arg2);
        this.field2649.method6043(var6, arg1);
        this.field2647.method5168(var6);
        var6.field4068 = 0L;
    }

    @ObfuscatedName("hs.k(I)V")
    public void method4195(int arg0) {
        for (class238 var2 = (class238) this.field2647.method5164(); var2 != null; var2 = (class238) this.field2647.method5166()) {
            if (var2.method4217()) {
                if (var2.method4215() == null) {
                    var2.method5775();
                    var2.method5771();
                    this.field2648 += var2.field2659;
                }
            } else if (++var2.field4068 > (long) arg0) {
                class235 var3 = new class235(var2.method4215(), var2.field2659);
                this.field2649.method6043(var3, var2.field4075);
                class314.method5162(var3, var2);
                var2.method5775();
                var2.method5771();
            }
        }
    }

    @ObfuscatedName("hs.t()V")
    public void method4196() {
        this.field2647.method5160();
        this.field2649.method6044();
        this.field2648 = this.field2650;
    }
}
