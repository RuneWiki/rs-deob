package deob;

@ObfuscatedName("gl")
public final class class193 {

    @ObfuscatedName("gl.z")
    public class204 field3065 = new class204();

    @ObfuscatedName("gl.q")
    public int field3066;

    @ObfuscatedName("gl.k")
    public int field3067;

    @ObfuscatedName("gl.f")
    public class196 field3068;

    @ObfuscatedName("gl.d")
    public class203 field3069 = new class203();

    public class193(int arg0) {
        this.field3066 = arg0;
        this.field3067 = arg0;
        int var2;
        for (var2 = 1; var2 + var2 < arg0; var2 += var2) {
        }
        this.field3068 = new class196(var2);
    }

    @ObfuscatedName("gl.z(J)Lgx;")
    public class204 method3439(long arg0) {
        class204 var3 = (class204) this.field3068.method3462(arg0);
        if (var3 != null) {
            this.field3069.method3556(var3);
        }
        return var3;
    }

    @ObfuscatedName("gl.q(J)V")
    public void method3428(long arg0) {
        class204 var3 = (class204) this.field3068.method3462(arg0);
        if (var3 != null) {
            var3.method3583();
            var3.method3565();
            this.field3067++;
        }
    }

    @ObfuscatedName("gl.k(Lgx;J)V")
    public void method3429(class204 arg0, long arg1) {
        if (this.field3067 == 0) {
            class204 var4 = this.field3069.method3561();
            var4.method3583();
            var4.method3565();
            if (this.field3065 == var4) {
                class204 var5 = this.field3069.method3561();
                var5.method3583();
                var5.method3565();
            }
        } else {
            this.field3067--;
        }
        this.field3068.method3470(arg0, arg1);
        this.field3069.method3556(arg0);
    }

    @ObfuscatedName("gl.f()V")
    public void method3430() {
        this.field3069.method3546();
        this.field3068.method3476();
        this.field3065 = new class204();
        this.field3067 = this.field3066;
    }
}
