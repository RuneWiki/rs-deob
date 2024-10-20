package deob;

@ObfuscatedName("fy")
public class class168 extends class286 {

    @ObfuscatedName("fy.n")
    public final boolean field2006;

    public class168(boolean arg0) {
        this.field2006 = arg0;
    }

    @ObfuscatedName("fy.n(Lky;Lky;B)I")
    public int method3333(class290 arg0, class290 arg1) {
        if (arg0.field3646 == arg1.field3646) {
            return this.method4862(arg0, arg1);
        } else if (this.field2006) {
            return arg0.field3646 - arg1.field3646;
        } else {
            return arg1.field3646 - arg0.field3646;
        }
    }

    public int compare(Object arg0, Object arg1) {
        return this.method3333((class290) arg0, (class290) arg1);
    }
}
