package deob;

@ObfuscatedName("fy")
public class class160 extends class275 {

    @ObfuscatedName("fy.z")
    public final boolean field1975;

    public class160(boolean arg0) {
        this.field1975 = arg0;
    }

    @ObfuscatedName("fy.z(Ljl;Ljl;I)I")
    public int method3109(class279 arg0, class279 arg1) {
        if (arg0.field3600 == 0 || arg1.field3600 == 0) {
            return this.method4596(arg0, arg1);
        } else if (this.field1975) {
            return arg0.method4570().method4700(arg1.method4570());
        } else {
            return arg1.method4570().method4700(arg0.method4570());
        }
    }

    public int compare(Object arg0, Object arg1) {
        return this.method3109((class279) arg0, (class279) arg1);
    }
}
