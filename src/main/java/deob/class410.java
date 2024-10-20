package deob;

@ObfuscatedName("pk")
public class class410 {

    @ObfuscatedName("pk.ac")
    public class508 field4677 = new class508();

    @ObfuscatedName("pk.ae")
    public class508 field4676;

    public class410() {
        this.field4677.field5123 = this.field4677;
        this.field4677.field5121 = this.field4677;
    }

    @ObfuscatedName("pk.ac()V")
    public void method7023() {
        while (true) {
            class508 var1 = this.field4677.field5123;
            if (this.field4677 == var1) {
                this.field4676 = null;
                return;
            }
            var1.method8362();
        }
    }

    @ObfuscatedName("pk.ae(Lto;)V")
    public void method7051(class508 arg0) {
        if (arg0.field5121 != null) {
            arg0.method8362();
        }
        arg0.field5121 = this.field4677.field5121;
        arg0.field5123 = this.field4677;
        arg0.field5121.field5123 = arg0;
        arg0.field5123.field5121 = arg0;
    }

    @ObfuscatedName("pk.ag(Lto;)V")
    public void method7025(class508 arg0) {
        if (arg0.field5121 != null) {
            arg0.method8362();
        }
        arg0.field5121 = this.field4677;
        arg0.field5123 = this.field4677.field5123;
        arg0.field5121.field5123 = arg0;
        arg0.field5123.field5121 = arg0;
    }

    @ObfuscatedName("pk.am(Lto;Lto;)V")
    public static void method7026(class508 arg0, class508 arg1) {
        if (arg0.field5121 != null) {
            arg0.method8362();
        }
        arg0.field5121 = arg1.field5121;
        arg0.field5123 = arg1;
        arg0.field5121.field5123 = arg0;
        arg0.field5123.field5121 = arg0;
    }

    @ObfuscatedName("pk.ax()Lto;")
    public class508 method7027() {
        class508 var1 = this.field4677.field5123;
        if (this.field4677 == var1) {
            return null;
        } else {
            var1.method8362();
            return var1;
        }
    }

    @ObfuscatedName("pk.aq()Lto;")
    public class508 method7022() {
        class508 var1 = this.field4677.field5121;
        if (this.field4677 == var1) {
            return null;
        } else {
            var1.method8362();
            return var1;
        }
    }

    @ObfuscatedName("pk.af()Lto;")
    public class508 method7029() {
        class508 var1 = this.field4677.field5123;
        if (this.field4677 == var1) {
            this.field4676 = null;
            return null;
        } else {
            this.field4676 = var1.field5123;
            return var1;
        }
    }

    @ObfuscatedName("pk.at()Lto;")
    public class508 method7028() {
        class508 var1 = this.field4677.field5121;
        if (this.field4677 == var1) {
            this.field4676 = null;
            return null;
        } else {
            this.field4676 = var1.field5121;
            return var1;
        }
    }

    @ObfuscatedName("pk.au()Lto;")
    public class508 method7031() {
        class508 var1 = this.field4676;
        if (this.field4677 == var1) {
            this.field4676 = null;
            return null;
        } else {
            this.field4676 = var1.field5123;
            return var1;
        }
    }

    @ObfuscatedName("pk.ar()Lto;")
    public class508 method7032() {
        class508 var1 = this.field4676;
        if (this.field4677 == var1) {
            this.field4676 = null;
            return null;
        } else {
            this.field4676 = var1.field5121;
            return var1;
        }
    }
}
