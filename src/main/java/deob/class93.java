package deob;

@ObfuscatedName("cy")
public class class93 extends class325 {

    @ObfuscatedName("cy.s")
    public final boolean field1245;

    public class93(boolean arg0) {
        this.field1245 = arg0;
    }

    @ObfuscatedName("cy.s(Llr;Llr;I)I")
    public int method2062(class328 arg0, class328 arg1) {
        if (arg0.field3865 == arg1.field3865) {
            return this.method5216(arg0, arg1);
        } else if (this.field1245) {
            return arg0.field3865 - arg1.field3865;
        } else {
            return arg1.field3865 - arg0.field3865;
        }
    }

    public int compare(Object arg0, Object arg1) {
        return this.method2062((class328) arg0, (class328) arg1);
    }
}
