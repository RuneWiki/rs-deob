package deob;

@ObfuscatedName("fp")
public class class172 {

    @ObfuscatedName("fp.u")
    public class177 field2792 = new class177();

    @ObfuscatedName("fp.k")
    public class177 field2793;

    public class172() {
        this.field2792.field2804 = this.field2792;
        this.field2792.field2805 = this.field2792;
    }

    @ObfuscatedName("fp.u(Lfd;)V")
    public void method3289(class177 arg0) {
        if (arg0.field2805 != null) {
            arg0.method3356();
        }
        arg0.field2805 = this.field2792.field2805;
        arg0.field2804 = this.field2792;
        arg0.field2805.field2804 = arg0;
        arg0.field2804.field2805 = arg0;
    }

    @ObfuscatedName("fp.k()Lfd;")
    public class177 method3290() {
        class177 var1 = this.field2792.field2804;
        if (this.field2792 == var1) {
            this.field2793 = null;
            return null;
        } else {
            this.field2793 = var1.field2804;
            return var1;
        }
    }

    @ObfuscatedName("fp.x()Lfd;")
    public class177 method3291() {
        class177 var1 = this.field2793;
        if (this.field2792 == var1) {
            this.field2793 = null;
            return null;
        } else {
            this.field2793 = var1.field2804;
            return var1;
        }
    }
}
