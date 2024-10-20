package deob;

@ObfuscatedName("gl")
public class class195 {

    @ObfuscatedName("gl.g")
    public class207 field3071 = new class207();

    @ObfuscatedName("gl.b")
    public class207 field3072;

    public class195() {
        this.field3071.field3097 = this.field3071;
        this.field3071.field3096 = this.field3071;
    }

    @ObfuscatedName("gl.g(Lgx;)V")
    public void method3557(class207 arg0) {
        if (arg0.field3096 != null) {
            arg0.method3692();
        }
        arg0.field3096 = this.field3071.field3096;
        arg0.field3097 = this.field3071;
        arg0.field3096.field3097 = arg0;
        arg0.field3097.field3096 = arg0;
    }

    @ObfuscatedName("gl.b()Lgx;")
    public class207 method3558() {
        class207 var1 = this.field3071.field3097;
        if (this.field3071 == var1) {
            this.field3072 = null;
            return null;
        } else {
            this.field3072 = var1.field3097;
            return var1;
        }
    }

    @ObfuscatedName("gl.w()Lgx;")
    public class207 method3560() {
        class207 var1 = this.field3072;
        if (this.field3071 == var1) {
            this.field3072 = null;
            return null;
        } else {
            this.field3072 = var1.field3097;
            return var1;
        }
    }
}
