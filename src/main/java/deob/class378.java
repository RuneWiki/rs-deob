package deob;

@ObfuscatedName("ow")
public class class378 {

    @ObfuscatedName("ow.au")
    public class473 field4410 = new class473();

    @ObfuscatedName("ow.ae")
    public class473 field4409;

    public class378() {
        this.field4410.field4813 = this.field4410;
        this.field4410.field4815 = this.field4410;
    }

    @ObfuscatedName("ow.au()V")
    public void method6387() {
        while (true) {
            class473 var1 = this.field4410.field4813;
            if (this.field4410 == var1) {
                this.field4409 = null;
                return;
            }
            var1.method7700();
        }
    }

    @ObfuscatedName("ow.ae(Lsj;)V")
    public void method6405(class473 arg0) {
        if (arg0.field4815 != null) {
            arg0.method7700();
        }
        arg0.field4815 = this.field4410.field4815;
        arg0.field4813 = this.field4410;
        arg0.field4815.field4813 = arg0;
        arg0.field4813.field4815 = arg0;
    }

    @ObfuscatedName("ow.ao(Lsj;)V")
    public void method6407(class473 arg0) {
        if (arg0.field4815 != null) {
            arg0.method7700();
        }
        arg0.field4815 = this.field4410;
        arg0.field4813 = this.field4410.field4813;
        arg0.field4815.field4813 = arg0;
        arg0.field4813.field4815 = arg0;
    }

    @ObfuscatedName("ow.at(Lsj;Lsj;)V")
    public static void method6390(class473 arg0, class473 arg1) {
        if (arg0.field4815 != null) {
            arg0.method7700();
        }
        arg0.field4815 = arg1.field4815;
        arg0.field4813 = arg1;
        arg0.field4815.field4813 = arg0;
        arg0.field4813.field4815 = arg0;
    }

    @ObfuscatedName("ow.ac()Lsj;")
    public class473 method6391() {
        class473 var1 = this.field4410.field4813;
        if (this.field4410 == var1) {
            return null;
        } else {
            var1.method7700();
            return var1;
        }
    }

    @ObfuscatedName("ow.ai()Lsj;")
    public class473 method6392() {
        class473 var1 = this.field4410.field4815;
        if (this.field4410 == var1) {
            return null;
        } else {
            var1.method7700();
            return var1;
        }
    }

    @ObfuscatedName("ow.az()Lsj;")
    public class473 method6393() {
        class473 var1 = this.field4410.field4813;
        if (this.field4410 == var1) {
            this.field4409 = null;
            return null;
        } else {
            this.field4409 = var1.field4813;
            return var1;
        }
    }

    @ObfuscatedName("ow.ap()Lsj;")
    public class473 method6394() {
        class473 var1 = this.field4410.field4815;
        if (this.field4410 == var1) {
            this.field4409 = null;
            return null;
        } else {
            this.field4409 = var1.field4815;
            return var1;
        }
    }

    @ObfuscatedName("ow.aa()Lsj;")
    public class473 method6395() {
        class473 var1 = this.field4409;
        if (this.field4410 == var1) {
            this.field4409 = null;
            return null;
        } else {
            this.field4409 = var1.field4813;
            return var1;
        }
    }

    @ObfuscatedName("ow.af()Lsj;")
    public class473 method6422() {
        class473 var1 = this.field4409;
        if (this.field4410 == var1) {
            this.field4409 = null;
            return null;
        } else {
            this.field4409 = var1.field4815;
            return var1;
        }
    }

    @ObfuscatedName("ow.ad()Z")
    public boolean method6397() {
        return this.field4410.field4813 == this.field4410;
    }
}
