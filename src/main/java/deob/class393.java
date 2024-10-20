package deob;

@ObfuscatedName("pf")
public class class393 {

    @ObfuscatedName("pf.ac")
    public class488 field4458 = new class488();

    @ObfuscatedName("pf.al")
    public class488 field4459;

    public class393() {
        this.field4458.field4856 = this.field4458;
        this.field4458.field4858 = this.field4458;
    }

    @ObfuscatedName("pf.ac()V")
    public void method6534() {
        while (true) {
            class488 var1 = this.field4458.field4856;
            if (this.field4458 == var1) {
                this.field4459 = null;
                return;
            }
            var1.method7776();
        }
    }

    @ObfuscatedName("pf.al(Lsj;)V")
    public void method6526(class488 arg0) {
        if (arg0.field4858 != null) {
            arg0.method7776();
        }
        arg0.field4858 = this.field4458.field4858;
        arg0.field4856 = this.field4458;
        arg0.field4858.field4856 = arg0;
        arg0.field4856.field4858 = arg0;
    }

    @ObfuscatedName("pf.ak(Lsj;)V")
    public void method6535(class488 arg0) {
        if (arg0.field4858 != null) {
            arg0.method7776();
        }
        arg0.field4858 = this.field4458;
        arg0.field4856 = this.field4458.field4856;
        arg0.field4858.field4856 = arg0;
        arg0.field4856.field4858 = arg0;
    }

    @ObfuscatedName("pf.ax(Lsj;Lsj;)V")
    public static void method6555(class488 arg0, class488 arg1) {
        if (arg0.field4858 != null) {
            arg0.method7776();
        }
        arg0.field4858 = arg1.field4858;
        arg0.field4856 = arg1;
        arg0.field4858.field4856 = arg0;
        arg0.field4856.field4858 = arg0;
    }

    @ObfuscatedName("pf.ao()Lsj;")
    public class488 method6531() {
        class488 var1 = this.field4458.field4856;
        if (this.field4458 == var1) {
            return null;
        } else {
            var1.method7776();
            return var1;
        }
    }

    @ObfuscatedName("pf.ah()Lsj;")
    public class488 method6533() {
        class488 var1 = this.field4458.field4858;
        if (this.field4458 == var1) {
            return null;
        } else {
            var1.method7776();
            return var1;
        }
    }

    @ObfuscatedName("pf.ar()Lsj;")
    public class488 method6532() {
        class488 var1 = this.field4458.field4856;
        if (this.field4458 == var1) {
            this.field4459 = null;
            return null;
        } else {
            this.field4459 = var1.field4856;
            return var1;
        }
    }

    @ObfuscatedName("pf.ab()Lsj;")
    public class488 method6527() {
        class488 var1 = this.field4458.field4858;
        if (this.field4458 == var1) {
            this.field4459 = null;
            return null;
        } else {
            this.field4459 = var1.field4858;
            return var1;
        }
    }

    @ObfuscatedName("pf.am()Lsj;")
    public class488 method6543() {
        class488 var1 = this.field4459;
        if (this.field4458 == var1) {
            this.field4459 = null;
            return null;
        } else {
            this.field4459 = var1.field4856;
            return var1;
        }
    }

    @ObfuscatedName("pf.av()Lsj;")
    public class488 method6530() {
        class488 var1 = this.field4459;
        if (this.field4458 == var1) {
            this.field4459 = null;
            return null;
        } else {
            this.field4459 = var1.field4858;
            return var1;
        }
    }

    @ObfuscatedName("pf.ag()Z")
    public boolean method6559() {
        return this.field4458.field4856 == this.field4458;
    }
}
