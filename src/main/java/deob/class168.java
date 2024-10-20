package deob;

@ObfuscatedName("fm")
public class class168 extends class286 {

    @ObfuscatedName("fm.f")
    public final boolean field2024;

    public class168(boolean arg0) {
        this.field2024 = arg0;
    }

    @ObfuscatedName("fm.f(Lkl;Lkl;I)I")
    public int method3256(class290 arg0, class290 arg1) {
        if (arg0.field3643 == arg1.field3643) {
            return this.method4793(arg0, arg1);
        } else if (this.field2024) {
            return arg0.field3643 - arg1.field3643;
        } else {
            return arg1.field3643 - arg0.field3643;
        }
    }

    public int compare(Object arg0, Object arg1) {
        return this.method3256((class290) arg0, (class290) arg1);
    }
}
