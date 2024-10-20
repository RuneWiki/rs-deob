package deob;

@ObfuscatedName("fc")
public class class165 extends class286 {

    @ObfuscatedName("fc.n")
    public final boolean field1999;

    public class165(boolean arg0) {
        this.field1999 = arg0;
    }

    @ObfuscatedName("fc.n(Lky;Lky;B)I")
    public int method3303(class290 arg0, class290 arg1) {
        if (arg0.field3645 == 0 || arg1.field3645 == 0) {
            return this.method4862(arg0, arg1);
        } else if (this.field1999) {
            return arg0.field3647 - arg1.field3647;
        } else {
            return arg1.field3647 - arg0.field3647;
        }
    }

    public int compare(Object arg0, Object arg1) {
        return this.method3303((class290) arg0, (class290) arg1);
    }
}
