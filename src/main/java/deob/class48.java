package deob;

import java.awt.Component;

@ObfuscatedName("ax")
public class class48 extends class50 {

    @ObfuscatedName("ax.c")
    public int field1076;

    public class48(class123 arg0, int arg1) {
        Statics.field1075 = arg0.method2495();
        this.field1076 = arg1;
    }

    @ObfuscatedName("ax.i(Ljava/awt/Component;)V")
    public void method939(Component arg0) throws Exception {
        Statics.field1075.method913(arg0, Statics.field1095, Statics.field1082, (byte) 44);
    }

    @ObfuscatedName("ax.c(I)V")
    public void method937(int arg0) throws Exception {
        if (arg0 > 32768) {
            throw new IllegalArgumentException();
        }
        Statics.field1075.method920(this.field1076, arg0, 1069594433);
    }

    @ObfuscatedName("ax.h()I")
    public int method934() {
        return Statics.field1075.method911(this.field1076, -275641070);
    }

    @ObfuscatedName("ax.v()V")
    public void method935() {
        Statics.field1075.method919(this.field1076, this.field1086, 1807675108);
    }

    @ObfuscatedName("ax.q()V")
    public void method940() {
        Statics.field1075.method929(this.field1076, 19551688);
    }

    @ObfuscatedName("ax.s()V")
    public void method945() {
        Statics.field1075.method916(this.field1076, 55943853);
    }
}
