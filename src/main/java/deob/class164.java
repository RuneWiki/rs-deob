package deob;

@ObfuscatedName("fq")
public class class164 extends class285 {

    @ObfuscatedName("fq.m")
    public final boolean field1999;

    public class164(boolean arg0) {
        this.field1999 = arg0;
    }

    @ObfuscatedName("fq.m(Lkx;Lkx;I)I")
    public int method3200(class289 arg0, class289 arg1) {
        if (client.field729 == arg0.field3643 && client.field729 == arg1.field3643) {
            return this.field1999 ? arg0.field3641 - arg1.field3641 : arg1.field3641 - arg0.field3641;
        } else {
            return this.method4799(arg0, arg1);
        }
    }

    public int compare(Object arg0, Object arg1) {
        return this.method3200((class289) arg0, (class289) arg1);
    }
}
