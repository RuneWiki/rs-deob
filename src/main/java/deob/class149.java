package deob;

@ObfuscatedName("ey")
public class class149 extends class290 {

    @ObfuscatedName("ey.a")
    public final boolean field1961;

    public class149(boolean arg0) {
        this.field1961 = arg0;
    }

    @ObfuscatedName("ey.a(Lkl;Lkl;I)I")
    public int method3137(class294 arg0, class294 arg1) {
        if (arg0.field3713 == 0 || arg1.field3713 == 0) {
            return this.method5117(arg0, arg1);
        } else if (this.field1961) {
            return arg0.field3712 - arg1.field3712;
        } else {
            return arg1.field3712 - arg0.field3712;
        }
    }

    public int compare(Object arg0, Object arg1) {
        return this.method3137((class294) arg0, (class294) arg1);
    }
}
