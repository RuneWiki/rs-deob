package deob;

import java.awt.Component;

@ObfuscatedName("bm")
public class class55 extends class57 {

    @ObfuscatedName("bm.h")
    public int field1148;

    public class55(class136 arg0, int arg1) {
        Statics.field1147 = arg0.method2705();
        this.field1148 = arg1;
    }

    @ObfuscatedName("bm.k(Ljava/awt/Component;)V")
    public void method1065(Component arg0) throws Exception {
        Statics.field1147.method1047(arg0, Statics.field2148, Statics.field1074, (byte) 83);
    }

    @ObfuscatedName("bm.h(I)V")
    public void method1066(int arg0) throws Exception {
        if (arg0 > 32768) {
            throw new IllegalArgumentException();
        }
        Statics.field1147.method1056(this.field1148, arg0, 171375702);
    }

    @ObfuscatedName("bm.o()I")
    public int method1067() {
        return Statics.field1147.method1046(this.field1148, 172034532);
    }

    @ObfuscatedName("bm.z()V")
    public void method1070() {
        Statics.field1147.method1061(this.field1148, this.field1155, (byte) 6);
    }

    @ObfuscatedName("bm.c()V")
    public void method1068() {
        Statics.field1147.method1048(this.field1148, 220798396);
    }

    @ObfuscatedName("bm.d()V")
    public void method1073() {
        Statics.field1147.method1057(this.field1148, 609230358);
    }
}
