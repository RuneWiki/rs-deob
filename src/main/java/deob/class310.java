package deob;

@ObfuscatedName("ld")
public final class class310 {

    @ObfuscatedName("ld.ak")
    public int field3258;

    @ObfuscatedName("ld.al")
    public int field3256;

    @ObfuscatedName("ld.aj")
    public class519 field3257;

    @ObfuscatedName("ld.az")
    public class411 field3255;

    @ObfuscatedName("ld.af")
    public class309 field3259;

    public class310(int arg0) {
        this(arg0, arg0);
    }

    public class310(int arg0, int arg1) {
        this.field3255 = new class411();
        this.field3258 = arg0;
        this.field3256 = arg0;
        int var3;
        for (var3 = 1; var3 + var3 < arg0 && var3 < arg1; var3 += var3) {
        }
        this.field3257 = new class519(var3);
    }

    @ObfuscatedName("ld.ak(J)Ljava/lang/Object;")
    public Object method5526(long arg0) {
        class314 var3 = (class314) this.field3257.method8506(arg0);
        if (var3 == null) {
            return null;
        }
        Object var4 = var3.method5548();
        if (var4 == null) {
            var3.method8189();
            var3.method8183();
            this.field3256 += var3.field3267;
            return null;
        }
        if (var3.method5549()) {
            class313 var5 = new class313(var4, var3.field3267);
            this.field3257.method8513(var5, var3.field5049);
            this.field3255.method6984(var5);
            var5.field5043 = 0L;
            var3.method8189();
            var3.method8183();
        } else {
            this.field3255.method6984(var3);
            var3.field5043 = 0L;
        }
        return var4;
    }

    @ObfuscatedName("ld.al(J)V")
    public void method5528(long arg0) {
        class314 var3 = (class314) this.field3257.method8506(arg0);
        this.method5537(var3);
    }

    @ObfuscatedName("ld.aj(Lmh;)V")
    public void method5537(class314 arg0) {
        if (arg0 != null) {
            arg0.method8189();
            arg0.method8183();
            this.field3256 += arg0.field3267;
        }
    }

    @ObfuscatedName("ld.az(Ljava/lang/Object;J)V")
    public void method5529(Object arg0, long arg1) {
        this.method5532(arg0, arg1, 1);
    }

    @ObfuscatedName("ld.af(Ljava/lang/Object;JI)V")
    public void method5532(Object arg0, long arg1, int arg2) {
        if (arg2 > this.field3258) {
            throw new IllegalStateException();
        }
        this.method5528(arg1);
        this.field3256 -= arg2;
        while (this.field3256 < 0) {
            class314 var5 = (class314) this.field3255.method6996();
            if (var5 == null) {
                throw new RuntimeException("");
            }
            if (!var5.method5549()) {
            }
            this.method5537(var5);
            if (this.field3259 != null) {
                this.field3259.method5525(var5.method5548());
            }
        }
        class313 var6 = new class313(arg0, arg2);
        this.field3257.method8513(var6, arg1);
        this.field3255.method6984(var6);
        var6.field5043 = 0L;
    }

    @ObfuscatedName("ld.aa(I)V")
    public void method5531(int arg0) {
        for (class314 var2 = (class314) this.field3255.method6987(); var2 != null; var2 = (class314) this.field3255.method6989()) {
            if (var2.method5549()) {
                if (var2.method5548() == null) {
                    var2.method8189();
                    var2.method8183();
                    this.field3256 += var2.field3267;
                }
            } else if (++var2.field5043 > (long) arg0) {
                class311 var3 = new class311(var2.method5548(), var2.field3267);
                this.field3257.method8513(var3, var2.field5049);
                class411.method6985(var3, var2);
                var2.method8189();
                var2.method8183();
            }
        }
    }

    @ObfuscatedName("ld.at()V")
    public void method5535() {
        this.field3255.method6983();
        this.field3257.method8508();
        this.field3256 = this.field3258;
    }
}
