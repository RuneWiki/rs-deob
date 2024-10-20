package deob;

@ObfuscatedName("fg")
public class class169 extends class286 {

    @ObfuscatedName("fg.f")
    public final boolean field2028;

    public class169(boolean arg0) {
        this.field2028 = arg0;
    }

    @ObfuscatedName("fg.f(Lkl;Lkl;I)I")
    public int method3265(class290 arg0, class290 arg1) {
        if (arg0.field3641 == 0 || arg1.field3641 == 0) {
            return this.method4793(arg0, arg1);
        } else if (this.field2028) {
            return arg0.method4780().method4904(arg1.method4780());
        } else {
            return arg1.method4780().method4904(arg0.method4780());
        }
    }

    public int compare(Object arg0, Object arg1) {
        return this.method3265((class290) arg0, (class290) arg1);
    }
}
