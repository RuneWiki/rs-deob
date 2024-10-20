package deob;

@ObfuscatedName("ka")
public final class class308 {

    @ObfuscatedName("ka.i")
    public class365 field3810 = new class365();

    public class308() {
        this.field3810.field4068 = this.field3810;
        this.field3810.field4069 = this.field3810;
    }

    @ObfuscatedName("ka.i(Lnt;)V")
    public void method4975(class365 arg0) {
        if (arg0.field4069 != null) {
            arg0.method5748();
        }
        arg0.field4069 = this.field3810.field4069;
        arg0.field4068 = this.field3810;
        arg0.field4069.field4068 = arg0;
        arg0.field4068.field4069 = arg0;
    }

    @ObfuscatedName("ka.w(Lnt;)V")
    public void method4971(class365 arg0) {
        if (arg0.field4069 != null) {
            arg0.method5748();
        }
        arg0.field4069 = this.field3810;
        arg0.field4068 = this.field3810.field4068;
        arg0.field4069.field4068 = arg0;
        arg0.field4068.field4069 = arg0;
    }

    @ObfuscatedName("ka.s()Lnt;")
    public class365 method4965() {
        class365 var1 = this.field3810.field4068;
        return this.field3810 == var1 ? null : var1;
    }
}
