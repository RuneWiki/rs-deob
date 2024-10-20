package deob;

@ObfuscatedName("ga")
public class class189 {

    @ObfuscatedName("ga.j")
    public class201 field3017 = new class201();

    @ObfuscatedName("ga.y")
    public class201 field3016;

    public class189() {
        this.field3017.field3041 = this.field3017;
        this.field3017.field3042 = this.field3017;
    }

    @ObfuscatedName("ga.j(Lgv;)V")
    public void method3454(class201 arg0) {
        if (arg0.field3042 != null) {
            arg0.method3560();
        }
        arg0.field3042 = this.field3017.field3042;
        arg0.field3041 = this.field3017;
        arg0.field3042.field3041 = arg0;
        arg0.field3041.field3042 = arg0;
    }

    @ObfuscatedName("ga.y()Lgv;")
    public class201 method3452() {
        class201 var1 = this.field3017.field3041;
        if (this.field3017 == var1) {
            this.field3016 = null;
            return null;
        } else {
            this.field3016 = var1.field3041;
            return var1;
        }
    }

    @ObfuscatedName("ga.z()Lgv;")
    public class201 method3453() {
        class201 var1 = this.field3016;
        if (this.field3017 == var1) {
            this.field3016 = null;
            return null;
        } else {
            this.field3016 = var1.field3041;
            return var1;
        }
    }
}
