package deob;

@ObfuscatedName("cp")
public class class94 extends class325 {

    @ObfuscatedName("cp.s")
    public final boolean field1246;

    public class94(boolean arg0) {
        this.field1246 = arg0;
    }

    @ObfuscatedName("cp.s(Llr;Llr;B)I")
    public int method2068(class328 arg0, class328 arg1) {
        if (client.field405 == arg0.field3865 && client.field405 == arg1.field3865) {
            return this.field1246 ? arg0.method5204().method6523(arg1.method5204()) : arg1.method5204().method6523(arg0.method5204());
        } else {
            return this.method5216(arg0, arg1);
        }
    }

    public int compare(Object arg0, Object arg1) {
        return this.method2068((class328) arg0, (class328) arg1);
    }
}
