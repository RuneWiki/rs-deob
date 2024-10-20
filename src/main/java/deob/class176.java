package deob;

import java.awt.Component;

@ObfuscatedName("ap")
public class class176 extends class163 {

    @ObfuscatedName("ap.c")
    public int field2701;

    @ObfuscatedName("ap.v(Ljava/awt/Component;)V")
    public void method2859(Component arg0) throws Exception {
        Statics.field2700.method3508(arg0, Statics.field1914, Statics.field1773, (byte) 86);
    }

    @ObfuscatedName("ap.c(I)V")
    public void method2860(int arg0) throws Exception {
        if (arg0 > 32768) {
            throw new IllegalArgumentException();
        }
        Statics.field2700.method3497(this.field2701, arg0, 1120227007);
    }

    @ObfuscatedName("ap.i()V")
    public void method2862() {
        Statics.field2700.method3502(this.field2701, this.field2433, (byte) 121);
    }

    @ObfuscatedName("ap.z()V")
    public void method2867() {
        Statics.field2700.method3496(this.field2701, 1320044759);
    }

    public class176(class130 arg0, int arg1) {
        Statics.field2700 = arg0.method2227();
        this.field2701 = arg1;
    }

    @ObfuscatedName("ap.m()V")
    public void method2863() {
        Statics.field2700.method3500(this.field2701, (byte) -6);
    }

    @ObfuscatedName("ap.b()I")
    public int method2876() {
        return Statics.field2700.method3498(this.field2701, -4043703);
    }
}
