package deob;

@ObfuscatedName("fv")
public class class166 extends class286 {

    @ObfuscatedName("fv.f")
    public final boolean field2010;

    public class166(boolean arg0) {
        this.field2010 = arg0;
    }

    @ObfuscatedName("fv.f(Lkl;Lkl;I)I")
    public int method3241(class290 arg0, class290 arg1) {
        if (arg0.field3641 == 0) {
            if (arg1.field3641 != 0) {
                return this.field2010 ? 1 : -1;
            }
        } else if (arg1.field3641 == 0) {
            return this.field2010 ? -1 : 1;
        }
        return this.method4793(arg0, arg1);
    }

    public int compare(Object arg0, Object arg1) {
        return this.method3241((class290) arg0, (class290) arg1);
    }
}
