package deob;

@ObfuscatedName("gn")
public final class class204 {

    @ObfuscatedName("gn.a")
    public class205 field3113 = new class205();

    public class204() {
        this.field3113.field3115 = this.field3113;
        this.field3113.field3114 = this.field3113;
    }

    @ObfuscatedName("gn.a(Lgi;)V")
    public void method3702(class205 arg0) {
        if (arg0.field3114 != null) {
            arg0.method3718();
        }
        arg0.field3114 = this.field3113.field3114;
        arg0.field3115 = this.field3113;
        arg0.field3114.field3115 = arg0;
        arg0.field3115.field3114 = arg0;
    }

    @ObfuscatedName("gn.w(Lgi;)V")
    public void method3703(class205 arg0) {
        if (arg0.field3114 != null) {
            arg0.method3718();
        }
        arg0.field3114 = this.field3113;
        arg0.field3115 = this.field3113.field3115;
        arg0.field3114.field3115 = arg0;
        arg0.field3115.field3114 = arg0;
    }

    @ObfuscatedName("gn.d()Lgi;")
    public class205 method3716() {
        class205 var1 = this.field3113.field3115;
        if (this.field3113 == var1) {
            return null;
        } else {
            var1.method3718();
            return var1;
        }
    }

    @ObfuscatedName("gn.c()Lgi;")
    public class205 method3705() {
        class205 var1 = this.field3113.field3115;
        return this.field3113 == var1 ? null : var1;
    }

    @ObfuscatedName("gn.y()V")
    public void method3706() {
        while (true) {
            class205 var1 = this.field3113.field3115;
            if (this.field3113 == var1) {
                return;
            }
            var1.method3718();
        }
    }
}
