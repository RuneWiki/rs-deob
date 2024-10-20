package deob;

@ObfuscatedName("ho")
public final class class214 {

    @ObfuscatedName("ho.g")
    public int field2648;

    @ObfuscatedName("ho.e")
    public int field2650;

    @ObfuscatedName("ho.b")
    public class210 field2647;

    @ObfuscatedName("ho.z")
    public class228 field2649 = new class228();

    public class214(int arg0, int arg1) {
        this.field2648 = arg0;
        this.field2650 = arg0;
        int var3;
        for (var3 = 1; var3 + var3 < arg0 && var3 < arg1; var3 += var3) {
        }
        this.field2647 = new class210(var3);
    }

    @ObfuscatedName("ho.g(J)Ljava/lang/Object;")
    public Object method3717(long arg0) {
        class225 var3 = (class225) this.field2647.method3674(arg0);
        if (var3 == null) {
            return null;
        }
        Object var4 = var3.method3669();
        if (var4 == null) {
            var3.method3796();
            var3.method3840();
            this.field2650 += var3.field2676;
            return null;
        }
        if (var3.method3672()) {
            class209 var5 = new class209(var4, var3.field2676);
            this.field2647.method3683(var5, var3.field2660);
            this.field2649.method3900(var5);
            var5.field2663 = 0L;
            var3.method3796();
            var3.method3840();
        } else {
            this.field2649.method3900(var3);
            var3.field2663 = 0L;
        }
        return var4;
    }

    @ObfuscatedName("ho.e(J)V")
    public void method3718(long arg0) {
        class225 var3 = (class225) this.field2647.method3674(arg0);
        this.method3719(var3);
    }

    @ObfuscatedName("ho.b(Lhz;)V")
    public void method3719(class225 arg0) {
        if (arg0 != null) {
            arg0.method3796();
            arg0.method3840();
            this.field2650 += arg0.field2676;
        }
    }

    @ObfuscatedName("ho.z(Ljava/lang/Object;J)V")
    public void method3723(Object arg0, long arg1) {
        this.method3716(arg0, arg1, 1);
    }

    @ObfuscatedName("ho.n(Ljava/lang/Object;JI)V")
    public void method3716(Object arg0, long arg1, int arg2) {
        if (arg2 > this.field2648) {
            throw new IllegalStateException();
        }
        this.method3718(arg1);
        this.field2650 -= arg2;
        while (this.field2650 < 0) {
            class225 var5 = (class225) this.field2649.method3880();
            this.method3719(var5);
        }
        class209 var6 = new class209(arg0, arg2);
        this.field2647.method3683(var6, arg1);
        this.field2649.method3900(var6);
        var6.field2663 = 0L;
    }

    @ObfuscatedName("ho.l(I)V")
    public void method3721(int arg0) {
        for (class225 var2 = (class225) this.field2649.method3881(); var2 != null; var2 = (class225) this.field2649.method3886()) {
            if (var2.method3672()) {
                if (var2.method3669() == null) {
                    var2.method3796();
                    var2.method3840();
                    this.field2650 += var2.field2676;
                }
            } else if (++var2.field2663 > (long) arg0) {
                class220 var3 = new class220(var2.method3669(), var2.field2676);
                this.field2647.method3683(var3, var2.field2660);
                class207.method3659(var3, var2);
                var2.method3796();
                var2.method3840();
            }
        }
    }

    @ObfuscatedName("ho.s()V")
    public void method3728() {
        this.field2649.method3901();
        this.field2647.method3676();
        this.field2650 = this.field2648;
    }
}
