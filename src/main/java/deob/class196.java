package deob;

@ObfuscatedName("ge")
public class class196 {

    @ObfuscatedName("ge.f")
    public class208 field3089 = new class208();

    @ObfuscatedName("ge.u")
    public class208 field3090;

    public class196() {
        this.field3089.field3115 = this.field3089;
        this.field3089.field3114 = this.field3089;
    }

    @ObfuscatedName("ge.f(Lgv;)V")
    public void method3542(class208 arg0) {
        if (arg0.field3114 != null) {
            arg0.method3669();
        }
        arg0.field3114 = this.field3089.field3114;
        arg0.field3115 = this.field3089;
        arg0.field3114.field3115 = arg0;
        arg0.field3115.field3114 = arg0;
    }

    @ObfuscatedName("ge.u()Lgv;")
    public class208 method3543() {
        class208 var1 = this.field3089.field3115;
        if (this.field3089 == var1) {
            this.field3090 = null;
            return null;
        } else {
            this.field3090 = var1.field3115;
            return var1;
        }
    }

    @ObfuscatedName("ge.x()Lgv;")
    public class208 method3550() {
        class208 var1 = this.field3090;
        if (this.field3089 == var1) {
            this.field3090 = null;
            return null;
        } else {
            this.field3090 = var1.field3115;
            return var1;
        }
    }
}
