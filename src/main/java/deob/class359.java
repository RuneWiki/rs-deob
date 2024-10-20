package deob;

@ObfuscatedName("nj")
public class class359 {

    @ObfuscatedName("nj.aj")
    public class444 field4318 = new class444();

    @ObfuscatedName("nj.al")
    public class444 field4319;

    public class359() {
        this.field4318.field4672 = this.field4318;
        this.field4318.field4674 = this.field4318;
    }

    @ObfuscatedName("nj.aj()V")
    public void method6118() {
        while (true) {
            class444 var1 = this.field4318.field4672;
            if (this.field4318 == var1) {
                this.field4319 = null;
                return;
            }
            var1.method7335();
        }
    }

    @ObfuscatedName("nj.al(Lru;)V")
    public void method6111(class444 arg0) {
        if (arg0.field4674 != null) {
            arg0.method7335();
        }
        arg0.field4674 = this.field4318.field4674;
        arg0.field4672 = this.field4318;
        arg0.field4674.field4672 = arg0;
        arg0.field4672.field4674 = arg0;
    }

    @ObfuscatedName("nj.ac(Lru;)V")
    public void method6092(class444 arg0) {
        if (arg0.field4674 != null) {
            arg0.method7335();
        }
        arg0.field4674 = this.field4318;
        arg0.field4672 = this.field4318.field4672;
        arg0.field4674.field4672 = arg0;
        arg0.field4672.field4674 = arg0;
    }

    @ObfuscatedName("nj.ab(Lru;Lru;)V")
    public static void method6115(class444 arg0, class444 arg1) {
        if (arg0.field4674 != null) {
            arg0.method7335();
        }
        arg0.field4674 = arg1.field4674;
        arg0.field4672 = arg1;
        arg0.field4674.field4672 = arg0;
        arg0.field4672.field4674 = arg0;
    }

    @ObfuscatedName("nj.an()Lru;")
    public class444 method6094() {
        class444 var1 = this.field4318.field4672;
        if (this.field4318 == var1) {
            return null;
        } else {
            var1.method7335();
            return var1;
        }
    }

    @ObfuscatedName("nj.ao()Lru;")
    public class444 method6095() {
        class444 var1 = this.field4318.field4674;
        if (this.field4318 == var1) {
            return null;
        } else {
            var1.method7335();
            return var1;
        }
    }

    @ObfuscatedName("nj.av()Lru;")
    public class444 method6089() {
        class444 var1 = this.field4318.field4672;
        if (this.field4318 == var1) {
            this.field4319 = null;
            return null;
        } else {
            this.field4319 = var1.field4672;
            return var1;
        }
    }

    @ObfuscatedName("nj.aq()Lru;")
    public class444 method6097() {
        class444 var1 = this.field4318.field4674;
        if (this.field4318 == var1) {
            this.field4319 = null;
            return null;
        } else {
            this.field4319 = var1.field4674;
            return var1;
        }
    }

    @ObfuscatedName("nj.ap()Lru;")
    public class444 method6098() {
        class444 var1 = this.field4319;
        if (this.field4318 == var1) {
            this.field4319 = null;
            return null;
        } else {
            this.field4319 = var1.field4672;
            return var1;
        }
    }

    @ObfuscatedName("nj.ar()Lru;")
    public class444 method6099() {
        class444 var1 = this.field4319;
        if (this.field4318 == var1) {
            this.field4319 = null;
            return null;
        } else {
            this.field4319 = var1.field4674;
            return var1;
        }
    }
}
