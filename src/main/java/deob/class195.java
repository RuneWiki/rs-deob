package deob;

@ObfuscatedName("gm")
public class class195 {

    @ObfuscatedName("gm.h")
    public class207 field3073 = new class207();

    @ObfuscatedName("gm.m")
    public class207 field3074;

    public class195() {
        this.field3073.field3098 = this.field3073;
        this.field3073.field3099 = this.field3073;
    }

    @ObfuscatedName("gm.h(Lgj;)V")
    public void method3500(class207 arg0) {
        if (arg0.field3099 != null) {
            arg0.method3624();
        }
        arg0.field3099 = this.field3073.field3099;
        arg0.field3098 = this.field3073;
        arg0.field3099.field3098 = arg0;
        arg0.field3098.field3099 = arg0;
    }

    @ObfuscatedName("gm.m()Lgj;")
    public class207 method3501() {
        class207 var1 = this.field3073.field3098;
        if (this.field3073 == var1) {
            this.field3074 = null;
            return null;
        } else {
            this.field3074 = var1.field3098;
            return var1;
        }
    }

    @ObfuscatedName("gm.i()Lgj;")
    public class207 method3502() {
        class207 var1 = this.field3074;
        if (this.field3073 == var1) {
            this.field3074 = null;
            return null;
        } else {
            this.field3074 = var1.field3098;
            return var1;
        }
    }
}
