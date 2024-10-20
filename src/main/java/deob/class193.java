package deob;

@ObfuscatedName("gk")
public final class class193 {

    @ObfuscatedName("gk.h")
    public class204 field3060 = new class204();

    @ObfuscatedName("gk.q")
    public int field3057;

    @ObfuscatedName("gk.v")
    public int field3059;

    @ObfuscatedName("gk.n")
    public class196 field3058;

    @ObfuscatedName("gk.f")
    public class203 field3061 = new class203();

    public class193(int arg0) {
        this.field3057 = arg0;
        this.field3059 = arg0;
        int var2;
        for (var2 = 1; var2 + var2 < arg0; var2 += var2) {
        }
        this.field3058 = new class196(var2);
    }

    @ObfuscatedName("gk.h(J)Lgo;")
    public class204 method3538(long arg0) {
        class204 var3 = (class204) this.field3058.method3584(arg0);
        if (var3 != null) {
            this.field3061.method3668(var3);
        }
        return var3;
    }

    @ObfuscatedName("gk.q(J)V")
    public void method3542(long arg0) {
        class204 var3 = (class204) this.field3058.method3584(arg0);
        if (var3 != null) {
            var3.method3711();
            var3.method3689();
            this.field3059++;
        }
    }

    @ObfuscatedName("gk.v(Lgo;J)V")
    public void method3540(class204 arg0, long arg1) {
        if (this.field3059 == 0) {
            class204 var4 = this.field3061.method3670();
            var4.method3711();
            var4.method3689();
            if (this.field3060 == var4) {
                class204 var5 = this.field3061.method3670();
                var5.method3711();
                var5.method3689();
            }
        } else {
            this.field3059--;
        }
        this.field3058.method3575(arg0, arg1);
        this.field3061.method3668(arg0);
    }

    @ObfuscatedName("gk.n()V")
    public void method3541() {
        this.field3061.method3678();
        this.field3058.method3576();
        this.field3060 = new class204();
        this.field3059 = this.field3057;
    }
}
