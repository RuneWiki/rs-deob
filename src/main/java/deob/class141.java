package deob;

@ObfuscatedName("ee")
public class class141 extends class286 {

    @ObfuscatedName("ee.g")
    public final boolean field1935;

    public class141(boolean arg0) {
        this.field1935 = arg0;
    }

    @ObfuscatedName("ee.g(Lkv;Lkv;I)I")
    public int method3083(class290 arg0, class290 arg1) {
        if (client.field692 == arg0.field3709 && client.field692 == arg1.field3709) {
            return this.field1935 ? arg0.method5128().method5273(arg1.method5128()) : arg1.method5128().method5273(arg0.method5128());
        } else {
            return this.method5152(arg0, arg1);
        }
    }

    public int compare(Object arg0, Object arg1) {
        return this.method3083((class290) arg0, (class290) arg1);
    }
}
