package deob;

@ObfuscatedName("gl")
public final class class193 {

    @ObfuscatedName("gl.j")
    public class204 field3067 = new class204();

    @ObfuscatedName("gl.m")
    public int field3068;

    @ObfuscatedName("gl.f")
    public int field3069;

    @ObfuscatedName("gl.l")
    public class196 field3070;

    @ObfuscatedName("gl.u")
    public class203 field3071 = new class203();

    public class193(int arg0) {
        this.field3068 = arg0;
        this.field3069 = arg0;
        int var2;
        for (var2 = 1; var2 + var2 < arg0; var2 += var2) {
        }
        this.field3070 = new class196(var2);
    }

    @ObfuscatedName("gl.j(J)Lgx;")
    public class204 method3543(long arg0) {
        class204 var3 = (class204) this.field3070.method3571(arg0);
        if (var3 != null) {
            this.field3071.method3669(var3);
        }
        return var3;
    }

    @ObfuscatedName("gl.m(J)V")
    public void method3539(long arg0) {
        class204 var3 = (class204) this.field3070.method3571(arg0);
        if (var3 != null) {
            var3.method3700();
            var3.method3680();
            this.field3069++;
        }
    }

    @ObfuscatedName("gl.f(Lgx;J)V")
    public void method3540(class204 arg0, long arg1) {
        if (this.field3069 == 0) {
            class204 var4 = this.field3071.method3662();
            var4.method3700();
            var4.method3680();
            if (this.field3067 == var4) {
                class204 var5 = this.field3071.method3662();
                var5.method3700();
                var5.method3680();
            }
        } else {
            this.field3069--;
        }
        this.field3070.method3574(arg0, arg1);
        this.field3071.method3669(arg0);
    }

    @ObfuscatedName("gl.l()V")
    public void method3541() {
        this.field3071.method3660();
        this.field3070.method3573();
        this.field3067 = new class204();
        this.field3069 = this.field3068;
    }
}
