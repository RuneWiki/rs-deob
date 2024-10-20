package deob;

import java.awt.Component;

@ObfuscatedName("af")
public class class50 extends class52 {

    @ObfuscatedName("af.a")
    public int field1051;

    public class50(class128 arg0, int arg1) {
        Statics.field1050 = arg0.method2569();
        this.field1051 = arg1;
    }

    @ObfuscatedName("af.e(Ljava/awt/Component;)V")
    public void method975(Component arg0) throws Exception {
        Statics.field1050.method969(arg0, Statics.field1064, Statics.field1057, (byte) -40);
    }

    @ObfuscatedName("af.a(I)V")
    public void method990(int arg0) throws Exception {
        if (arg0 > 32768) {
            throw new IllegalArgumentException();
        }
        Statics.field1050.method954(this.field1051, arg0, 1230953759);
    }

    @ObfuscatedName("af.l()I")
    public int method977() {
        return Statics.field1050.method955(this.field1051, (byte) 81);
    }

    @ObfuscatedName("af.c()V")
    public void method995() {
        Statics.field1050.method961(this.field1051, this.field1059, (byte) 68);
    }

    @ObfuscatedName("af.u()V")
    public void method979() {
        Statics.field1050.method957(this.field1051, -1828708583);
    }

    @ObfuscatedName("af.w()V")
    public void method976() {
        Statics.field1050.method956(this.field1051, -231193695);
    }
}
