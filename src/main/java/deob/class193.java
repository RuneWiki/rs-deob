package deob;

@ObfuscatedName("gr")
public final class class193 {

    @ObfuscatedName("gr.v")
    public class204 field3080 = new class204();

    @ObfuscatedName("gr.f")
    public int field3079;

    @ObfuscatedName("gr.i")
    public int field3082;

    @ObfuscatedName("gr.d")
    public class196 field3081;

    @ObfuscatedName("gr.o")
    public class203 field3078 = new class203();

    public class193(int arg0) {
        this.field3079 = arg0;
        this.field3082 = arg0;
        int var2;
        for (var2 = 1; var2 + var2 < arg0; var2 += var2) {
        }
        this.field3081 = new class196(var2);
    }

    @ObfuscatedName("gr.v(J)Lgk;")
    public class204 method3490(long arg0) {
        class204 var3 = (class204) this.field3081.method3524(arg0);
        if (var3 != null) {
            this.field3078.method3614(var3);
        }
        return var3;
    }

    @ObfuscatedName("gr.f(J)V")
    public void method3491(long arg0) {
        class204 var3 = (class204) this.field3081.method3524(arg0);
        if (var3 != null) {
            var3.method3645();
            var3.method3623();
            this.field3082++;
        }
    }

    @ObfuscatedName("gr.i(Lgk;J)V")
    public void method3502(class204 arg0, long arg1) {
        if (this.field3082 == 0) {
            class204 var4 = this.field3078.method3612();
            var4.method3645();
            var4.method3623();
            if (this.field3080 == var4) {
                class204 var5 = this.field3078.method3612();
                var5.method3645();
                var5.method3623();
            }
        } else {
            this.field3082--;
        }
        this.field3081.method3526(arg0, arg1);
        this.field3078.method3614(arg0);
    }

    @ObfuscatedName("gr.d()V")
    public void method3496() {
        this.field3078.method3620();
        this.field3081.method3527();
        this.field3080 = new class204();
        this.field3082 = this.field3079;
    }
}
