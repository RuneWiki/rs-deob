package deob;

@ObfuscatedName("ga")
public class class195 {

    @ObfuscatedName("ga.n")
    public class207 field3069 = new class207();

    @ObfuscatedName("ga.d")
    public class207 field3070;

    public class195() {
        this.field3069.field3094 = this.field3069;
        this.field3069.field3095 = this.field3069;
    }

    @ObfuscatedName("ga.n(Lgz;)V")
    public void method3507(class207 arg0) {
        if (arg0.field3095 != null) {
            arg0.method3649();
        }
        arg0.field3095 = this.field3069.field3095;
        arg0.field3094 = this.field3069;
        arg0.field3095.field3094 = arg0;
        arg0.field3094.field3095 = arg0;
    }

    @ObfuscatedName("ga.d()Lgz;")
    public class207 method3508() {
        class207 var1 = this.field3069.field3094;
        if (this.field3069 == var1) {
            this.field3070 = null;
            return null;
        } else {
            this.field3070 = var1.field3094;
            return var1;
        }
    }

    @ObfuscatedName("ga.s()Lgz;")
    public class207 method3511() {
        class207 var1 = this.field3070;
        if (this.field3069 == var1) {
            this.field3070 = null;
            return null;
        } else {
            this.field3070 = var1.field3094;
            return var1;
        }
    }
}
