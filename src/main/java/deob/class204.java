package deob;

@ObfuscatedName("gn")
public final class class204 {

    @ObfuscatedName("gn.j")
    public class205 field3112 = new class205();

    public class204() {
        this.field3112.field3113 = this.field3112;
        this.field3112.field3114 = this.field3112;
    }

    @ObfuscatedName("gn.j(Lgt;)V")
    public void method3600(class205 arg0) {
        if (arg0.field3114 != null) {
            arg0.method3619();
        }
        arg0.field3114 = this.field3112.field3114;
        arg0.field3113 = this.field3112;
        arg0.field3114.field3113 = arg0;
        arg0.field3113.field3114 = arg0;
    }

    @ObfuscatedName("gn.h(Lgt;)V")
    public void method3611(class205 arg0) {
        if (arg0.field3114 != null) {
            arg0.method3619();
        }
        arg0.field3114 = this.field3112;
        arg0.field3113 = this.field3112.field3113;
        arg0.field3114.field3113 = arg0;
        arg0.field3113.field3114 = arg0;
    }

    @ObfuscatedName("gn.m()Lgt;")
    public class205 method3608() {
        class205 var1 = this.field3112.field3113;
        if (this.field3112 == var1) {
            return null;
        } else {
            var1.method3619();
            return var1;
        }
    }

    @ObfuscatedName("gn.z()Lgt;")
    public class205 method3604() {
        class205 var1 = this.field3112.field3113;
        return this.field3112 == var1 ? null : var1;
    }

    @ObfuscatedName("gn.x()V")
    public void method3605() {
        while (true) {
            class205 var1 = this.field3112.field3113;
            if (this.field3112 == var1) {
                return;
            }
            var1.method3619();
        }
    }
}
