package deob;

@ObfuscatedName("gw")
public class class195 {

    @ObfuscatedName("gw.n")
    public class207 field3083 = new class207();

    @ObfuscatedName("gw.q")
    public class207 field3084;

    public class195() {
        this.field3083.field3108 = this.field3083;
        this.field3083.field3109 = this.field3083;
    }

    @ObfuscatedName("gw.n(Lge;)V")
    public void method3507(class207 arg0) {
        if (arg0.field3109 != null) {
            arg0.method3645();
        }
        arg0.field3109 = this.field3083.field3109;
        arg0.field3108 = this.field3083;
        arg0.field3109.field3108 = arg0;
        arg0.field3108.field3109 = arg0;
    }

    @ObfuscatedName("gw.q()Lge;")
    public class207 method3508() {
        class207 var1 = this.field3083.field3108;
        if (this.field3083 == var1) {
            this.field3084 = null;
            return null;
        } else {
            this.field3084 = var1.field3108;
            return var1;
        }
    }

    @ObfuscatedName("gw.c()Lge;")
    public class207 method3513() {
        class207 var1 = this.field3084;
        if (this.field3083 == var1) {
            this.field3084 = null;
            return null;
        } else {
            this.field3084 = var1.field3108;
            return var1;
        }
    }
}
