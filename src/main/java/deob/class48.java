package deob;

import java.awt.Component;

@ObfuscatedName("ah")
public class class48 extends class50 {

    @ObfuscatedName("ah.r")
    public int field1069;

    public class48(class123 arg0, int arg1) {
        Statics.field1068 = arg0.method2465();
        this.field1069 = arg1;
    }

    @ObfuscatedName("ah.k(Ljava/awt/Component;)V")
    public void method950(Component arg0) throws Exception {
        Statics.field1068.method933(arg0, Statics.field1096, Statics.field1092, -683869216);
    }

    @ObfuscatedName("ah.r(I)V")
    public void method951(int arg0) throws Exception {
        if (arg0 > 32768) {
            throw new IllegalArgumentException();
        }
        Statics.field1068.method930(this.field1069, arg0, (byte) 0);
    }

    @ObfuscatedName("ah.y()I")
    public int method952() {
        return Statics.field1068.method948(this.field1069, (byte) -1);
    }

    @ObfuscatedName("ah.w()V")
    public void method953() {
        Statics.field1068.method932(this.field1069, this.field1079, 1340322983);
    }

    @ObfuscatedName("ah.m()V")
    public void method954() {
        Statics.field1068.method947(this.field1069, 912944227);
    }

    @ObfuscatedName("ah.j()V")
    public void method961() {
        Statics.field1068.method934(this.field1069, (short) -10963);
    }
}
