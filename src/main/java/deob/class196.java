package deob;

@ObfuscatedName("go")
public class class196 {

    @ObfuscatedName("go.t")
    public class208 field3098 = new class208();

    @ObfuscatedName("go.i")
    public class208 field3099;

    public class196() {
        this.field3098.field3124 = this.field3098;
        this.field3098.field3123 = this.field3098;
    }

    @ObfuscatedName("go.t(Lgg;)V")
    public void method3476(class208 arg0) {
        if (arg0.field3123 != null) {
            arg0.method3598();
        }
        arg0.field3123 = this.field3098.field3123;
        arg0.field3124 = this.field3098;
        arg0.field3123.field3124 = arg0;
        arg0.field3124.field3123 = arg0;
    }

    @ObfuscatedName("go.i()Lgg;")
    public class208 method3472() {
        class208 var1 = this.field3098.field3124;
        if (this.field3098 == var1) {
            this.field3099 = null;
            return null;
        } else {
            this.field3099 = var1.field3124;
            return var1;
        }
    }

    @ObfuscatedName("go.g()Lgg;")
    public class208 method3474() {
        class208 var1 = this.field3099;
        if (this.field3098 == var1) {
            this.field3099 = null;
            return null;
        } else {
            this.field3099 = var1.field3124;
            return var1;
        }
    }
}
