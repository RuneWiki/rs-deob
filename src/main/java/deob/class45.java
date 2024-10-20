package deob;

import java.awt.Component;

@ObfuscatedName("af")
public class class45 extends class53 {

    @ObfuscatedName("af.i")
    public int field1063;

    public class45(class75 arg0, int arg1) {
        Statics.field1064 = arg0.method1543();
        this.field1063 = arg1;
    }

    @ObfuscatedName("af.e(Ljava/awt/Component;)V")
    public void method968(Component arg0) throws Exception {
        Statics.field1064.method965(arg0, Statics.field1126, Statics.field1118, (byte) 107);
    }

    @ObfuscatedName("af.i(I)V")
    public void method977(int arg0) throws Exception {
        if (arg0 > 32768) {
            throw new IllegalArgumentException();
        }
        Statics.field1064.method949(this.field1063, arg0, 13237463);
    }

    @ObfuscatedName("af.k()I")
    public int method967() {
        return Statics.field1064.method950(this.field1063, (byte) 0);
    }

    @ObfuscatedName("af.q()V")
    public void method969() {
        Statics.field1064.method952(this.field1063, this.field1113, 430971342);
    }

    @ObfuscatedName("af.j()V")
    public void method976() {
        Statics.field1064.method948(this.field1063, 688064167);
    }

    @ObfuscatedName("af.z()V")
    public void method971() {
        Statics.field1064.method953(this.field1063, (byte) 77);
    }
}
