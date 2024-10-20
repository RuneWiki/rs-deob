package deob;

import java.awt.Component;

@ObfuscatedName("bw")
public class class55 extends class57 {

    @ObfuscatedName("bw.e")
    public int field1160;

    public class55(class136 arg0, int arg1) {
        Statics.field1159 = arg0.method2713();
        this.field1160 = arg1;
    }

    @ObfuscatedName("bw.o(Ljava/awt/Component;)V")
    public void method1067(Component arg0) throws Exception {
        Statics.field1159.method1065(arg0, Statics.field2641, Statics.field1182, 1389448031);
    }

    @ObfuscatedName("bw.e(I)V")
    public void method1068(int arg0) throws Exception {
        if (arg0 > 32768) {
            throw new IllegalArgumentException();
        }
        Statics.field1159.method1060(this.field1160, arg0, -1521974900);
    }

    @ObfuscatedName("bw.u()I")
    public int method1069() {
        return Statics.field1159.method1051(this.field1160, -2092380935);
    }

    @ObfuscatedName("bw.b()V")
    public void method1070() {
        Statics.field1159.method1046(this.field1160, this.field1168, (byte) 82);
    }

    @ObfuscatedName("bw.p()V")
    public void method1066() {
        Statics.field1159.method1047(this.field1160, -833532733);
    }

    @ObfuscatedName("bw.s()V")
    public void method1072() {
        Statics.field1159.method1048(this.field1160, 740155611);
    }
}
