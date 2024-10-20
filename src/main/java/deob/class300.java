package deob;

@ObfuscatedName("lm")
public final class class300 {

    @ObfuscatedName("lm.am")
    public int field3144;

    @ObfuscatedName("lm.ap")
    public int field3143;

    @ObfuscatedName("lm.af")
    public class504 field3142;

    @ObfuscatedName("lm.aj")
    public class399 field3145;

    @ObfuscatedName("lm.aq")
    public class299 field3146;

    public class300(int arg0) {
        this(arg0, arg0);
    }

    public class300(int arg0, int arg1) {
        this.field3145 = new class399();
        this.field3144 = arg0;
        this.field3143 = arg0;
        int var3;
        for (var3 = 1; var3 + var3 < arg0 && var3 < arg1; var3 += var3) {
        }
        this.field3142 = new class504(var3);
    }

    @ObfuscatedName("lm.am(J)Ljava/lang/Object;")
    public Object method5361(long arg0) {
        class304 var3 = (class304) this.field3142.method8286(arg0);
        if (var3 == null) {
            return null;
        }
        Object var4 = var3.method5390();
        if (var4 == null) {
            var3.method7988();
            var3.method7986();
            this.field3143 += var3.field3154;
            return null;
        }
        if (var3.method5391()) {
            class303 var5 = new class303(var4, var3.field3154);
            this.field3142.method8292(var5, var3.field4889);
            this.field3145.method6815(var5);
            var5.field4884 = 0L;
            var3.method7988();
            var3.method7986();
        } else {
            this.field3145.method6815(var3);
            var3.field4884 = 0L;
        }
        return var4;
    }

    @ObfuscatedName("lm.ap(J)V")
    public void method5365(long arg0) {
        class304 var3 = (class304) this.field3142.method8286(arg0);
        this.method5363(var3);
    }

    @ObfuscatedName("lm.af(Llt;)V")
    public void method5363(class304 arg0) {
        if (arg0 != null) {
            arg0.method7988();
            arg0.method7986();
            this.field3143 += arg0.field3154;
        }
    }

    @ObfuscatedName("lm.aj(Ljava/lang/Object;J)V")
    public void method5364(Object arg0, long arg1) {
        this.method5360(arg0, arg1, 1);
    }

    @ObfuscatedName("lm.aq(Ljava/lang/Object;JI)V")
    public void method5360(Object arg0, long arg1, int arg2) {
        if (arg2 > this.field3144) {
            throw new IllegalStateException();
        }
        this.method5365(arg1);
        this.field3143 -= arg2;
        while (this.field3143 < 0) {
            class304 var5 = (class304) this.field3145.method6806();
            if (var5 == null) {
                throw new RuntimeException("");
            }
            if (!var5.method5391()) {
            }
            this.method5363(var5);
            if (this.field3146 != null) {
                this.field3146.method5358(var5.method5390());
            }
        }
        class303 var6 = new class303(arg0, arg2);
        this.field3142.method8292(var6, arg1);
        this.field3145.method6815(var6);
        var6.field4884 = 0L;
    }

    @ObfuscatedName("lm.ar(I)V")
    public void method5366(int arg0) {
        for (class304 var2 = (class304) this.field3145.method6823(); var2 != null; var2 = (class304) this.field3145.method6808()) {
            if (var2.method5391()) {
                if (var2.method5390() == null) {
                    var2.method7988();
                    var2.method7986();
                    this.field3143 += var2.field3154;
                }
            } else if (++var2.field4884 > (long) arg0) {
                class301 var3 = new class301(var2.method5390(), var2.field3154);
                this.field3142.method8292(var3, var2.field4889);
                class399.method6802(var3, var2);
                var2.method7988();
                var2.method7986();
            }
        }
    }

    @ObfuscatedName("lm.ag()V")
    public void method5367() {
        this.field3145.method6805();
        this.field3142.method8284();
        this.field3143 = this.field3144;
    }
}
