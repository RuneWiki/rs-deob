package deob;

import java.awt.Component;

@ObfuscatedName("at")
public class class43 extends class51 {

    @ObfuscatedName("at.j")
    public int field1031;

    public class43(class73 arg0, int arg1) {
        Statics.field1030 = arg0.method1443();
        this.field1031 = arg1;
    }

    @ObfuscatedName("at.c(Ljava/awt/Component;)V")
    public void method885(Component arg0) throws Exception {
        Statics.field1030.method866(arg0, Statics.field1090, Statics.field1077, 525895240);
    }

    @ObfuscatedName("at.j(I)V")
    public void method886(int arg0) throws Exception {
        if (arg0 > 32768) {
            throw new IllegalArgumentException();
        }
        Statics.field1030.method883(this.field1031, arg0, -2021154143);
    }

    @ObfuscatedName("at.f()I")
    public int method888() {
        return Statics.field1030.method882(this.field1031, -1117878106);
    }

    @ObfuscatedName("at.y()V")
    public void method902() {
        Statics.field1030.method864(this.field1031, this.field1091, (byte) 55);
    }

    @ObfuscatedName("at.x()V")
    public void method889() {
        Statics.field1030.method865(this.field1031, 147357011);
    }

    @ObfuscatedName("at.e()V")
    public void method890() {
        Statics.field1030.method874(this.field1031, -2091798492);
    }
}
