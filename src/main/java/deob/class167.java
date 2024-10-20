package deob;

@ObfuscatedName("fv")
public class class167 extends class286 {

    @ObfuscatedName("fv.h")
    public final boolean field2006;

    public class167(boolean arg0) {
        this.field2006 = arg0;
    }

    @ObfuscatedName("fv.h(Lkz;Lkz;B)I")
    public int method3238(class290 arg0, class290 arg1) {
        if (arg0.field3651 == arg1.field3651) {
            return this.method4712(arg0, arg1);
        } else if (this.field2006) {
            return arg0.field3651 - arg1.field3651;
        } else {
            return arg1.field3651 - arg0.field3651;
        }
    }

    public int compare(Object arg0, Object arg1) {
        return this.method3238((class290) arg0, (class290) arg1);
    }
}
