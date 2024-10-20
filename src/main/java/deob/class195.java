package deob;

@ObfuscatedName("gq")
public class class195 {

    @ObfuscatedName("gq.j")
    public class207 field3076 = new class207();

    @ObfuscatedName("gq.m")
    public class207 field3077;

    public class195() {
        this.field3076.field3102 = this.field3076;
        this.field3076.field3101 = this.field3076;
    }

    @ObfuscatedName("gq.j(Lgw;)V")
    public void method3569(class207 arg0) {
        if (arg0.field3101 != null) {
            arg0.method3698();
        }
        arg0.field3101 = this.field3076.field3101;
        arg0.field3102 = this.field3076;
        arg0.field3101.field3102 = arg0;
        arg0.field3102.field3101 = arg0;
    }

    @ObfuscatedName("gq.m()Lgw;")
    public class207 method3561() {
        class207 var1 = this.field3076.field3102;
        if (this.field3076 == var1) {
            this.field3077 = null;
            return null;
        } else {
            this.field3077 = var1.field3102;
            return var1;
        }
    }

    @ObfuscatedName("gq.f()Lgw;")
    public class207 method3562() {
        class207 var1 = this.field3077;
        if (this.field3076 == var1) {
            this.field3077 = null;
            return null;
        } else {
            this.field3077 = var1.field3102;
            return var1;
        }
    }
}
