package deob;

@ObfuscatedName("ke")
public final class class278 {

    @ObfuscatedName("ke.af")
    public int field3077;

    @ObfuscatedName("ke.an")
    public int field3074;

    @ObfuscatedName("ke.aw")
    public class464 field3075;

    @ObfuscatedName("ke.ac")
    public class368 field3073;

    @ObfuscatedName("ke.au")
    public class277 field3076;

    public class278(int arg0) {
        this(arg0, arg0);
    }

    public class278(int arg0, int arg1) {
        this.field3073 = new class368();
        this.field3077 = arg0;
        this.field3074 = arg0;
        int var3;
        for (var3 = 1; var3 + var3 < arg0 && var3 < arg1; var3 += var3) {
        }
        this.field3075 = new class464(var3);
    }

    @ObfuscatedName("ke.af(J)Ljava/lang/Object;")
    public Object method5084(long arg0) {
        class282 var3 = (class282) this.field3075.method7945(arg0);
        if (var3 == null) {
            return null;
        }
        Object var4 = var3.method5111();
        if (var4 == null) {
            var3.method7651();
            var3.method7640();
            this.field3074 += var3.field3085;
            return null;
        }
        if (var3.method5112()) {
            class281 var5 = new class281(var4, var3.field3085);
            this.field3075.method7946(var5, var3.field4745);
            this.field3073.method6480(var5);
            var5.field4738 = 0L;
            var3.method7651();
            var3.method7640();
        } else {
            this.field3073.method6480(var3);
            var3.field4738 = 0L;
        }
        return var4;
    }

    @ObfuscatedName("ke.an(J)V")
    public void method5085(long arg0) {
        class282 var3 = (class282) this.field3075.method7945(arg0);
        this.method5110(var3);
    }

    @ObfuscatedName("ke.aw(Lkf;)V")
    public void method5110(class282 arg0) {
        if (arg0 != null) {
            arg0.method7651();
            arg0.method7640();
            this.field3074 += arg0.field3085;
        }
    }

    @ObfuscatedName("ke.ac(Ljava/lang/Object;J)V")
    public void method5108(Object arg0, long arg1) {
        this.method5087(arg0, arg1, 1);
    }

    @ObfuscatedName("ke.au(Ljava/lang/Object;JI)V")
    public void method5087(Object arg0, long arg1, int arg2) {
        if (arg2 > this.field3077) {
            throw new IllegalStateException();
        }
        this.method5085(arg1);
        this.field3074 -= arg2;
        while (this.field3074 < 0) {
            class282 var5 = (class282) this.field3073.method6469();
            if (var5 == null) {
                throw new RuntimeException("");
            }
            if (!var5.method5112()) {
            }
            this.method5110(var5);
            if (this.field3076 != null) {
                this.field3076.method5077(var5.method5111());
            }
        }
        class281 var6 = new class281(arg0, arg2);
        this.field3075.method7946(var6, arg1);
        this.field3073.method6480(var6);
        var6.field4738 = 0L;
    }

    @ObfuscatedName("ke.ab(I)V")
    public void method5088(int arg0) {
        for (class282 var2 = (class282) this.field3073.method6467(); var2 != null; var2 = (class282) this.field3073.method6462()) {
            if (var2.method5112()) {
                if (var2.method5111() == null) {
                    var2.method7651();
                    var2.method7640();
                    this.field3074 += var2.field3085;
                }
            } else if (++var2.field4738 > (long) arg0) {
                class279 var3 = new class279(var2.method5111(), var2.field3085);
                this.field3075.method7946(var3, var2.field4745);
                class368.method6484(var3, var2);
                var2.method7651();
                var2.method7640();
            }
        }
    }

    @ObfuscatedName("ke.aq()V")
    public void method5095() {
        this.field3073.method6463();
        this.field3075.method7947();
        this.field3074 = this.field3077;
    }
}
