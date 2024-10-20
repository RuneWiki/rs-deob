package deob;

@ObfuscatedName("fy")
public class class163 extends class286 {

    @ObfuscatedName("fy.f")
    public final boolean field1996;

    public class163(boolean arg0) {
        this.field1996 = arg0;
    }

    @ObfuscatedName("fy.f(Lkl;Lkl;I)I")
    public int method3218(class290 arg0, class290 arg1) {
        if (client.field817 == arg0.field3641) {
            if (client.field817 != arg1.field3641) {
                return this.field1996 ? -1 : 1;
            }
        } else if (client.field817 == arg1.field3641) {
            return this.field1996 ? 1 : -1;
        }
        return this.method4793(arg0, arg1);
    }

    public int compare(Object arg0, Object arg1) {
        return this.method3218((class290) arg0, (class290) arg1);
    }
}
