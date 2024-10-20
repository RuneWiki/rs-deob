package deob;

@ObfuscatedName("ls")
public final class class302 {

    @ObfuscatedName("ls.aq")
    public int field3154;

    @ObfuscatedName("ls.aw")
    public int field3152;

    @ObfuscatedName("ls.al")
    public class507 field3153;

    @ObfuscatedName("ls.ai")
    public class402 field3155;

    @ObfuscatedName("ls.ar")
    public class301 field3156;

    public class302(int arg0) {
        this(arg0, arg0);
    }

    public class302(int arg0, int arg1) {
        this.field3155 = new class402();
        this.field3154 = arg0;
        this.field3152 = arg0;
        int var3;
        for (var3 = 1; var3 + var3 < arg0 && var3 < arg1; var3 += var3) {
        }
        this.field3153 = new class507(var3);
    }

    @ObfuscatedName("ls.aq(J)Ljava/lang/Object;")
    public Object method5384(long arg0) {
        class306 var3 = (class306) this.field3153.method8299(arg0);
        if (var3 == null) {
            return null;
        }
        Object var4 = var3.method5407();
        if (var4 == null) {
            var3.method7996();
            var3.method7989();
            this.field3152 += var3.field3164;
            return null;
        }
        if (var3.method5406()) {
            class305 var5 = new class305(var4, var3.field3164);
            this.field3153.method8319(var5, var3.field4920);
            this.field3155.method6836(var5);
            var5.field4912 = 0L;
            var3.method7996();
            var3.method7989();
        } else {
            this.field3155.method6836(var3);
            var3.field4912 = 0L;
        }
        return var4;
    }

    @ObfuscatedName("ls.aw(J)V")
    public void method5385(long arg0) {
        class306 var3 = (class306) this.field3153.method8299(arg0);
        this.method5392(var3);
    }

    @ObfuscatedName("ls.al(Llb;)V")
    public void method5392(class306 arg0) {
        if (arg0 != null) {
            arg0.method7996();
            arg0.method7989();
            this.field3152 += arg0.field3164;
        }
    }

    @ObfuscatedName("ls.ai(Ljava/lang/Object;J)V")
    public void method5387(Object arg0, long arg1) {
        this.method5402(arg0, arg1, 1);
    }

    @ObfuscatedName("ls.ar(Ljava/lang/Object;JI)V")
    public void method5402(Object arg0, long arg1, int arg2) {
        if (arg2 > this.field3154) {
            throw new IllegalStateException();
        }
        this.method5385(arg1);
        this.field3152 -= arg2;
        while (this.field3152 < 0) {
            class306 var5 = (class306) this.field3155.method6838();
            if (var5 == null) {
                throw new RuntimeException("");
            }
            if (!var5.method5406()) {
            }
            this.method5392(var5);
            if (this.field3156 != null) {
                this.field3156.method5381(var5.method5407());
            }
        }
        class305 var6 = new class305(arg0, arg2);
        this.field3153.method8319(var6, arg1);
        this.field3155.method6836(var6);
        var6.field4912 = 0L;
    }

    @ObfuscatedName("ls.as(I)V")
    public void method5393(int arg0) {
        for (class306 var2 = (class306) this.field3155.method6839(); var2 != null; var2 = (class306) this.field3155.method6841()) {
            if (var2.method5406()) {
                if (var2.method5407() == null) {
                    var2.method7996();
                    var2.method7989();
                    this.field3152 += var2.field3164;
                }
            } else if (++var2.field4912 > (long) arg0) {
                class303 var3 = new class303(var2.method5407(), var2.field3164);
                this.field3153.method8319(var3, var2.field4920);
                class402.method6837(var3, var2);
                var2.method7996();
                var2.method7989();
            }
        }
    }

    @ObfuscatedName("ls.aa()V")
    public void method5390() {
        this.field3155.method6835();
        this.field3153.method8308();
        this.field3152 = this.field3154;
    }
}
