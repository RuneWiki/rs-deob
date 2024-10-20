package deob;

@ObfuscatedName("fv")
public class class167 extends class286 {

    @ObfuscatedName("fv.n")
    public final boolean field2005;

    public class167(boolean arg0) {
        this.field2005 = arg0;
    }

    @ObfuscatedName("fv.n(Lky;Lky;I)I")
    public int method3326(class290 arg0, class290 arg1) {
        if (arg0.field3645 == arg1.field3645) {
            return this.method4862(arg0, arg1);
        } else if (this.field2005) {
            return arg0.field3645 - arg1.field3645;
        } else {
            return arg1.field3645 - arg0.field3645;
        }
    }

    public int compare(Object arg0, Object arg1) {
        return this.method3326((class290) arg0, (class290) arg1);
    }
}
