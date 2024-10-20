package deob;

@ObfuscatedName("gf")
public final class class193 {

    @ObfuscatedName("gf.i")
    public class204 field3064 = new class204();

    @ObfuscatedName("gf.v")
    public int field3063;

    @ObfuscatedName("gf.f")
    public int field3066;

    @ObfuscatedName("gf.h")
    public class196 field3062;

    @ObfuscatedName("gf.a")
    public class203 field3065 = new class203();

    public class193(int arg0) {
        this.field3063 = arg0;
        this.field3066 = arg0;
        int var2;
        for (var2 = 1; var2 + var2 < arg0; var2 += var2) {
        }
        this.field3062 = new class196(var2);
    }

    @ObfuscatedName("gf.i(J)Lgr;")
    public class204 method3467(long arg0) {
        class204 var3 = (class204) this.field3062.method3509(arg0);
        if (var3 != null) {
            this.field3065.method3595(var3);
        }
        return var3;
    }

    @ObfuscatedName("gf.v(J)V")
    public void method3476(long arg0) {
        class204 var3 = (class204) this.field3062.method3509(arg0);
        if (var3 != null) {
            var3.method3624();
            var3.method3605();
            this.field3066++;
        }
    }

    @ObfuscatedName("gf.f(Lgr;J)V")
    public void method3466(class204 arg0, long arg1) {
        if (this.field3066 == 0) {
            class204 var4 = this.field3065.method3594();
            var4.method3624();
            var4.method3605();
            if (this.field3064 == var4) {
                class204 var5 = this.field3065.method3594();
                var5.method3624();
                var5.method3605();
            }
        } else {
            this.field3066--;
        }
        this.field3062.method3495(arg0, arg1);
        this.field3065.method3595(arg0);
    }

    @ObfuscatedName("gf.h()V")
    public void method3464() {
        this.field3065.method3590();
        this.field3062.method3498();
        this.field3064 = new class204();
        this.field3066 = this.field3063;
    }
}
