package deob;

import java.awt.Component;

@ObfuscatedName("bw")
public class class55 extends class57 {

    @ObfuscatedName("bw.l")
    public int field1177;

    public class55(class136 arg0, int arg1) {
        Statics.field1176 = arg0.method2671();
        this.field1177 = arg1;
    }

    @ObfuscatedName("bw.j(Ljava/awt/Component;)V")
    public void method1106(Component arg0) throws Exception {
        Statics.field1176.method1084(arg0, Statics.field1781, Statics.field1192, -1194555761);
    }

    @ObfuscatedName("bw.l(I)V")
    public void method1099(int arg0) throws Exception {
        if (arg0 > 32768) {
            throw new IllegalArgumentException();
        }
        Statics.field1176.method1080(this.field1177, arg0, (byte) 0);
    }

    @ObfuscatedName("bw.a()I")
    public int method1101() {
        return Statics.field1176.method1081(this.field1177, 2071908958);
    }

    @ObfuscatedName("bw.i()V")
    public void method1107() {
        Statics.field1176.method1087(this.field1177, this.field1201, (byte) 111);
    }

    @ObfuscatedName("bw.f()V")
    public void method1102() {
        Statics.field1176.method1083(this.field1177, 1757842062);
    }

    @ObfuscatedName("bw.m()V")
    public void method1103() {
        Statics.field1176.method1079(this.field1177, 307816345);
    }
}
