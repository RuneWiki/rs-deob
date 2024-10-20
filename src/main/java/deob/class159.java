package deob;

@ObfuscatedName("fj")
public class class159 extends class275 {

    @ObfuscatedName("fj.u")
    public final boolean field2000;

    public class159(boolean arg0) {
        this.field2000 = arg0;
    }

    @ObfuscatedName("fj.u(Ljt;Ljt;I)I")
    public int method3178(class279 arg0, class279 arg1) {
        if (arg0.field3612 == arg1.field3612) {
            return this.method4723(arg0, arg1);
        } else if (this.field2000) {
            return arg0.field3612 - arg1.field3612;
        } else {
            return arg1.field3612 - arg0.field3612;
        }
    }

    public int compare(Object arg0, Object arg1) {
        return this.method3178((class279) arg0, (class279) arg1);
    }
}
