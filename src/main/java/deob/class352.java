package deob;

@ObfuscatedName("mf")
public class class352 {

    @ObfuscatedName("mf.a")
    public class424 field4283 = new class424();

    @ObfuscatedName("mf.f")
    public class424 field4282;

    public class352() {
        this.field4283.field4627 = this.field4283;
        this.field4283.field4626 = this.field4283;
    }

    @ObfuscatedName("mf.a(Lpg;)V")
    public void method6154(class424 arg0) {
        if (arg0.field4626 != null) {
            arg0.method7165();
        }
        arg0.field4626 = this.field4283.field4626;
        arg0.field4627 = this.field4283;
        arg0.field4626.field4627 = arg0;
        arg0.field4627.field4626 = arg0;
    }

    @ObfuscatedName("mf.f()Lpg;")
    public class424 method6156() {
        class424 var1 = this.field4283.field4627;
        if (this.field4283 == var1) {
            this.field4282 = null;
            return null;
        } else {
            this.field4282 = var1.field4627;
            return var1;
        }
    }

    @ObfuscatedName("mf.c()Lpg;")
    public class424 method6153() {
        class424 var1 = this.field4282;
        if (this.field4283 == var1) {
            this.field4282 = null;
            return null;
        } else {
            this.field4282 = var1.field4627;
            return var1;
        }
    }
}
