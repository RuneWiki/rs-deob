package deob;

@ObfuscatedName("fg")
public class class166 extends class286 {

    @ObfuscatedName("fg.n")
    public final boolean field2004;

    public class166(boolean arg0) {
        this.field2004 = arg0;
    }

    @ObfuscatedName("fg.n(Lky;Lky;I)I")
    public int method3314(class290 arg0, class290 arg1) {
        if (arg0.field3645 == 0) {
            if (arg1.field3645 != 0) {
                return this.field2004 ? 1 : -1;
            }
        } else if (arg1.field3645 == 0) {
            return this.field2004 ? -1 : 1;
        }
        return this.method4862(arg0, arg1);
    }

    public int compare(Object arg0, Object arg1) {
        return this.method3314((class290) arg0, (class290) arg1);
    }
}
