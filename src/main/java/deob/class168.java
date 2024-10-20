package deob;

@ObfuscatedName("fg")
public class class168 extends class285 {

    @ObfuscatedName("fg.x")
    public final boolean field1999;

    public class168(boolean arg0) {
        this.field1999 = arg0;
    }

    @ObfuscatedName("fg.x(Lke;Lke;I)I")
    public int method3233(class289 arg0, class289 arg1) {
        if (arg0.field3612 == arg1.field3612) {
            return this.method4715(arg0, arg1);
        } else if (this.field1999) {
            return arg0.field3612 - arg1.field3612;
        } else {
            return arg1.field3612 - arg0.field3612;
        }
    }

    public int compare(Object arg0, Object arg1) {
        return this.method3233((class289) arg0, (class289) arg1);
    }
}
