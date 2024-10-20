package deob;

import java.awt.Component;

@ObfuscatedName("ba")
public class class55 extends class57 {

    @ObfuscatedName("ba.p")
    public int field1169;

    public class55(class136 arg0, int arg1) {
        Statics.field1170 = arg0.method2748();
        this.field1169 = arg1;
    }

    @ObfuscatedName("ba.d(Ljava/awt/Component;)V")
    public void method1098(Component arg0) throws Exception {
        Statics.field1170.method1089(arg0, Statics.field1177, Statics.field1186, 27267436);
    }

    @ObfuscatedName("ba.p(I)V")
    public void method1103(int arg0) throws Exception {
        if (arg0 > 32768) {
            throw new IllegalArgumentException();
        }
        Statics.field1170.method1085(this.field1169, arg0, -43135214);
    }

    @ObfuscatedName("ba.v()I")
    public int method1101() {
        return Statics.field1170.method1086(this.field1169, -484116145);
    }

    @ObfuscatedName("ba.l()V")
    public void method1110() {
        Statics.field1170.method1087(this.field1169, this.field1180, (byte) 66);
    }

    @ObfuscatedName("ba.y()V")
    public void method1102() {
        Statics.field1170.method1088(this.field1169, -128516486);
    }

    @ObfuscatedName("ba.w()V")
    public void method1097() {
        Statics.field1170.method1091(this.field1169, 1777139303);
    }
}
