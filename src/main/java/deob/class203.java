package deob;

@ObfuscatedName("gs")
public final class class203 {

    @ObfuscatedName("gs.k")
    public class204 field3098 = new class204();

    public class203() {
        this.field3098.field3099 = this.field3098;
        this.field3098.field3100 = this.field3098;
    }

    @ObfuscatedName("gs.k(Lgl;)V")
    public void method3627(class204 arg0) {
        if (arg0.field3100 != null) {
            arg0.method3649();
        }
        arg0.field3100 = this.field3098.field3100;
        arg0.field3099 = this.field3098;
        arg0.field3100.field3099 = arg0;
        arg0.field3099.field3100 = arg0;
    }

    @ObfuscatedName("gs.h(Lgl;)V")
    public void method3629(class204 arg0) {
        if (arg0.field3100 != null) {
            arg0.method3649();
        }
        arg0.field3100 = this.field3098;
        arg0.field3099 = this.field3098.field3099;
        arg0.field3100.field3099 = arg0;
        arg0.field3099.field3100 = arg0;
    }

    @ObfuscatedName("gs.o()Lgl;")
    public class204 method3630() {
        class204 var1 = this.field3098.field3099;
        if (this.field3098 == var1) {
            return null;
        } else {
            var1.method3649();
            return var1;
        }
    }

    @ObfuscatedName("gs.z()Lgl;")
    public class204 method3631() {
        class204 var1 = this.field3098.field3099;
        return this.field3098 == var1 ? null : var1;
    }

    @ObfuscatedName("gs.c()V")
    public void method3633() {
        while (true) {
            class204 var1 = this.field3098.field3099;
            if (this.field3098 == var1) {
                return;
            }
            var1.method3649();
        }
    }
}
