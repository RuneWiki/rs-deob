package deob;

@ObfuscatedName("li")
public class class330 {

    @ObfuscatedName("li.n")
    public int field3879;

    @ObfuscatedName("li.v")
    public int field3878;

    @ObfuscatedName("li.d")
    public int field3881;

    @ObfuscatedName("li.c")
    public int field3877;

    public class330(int arg0, int arg1) {
        this(0, 0, arg0, arg1);
    }

    public class330(int arg0, int arg1, int arg2, int arg3) {
        this.method5697(arg0, arg1);
        this.method5693(arg2, arg3);
    }

    @ObfuscatedName("li.n(IIB)V")
    public void method5697(int arg0, int arg1) {
        this.field3879 = arg0;
        this.field3878 = arg1;
    }

    @ObfuscatedName("li.v(IIB)V")
    public void method5693(int arg0, int arg1) {
        this.field3881 = arg0;
        this.field3877 = arg1;
    }

    public String toString() {
        return null;
    }

    @ObfuscatedName("li.d(Lli;Lli;B)V")
    public void method5695(class330 arg0, class330 arg1) {
        this.method5706(arg0, arg1);
        this.method5692(arg0, arg1);
    }

    @ObfuscatedName("li.c(Lli;Lli;I)V")
    public void method5706(class330 arg0, class330 arg1) {
        arg1.field3879 = this.field3879;
        arg1.field3881 = this.field3881;
        if (this.field3879 < arg0.field3879) {
            arg1.field3881 -= arg0.field3879 - this.field3879;
            arg1.field3879 = arg0.field3879;
        }
        if (arg1.method5698() > arg0.method5698()) {
            arg1.field3881 -= arg1.method5698() - arg0.method5698();
        }
        if (arg1.field3881 < 0) {
            arg1.field3881 = 0;
        }
    }

    @ObfuscatedName("li.y(Lli;Lli;I)V")
    public void method5692(class330 arg0, class330 arg1) {
        arg1.field3878 = this.field3878;
        arg1.field3877 = this.field3877;
        if (this.field3878 < arg0.field3878) {
            arg1.field3877 -= arg0.field3878 - this.field3878;
            arg1.field3878 = arg0.field3878;
        }
        if (arg1.method5699() > arg0.method5699()) {
            arg1.field3877 -= arg1.method5699() - arg0.method5699();
        }
        if (arg1.field3877 < 0) {
            arg1.field3877 = 0;
        }
    }

    @ObfuscatedName("li.h(I)I")
    public int method5698() {
        return this.field3881 + this.field3879;
    }

    @ObfuscatedName("li.z(B)I")
    public int method5699() {
        return this.field3878 + this.field3877;
    }
}
