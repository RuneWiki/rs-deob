package deob;

@ObfuscatedName("it")
public final class class255 {

    @ObfuscatedName("it.c")
    public int field2916;

    @ObfuscatedName("it.p")
    public int field2917;

    @ObfuscatedName("it.f")
    public class421 field2918;

    @ObfuscatedName("it.n")
    public class341 field2919;

    @ObfuscatedName("it.k")
    public class254 field2920;

    public class255(int arg0) {
        this(arg0, arg0);
    }

    public class255(int arg0, int arg1) {
        this.field2919 = new class341();
        this.field2916 = arg0;
        this.field2917 = arg0;
        int var3;
        for (var3 = 1; var3 + var3 < arg0 && var3 < arg1; var3 += var3) {
        }
        this.field2918 = new class421(var3);
    }

    @ObfuscatedName("it.c(J)Ljava/lang/Object;")
    public Object method4743(long arg0) {
        class259 var3 = (class259) this.field2918.method6917(arg0);
        if (var3 == null) {
            return null;
        }
        Object var4 = var3.method4777();
        if (var4 == null) {
            var3.method6657();
            var3.method6653();
            this.field2917 += var3.field2928;
            return null;
        }
        if (var3.method4770()) {
            class258 var5 = new class258(var4, var3.field2928);
            this.field2918.method6918(var5, var3.field4504);
            this.field2919.method5789(var5);
            var5.field4497 = 0L;
            var3.method6657();
            var3.method6653();
        } else {
            this.field2919.method5789(var3);
            var3.field4497 = 0L;
        }
        return var4;
    }

    @ObfuscatedName("it.p(J)V")
    public void method4744(long arg0) {
        class259 var3 = (class259) this.field2918.method6917(arg0);
        this.method4757(var3);
    }

    @ObfuscatedName("it.f(Liz;)V")
    public void method4757(class259 arg0) {
        if (arg0 != null) {
            arg0.method6657();
            arg0.method6653();
            this.field2917 += arg0.field2928;
        }
    }

    @ObfuscatedName("it.n(Ljava/lang/Object;J)V")
    public void method4762(Object arg0, long arg1) {
        this.method4742(arg0, arg1, 1);
    }

    @ObfuscatedName("it.k(Ljava/lang/Object;JI)V")
    public void method4742(Object arg0, long arg1, int arg2) {
        if (arg2 > this.field2916) {
            throw new IllegalStateException();
        }
        this.method4744(arg1);
        this.field2917 -= arg2;
        while (this.field2917 < 0) {
            class259 var5 = (class259) this.field2919.method5803();
            if (var5 == null) {
                throw new RuntimeException("");
            }
            if (!var5.method4770()) {
            }
            this.method4757(var5);
            if (this.field2920 != null) {
                this.field2920.method4740(var5.method4777());
            }
        }
        class258 var6 = new class258(arg0, arg2);
        this.field2918.method6918(var6, arg1);
        this.field2919.method5789(var6);
        var6.field4497 = 0L;
    }

    @ObfuscatedName("it.w(I)V")
    public void method4751(int arg0) {
        for (class259 var2 = (class259) this.field2919.method5792(); var2 != null; var2 = (class259) this.field2919.method5794()) {
            if (var2.method4770()) {
                if (var2.method4777() == null) {
                    var2.method6657();
                    var2.method6653();
                    this.field2917 += var2.field2928;
                }
            } else if (++var2.field4497 > (long) arg0) {
                class256 var3 = new class256(var2.method4777(), var2.field2928);
                this.field2918.method6918(var3, var2.field4504);
                class341.method5790(var3, var2);
                var2.method6657();
                var2.method6653();
            }
        }
    }

    @ObfuscatedName("it.s()V")
    public void method4749() {
        this.field2919.method5788();
        this.field2918.method6928();
        this.field2917 = this.field2916;
    }
}
