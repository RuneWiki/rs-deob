package deob;

@ObfuscatedName("em")
public class class141 extends class286 {

    @ObfuscatedName("em.f")
    public final boolean field1919;

    public class141(boolean arg0) {
        this.field1919 = arg0;
    }

    @ObfuscatedName("em.f(Lkd;Lkd;B)I")
    public int method2914(class290 arg0, class290 arg1) {
        if (client.field610 == arg0.field3696 && client.field610 == arg1.field3696) {
            return this.field1919 ? arg0.method4927().method5063(arg1.method4927()) : arg1.method4927().method5063(arg0.method4927());
        } else {
            return this.method4946(arg0, arg1);
        }
    }

    public int compare(Object arg0, Object arg1) {
        return this.method2914((class290) arg0, (class290) arg1);
    }
}
