package deob;

@ObfuscatedName("jk")
public class class273 {

    @ObfuscatedName("jk.x")
    public class188 field3535 = new class188();

    @ObfuscatedName("jk.m")
    public class188 field3536;

    public class273() {
        this.field3535.field2114 = this.field3535;
        this.field3535.field2113 = this.field3535;
    }

    @ObfuscatedName("jk.x(Lgt;)V")
    public void method4588(class188 arg0) {
        if (arg0.field2113 != null) {
            arg0.method3352();
        }
        arg0.field2113 = this.field3535.field2113;
        arg0.field2114 = this.field3535;
        arg0.field2113.field2114 = arg0;
        arg0.field2114.field2113 = arg0;
    }

    @ObfuscatedName("jk.m()Lgt;")
    public class188 method4593() {
        class188 var1 = this.field3535.field2114;
        if (this.field3535 == var1) {
            this.field3536 = null;
            return null;
        } else {
            this.field3536 = var1.field2114;
            return var1;
        }
    }

    @ObfuscatedName("jk.k()Lgt;")
    public class188 method4589() {
        class188 var1 = this.field3536;
        if (this.field3535 == var1) {
            this.field3536 = null;
            return null;
        } else {
            this.field3536 = var1.field2114;
            return var1;
        }
    }
}
