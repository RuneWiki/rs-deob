package deob;

import java.awt.Component;

@ObfuscatedName("bg")
public class class55 extends class57 {

    @ObfuscatedName("bg.s")
    public int field1174;

    public class55(class136 arg0, int arg1) {
        Statics.field1173 = arg0.method2710();
        this.field1174 = arg1;
    }

    @ObfuscatedName("bg.f(Ljava/awt/Component;)V")
    public void method1102(Component arg0) throws Exception {
        Statics.field1173.method1085(arg0, Statics.field3153, Statics.field1195, 324953174);
    }

    @ObfuscatedName("bg.s(I)V")
    public void method1103(int arg0) throws Exception {
        if (arg0 > 32768) {
            throw new IllegalArgumentException();
        }
        Statics.field1173.method1078(this.field1174, arg0, (byte) 30);
    }

    @ObfuscatedName("bg.q()I")
    public int method1104() {
        return Statics.field1173.method1077(this.field1174, (byte) 52);
    }

    @ObfuscatedName("bg.g()V")
    public void method1113() {
        Statics.field1173.method1080(this.field1174, this.field1203, -812044128);
    }

    @ObfuscatedName("bg.m()V")
    public void method1105() {
        Statics.field1173.method1081(this.field1174, 250362071);
    }

    @ObfuscatedName("bg.t()V")
    public void method1106() {
        Statics.field1173.method1089(this.field1174, -356586250);
    }
}
