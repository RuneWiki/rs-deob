package deob;

@ObfuscatedName("gu")
public class class186 {

    @ObfuscatedName("gu.t")
    public class198 field2988 = new class198();

    @ObfuscatedName("gu.b")
    public class198 field2987;

    public class186() {
        this.field2988.field3013 = this.field2988;
        this.field2988.field3012 = this.field2988;
    }

    @ObfuscatedName("gu.t(Lgh;)V")
    public void method3366(class198 arg0) {
        if (arg0.field3012 != null) {
            arg0.method3502();
        }
        arg0.field3012 = this.field2988.field3012;
        arg0.field3013 = this.field2988;
        arg0.field3012.field3013 = arg0;
        arg0.field3013.field3012 = arg0;
    }

    @ObfuscatedName("gu.b()Lgh;")
    public class198 method3367() {
        class198 var1 = this.field2988.field3013;
        if (this.field2988 == var1) {
            this.field2987 = null;
            return null;
        } else {
            this.field2987 = var1.field3013;
            return var1;
        }
    }

    @ObfuscatedName("gu.p()Lgh;")
    public class198 method3376() {
        class198 var1 = this.field2987;
        if (this.field2988 == var1) {
            this.field2987 = null;
            return null;
        } else {
            this.field2987 = var1.field3013;
            return var1;
        }
    }
}
