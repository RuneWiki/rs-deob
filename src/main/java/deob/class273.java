package deob;

@ObfuscatedName("ja")
public final class class273 {

    @ObfuscatedName("ja.f")
    public class435 field3047 = new class435();

    @ObfuscatedName("ja.w")
    public int field3046;

    @ObfuscatedName("ja.v")
    public int field3049;

    @ObfuscatedName("ja.s")
    public class450 field3048;

    @ObfuscatedName("ja.z")
    public class361 field3045 = new class361();

    public class273(int arg0) {
        this.field3046 = arg0;
        this.field3049 = arg0;
        int var2;
        for (var2 = 1; var2 + var2 < arg0; var2 += var2) {
        }
        this.field3048 = new class450(var2);
    }

    @ObfuscatedName("ja.f(J)Lpi;")
    public class435 method5028(long arg0) {
        class435 var3 = (class435) this.field3048.method7691(arg0);
        if (var3 != null) {
            this.field3045.method6371(var3);
        }
        return var3;
    }

    @ObfuscatedName("ja.w(J)V")
    public void method5029(long arg0) {
        class435 var3 = (class435) this.field3048.method7691(arg0);
        if (var3 != null) {
            var3.method7431();
            var3.method7429();
            this.field3049++;
        }
    }

    @ObfuscatedName("ja.v(Lpi;J)V")
    public void method5027(class435 arg0, long arg1) {
        if (this.field3049 == 0) {
            class435 var4 = this.field3045.method6373();
            var4.method7431();
            var4.method7429();
            if (this.field3047 == var4) {
                class435 var5 = this.field3045.method6373();
                var5.method7431();
                var5.method7429();
            }
        } else {
            this.field3049--;
        }
        this.field3048.method7693(arg0, arg1);
        this.field3045.method6371(arg0);
    }

    @ObfuscatedName("ja.s()V")
    public void method5033() {
        this.field3045.method6370();
        this.field3048.method7698();
        this.field3047 = new class435();
        this.field3049 = this.field3046;
    }
}
