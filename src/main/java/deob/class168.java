package deob;

@ObfuscatedName("fm")
public class class168 extends class286 {

    @ObfuscatedName("fm.h")
    public final boolean field2010;

    public class168(boolean arg0) {
        this.field2010 = arg0;
    }

    @ObfuscatedName("fm.h(Lkz;Lkz;I)I")
    public int method3243(class290 arg0, class290 arg1) {
        if (arg0.field3652 == arg1.field3652) {
            return this.method4712(arg0, arg1);
        } else if (this.field2010) {
            return arg0.field3652 - arg1.field3652;
        } else {
            return arg1.field3652 - arg0.field3652;
        }
    }

    public int compare(Object arg0, Object arg1) {
        return this.method3243((class290) arg0, (class290) arg1);
    }
}
