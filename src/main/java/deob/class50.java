package deob;

import java.awt.Component;

@ObfuscatedName("av")
public class class50 extends class52 {

    @ObfuscatedName("av.b")
    public int field1083;

    public class50(class128 arg0, int arg1) {
        Statics.field1082 = arg0.method2569();
        this.field1083 = arg1;
    }

    @ObfuscatedName("av.t(Ljava/awt/Component;)V")
    public void method1014(Component arg0) throws Exception {
        Statics.field1082.method996(arg0, Statics.field1106, Statics.field1089, 1618961744);
    }

    @ObfuscatedName("av.b(I)V")
    public void method1015(int arg0) throws Exception {
        if (arg0 > 32768) {
            throw new IllegalArgumentException();
        }
        Statics.field1082.method1000(this.field1083, arg0, -1527725663);
    }

    @ObfuscatedName("av.p()I")
    public int method1013() {
        return Statics.field1082.method994(this.field1083, (byte) 31);
    }

    @ObfuscatedName("av.e()V")
    public void method1017() {
        Statics.field1082.method995(this.field1083, this.field1092, (byte) -33);
    }

    @ObfuscatedName("av.i()V")
    public void method1019() {
        Statics.field1082.method1003(this.field1083, (byte) 90);
    }

    @ObfuscatedName("av.o()V")
    public void method1018() {
        Statics.field1082.method997(this.field1083, (byte) 31);
    }
}
