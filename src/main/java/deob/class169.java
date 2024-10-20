package deob;

@ObfuscatedName("fk")
public class class169 extends class286 {

    @ObfuscatedName("fk.n")
    public final boolean field2010;

    public class169(boolean arg0) {
        this.field2010 = arg0;
    }

    @ObfuscatedName("fk.n(Lky;Lky;I)I")
    public int method3347(class290 arg0, class290 arg1) {
        if (arg0.field3645 == 0 || arg1.field3645 == 0) {
            return this.method4862(arg0, arg1);
        } else if (this.field2010) {
            return arg0.method4851().method4967(arg1.method4851());
        } else {
            return arg1.method4851().method4967(arg0.method4851());
        }
    }

    public int compare(Object arg0, Object arg1) {
        return this.method3347((class290) arg0, (class290) arg1);
    }
}
