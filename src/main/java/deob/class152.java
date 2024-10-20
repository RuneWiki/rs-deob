package deob;

@ObfuscatedName("em")
public class class152 extends class284 {

    @ObfuscatedName("em.b")
    public final boolean field2089;

    public class152(boolean arg0) {
        this.field2089 = arg0;
    }

    @ObfuscatedName("em.b(Lku;Lku;B)I")
    public int method2890(class288 arg0, class288 arg1) {
        if (client.field1043 == arg0.field3721 && client.field1043 == arg1.field3721) {
            return this.field2089 ? arg0.field3719 - arg1.field3719 : arg1.field3719 - arg0.field3719;
        } else {
            return this.method4811(arg0, arg1);
        }
    }

    public int compare(Object arg0, Object arg1) {
        return this.method2890((class288) arg0, (class288) arg1);
    }
}
