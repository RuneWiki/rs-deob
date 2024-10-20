package deob;

@ObfuscatedName("li")
public class class337 {

    @ObfuscatedName("li.c")
    public class404 field4131 = new class404();

    @ObfuscatedName("li.v")
    public class404 field4130;

    public class337() {
        this.field4131.field4453 = this.field4131;
        this.field4131.field4454 = this.field4131;
    }

    @ObfuscatedName("li.c(Lou;)V")
    public void method5637(class404 arg0) {
        if (arg0.field4454 != null) {
            arg0.method6490();
        }
        arg0.field4454 = this.field4131.field4454;
        arg0.field4453 = this.field4131;
        arg0.field4454.field4453 = arg0;
        arg0.field4453.field4454 = arg0;
    }

    @ObfuscatedName("li.v()Lou;")
    public class404 method5638() {
        class404 var1 = this.field4131.field4453;
        if (this.field4131 == var1) {
            this.field4130 = null;
            return null;
        } else {
            this.field4130 = var1.field4453;
            return var1;
        }
    }

    @ObfuscatedName("li.q()Lou;")
    public class404 method5639() {
        class404 var1 = this.field4130;
        if (this.field4131 == var1) {
            this.field4130 = null;
            return null;
        } else {
            this.field4130 = var1.field4453;
            return var1;
        }
    }
}
