package deob;

@ObfuscatedName("ed")
public class class148 extends class286 {

    @ObfuscatedName("ed.f")
    public final boolean field1945;

    public class148(boolean arg0) {
        this.field1945 = arg0;
    }

    @ObfuscatedName("ed.f(Lkd;Lkd;I)I")
    public int method2997(class290 arg0, class290 arg1) {
        if (arg0.field3696 == 0 || arg1.field3696 == 0) {
            return this.method4946(arg0, arg1);
        } else if (this.field1945) {
            return arg0.method4927().method5063(arg1.method4927());
        } else {
            return arg1.method4927().method5063(arg0.method4927());
        }
    }

    public int compare(Object arg0, Object arg1) {
        return this.method2997((class290) arg0, (class290) arg1);
    }
}
