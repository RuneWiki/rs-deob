package deob;

@ObfuscatedName("ff")
public class class164 extends class286 {

    @ObfuscatedName("ff.f")
    public final boolean field2004;

    public class164(boolean arg0) {
        this.field2004 = arg0;
    }

    @ObfuscatedName("ff.f(Lkl;Lkl;I)I")
    public int method3223(class290 arg0, class290 arg1) {
        if (client.field817 == arg0.field3641 && client.field817 == arg1.field3641) {
            return this.field2004 ? arg0.field3642 - arg1.field3642 : arg1.field3642 - arg0.field3642;
        } else {
            return this.method4793(arg0, arg1);
        }
    }

    public int compare(Object arg0, Object arg1) {
        return this.method3223((class290) arg0, (class290) arg1);
    }
}
