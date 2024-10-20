package deob;

@ObfuscatedName("ej")
public class class148 extends class286 {

    @ObfuscatedName("ej.g")
    public final boolean field1962;

    public class148(boolean arg0) {
        this.field1962 = arg0;
    }

    @ObfuscatedName("ej.g(Lkv;Lkv;I)I")
    public int method3133(class290 arg0, class290 arg1) {
        if (arg0.field3709 == 0 || arg1.field3709 == 0) {
            return this.method5152(arg0, arg1);
        } else if (this.field1962) {
            return arg0.method5128().method5273(arg1.method5128());
        } else {
            return arg1.method5128().method5273(arg0.method5128());
        }
    }

    public int compare(Object arg0, Object arg1) {
        return this.method3133((class290) arg0, (class290) arg1);
    }
}
