package deob;

@ObfuscatedName("gm")
public class class195 {

    @ObfuscatedName("gm.y")
    public class207 field3065 = new class207();

    @ObfuscatedName("gm.d")
    public class207 field3064;

    public class195() {
        this.field3065.field3090 = this.field3065;
        this.field3065.field3089 = this.field3065;
    }

    @ObfuscatedName("gm.y(Lgj;)V")
    public void method3451(class207 arg0) {
        if (arg0.field3089 != null) {
            arg0.method3584();
        }
        arg0.field3089 = this.field3065.field3089;
        arg0.field3090 = this.field3065;
        arg0.field3089.field3090 = arg0;
        arg0.field3090.field3089 = arg0;
    }

    @ObfuscatedName("gm.d()Lgj;")
    public class207 method3452() {
        class207 var1 = this.field3065.field3090;
        if (this.field3065 == var1) {
            this.field3064 = null;
            return null;
        } else {
            this.field3064 = var1.field3090;
            return var1;
        }
    }

    @ObfuscatedName("gm.g()Lgj;")
    public class207 method3453() {
        class207 var1 = this.field3064;
        if (this.field3065 == var1) {
            this.field3064 = null;
            return null;
        } else {
            this.field3064 = var1.field3090;
            return var1;
        }
    }
}
