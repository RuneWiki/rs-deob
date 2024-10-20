package deob;

import java.awt.Component;

@ObfuscatedName("af")
public class class50 extends class52 {

    @ObfuscatedName("af.d")
    public int field1103;

    public class50(class128 arg0, int arg1) {
        Statics.field1104 = arg0.method2642();
        this.field1103 = arg1;
    }

    @ObfuscatedName("af.n(Ljava/awt/Component;)V")
    public void method987(Component arg0) throws Exception {
        Statics.field1104.method970(arg0, Statics.field3058, Statics.field619, -737403428);
    }

    @ObfuscatedName("af.d(I)V")
    public void method988(int arg0) throws Exception {
        if (arg0 > 32768) {
            throw new IllegalArgumentException();
        }
        Statics.field1104.method967(this.field1103, arg0, (short) 20712);
    }

    @ObfuscatedName("af.z()I")
    public int method989() {
        return Statics.field1104.method972(this.field1103, 1573312002);
    }

    @ObfuscatedName("af.y()V")
    public void method999() {
        Statics.field1104.method969(this.field1103, this.field1112, -370592298);
    }

    @ObfuscatedName("af.e()V")
    public void method995() {
        Statics.field1104.method983(this.field1103, (byte) -28);
    }

    @ObfuscatedName("af.g()V")
    public void method991() {
        Statics.field1104.method971(this.field1103, 775148158);
    }
}
