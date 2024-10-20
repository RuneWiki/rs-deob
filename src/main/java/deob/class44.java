package deob;

import java.awt.Component;

@ObfuscatedName("ap")
public class class44 extends class52 {

    @ObfuscatedName("ap.r")
    public int field1033;

    public class44(class74 arg0, int arg1) {
        Statics.field1032 = arg0.method1420();
        this.field1033 = arg1;
    }

    @ObfuscatedName("ap.a(Ljava/awt/Component;)V")
    public void method874(Component arg0) throws Exception {
        Statics.field1032.method864(arg0, Statics.field1080, Statics.field2456, (byte) 82);
    }

    @ObfuscatedName("ap.r(I)V")
    public void method870(int arg0) throws Exception {
        if (arg0 > 32768) {
            throw new IllegalArgumentException();
        }
        Statics.field1032.method849(this.field1033, arg0, (byte) 20);
    }

    @ObfuscatedName("ap.u()I")
    public int method871() {
        return Statics.field1032.method848(this.field1033, (byte) 111);
    }

    @ObfuscatedName("ap.t()V")
    public void method872() {
        Statics.field1032.method846(this.field1033, this.field1081, (byte) 64);
    }

    @ObfuscatedName("ap.k()V")
    public void method873() {
        Statics.field1032.method853(this.field1033, -2003198834);
    }

    @ObfuscatedName("ap.x()V")
    public void method877() {
        Statics.field1032.method867(this.field1033, (byte) 1);
    }
}
