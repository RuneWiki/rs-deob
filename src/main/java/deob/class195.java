package deob;

@ObfuscatedName("gh")
public class class195 {

    @ObfuscatedName("gh.o")
    public class207 field3084 = new class207();

    @ObfuscatedName("gh.e")
    public class207 field3085;

    public class195() {
        this.field3084.field3110 = this.field3084;
        this.field3084.field3109 = this.field3084;
    }

    @ObfuscatedName("gh.o(Lgf;)V")
    public void method3536(class207 arg0) {
        if (arg0.field3109 != null) {
            arg0.method3664();
        }
        arg0.field3109 = this.field3084.field3109;
        arg0.field3110 = this.field3084;
        arg0.field3109.field3110 = arg0;
        arg0.field3110.field3109 = arg0;
    }

    @ObfuscatedName("gh.e()Lgf;")
    public class207 method3542() {
        class207 var1 = this.field3084.field3110;
        if (this.field3084 == var1) {
            this.field3085 = null;
            return null;
        } else {
            this.field3085 = var1.field3110;
            return var1;
        }
    }

    @ObfuscatedName("gh.u()Lgf;")
    public class207 method3540() {
        class207 var1 = this.field3085;
        if (this.field3084 == var1) {
            this.field3085 = null;
            return null;
        } else {
            this.field3085 = var1.field3110;
            return var1;
        }
    }
}
