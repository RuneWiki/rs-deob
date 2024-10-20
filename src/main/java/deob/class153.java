package deob;

@ObfuscatedName("eu")
public class class153 extends class284 {

    @ObfuscatedName("eu.b")
    public final boolean field2090;

    public class153(boolean arg0) {
        this.field2090 = arg0;
    }

    @ObfuscatedName("eu.b(Lku;Lku;I)I")
    public int method2894(class288 arg0, class288 arg1) {
        if (arg0.field3721 == 0 || arg1.field3721 == 0) {
            return this.method4811(arg0, arg1);
        } else if (this.field2090) {
            return arg0.field3719 - arg1.field3719;
        } else {
            return arg1.field3719 - arg0.field3719;
        }
    }

    public int compare(Object arg0, Object arg1) {
        return this.method2894((class288) arg0, (class288) arg1);
    }
}
