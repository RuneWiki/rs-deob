package deob;

@ObfuscatedName("lj")
public final class class287 {

    @ObfuscatedName("lj.aw")
    public int field3070;

    @ObfuscatedName("lj.ay")
    public int field3069;

    @ObfuscatedName("lj.ar")
    public class489 field3068;

    @ObfuscatedName("lj.am")
    public class384 field3071;

    @ObfuscatedName("lj.as")
    public class286 field3072;

    public class287(int arg0) {
        this(arg0, arg0);
    }

    public class287(int arg0, int arg1) {
        this.field3071 = new class384();
        this.field3070 = arg0;
        this.field3069 = arg0;
        int var3;
        for (var3 = 1; var3 + var3 < arg0 && var3 < arg1; var3 += var3) {
        }
        this.field3068 = new class489(var3);
    }

    @ObfuscatedName("lj.aw(J)Ljava/lang/Object;")
    public Object method5116(long arg0) {
        class291 var3 = (class291) this.field3068.method7961(arg0);
        if (var3 == null) {
            return null;
        }
        Object var4 = var3.method5138();
        if (var4 == null) {
            var3.method7662();
            var3.method7660();
            this.field3069 += var3.field3080;
            return null;
        }
        if (var3.method5141()) {
            class290 var5 = new class290(var4, var3.field3080);
            this.field3068.method7962(var5, var3.field4819);
            this.field3071.method6512(var5);
            var5.field4814 = 0L;
            var3.method7662();
            var3.method7660();
        } else {
            this.field3071.method6512(var3);
            var3.field4814 = 0L;
        }
        return var4;
    }

    @ObfuscatedName("lj.ay(J)V")
    public void method5112(long arg0) {
        class291 var3 = (class291) this.field3068.method7961(arg0);
        this.method5122(var3);
    }

    @ObfuscatedName("lj.ar(Lla;)V")
    public void method5122(class291 arg0) {
        if (arg0 != null) {
            arg0.method7662();
            arg0.method7660();
            this.field3069 += arg0.field3080;
        }
    }

    @ObfuscatedName("lj.am(Ljava/lang/Object;J)V")
    public void method5114(Object arg0, long arg1) {
        this.method5115(arg0, arg1, 1);
    }

    @ObfuscatedName("lj.as(Ljava/lang/Object;JI)V")
    public void method5115(Object arg0, long arg1, int arg2) {
        if (arg2 > this.field3070) {
            throw new IllegalStateException();
        }
        this.method5112(arg1);
        this.field3069 -= arg2;
        while (this.field3069 < 0) {
            class291 var5 = (class291) this.field3071.method6521();
            if (var5 == null) {
                throw new RuntimeException("");
            }
            if (!var5.method5141()) {
            }
            this.method5122(var5);
            if (this.field3072 != null) {
                this.field3072.method5108(var5.method5138());
            }
        }
        class290 var6 = new class290(arg0, arg2);
        this.field3068.method7962(var6, arg1);
        this.field3071.method6512(var6);
        var6.field4814 = 0L;
    }

    @ObfuscatedName("lj.aj(I)V")
    public void method5110(int arg0) {
        for (class291 var2 = (class291) this.field3071.method6514(); var2 != null; var2 = (class291) this.field3071.method6516()) {
            if (var2.method5141()) {
                if (var2.method5138() == null) {
                    var2.method7662();
                    var2.method7660();
                    this.field3069 += var2.field3080;
                }
            } else if (++var2.field4814 > (long) arg0) {
                class288 var3 = new class288(var2.method5138(), var2.field3080);
                this.field3068.method7962(var3, var2.field4819);
                class384.method6519(var3, var2);
                var2.method7662();
                var2.method7660();
            }
        }
    }

    @ObfuscatedName("lj.ag()V")
    public void method5117() {
        this.field3071.method6511();
        this.field3068.method7963();
        this.field3069 = this.field3070;
    }
}
