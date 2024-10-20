package deob;

@ObfuscatedName("ge")
public class class196 {

    @ObfuscatedName("ge.w")
    public class208 field3098 = new class208();

    @ObfuscatedName("ge.x")
    public class208 field3097;

    public class196() {
        this.field3098.field3122 = this.field3098;
        this.field3098.field3123 = this.field3098;
    }

    @ObfuscatedName("ge.w(Lgv;)V")
    public void method3546(class208 arg0) {
        if (arg0.field3123 != null) {
            arg0.method3678();
        }
        arg0.field3123 = this.field3098.field3123;
        arg0.field3122 = this.field3098;
        arg0.field3123.field3122 = arg0;
        arg0.field3122.field3123 = arg0;
    }

    @ObfuscatedName("ge.x()Lgv;")
    public class208 method3547() {
        class208 var1 = this.field3098.field3122;
        if (this.field3098 == var1) {
            this.field3097 = null;
            return null;
        } else {
            this.field3097 = var1.field3122;
            return var1;
        }
    }

    @ObfuscatedName("ge.t()Lgv;")
    public class208 method3550() {
        class208 var1 = this.field3097;
        if (this.field3098 == var1) {
            this.field3097 = null;
            return null;
        } else {
            this.field3097 = var1.field3122;
            return var1;
        }
    }
}
