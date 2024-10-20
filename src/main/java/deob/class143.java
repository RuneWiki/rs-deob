package deob;

@ObfuscatedName("et")
public class class143 extends class286 {

    @ObfuscatedName("et.y")
    public final boolean field1927;

    public class143(boolean arg0) {
        this.field1927 = arg0;
    }

    @ObfuscatedName("et.y(Lkk;Lkk;I)I")
    public int method2909(class290 arg0, class290 arg1) {
        if (client.field627 == arg0.field3686 && client.field627 == arg1.field3686) {
            return this.field1927 ? arg0.field3683 - arg1.field3683 : arg1.field3683 - arg0.field3683;
        } else {
            return this.method4980(arg0, arg1);
        }
    }

    public int compare(Object arg0, Object arg1) {
        return this.method2909((class290) arg0, (class290) arg1);
    }
}
