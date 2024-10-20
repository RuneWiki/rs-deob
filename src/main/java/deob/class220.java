package deob;

@ObfuscatedName("hh")
public final class class220 {

    @ObfuscatedName("hh.f")
    public int field2564;

    @ObfuscatedName("hh.e")
    public int field2563;

    @ObfuscatedName("hh.v")
    public class362 field2565;

    @ObfuscatedName("hh.y")
    public class300 field2562;

    @ObfuscatedName("hh.j")
    public class219 field2566;

    public class220(int arg0) {
        this(arg0, arg0);
    }

    public class220(int arg0, int arg1) {
        this.field2562 = new class300();
        this.field2564 = arg0;
        this.field2563 = arg0;
        int var3;
        for (var3 = 1; var3 + var3 < arg0 && var3 < arg1; var3 += var3) {
        }
        this.field2565 = new class362(var3);
    }

    @ObfuscatedName("hh.f(J)Ljava/lang/Object;")
    public Object method3970(long arg0) {
        class224 var3 = (class224) this.field2565.method5668(arg0);
        if (var3 == null) {
            return null;
        }
        Object var4 = var3.method3982();
        if (var4 == null) {
            var3.method5407();
            var3.method5404();
            this.field2563 += var3.field2574;
            return null;
        }
        if (var3.method3983()) {
            class223 var5 = new class223(var4, var3.field2574);
            this.field2565.method5669(var5, var3.field3937);
            this.field2562.method4845(var5);
            var5.field3930 = 0L;
            var3.method5407();
            var3.method5404();
        } else {
            this.field2562.method4845(var3);
            var3.field3930 = 0L;
        }
        return var4;
    }

    @ObfuscatedName("hh.e(J)V")
    public void method3960(long arg0) {
        class224 var3 = (class224) this.field2565.method5668(arg0);
        this.method3962(var3);
    }

    @ObfuscatedName("hh.v(Lha;)V")
    public void method3962(class224 arg0) {
        if (arg0 != null) {
            arg0.method5407();
            arg0.method5404();
            this.field2563 += arg0.field2574;
        }
    }

    @ObfuscatedName("hh.y(Ljava/lang/Object;J)V")
    public void method3975(Object arg0, long arg1) {
        this.method3963(arg0, arg1, 1);
    }

    @ObfuscatedName("hh.j(Ljava/lang/Object;JI)V")
    public void method3963(Object arg0, long arg1, int arg2) {
        if (arg2 > this.field2564) {
            throw new IllegalStateException();
        }
        this.method3960(arg1);
        this.field2563 -= arg2;
        while (this.field2563 < 0) {
            class224 var5 = (class224) this.field2562.method4861();
            if (var5 == null) {
                throw new RuntimeException("");
            }
            if (!var5.method3983()) {
            }
            this.method3962(var5);
            if (this.field2566 != null) {
                this.field2566.method3957(var5.method3982());
            }
        }
        class223 var6 = new class223(arg0, arg2);
        this.field2565.method5669(var6, arg1);
        this.field2562.method4845(var6);
        var6.field3930 = 0L;
    }

    @ObfuscatedName("hh.o(I)V")
    public void method3964(int arg0) {
        for (class224 var2 = (class224) this.field2562.method4849(); var2 != null; var2 = (class224) this.field2562.method4851()) {
            if (var2.method3983()) {
                if (var2.method3982() == null) {
                    var2.method5407();
                    var2.method5404();
                    this.field2563 += var2.field2574;
                }
            } else if (++var2.field3930 > (long) arg0) {
                class221 var3 = new class221(var2.method3982(), var2.field2574);
                this.field2565.method5669(var3, var2.field3937);
                class300.method4847(var3, var2);
                var2.method5407();
                var2.method5404();
            }
        }
    }

    @ObfuscatedName("hh.m()V")
    public void method3965() {
        this.field2562.method4846();
        this.field2565.method5670();
        this.field2563 = this.field2564;
    }
}
