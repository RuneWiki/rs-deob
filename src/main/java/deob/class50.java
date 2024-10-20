package deob;

import java.awt.Component;

@ObfuscatedName("av")
public class class50 extends class52 {

    @ObfuscatedName("av.e")
    public int field1095;

    public class50(class128 arg0, int arg1) {
        Statics.field1096 = arg0.method2514();
        this.field1095 = arg1;
    }

    @ObfuscatedName("av.b(Ljava/awt/Component;)V")
    public void method965(Component arg0) throws Exception {
        Statics.field1096.method943(arg0, Statics.field1124, Statics.field1102, 67859960);
    }

    @ObfuscatedName("av.e(I)V")
    public void method955(int arg0) throws Exception {
        if (arg0 > 32768) {
            throw new IllegalArgumentException();
        }
        Statics.field1096.method936(this.field1095, arg0, (byte) 65);
    }

    @ObfuscatedName("av.a()I")
    public int method956() {
        return Statics.field1096.method937(this.field1095, 1494249850);
    }

    @ObfuscatedName("av.k()V")
    public void method957() {
        Statics.field1096.method938(this.field1095, this.field1105, (byte) 44);
    }

    @ObfuscatedName("av.p()V")
    public void method958() {
        Statics.field1096.method939(this.field1095, -33596812);
    }

    @ObfuscatedName("av.l()V")
    public void method959() {
        Statics.field1096.method940(this.field1095, (byte) 20);
    }
}
