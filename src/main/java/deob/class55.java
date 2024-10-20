package deob;

import java.awt.Component;

@ObfuscatedName("bq")
public class class55 extends class57 {

    @ObfuscatedName("bq.q")
    public int field1168;

    public class55(class136 arg0, int arg1) {
        Statics.field1169 = arg0.method2763();
        this.field1168 = arg1;
    }

    @ObfuscatedName("bq.h(Ljava/awt/Component;)V")
    public void method1097(Component arg0) throws Exception {
        Statics.field1169.method1080(arg0, Statics.field1189, Statics.field3098, 1976224573);
    }

    @ObfuscatedName("bq.q(I)V")
    public void method1098(int arg0) throws Exception {
        if (arg0 > 32768) {
            throw new IllegalArgumentException();
        }
        Statics.field1169.method1075(this.field1168, arg0, 858071172);
    }

    @ObfuscatedName("bq.v()I")
    public int method1099() {
        return Statics.field1169.method1076(this.field1168, 2747837);
    }

    @ObfuscatedName("bq.n()V")
    public void method1100() {
        Statics.field1169.method1077(this.field1168, this.field1174, (byte) -127);
    }

    @ObfuscatedName("bq.f()V")
    public void method1113() {
        Statics.field1169.method1078(this.field1168, -16340943);
    }

    @ObfuscatedName("bq.g()V")
    public void method1102() {
        Statics.field1169.method1083(this.field1168, 1154617098);
    }
}
