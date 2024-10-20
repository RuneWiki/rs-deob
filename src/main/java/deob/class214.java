package deob;

@ObfuscatedName("hm")
public final class class214 {

    @ObfuscatedName("hm.c")
    public int field2632;

    @ObfuscatedName("hm.i")
    public int field2633;

    @ObfuscatedName("hm.o")
    public class210 field2634;

    @ObfuscatedName("hm.j")
    public class228 field2635 = new class228();

    public class214(int arg0, int arg1) {
        this.field2632 = arg0;
        this.field2633 = arg0;
        int var3;
        for (var3 = 1; var3 + var3 < arg0 && var3 < arg1; var3 += var3) {
        }
        this.field2634 = new class210(var3);
    }

    @ObfuscatedName("hm.c(J)Ljava/lang/Object;")
    public Object method3641(long arg0) {
        class225 var3 = (class225) this.field2634.method3603(arg0);
        if (var3 == null) {
            return null;
        }
        Object var4 = var3.method3593();
        if (var4 == null) {
            var3.method3710();
            var3.method3747();
            this.field2633 += var3.field2661;
            return null;
        }
        if (var3.method3594()) {
            class209 var5 = new class209(var4, var3.field2661);
            this.field2634.method3610(var5, var3.field2645);
            this.field2635.method3782(var5);
            var5.field2648 = 0L;
            var3.method3710();
            var3.method3747();
        } else {
            this.field2635.method3782(var3);
            var3.field2648 = 0L;
        }
        return var4;
    }

    @ObfuscatedName("hm.i(J)V")
    public void method3637(long arg0) {
        class225 var3 = (class225) this.field2634.method3603(arg0);
        this.method3636(var3);
    }

    @ObfuscatedName("hm.o(Lhs;)V")
    public void method3636(class225 arg0) {
        if (arg0 != null) {
            arg0.method3710();
            arg0.method3747();
            this.field2633 += arg0.field2661;
        }
    }

    @ObfuscatedName("hm.j(Ljava/lang/Object;J)V")
    public void method3649(Object arg0, long arg1) {
        this.method3639(arg0, arg1, 1);
    }

    @ObfuscatedName("hm.k(Ljava/lang/Object;JI)V")
    public void method3639(Object arg0, long arg1, int arg2) {
        if (arg2 > this.field2632) {
            throw new IllegalStateException();
        }
        this.method3637(arg1);
        this.field2633 -= arg2;
        while (this.field2633 < 0) {
            class225 var5 = (class225) this.field2635.method3789();
            this.method3636(var5);
        }
        class209 var6 = new class209(arg0, arg2);
        this.field2634.method3610(var6, arg1);
        this.field2635.method3782(var6);
        var6.field2648 = 0L;
    }

    @ObfuscatedName("hm.x(I)V")
    public void method3640(int arg0) {
        for (class225 var2 = (class225) this.field2635.method3786(); var2 != null; var2 = (class225) this.field2635.method3784()) {
            if (var2.method3594()) {
                if (var2.method3593() == null) {
                    var2.method3710();
                    var2.method3747();
                    this.field2633 += var2.field2661;
                }
            } else if (++var2.field2648 > (long) arg0) {
                class220 var3 = new class220(var2.method3593(), var2.field2661);
                this.field2634.method3610(var3, var2.field2645);
                class207.method3575(var3, var2);
                var2.method3710();
                var2.method3747();
            }
        }
    }

    @ObfuscatedName("hm.z()V")
    public void method3650() {
        this.field2635.method3783();
        this.field2634.method3600();
        this.field2633 = this.field2632;
    }
}
