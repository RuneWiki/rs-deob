package deob;

import java.awt.Component;

@ObfuscatedName("ak")
public class class50 extends class52 {

    @ObfuscatedName("ak.o")
    public int field1118;

    public class50(class128 arg0, int arg1) {
        Statics.field1117 = arg0.method2613();
        this.field1118 = arg1;
    }

    @ObfuscatedName("ak.n(Ljava/awt/Component;)V")
    public void method1010(Component arg0) throws Exception {
        Statics.field1117.method1004(arg0, Statics.field1141, Statics.field1126, (byte) -90);
    }

    @ObfuscatedName("ak.o(I)V")
    public void method1012(int arg0) throws Exception {
        if (arg0 > 32768) {
            throw new IllegalArgumentException();
        }
        Statics.field1117.method990(this.field1118, arg0, (byte) 79);
    }

    @ObfuscatedName("ak.a()I")
    public int method1018() {
        return Statics.field1117.method991(this.field1118, 1489756403);
    }

    @ObfuscatedName("ak.w()V")
    public void method1022() {
        Statics.field1117.method1001(this.field1118, this.field1128, (byte) 9);
    }

    @ObfuscatedName("ak.m()V")
    public void method1009() {
        Statics.field1117.method989(this.field1118, -1077017058);
    }

    @ObfuscatedName("ak.h()V")
    public void method1025() {
        Statics.field1117.method994(this.field1118, (byte) 0);
    }
}
