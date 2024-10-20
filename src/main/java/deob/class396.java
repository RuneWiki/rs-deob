package deob;

@ObfuscatedName("ph")
public class class396 {

    @ObfuscatedName("ph.ac")
    public class483 field4466 = new class483();

    @ObfuscatedName("ph.al")
    public class483 field4465;

    public class396() {
        this.field4466.field4849 = this.field4466;
        this.field4466.field4848 = this.field4466;
    }

    @ObfuscatedName("ph.ac(Lsg;)V")
    public void method6638(class483 arg0) {
        if (arg0.field4848 != null) {
            arg0.method7766();
        }
        arg0.field4848 = this.field4466.field4848;
        arg0.field4849 = this.field4466;
        arg0.field4848.field4849 = arg0;
        arg0.field4849.field4848 = arg0;
    }

    @ObfuscatedName("ph.al()Lsg;")
    public class483 method6639() {
        class483 var1 = this.field4466.field4849;
        if (this.field4466 == var1) {
            this.field4465 = null;
            return null;
        } else {
            this.field4465 = var1.field4849;
            return var1;
        }
    }

    @ObfuscatedName("ph.ak()Lsg;")
    public class483 method6640() {
        class483 var1 = this.field4465;
        if (this.field4466 == var1) {
            this.field4465 = null;
            return null;
        } else {
            this.field4465 = var1.field4849;
            return var1;
        }
    }
}
