package deob;

@ObfuscatedName("fs")
public class class165 extends class286 {

    @ObfuscatedName("fs.h")
    public final boolean field2000;

    public class165(boolean arg0) {
        this.field2000 = arg0;
    }

    @ObfuscatedName("fs.h(Lkz;Lkz;I)I")
    public int method3221(class290 arg0, class290 arg1) {
        if (arg0.field3651 == 0 || arg1.field3651 == 0) {
            return this.method4712(arg0, arg1);
        } else if (this.field2000) {
            return arg0.field3650 - arg1.field3650;
        } else {
            return arg1.field3650 - arg0.field3650;
        }
    }

    public int compare(Object arg0, Object arg1) {
        return this.method3221((class290) arg0, (class290) arg1);
    }
}
