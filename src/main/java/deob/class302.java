package deob;

@ObfuscatedName("ly")
public final class class302 {

    @ObfuscatedName("ly.az")
    public int field3183;

    @ObfuscatedName("ly.ah")
    public int field3181;

    @ObfuscatedName("ly.af")
    public class508 field3182;

    @ObfuscatedName("ly.at")
    public class403 field3184;

    @ObfuscatedName("ly.an")
    public class301 field3185;

    public class302(int arg0) {
        this(arg0, arg0);
    }

    public class302(int arg0, int arg1) {
        this.field3184 = new class403();
        this.field3183 = arg0;
        this.field3181 = arg0;
        int var3;
        for (var3 = 1; var3 + var3 < arg0 && var3 < arg1; var3 += var3) {
        }
        this.field3182 = new class508(var3);
    }

    @ObfuscatedName("ly.az(J)Ljava/lang/Object;")
    public Object method5301(long arg0) {
        class306 var3 = (class306) this.field3182.method8177(arg0);
        if (var3 == null) {
            return null;
        }
        Object var4 = var3.method5327();
        if (var4 == null) {
            var3.method7855();
            var3.method7853();
            this.field3181 += var3.field3193;
            return null;
        }
        if (var3.method5328()) {
            class305 var5 = new class305(var4, var3.field3193);
            this.field3182.method8200(var5, var3.field4951);
            this.field3184.method6759(var5);
            var5.field4944 = 0L;
            var3.method7855();
            var3.method7853();
        } else {
            this.field3184.method6759(var3);
            var3.field4944 = 0L;
        }
        return var4;
    }

    @ObfuscatedName("ly.ah(J)V")
    public void method5302(long arg0) {
        class306 var3 = (class306) this.field3182.method8177(arg0);
        this.method5303(var3);
    }

    @ObfuscatedName("ly.af(Llp;)V")
    public void method5303(class306 arg0) {
        if (arg0 != null) {
            arg0.method7855();
            arg0.method7853();
            this.field3181 += arg0.field3193;
        }
    }

    @ObfuscatedName("ly.at(Ljava/lang/Object;J)V")
    public void method5304(Object arg0, long arg1) {
        this.method5307(arg0, arg1, 1);
    }

    @ObfuscatedName("ly.an(Ljava/lang/Object;JI)V")
    public void method5307(Object arg0, long arg1, int arg2) {
        if (arg2 > this.field3183) {
            throw new IllegalStateException();
        }
        this.method5302(arg1);
        this.field3181 -= arg2;
        while (this.field3181 < 0) {
            class306 var5 = (class306) this.field3184.method6744();
            if (var5 == null) {
                throw new RuntimeException("");
            }
            if (!var5.method5328()) {
            }
            this.method5303(var5);
            if (this.field3185 != null) {
                this.field3185.method5296(var5.method5327());
            }
        }
        class305 var6 = new class305(arg0, arg2);
        this.field3182.method8200(var6, arg1);
        this.field3184.method6759(var6);
        var6.field4944 = 0L;
    }

    @ObfuscatedName("ly.ao(I)V")
    public void method5306(int arg0) {
        for (class306 var2 = (class306) this.field3184.method6745(); var2 != null; var2 = (class306) this.field3184.method6752()) {
            if (var2.method5328()) {
                if (var2.method5327() == null) {
                    var2.method7855();
                    var2.method7853();
                    this.field3181 += var2.field3193;
                }
            } else if (++var2.field4944 > (long) arg0) {
                class303 var3 = new class303(var2.method5327(), var2.field3193);
                this.field3182.method8200(var3, var2.field4951);
                class403.method6740(var3, var2);
                var2.method7855();
                var2.method7853();
            }
        }
    }

    @ObfuscatedName("ly.ab()V")
    public void method5322() {
        this.field3184.method6741();
        this.field3182.method8180();
        this.field3181 = this.field3183;
    }
}
