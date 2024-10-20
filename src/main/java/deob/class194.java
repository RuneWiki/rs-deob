package deob;

@ObfuscatedName("gi")
public final class class194 {

    @ObfuscatedName("gi.s")
    public class205 field3089 = new class205();

    @ObfuscatedName("gi.j")
    public int field3090;

    @ObfuscatedName("gi.p")
    public int field3092;

    @ObfuscatedName("gi.x")
    public class197 field3091;

    @ObfuscatedName("gi.d")
    public class204 field3093 = new class204();

    public class194(int arg0) {
        this.field3090 = arg0;
        this.field3092 = arg0;
        int var2;
        for (var2 = 1; var2 + var2 < arg0; var2 += var2) {
        }
        this.field3091 = new class197(var2);
    }

    @ObfuscatedName("gi.s(J)Lgv;")
    public class205 method3484(long arg0) {
        class205 var3 = (class205) this.field3091.method3518(arg0);
        if (var3 != null) {
            this.field3093.method3601(var3);
        }
        return var3;
    }

    @ObfuscatedName("gi.j(J)V")
    public void method3483(long arg0) {
        class205 var3 = (class205) this.field3091.method3518(arg0);
        if (var3 != null) {
            var3.method3639();
            var3.method3617();
            this.field3092++;
        }
    }

    @ObfuscatedName("gi.p(Lgv;J)V")
    public void method3486(class205 arg0, long arg1) {
        if (this.field3092 == 0) {
            class205 var4 = this.field3093.method3612();
            var4.method3639();
            var4.method3617();
            if (this.field3089 == var4) {
                class205 var5 = this.field3093.method3612();
                var5.method3639();
                var5.method3617();
            }
        } else {
            this.field3092--;
        }
        this.field3091.method3519(arg0, arg1);
        this.field3093.method3601(arg0);
    }

    @ObfuscatedName("gi.x()V")
    public void method3491() {
        this.field3093.method3605();
        this.field3091.method3520();
        this.field3089 = new class205();
        this.field3092 = this.field3090;
    }
}
