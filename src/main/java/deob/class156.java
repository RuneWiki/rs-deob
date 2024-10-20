package deob;

@ObfuscatedName("eq")
public class class156 extends class275 {

    @ObfuscatedName("eq.u")
    public final boolean field1986;

    public class156(boolean arg0) {
        this.field1986 = arg0;
    }

    @ObfuscatedName("eq.u(Ljt;Ljt;I)I")
    public int method3153(class279 arg0, class279 arg1) {
        if (arg0.field3614 == 0 || arg1.field3614 == 0) {
            return this.method4723(arg0, arg1);
        } else if (this.field1986) {
            return arg0.field3613 - arg1.field3613;
        } else {
            return arg1.field3613 - arg0.field3613;
        }
    }

    public int compare(Object arg0, Object arg1) {
        return this.method3153((class279) arg0, (class279) arg1);
    }
}
