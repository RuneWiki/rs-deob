package deob;

@ObfuscatedName("gn")
public final class class204 {

    @ObfuscatedName("gn.f")
    public int field2477;

    @ObfuscatedName("gn.h")
    public int field2476;

    @ObfuscatedName("gn.e")
    public class200 field2474;

    @ObfuscatedName("gn.b")
    public class218 field2475 = new class218();

    public class204(int arg0, int arg1) {
        this.field2477 = arg0;
        this.field2476 = arg0;
        int var3;
        for (var3 = 1; var3 + var3 < arg0 && var3 < arg1; var3 += var3) {
        }
        this.field2474 = new class200(var3);
    }

    @ObfuscatedName("gn.f(J)Ljava/lang/Object;")
    public Object method3739(long arg0) {
        class215 var3 = (class215) this.field2474.method3710(arg0);
        if (var3 == null) {
            return null;
        }
        Object var4 = var3.method3691();
        if (var4 == null) {
            var3.method3812();
            var3.method3845();
            this.field2476 += var3.field2503;
            return null;
        }
        if (var3.method3693()) {
            class199 var5 = new class199(var4, var3.field2503);
            this.field2474.method3698(var5, var3.field2486);
            this.field2475.method3878(var5);
            var5.field2490 = 0L;
            var3.method3812();
            var3.method3845();
        } else {
            this.field2475.method3878(var3);
            var3.field2490 = 0L;
        }
        return var4;
    }

    @ObfuscatedName("gn.h(J)V")
    public void method3751(long arg0) {
        class215 var3 = (class215) this.field2474.method3710(arg0);
        this.method3741(var3);
    }

    @ObfuscatedName("gn.e(Lhf;)V")
    public void method3741(class215 arg0) {
        if (arg0 != null) {
            arg0.method3812();
            arg0.method3845();
            this.field2476 += arg0.field2503;
        }
    }

    @ObfuscatedName("gn.b(Ljava/lang/Object;J)V")
    public void method3742(Object arg0, long arg1) {
        this.method3743(arg0, arg1, 1);
    }

    @ObfuscatedName("gn.l(Ljava/lang/Object;JI)V")
    public void method3743(Object arg0, long arg1, int arg2) {
        if (arg2 > this.field2477) {
            throw new IllegalStateException();
        }
        this.method3751(arg1);
        this.field2476 -= arg2;
        while (this.field2476 < 0) {
            class215 var5 = (class215) this.field2475.method3877();
            this.method3741(var5);
        }
        class199 var6 = new class199(arg0, arg2);
        this.field2474.method3698(var6, arg1);
        this.field2475.method3878(var6);
        var6.field2490 = 0L;
    }

    @ObfuscatedName("gn.w(I)V")
    public void method3758(int arg0) {
        for (class215 var2 = (class215) this.field2475.method3879(); var2 != null; var2 = (class215) this.field2475.method3881()) {
            if (var2.method3693()) {
                if (var2.method3691() == null) {
                    var2.method3812();
                    var2.method3845();
                    this.field2476 += var2.field2503;
                }
            } else if (++var2.field2490 > (long) arg0) {
                class210 var3 = new class210(var2.method3691(), var2.field2503);
                this.field2474.method3698(var3, var2.field2486);
                class197.method3675(var3, var2);
                var2.method3812();
                var2.method3845();
            }
        }
    }

    @ObfuscatedName("gn.d()V")
    public void method3745() {
        this.field2475.method3884();
        this.field2474.method3699();
        this.field2476 = this.field2477;
    }
}
