package deob;

@ObfuscatedName("ed")
public class class148 extends class290 {

    @ObfuscatedName("ed.a")
    public final boolean field1959;

    public class148(boolean arg0) {
        this.field1959 = arg0;
    }

    @ObfuscatedName("ed.a(Lkl;Lkl;I)I")
    public int method3131(class294 arg0, class294 arg1) {
        if (client.field650 == arg0.field3713 && client.field650 == arg1.field3713) {
            return this.field1959 ? arg0.field3712 - arg1.field3712 : arg1.field3712 - arg0.field3712;
        } else {
            return this.method5117(arg0, arg1);
        }
    }

    public int compare(Object arg0, Object arg1) {
        return this.method3131((class294) arg0, (class294) arg1);
    }
}
