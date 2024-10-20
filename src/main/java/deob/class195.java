package deob;

@ObfuscatedName("gu")
public class class195 {

    @ObfuscatedName("gu.i")
    public class207 field3073 = new class207();

    @ObfuscatedName("gu.v")
    public class207 field3072;

    public class195() {
        this.field3073.field3097 = this.field3073;
        this.field3073.field3098 = this.field3073;
    }

    @ObfuscatedName("gu.i(Lgs;)V")
    public void method3488(class207 arg0) {
        if (arg0.field3098 != null) {
            arg0.method3620();
        }
        arg0.field3098 = this.field3073.field3098;
        arg0.field3097 = this.field3073;
        arg0.field3098.field3097 = arg0;
        arg0.field3097.field3098 = arg0;
    }

    @ObfuscatedName("gu.v()Lgs;")
    public class207 method3489() {
        class207 var1 = this.field3073.field3097;
        if (this.field3073 == var1) {
            this.field3072 = null;
            return null;
        } else {
            this.field3072 = var1.field3097;
            return var1;
        }
    }

    @ObfuscatedName("gu.r()Lgs;")
    public class207 method3490() {
        class207 var1 = this.field3072;
        if (this.field3073 == var1) {
            this.field3072 = null;
            return null;
        } else {
            this.field3072 = var1.field3097;
            return var1;
        }
    }
}
