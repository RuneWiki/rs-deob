package deob;

@ObfuscatedName("cg")
public class class97 extends class325 {

    @ObfuscatedName("cg.s")
    public final boolean field1261;

    public class97(boolean arg0) {
        this.field1261 = arg0;
    }

    @ObfuscatedName("cg.s(Llr;Llr;I)I")
    public int method2092(class328 arg0, class328 arg1) {
        if (arg0.field3865 == 0 || arg1.field3865 == 0) {
            return this.method5216(arg0, arg1);
        } else if (this.field1261) {
            return arg0.method5204().method6523(arg1.method5204());
        } else {
            return arg1.method5204().method6523(arg0.method5204());
        }
    }

    public int compare(Object arg0, Object arg1) {
        return this.method2092((class328) arg0, (class328) arg1);
    }
}
