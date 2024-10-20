package deob;

@ObfuscatedName("fm")
public class class168 extends class285 {

    @ObfuscatedName("fm.z")
    public final boolean field2031;

    public class168(boolean arg0) {
        this.field2031 = arg0;
    }

    @ObfuscatedName("fm.z(Lko;Lko;I)I")
    public int method3254(class289 arg0, class289 arg1) {
        if (arg0.field3634 == arg1.field3634) {
            return this.method4783(arg0, arg1);
        } else if (this.field2031) {
            return arg0.field3634 - arg1.field3634;
        } else {
            return arg1.field3634 - arg0.field3634;
        }
    }

    public int compare(Object arg0, Object arg1) {
        return this.method3254((class289) arg0, (class289) arg1);
    }
}
