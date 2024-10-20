package deob;

import java.awt.Component;

@ObfuscatedName("al")
public class class172 extends class186 {

    @ObfuscatedName("al.p")
    public int field2597;

    @ObfuscatedName("al.p(I)V")
    public void method3314(int arg0) throws Exception {
        if (arg0 > 32768) {
            throw new IllegalArgumentException();
        }
        Statics.field2598.method3378(this.field2597, arg0, -1471612878);
    }

    @ObfuscatedName("al.o()I")
    public int method3315() {
        return Statics.field2598.method3389(this.field2597, (byte) 29);
    }

    @ObfuscatedName("al.t()V")
    public void method3316() {
        Statics.field2598.method3380(this.field2597, this.field2847, (byte) -78);
    }

    @ObfuscatedName("al.h()V")
    public void method3317() {
        Statics.field2598.method3393(this.field2597, (byte) 0);
    }

    @ObfuscatedName("al.r()V")
    public void method3318() {
        Statics.field2598.method3391(this.field2597, 2100108492);
    }

    public class172(class110 arg0, int arg1) {
        Statics.field2598 = arg0.method1908();
        this.field2597 = arg1;
    }

    @ObfuscatedName("al.j(Ljava/awt/Component;)V")
    public void method3330(Component arg0) throws Exception {
        Statics.field2598.method3383(arg0, Statics.field2851, Statics.field2866, 2122016265);
    }
}
