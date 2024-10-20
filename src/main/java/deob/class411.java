package deob;

@ObfuscatedName("po")
public class class411 {

    @ObfuscatedName("po.ab")
    public class501 field4633 = new class501();

    @ObfuscatedName("po.ay")
    public class501 field4632;

    public class411() {
        this.field4633.field5066 = this.field4633;
        this.field4633.field5067 = this.field4633;
    }

    @ObfuscatedName("po.ab(Lth;)V")
    public void method7010(class501 arg0) {
        if (arg0.field5067 != null) {
            arg0.method8212();
        }
        arg0.field5067 = this.field4633.field5067;
        arg0.field5066 = this.field4633;
        arg0.field5067.field5066 = arg0;
        arg0.field5066.field5067 = arg0;
    }

    @ObfuscatedName("po.ay()Lth;")
    public class501 method7009() {
        class501 var1 = this.field4633.field5066;
        if (this.field4633 == var1) {
            this.field4632 = null;
            return null;
        } else {
            this.field4632 = var1.field5066;
            return var1;
        }
    }

    @ObfuscatedName("po.an()Lth;")
    public class501 method7011() {
        class501 var1 = this.field4632;
        if (this.field4633 == var1) {
            this.field4632 = null;
            return null;
        } else {
            this.field4632 = var1.field5066;
            return var1;
        }
    }
}
