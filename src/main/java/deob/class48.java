package deob;

import java.awt.Component;

@ObfuscatedName("av")
public class class48 extends class50 {

    @ObfuscatedName("av.p")
    public int field1060;

    public class48(class123 arg0, int arg1) {
        Statics.field1059 = arg0.method2481();
        this.field1060 = arg1;
    }

    @ObfuscatedName("av.e(Ljava/awt/Component;)V")
    public void method962(Component arg0) throws Exception {
        Statics.field1059.method943(arg0, Statics.field1076, Statics.field1066, 1445050691);
    }

    @ObfuscatedName("av.p(I)V")
    public void method959(int arg0) throws Exception {
        if (arg0 > 32768) {
            throw new IllegalArgumentException();
        }
        Statics.field1059.method939(this.field1060, arg0, (byte) 45);
    }

    @ObfuscatedName("av.a()I")
    public int method960() {
        return Statics.field1059.method956(this.field1060, (byte) -1);
    }

    @ObfuscatedName("av.g()V")
    public void method961() {
        Statics.field1059.method941(this.field1060, this.field1068, -1199965627);
    }

    @ObfuscatedName("av.u()V")
    public void method967() {
        Statics.field1059.method942(this.field1060, 912342799);
    }

    @ObfuscatedName("av.k()V")
    public void method963() {
        Statics.field1059.method938(this.field1060, -1813405155);
    }
}
