package deob;

@ObfuscatedName("ea")
public class class152 extends class287 {

    @ObfuscatedName("ea.m")
    public final boolean field1951;

    public class152(boolean arg0) {
        this.field1951 = arg0;
    }

    @ObfuscatedName("ea.m(Lke;Lke;I)I")
    public int method3058(class291 arg0, class291 arg1) {
        if (client.field622 == arg0.field3703 && client.field622 == arg1.field3703) {
            return this.field1951 ? arg0.method4997().method5134(arg1.method4997()) : arg1.method4997().method5134(arg0.method4997());
        } else {
            return this.method5011(arg0, arg1);
        }
    }

    public int compare(Object arg0, Object arg1) {
        return this.method3058((class291) arg0, (class291) arg1);
    }
}
