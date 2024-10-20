package deob;

@ObfuscatedName("ge")
public final class class204 {

    @ObfuscatedName("ge.s")
    public class205 field3114 = new class205();

    public class204() {
        this.field3114.field3115 = this.field3114;
        this.field3114.field3116 = this.field3114;
    }

    @ObfuscatedName("ge.s(Lgv;)V")
    public void method3601(class205 arg0) {
        if (arg0.field3116 != null) {
            arg0.method3617();
        }
        arg0.field3116 = this.field3114.field3116;
        arg0.field3115 = this.field3114;
        arg0.field3116.field3115 = arg0;
        arg0.field3115.field3116 = arg0;
    }

    @ObfuscatedName("ge.j(Lgv;)V")
    public void method3602(class205 arg0) {
        if (arg0.field3116 != null) {
            arg0.method3617();
        }
        arg0.field3116 = this.field3114;
        arg0.field3115 = this.field3114.field3115;
        arg0.field3116.field3115 = arg0;
        arg0.field3115.field3116 = arg0;
    }

    @ObfuscatedName("ge.p()Lgv;")
    public class205 method3612() {
        class205 var1 = this.field3114.field3115;
        if (this.field3114 == var1) {
            return null;
        } else {
            var1.method3617();
            return var1;
        }
    }

    @ObfuscatedName("ge.x()Lgv;")
    public class205 method3604() {
        class205 var1 = this.field3114.field3115;
        return this.field3114 == var1 ? null : var1;
    }

    @ObfuscatedName("ge.d()V")
    public void method3605() {
        while (true) {
            class205 var1 = this.field3114.field3115;
            if (this.field3114 == var1) {
                return;
            }
            var1.method3617();
        }
    }
}
