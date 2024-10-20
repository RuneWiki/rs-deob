package deob;

import java.awt.Component;

@ObfuscatedName("al")
public class class50 extends class52 {

    @ObfuscatedName("al.w")
    public int field1095;

    public class50(class128 arg0, int arg1) {
        Statics.field1096 = arg0.method2526();
        this.field1095 = arg1;
    }

    @ObfuscatedName("al.n(Ljava/awt/Component;)V")
    public void method998(Component arg0) throws Exception {
        Statics.field1096.method973(arg0, Statics.field1118, Statics.field1103, -1331764820);
    }

    @ObfuscatedName("al.w(I)V")
    public void method976(int arg0) throws Exception {
        if (arg0 > 32768) {
            throw new IllegalArgumentException();
        }
        Statics.field1096.method952(this.field1095, arg0, (byte) -128);
    }

    @ObfuscatedName("al.i()I")
    public int method977() {
        return Statics.field1096.method953(this.field1095, 151381753);
    }

    @ObfuscatedName("al.e()V")
    public void method978() {
        Statics.field1096.method951(this.field1095, this.field1104, 144472594);
    }

    @ObfuscatedName("al.h()V")
    public void method979() {
        Statics.field1096.method955(this.field1095, (byte) 35);
    }

    @ObfuscatedName("al.q()V")
    public void method980() {
        Statics.field1096.method962(this.field1095, (byte) -35);
    }
}
