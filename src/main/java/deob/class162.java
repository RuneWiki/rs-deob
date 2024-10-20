package deob;

@ObfuscatedName("fo")
public class class162 extends class286 {

    @ObfuscatedName("fo.f")
    public final boolean field1992;

    public class162(boolean arg0) {
        this.field1992 = arg0;
    }

    @ObfuscatedName("fo.f(Lkl;Lkl;I)I")
    public int method3212(class290 arg0, class290 arg1) {
        if (client.field817 == arg0.field3641 && client.field817 == arg1.field3641) {
            return this.field1992 ? arg0.method4780().method4904(arg1.method4780()) : arg1.method4780().method4904(arg0.method4780());
        } else {
            return this.method4793(arg0, arg1);
        }
    }

    public int compare(Object arg0, Object arg1) {
        return this.method3212((class290) arg0, (class290) arg1);
    }
}
