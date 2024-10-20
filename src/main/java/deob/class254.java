package deob;

@ObfuscatedName("ic")
public final class class254 {

    @ObfuscatedName("ic.c")
    public int field2888;

    @ObfuscatedName("ic.v")
    public int field2887;

    @ObfuscatedName("ic.q")
    public class419 field2889;

    @ObfuscatedName("ic.f")
    public class339 field2890;

    @ObfuscatedName("ic.j")
    public class253 field2891;

    public class254(int arg0) {
        this(arg0, arg0);
    }

    public class254(int arg0, int arg1) {
        this.field2890 = new class339();
        this.field2888 = arg0;
        this.field2887 = arg0;
        int var3;
        for (var3 = 1; var3 + var3 < arg0 && var3 < arg1; var3 += var3) {
        }
        this.field2889 = new class419(var3);
    }

    @ObfuscatedName("ic.c(J)Ljava/lang/Object;")
    public Object method4664(long arg0) {
        class258 var3 = (class258) this.field2889.method6756(arg0);
        if (var3 == null) {
            return null;
        }
        Object var4 = var3.method4681();
        if (var4 == null) {
            var3.method6497();
            var3.method6493();
            this.field2887 += var3.field2899;
            return null;
        }
        if (var3.method4683()) {
            class257 var5 = new class257(var4, var3.field2899);
            this.field2889.method6754(var5, var3.field4462);
            this.field2890.method5655(var5);
            var5.field4455 = 0L;
            var3.method6497();
            var3.method6493();
        } else {
            this.field2890.method5655(var3);
            var3.field4455 = 0L;
        }
        return var4;
    }

    @ObfuscatedName("ic.v(J)V")
    public void method4660(long arg0) {
        class258 var3 = (class258) this.field2889.method6756(arg0);
        this.method4674(var3);
    }

    @ObfuscatedName("ic.q(Lip;)V")
    public void method4674(class258 arg0) {
        if (arg0 != null) {
            arg0.method6497();
            arg0.method6493();
            this.field2887 += arg0.field2899;
        }
    }

    @ObfuscatedName("ic.f(Ljava/lang/Object;J)V")
    public void method4663(Object arg0, long arg1) {
        this.method4662(arg0, arg1, 1);
    }

    @ObfuscatedName("ic.j(Ljava/lang/Object;JI)V")
    public void method4662(Object arg0, long arg1, int arg2) {
        if (arg2 > this.field2888) {
            throw new IllegalStateException();
        }
        this.method4660(arg1);
        this.field2887 -= arg2;
        while (this.field2887 < 0) {
            class258 var5 = (class258) this.field2890.method5671();
            if (var5 == null) {
                throw new RuntimeException("");
            }
            if (!var5.method4683()) {
            }
            this.method4674(var5);
            if (this.field2891 != null) {
                this.field2891.method4657(var5.method4681());
            }
        }
        class257 var6 = new class257(arg0, arg2);
        this.field2889.method6754(var6, arg1);
        this.field2890.method5655(var6);
        var6.field4455 = 0L;
    }

    @ObfuscatedName("ic.e(I)V")
    public void method4665(int arg0) {
        for (class258 var2 = (class258) this.field2890.method5657(); var2 != null; var2 = (class258) this.field2890.method5659()) {
            if (var2.method4683()) {
                if (var2.method4681() == null) {
                    var2.method6497();
                    var2.method6493();
                    this.field2887 += var2.field2899;
                }
            } else if (++var2.field4455 > (long) arg0) {
                class255 var3 = new class255(var2.method4681(), var2.field2899);
                this.field2889.method6754(var3, var2.field4462);
                class339.method5663(var3, var2);
                var2.method6497();
                var2.method6493();
            }
        }
    }

    @ObfuscatedName("ic.g()V")
    public void method4666() {
        this.field2890.method5661();
        this.field2889.method6748();
        this.field2887 = this.field2888;
    }
}
