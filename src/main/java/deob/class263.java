package deob;

@ObfuscatedName("jj")
public class class263 {

    @ObfuscatedName("jj.u")
    public class179 field3542 = new class179();

    @ObfuscatedName("jj.f")
    public class179 field3541;

    public class263() {
        this.field3542.field2123 = this.field3542;
        this.field3542.field2124 = this.field3542;
    }

    @ObfuscatedName("jj.u(Lfd;)V")
    public void method4598(class179 arg0) {
        if (arg0.field2124 != null) {
            arg0.method3326();
        }
        arg0.field2124 = this.field3542.field2124;
        arg0.field2123 = this.field3542;
        arg0.field2124.field2123 = arg0;
        arg0.field2123.field2124 = arg0;
    }

    @ObfuscatedName("jj.f()Lfd;")
    public class179 method4599() {
        class179 var1 = this.field3542.field2123;
        if (this.field3542 == var1) {
            this.field3541 = null;
            return null;
        } else {
            this.field3541 = var1.field2123;
            return var1;
        }
    }

    @ObfuscatedName("jj.b()Lfd;")
    public class179 method4600() {
        class179 var1 = this.field3541;
        if (this.field3542 == var1) {
            this.field3541 = null;
            return null;
        } else {
            this.field3541 = var1.field2123;
            return var1;
        }
    }
}
