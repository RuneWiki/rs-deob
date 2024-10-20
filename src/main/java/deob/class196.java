package deob;

@ObfuscatedName("gf")
public class class196 {

    @ObfuscatedName("gf.a")
    public class208 field3098 = new class208();

    @ObfuscatedName("gf.w")
    public class208 field3097;

    public class196() {
        this.field3098.field3123 = this.field3098;
        this.field3098.field3122 = this.field3098;
    }

    @ObfuscatedName("gf.a(Lgh;)V")
    public void method3601(class208 arg0) {
        if (arg0.field3122 != null) {
            arg0.method3733();
        }
        arg0.field3122 = this.field3098.field3122;
        arg0.field3123 = this.field3098;
        arg0.field3122.field3123 = arg0;
        arg0.field3123.field3122 = arg0;
    }

    @ObfuscatedName("gf.w()Lgh;")
    public class208 method3605() {
        class208 var1 = this.field3098.field3123;
        if (this.field3098 == var1) {
            this.field3097 = null;
            return null;
        } else {
            this.field3097 = var1.field3123;
            return var1;
        }
    }

    @ObfuscatedName("gf.d()Lgh;")
    public class208 method3602() {
        class208 var1 = this.field3097;
        if (this.field3098 == var1) {
            this.field3097 = null;
            return null;
        } else {
            this.field3097 = var1.field3123;
            return var1;
        }
    }
}
