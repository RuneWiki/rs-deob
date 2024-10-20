package deob;

@ObfuscatedName("hv")
public final class class234 {

    @ObfuscatedName("hv.n")
    public int field2631;

    @ObfuscatedName("hv.c")
    public int field2629;

    @ObfuscatedName("hv.m")
    public class378 field2628;

    @ObfuscatedName("hv.k")
    public class314 field2630;

    @ObfuscatedName("hv.o")
    public class233 field2632;

    public class234(int arg0) {
        this(arg0, arg0);
    }

    public class234(int arg0, int arg1) {
        this.field2630 = new class314();
        this.field2631 = arg0;
        this.field2629 = arg0;
        int var3;
        for (var3 = 1; var3 + var3 < arg0 && var3 < arg1; var3 += var3) {
        }
        this.field2628 = new class378(var3);
    }

    @ObfuscatedName("hv.n(J)Ljava/lang/Object;")
    public Object method4136(long arg0) {
        class238 var3 = (class238) this.field2628.method5996(arg0);
        if (var3 == null) {
            return null;
        }
        Object var4 = var3.method4161();
        if (var4 == null) {
            var3.method5732();
            var3.method5728();
            this.field2629 += var3.field2640;
            return null;
        }
        if (var3.method4163()) {
            class237 var5 = new class237(var4, var3.field2640);
            this.field2628.method5997(var5, var3.field4056);
            this.field2630.method5103(var5);
            var5.field4048 = 0L;
            var3.method5732();
            var3.method5728();
        } else {
            this.field2630.method5103(var3);
            var3.field4048 = 0L;
        }
        return var4;
    }

    @ObfuscatedName("hv.c(J)V")
    public void method4137(long arg0) {
        class238 var3 = (class238) this.field2628.method5996(arg0);
        this.method4138(var3);
    }

    @ObfuscatedName("hv.m(Lij;)V")
    public void method4138(class238 arg0) {
        if (arg0 != null) {
            arg0.method5732();
            arg0.method5728();
            this.field2629 += arg0.field2640;
        }
    }

    @ObfuscatedName("hv.k(Ljava/lang/Object;J)V")
    public void method4155(Object arg0, long arg1) {
        this.method4158(arg0, arg1, 1);
    }

    @ObfuscatedName("hv.o(Ljava/lang/Object;JI)V")
    public void method4158(Object arg0, long arg1, int arg2) {
        if (arg2 > this.field2631) {
            throw new IllegalStateException();
        }
        this.method4137(arg1);
        this.field2629 -= arg2;
        while (this.field2629 < 0) {
            class238 var5 = (class238) this.field2630.method5091();
            if (var5 == null) {
                throw new RuntimeException("");
            }
            if (!var5.method4163()) {
            }
            this.method4138(var5);
            if (this.field2632 != null) {
                this.field2632.method4134(var5.method4161());
            }
        }
        class237 var6 = new class237(arg0, arg2);
        this.field2628.method5997(var6, arg1);
        this.field2630.method5103(var6);
        var6.field4048 = 0L;
    }

    @ObfuscatedName("hv.g(I)V")
    public void method4140(int arg0) {
        for (class238 var2 = (class238) this.field2630.method5089(); var2 != null; var2 = (class238) this.field2630.method5094()) {
            if (var2.method4163()) {
                if (var2.method4161() == null) {
                    var2.method5732();
                    var2.method5728();
                    this.field2629 += var2.field2640;
                }
            } else if (++var2.field4048 > (long) arg0) {
                class235 var3 = new class235(var2.method4161(), var2.field2640);
                this.field2628.method5997(var3, var2.field4056);
                class314.method5090(var3, var2);
                var2.method5732();
                var2.method5728();
            }
        }
    }

    @ObfuscatedName("hv.z()V")
    public void method4142() {
        this.field2630.method5088();
        this.field2628.method6000();
        this.field2629 = this.field2631;
    }
}
