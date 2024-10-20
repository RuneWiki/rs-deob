package deob;

import java.awt.Component;

@ObfuscatedName("au")
public class class49 extends class51 {

    @ObfuscatedName("au.t")
    public int field1068;

    public class49(class127 arg0, int arg1) {
        Statics.field1067 = arg0.method2535();
        this.field1068 = arg1;
    }

    @ObfuscatedName("au.v(Ljava/awt/Component;)V")
    public void method948(Component arg0) throws Exception {
        Statics.field1067.method921(arg0, Statics.field1819, Statics.field1078, (short) -28244);
    }

    @ObfuscatedName("au.t(I)V")
    public void method931(int arg0) throws Exception {
        if (arg0 > 32768) {
            throw new IllegalArgumentException();
        }
        Statics.field1067.method909(this.field1068, arg0, -1908559403);
    }

    @ObfuscatedName("au.f()I")
    public int method932() {
        return Statics.field1067.method910(this.field1068, (byte) 10);
    }

    @ObfuscatedName("au.j()V")
    public void method933() {
        Statics.field1067.method918(this.field1068, this.field1075, (byte) 5);
    }

    @ObfuscatedName("au.l()V")
    public void method934() {
        Statics.field1067.method912(this.field1068, (byte) 41);
    }

    @ObfuscatedName("au.g()V")
    public void method939() {
        Statics.field1067.method926(this.field1068, 50202124);
    }
}
