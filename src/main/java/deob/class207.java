package deob;

@ObfuscatedName("gd")
public final class class207 {

    @ObfuscatedName("gd.m")
    public class208 field3156 = new class208();

    public class207() {
        this.field3156.field3157 = this.field3156;
        this.field3156.field3158 = this.field3156;
    }

    @ObfuscatedName("gd.m(Lgs;)V")
    public void method3685(class208 arg0) {
        if (arg0.field3158 != null) {
            arg0.method3699();
        }
        arg0.field3158 = this.field3156.field3158;
        arg0.field3157 = this.field3156;
        arg0.field3158.field3157 = arg0;
        arg0.field3157.field3158 = arg0;
    }

    @ObfuscatedName("gd.w(Lgs;)V")
    public void method3681(class208 arg0) {
        if (arg0.field3158 != null) {
            arg0.method3699();
        }
        arg0.field3158 = this.field3156;
        arg0.field3157 = this.field3156.field3157;
        arg0.field3158.field3157 = arg0;
        arg0.field3157.field3158 = arg0;
    }

    @ObfuscatedName("gd.e()Lgs;")
    public class208 method3680() {
        class208 var1 = this.field3156.field3157;
        if (this.field3156 == var1) {
            return null;
        } else {
            var1.method3699();
            return var1;
        }
    }

    @ObfuscatedName("gd.o()Lgs;")
    public class208 method3683() {
        class208 var1 = this.field3156.field3157;
        return this.field3156 == var1 ? null : var1;
    }

    @ObfuscatedName("gd.g()V")
    public void method3679() {
        while (true) {
            class208 var1 = this.field3156.field3157;
            if (this.field3156 == var1) {
                return;
            }
            var1.method3699();
        }
    }
}
