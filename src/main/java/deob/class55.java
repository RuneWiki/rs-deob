package deob;

import java.awt.Component;

@ObfuscatedName("bf")
public class class55 extends class57 {

    @ObfuscatedName("bf.m")
    public int field1157;

    public class55(class136 arg0, int arg1) {
        Statics.field1156 = arg0.method2754();
        this.field1157 = arg1;
    }

    @ObfuscatedName("bf.j(Ljava/awt/Component;)V")
    public void method1118(Component arg0) throws Exception {
        Statics.field1156.method1110(arg0, Statics.field1184, Statics.field3216, -1526331111);
    }

    @ObfuscatedName("bf.m(I)V")
    public void method1119(int arg0) throws Exception {
        if (arg0 > 32768) {
            throw new IllegalArgumentException();
        }
        Statics.field1156.method1098(this.field1157, arg0, (byte) -91);
    }

    @ObfuscatedName("bf.f()I")
    public int method1120() {
        return Statics.field1156.method1099(this.field1157, 2075018564);
    }

    @ObfuscatedName("bf.l()V")
    public void method1125() {
        Statics.field1156.method1100(this.field1157, this.field1166, 97230528);
    }

    @ObfuscatedName("bf.u()V")
    public void method1122() {
        Statics.field1156.method1101(this.field1157, 1717238024);
    }

    @ObfuscatedName("bf.a()V")
    public void method1139() {
        Statics.field1156.method1114(this.field1157, 1334104258);
    }
}
