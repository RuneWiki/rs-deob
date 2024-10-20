package deob;

@ObfuscatedName("pr")
public class class397 {

    @ObfuscatedName("pr.aq")
    public class492 field4517 = new class492();

    @ObfuscatedName("pr.aw")
    public class492 field4518;

    public class397() {
        this.field4517.field4918 = this.field4517;
        this.field4517.field4919 = this.field4517;
    }

    @ObfuscatedName("pr.aq()V")
    public void method6677() {
        while (true) {
            class492 var1 = this.field4517.field4918;
            if (this.field4517 == var1) {
                this.field4518 = null;
                return;
            }
            var1.method7996();
        }
    }

    @ObfuscatedName("pr.aw(Lse;)V")
    public void method6678(class492 arg0) {
        if (arg0.field4919 != null) {
            arg0.method7996();
        }
        arg0.field4919 = this.field4517.field4919;
        arg0.field4918 = this.field4517;
        arg0.field4919.field4918 = arg0;
        arg0.field4918.field4919 = arg0;
    }

    @ObfuscatedName("pr.al(Lse;)V")
    public void method6686(class492 arg0) {
        if (arg0.field4919 != null) {
            arg0.method7996();
        }
        arg0.field4919 = this.field4517;
        arg0.field4918 = this.field4517.field4918;
        arg0.field4919.field4918 = arg0;
        arg0.field4918.field4919 = arg0;
    }

    @ObfuscatedName("pr.ai(Lse;Lse;)V")
    public static void method6718(class492 arg0, class492 arg1) {
        if (arg0.field4919 != null) {
            arg0.method7996();
        }
        arg0.field4919 = arg1.field4919;
        arg0.field4918 = arg1;
        arg0.field4919.field4918 = arg0;
        arg0.field4918.field4919 = arg0;
    }

    @ObfuscatedName("pr.ar()Lse;")
    public class492 method6681() {
        class492 var1 = this.field4517.field4918;
        if (this.field4517 == var1) {
            return null;
        } else {
            var1.method7996();
            return var1;
        }
    }

    @ObfuscatedName("pr.as()Lse;")
    public class492 method6682() {
        class492 var1 = this.field4517.field4919;
        if (this.field4517 == var1) {
            return null;
        } else {
            var1.method7996();
            return var1;
        }
    }

    @ObfuscatedName("pr.aa()Lse;")
    public class492 method6702() {
        class492 var1 = this.field4517.field4918;
        if (this.field4517 == var1) {
            this.field4518 = null;
            return null;
        } else {
            this.field4518 = var1.field4918;
            return var1;
        }
    }

    @ObfuscatedName("pr.az()Lse;")
    public class492 method6695() {
        class492 var1 = this.field4517.field4919;
        if (this.field4517 == var1) {
            this.field4518 = null;
            return null;
        } else {
            this.field4518 = var1.field4919;
            return var1;
        }
    }

    @ObfuscatedName("pr.ao()Lse;")
    public class492 method6684() {
        class492 var1 = this.field4518;
        if (this.field4517 == var1) {
            this.field4518 = null;
            return null;
        } else {
            this.field4518 = var1.field4918;
            return var1;
        }
    }

    @ObfuscatedName("pr.au()Lse;")
    public class492 method6685() {
        class492 var1 = this.field4518;
        if (this.field4517 == var1) {
            this.field4518 = null;
            return null;
        } else {
            this.field4518 = var1.field4919;
            return var1;
        }
    }

    @ObfuscatedName("pr.ak()Z")
    public boolean method6715() {
        return this.field4517.field4918 == this.field4517;
    }
}
