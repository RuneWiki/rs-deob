package deob;

@ObfuscatedName("go")
public class class196 {

    @ObfuscatedName("go.s")
    public class208 field3098 = new class208();

    @ObfuscatedName("go.j")
    public class208 field3099;

    public class196() {
        this.field3098.field3123 = this.field3098;
        this.field3098.field3124 = this.field3098;
    }

    @ObfuscatedName("go.s(Lgt;)V")
    public void method3504(class208 arg0) {
        if (arg0.field3124 != null) {
            arg0.method3635();
        }
        arg0.field3124 = this.field3098.field3124;
        arg0.field3123 = this.field3098;
        arg0.field3124.field3123 = arg0;
        arg0.field3123.field3124 = arg0;
    }

    @ObfuscatedName("go.j()Lgt;")
    public class208 method3505() {
        class208 var1 = this.field3098.field3123;
        if (this.field3098 == var1) {
            this.field3099 = null;
            return null;
        } else {
            this.field3099 = var1.field3123;
            return var1;
        }
    }

    @ObfuscatedName("go.p()Lgt;")
    public class208 method3506() {
        class208 var1 = this.field3099;
        if (this.field3098 == var1) {
            this.field3099 = null;
            return null;
        } else {
            this.field3099 = var1.field3123;
            return var1;
        }
    }
}
