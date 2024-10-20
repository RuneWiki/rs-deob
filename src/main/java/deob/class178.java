package deob;

import java.awt.Component;

@ObfuscatedName("an")
public class class178 extends class185 {

    @ObfuscatedName("an.h")
    public int field2661;

    @ObfuscatedName("an.h(I)V")
    public void method2758(int arg0) throws Exception {
        if (arg0 > 32768) {
            throw new IllegalArgumentException();
        }
        Statics.field2662.method2980(this.field2661, arg0, 1590904390);
    }

    @ObfuscatedName("an.k()I")
    public int method2761() {
        return Statics.field2662.method2981(this.field2661, -1204153202);
    }

    @ObfuscatedName("an.w()V")
    public void method2756() {
        Statics.field2662.method3000(this.field2661, this.field2831, -1267404985);
    }

    @ObfuscatedName("an.t()V")
    public void method2759() {
        Statics.field2662.method2985(this.field2661, (short) 5646);
    }

    @ObfuscatedName("an.d()V")
    public void method2769() {
        Statics.field2662.method2984(this.field2661, (byte) 14);
    }

    @ObfuscatedName("an.b(Ljava/awt/Component;)V")
    public void method2762(Component arg0) throws Exception {
        Statics.field2662.method2982(arg0, Statics.field2840, Statics.field2825, -1136669374);
    }

    public class178(class116 arg0, int arg1) {
        Statics.field2662 = arg0.method2074();
        this.field2661 = arg1;
    }
}
