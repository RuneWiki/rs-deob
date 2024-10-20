package deob;

@ObfuscatedName("gv")
public final class class202 {

    @ObfuscatedName("gv.w")
    public int field2439;

    @ObfuscatedName("gv.m")
    public int field2438;

    @ObfuscatedName("gv.q")
    public class198 field2437;

    @ObfuscatedName("gv.b")
    public class216 field2440 = new class216();

    public class202(int arg0, int arg1) {
        this.field2439 = arg0;
        this.field2438 = arg0;
        int var3;
        for (var3 = 1; var3 + var3 < arg0 && var3 < arg1; var3 += var3) {
        }
        this.field2437 = new class198(var3);
    }

    @ObfuscatedName("gv.w(J)Ljava/lang/Object;")
    public Object method3717(long arg0) {
        class213 var3 = (class213) this.field2437.method3675(arg0);
        if (var3 == null) {
            return null;
        }
        Object var4 = var3.method3669();
        if (var4 == null) {
            var3.method3782();
            var3.method3819();
            this.field2438 += var3.field2466;
            return null;
        }
        if (var3.method3668()) {
            class197 var5 = new class197(var4, var3.field2466);
            this.field2437.method3676(var5, var3.field2450);
            this.field2440.method3851(var5);
            var5.field2455 = 0L;
            var3.method3782();
            var3.method3819();
        } else {
            this.field2440.method3851(var3);
            var3.field2455 = 0L;
        }
        return var4;
    }

    @ObfuscatedName("gv.m(J)V")
    public void method3721(long arg0) {
        class213 var3 = (class213) this.field2437.method3675(arg0);
        this.method3719(var3);
    }

    @ObfuscatedName("gv.q(Lhd;)V")
    public void method3719(class213 arg0) {
        if (arg0 != null) {
            arg0.method3782();
            arg0.method3819();
            this.field2438 += arg0.field2466;
        }
    }

    @ObfuscatedName("gv.x(Ljava/lang/Object;J)V")
    public void method3720(Object arg0, long arg1) {
        this.method3718(arg0, arg1, 1);
    }

    @ObfuscatedName("gv.j(Ljava/lang/Object;JI)V")
    public void method3718(Object arg0, long arg1, int arg2) {
        if (arg2 > this.field2439) {
            throw new IllegalStateException();
        }
        this.method3721(arg1);
        this.field2438 -= arg2;
        while (this.field2438 < 0) {
            class213 var5 = (class213) this.field2440.method3852();
            this.method3719(var5);
        }
        class197 var6 = new class197(arg0, arg2);
        this.field2437.method3676(var6, arg1);
        this.field2440.method3851(var6);
        var6.field2455 = 0L;
    }

    @ObfuscatedName("gv.a(I)V")
    public void method3732(int arg0) {
        for (class213 var2 = (class213) this.field2440.method3853(); var2 != null; var2 = (class213) this.field2440.method3855()) {
            if (var2.method3668()) {
                if (var2.method3669() == null) {
                    var2.method3782();
                    var2.method3819();
                    this.field2438 += var2.field2466;
                }
            } else if (++var2.field2455 > (long) arg0) {
                class208 var3 = new class208(var2.method3669(), var2.field2466);
                this.field2437.method3676(var3, var2.field2450);
                class195.method3650(var3, var2);
                var2.method3782();
                var2.method3819();
            }
        }
    }

    @ObfuscatedName("gv.l()V")
    public void method3723() {
        this.field2440.method3859();
        this.field2437.method3689();
        this.field2438 = this.field2439;
    }
}
