package deob;

@ObfuscatedName("go")
public class class186 {

    @ObfuscatedName("go.n")
    public class198 field2980 = new class198();

    @ObfuscatedName("go.d")
    public class198 field2981;

    public class186() {
        this.field2980.field3005 = this.field2980;
        this.field2980.field3006 = this.field2980;
    }

    @ObfuscatedName("go.n(Lgc;)V")
    public void method3439(class198 arg0) {
        if (arg0.field3006 != null) {
            arg0.method3559();
        }
        arg0.field3006 = this.field2980.field3006;
        arg0.field3005 = this.field2980;
        arg0.field3006.field3005 = arg0;
        arg0.field3005.field3006 = arg0;
    }

    @ObfuscatedName("go.d()Lgc;")
    public class198 method3440() {
        class198 var1 = this.field2980.field3005;
        if (this.field2980 == var1) {
            this.field2981 = null;
            return null;
        } else {
            this.field2981 = var1.field3005;
            return var1;
        }
    }

    @ObfuscatedName("go.z()Lgc;")
    public class198 method3438() {
        class198 var1 = this.field2981;
        if (this.field2980 == var1) {
            this.field2981 = null;
            return null;
        } else {
            this.field2981 = var1.field3005;
            return var1;
        }
    }
}
