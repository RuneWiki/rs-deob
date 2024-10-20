package deob;

@ObfuscatedName("el")
public class class151 extends class290 {

    @ObfuscatedName("el.a")
    public final boolean field1972;

    public class151(boolean arg0) {
        this.field1972 = arg0;
    }

    @ObfuscatedName("el.a(Lkl;Lkl;I)I")
    public int method3158(class294 arg0, class294 arg1) {
        if (arg0.field3713 == arg1.field3713) {
            return this.method5117(arg0, arg1);
        } else if (this.field1972) {
            return arg0.field3713 - arg1.field3713;
        } else {
            return arg1.field3713 - arg0.field3713;
        }
    }

    public int compare(Object arg0, Object arg1) {
        return this.method3158((class294) arg0, (class294) arg1);
    }
}
