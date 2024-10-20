package deob;

@ObfuscatedName("pu")
public class class394 {

    @ObfuscatedName("pu.am")
    public class489 field4475 = new class489();

    @ObfuscatedName("pu.ap")
    public class489 field4476;

    public class394() {
        this.field4475.field4888 = this.field4475;
        this.field4475.field4890 = this.field4475;
    }

    @ObfuscatedName("pu.am()V")
    public void method6664() {
        while (true) {
            class489 var1 = this.field4475.field4888;
            if (this.field4475 == var1) {
                this.field4476 = null;
                return;
            }
            var1.method7988();
        }
    }

    @ObfuscatedName("pu.ap(Lse;)V")
    public void method6666(class489 arg0) {
        if (arg0.field4890 != null) {
            arg0.method7988();
        }
        arg0.field4890 = this.field4475.field4890;
        arg0.field4888 = this.field4475;
        arg0.field4890.field4888 = arg0;
        arg0.field4888.field4890 = arg0;
    }

    @ObfuscatedName("pu.af(Lse;)V")
    public void method6672(class489 arg0) {
        if (arg0.field4890 != null) {
            arg0.method7988();
        }
        arg0.field4890 = this.field4475;
        arg0.field4888 = this.field4475.field4888;
        arg0.field4890.field4888 = arg0;
        arg0.field4888.field4890 = arg0;
    }

    @ObfuscatedName("pu.aj(Lse;Lse;)V")
    public static void method6667(class489 arg0, class489 arg1) {
        if (arg0.field4890 != null) {
            arg0.method7988();
        }
        arg0.field4890 = arg1.field4890;
        arg0.field4888 = arg1;
        arg0.field4890.field4888 = arg0;
        arg0.field4888.field4890 = arg0;
    }

    @ObfuscatedName("pu.aq()Lse;")
    public class489 method6668() {
        class489 var1 = this.field4475.field4888;
        if (this.field4475 == var1) {
            return null;
        } else {
            var1.method7988();
            return var1;
        }
    }

    @ObfuscatedName("pu.ar()Lse;")
    public class489 method6669() {
        class489 var1 = this.field4475.field4890;
        if (this.field4475 == var1) {
            return null;
        } else {
            var1.method7988();
            return var1;
        }
    }

    @ObfuscatedName("pu.ag()Lse;")
    public class489 method6670() {
        class489 var1 = this.field4475.field4888;
        if (this.field4475 == var1) {
            this.field4476 = null;
            return null;
        } else {
            this.field4476 = var1.field4888;
            return var1;
        }
    }

    @ObfuscatedName("pu.ao()Lse;")
    public class489 method6671() {
        class489 var1 = this.field4475.field4890;
        if (this.field4475 == var1) {
            this.field4476 = null;
            return null;
        } else {
            this.field4476 = var1.field4890;
            return var1;
        }
    }

    @ObfuscatedName("pu.ae()Lse;")
    public class489 method6665() {
        class489 var1 = this.field4476;
        if (this.field4475 == var1) {
            this.field4476 = null;
            return null;
        } else {
            this.field4476 = var1.field4888;
            return var1;
        }
    }

    @ObfuscatedName("pu.aa()Lse;")
    public class489 method6674() {
        class489 var1 = this.field4476;
        if (this.field4475 == var1) {
            this.field4476 = null;
            return null;
        } else {
            this.field4476 = var1.field4890;
            return var1;
        }
    }

    @ObfuscatedName("pu.au()Z")
    public boolean method6683() {
        return this.field4475.field4888 == this.field4475;
    }
}
