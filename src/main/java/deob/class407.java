package deob;

@ObfuscatedName("pr")
public class class407 {

    @ObfuscatedName("pr.aq")
    public class505 field4655 = new class505();

    @ObfuscatedName("pr.ad")
    public class505 field4654;

    public class407() {
        this.field4655.field5083 = this.field4655;
        this.field4655.field5081 = this.field4655;
    }

    @ObfuscatedName("pr.aq()V")
    public void method6806() {
        while (true) {
            class505 var1 = this.field4655.field5083;
            if (this.field4655 == var1) {
                this.field4654 = null;
                return;
            }
            var1.method8130();
        }
    }

    @ObfuscatedName("pr.ad(Ltz;)V")
    public void method6794(class505 arg0) {
        if (arg0.field5081 != null) {
            arg0.method8130();
        }
        arg0.field5081 = this.field4655.field5081;
        arg0.field5083 = this.field4655;
        arg0.field5081.field5083 = arg0;
        arg0.field5083.field5081 = arg0;
    }

    @ObfuscatedName("pr.ag(Ltz;)V")
    public void method6793(class505 arg0) {
        if (arg0.field5081 != null) {
            arg0.method8130();
        }
        arg0.field5081 = this.field4655;
        arg0.field5083 = this.field4655.field5083;
        arg0.field5081.field5083 = arg0;
        arg0.field5083.field5081 = arg0;
    }

    @ObfuscatedName("pr.ak(Ltz;Ltz;)V")
    public static void method6791(class505 arg0, class505 arg1) {
        if (arg0.field5081 != null) {
            arg0.method8130();
        }
        arg0.field5081 = arg1.field5081;
        arg0.field5083 = arg1;
        arg0.field5081.field5083 = arg0;
        arg0.field5083.field5081 = arg0;
    }

    @ObfuscatedName("pr.ap()Ltz;")
    public class505 method6795() {
        class505 var1 = this.field4655.field5083;
        if (this.field4655 == var1) {
            return null;
        } else {
            var1.method8130();
            return var1;
        }
    }

    @ObfuscatedName("pr.an()Ltz;")
    public class505 method6796() {
        class505 var1 = this.field4655.field5081;
        if (this.field4655 == var1) {
            return null;
        } else {
            var1.method8130();
            return var1;
        }
    }

    @ObfuscatedName("pr.aj()Ltz;")
    public class505 method6814() {
        class505 var1 = this.field4655.field5083;
        if (this.field4655 == var1) {
            this.field4654 = null;
            return null;
        } else {
            this.field4654 = var1.field5083;
            return var1;
        }
    }

    @ObfuscatedName("pr.av()Ltz;")
    public class505 method6798() {
        class505 var1 = this.field4655.field5081;
        if (this.field4655 == var1) {
            this.field4654 = null;
            return null;
        } else {
            this.field4654 = var1.field5081;
            return var1;
        }
    }

    @ObfuscatedName("pr.ab()Ltz;")
    public class505 method6799() {
        class505 var1 = this.field4654;
        if (this.field4655 == var1) {
            this.field4654 = null;
            return null;
        } else {
            this.field4654 = var1.field5083;
            return var1;
        }
    }

    @ObfuscatedName("pr.ai()Ltz;")
    public class505 method6800() {
        class505 var1 = this.field4654;
        if (this.field4655 == var1) {
            this.field4654 = null;
            return null;
        } else {
            this.field4654 = var1.field5081;
            return var1;
        }
    }

    @ObfuscatedName("pr.ae()Z")
    public boolean method6801() {
        return this.field4655.field5083 == this.field4655;
    }
}
