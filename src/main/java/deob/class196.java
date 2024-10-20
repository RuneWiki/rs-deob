package deob;

@ObfuscatedName("gi")
public class class196 {

    @ObfuscatedName("gi.j")
    public class208 field3097 = new class208();

    @ObfuscatedName("gi.h")
    public class208 field3096;

    public class196() {
        this.field3097.field3121 = this.field3097;
        this.field3097.field3122 = this.field3097;
    }

    @ObfuscatedName("gi.j(Lgf;)V")
    public void method3495(class208 arg0) {
        if (arg0.field3122 != null) {
            arg0.method3636();
        }
        arg0.field3122 = this.field3097.field3122;
        arg0.field3121 = this.field3097;
        arg0.field3122.field3121 = arg0;
        arg0.field3121.field3122 = arg0;
    }

    @ObfuscatedName("gi.h()Lgf;")
    public class208 method3487() {
        class208 var1 = this.field3097.field3121;
        if (this.field3097 == var1) {
            this.field3096 = null;
            return null;
        } else {
            this.field3096 = var1.field3121;
            return var1;
        }
    }

    @ObfuscatedName("gi.m()Lgf;")
    public class208 method3489() {
        class208 var1 = this.field3096;
        if (this.field3097 == var1) {
            this.field3096 = null;
            return null;
        } else {
            this.field3096 = var1.field3121;
            return var1;
        }
    }
}
