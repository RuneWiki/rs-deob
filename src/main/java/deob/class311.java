package deob;

@ObfuscatedName("lx")
public final class class311 {

    @ObfuscatedName("lx.aq")
    public int field3255;

    @ObfuscatedName("lx.ad")
    public int field3252;

    @ObfuscatedName("lx.ag")
    public class520 field3251;

    @ObfuscatedName("lx.ak")
    public class412 field3254;

    @ObfuscatedName("lx.ap")
    public class310 field3253;

    public class311(int arg0) {
        this(arg0, arg0);
    }

    public class311(int arg0, int arg1) {
        this.field3254 = new class412();
        this.field3255 = arg0;
        this.field3252 = arg0;
        int var3;
        for (var3 = 1; var3 + var3 < arg0 && var3 < arg1; var3 += var3) {
        }
        this.field3251 = new class520(var3);
    }

    @ObfuscatedName("lx.aq(J)Ljava/lang/Object;")
    public Object method5473(long arg0) {
        class315 var3 = (class315) this.field3251.method8442(arg0);
        if (var3 == null) {
            return null;
        }
        Object var4 = var3.method5490();
        if (var4 == null) {
            var3.method8130();
            var3.method8125();
            this.field3252 += var3.field3263;
            return null;
        }
        if (var3.method5492()) {
            class314 var5 = new class314(var4, var3.field3263);
            this.field3251.method8443(var5, var3.field5082);
            this.field3254.method6923(var5);
            var5.field5076 = 0L;
            var3.method8130();
            var3.method8125();
        } else {
            this.field3254.method6923(var3);
            var3.field5076 = 0L;
        }
        return var4;
    }

    @ObfuscatedName("lx.ad(J)V")
    public void method5475(long arg0) {
        class315 var3 = (class315) this.field3251.method8442(arg0);
        this.method5470(var3);
    }

    @ObfuscatedName("lx.ag(Lmz;)V")
    public void method5470(class315 arg0) {
        if (arg0 != null) {
            arg0.method8130();
            arg0.method8125();
            this.field3252 += arg0.field3263;
        }
    }

    @ObfuscatedName("lx.ak(Ljava/lang/Object;J)V")
    public void method5471(Object arg0, long arg1) {
        this.method5484(arg0, arg1, 1);
    }

    @ObfuscatedName("lx.ap(Ljava/lang/Object;JI)V")
    public void method5484(Object arg0, long arg1, int arg2) {
        if (arg2 > this.field3255) {
            throw new IllegalStateException();
        }
        this.method5475(arg1);
        this.field3252 -= arg2;
        while (this.field3252 < 0) {
            class315 var5 = (class315) this.field3254.method6935();
            if (var5 == null) {
                throw new RuntimeException("");
            }
            if (!var5.method5492()) {
            }
            this.method5470(var5);
            if (this.field3253 != null) {
                this.field3253.method5466(var5.method5490());
            }
        }
        class314 var6 = new class314(arg0, arg2);
        this.field3251.method8443(var6, arg1);
        this.field3254.method6923(var6);
        var6.field5076 = 0L;
    }

    @ObfuscatedName("lx.an(I)V")
    public void method5467(int arg0) {
        for (class315 var2 = (class315) this.field3254.method6925(); var2 != null; var2 = (class315) this.field3254.method6922()) {
            if (var2.method5492()) {
                if (var2.method5490() == null) {
                    var2.method8130();
                    var2.method8125();
                    this.field3252 += var2.field3263;
                }
            } else if (++var2.field5076 > (long) arg0) {
                class312 var3 = new class312(var2.method5490(), var2.field3263);
                this.field3251.method8443(var3, var2.field5082);
                class412.method6924(var3, var2);
                var2.method8130();
                var2.method8125();
            }
        }
    }

    @ObfuscatedName("lx.aj()V")
    public void method5468() {
        this.field3254.method6927();
        this.field3251.method8444();
        this.field3252 = this.field3255;
    }
}
