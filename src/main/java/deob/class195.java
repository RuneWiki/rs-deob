package deob;

@ObfuscatedName("go")
public class class195 {

    @ObfuscatedName("go.i")
    public class207 field3072 = new class207();

    @ObfuscatedName("go.v")
    public class207 field3071;

    public class195() {
        this.field3072.field3097 = this.field3072;
        this.field3072.field3096 = this.field3072;
    }

    @ObfuscatedName("go.i(Lgn;)V")
    public void method3490(class207 arg0) {
        if (arg0.field3096 != null) {
            arg0.method3621();
        }
        arg0.field3096 = this.field3072.field3096;
        arg0.field3097 = this.field3072;
        arg0.field3096.field3097 = arg0;
        arg0.field3097.field3096 = arg0;
    }

    @ObfuscatedName("go.v()Lgn;")
    public class207 method3494() {
        class207 var1 = this.field3072.field3097;
        if (this.field3072 == var1) {
            this.field3071 = null;
            return null;
        } else {
            this.field3071 = var1.field3097;
            return var1;
        }
    }

    @ObfuscatedName("go.f()Lgn;")
    public class207 method3488() {
        class207 var1 = this.field3071;
        if (this.field3072 == var1) {
            this.field3071 = null;
            return null;
        } else {
            this.field3071 = var1.field3097;
            return var1;
        }
    }
}
