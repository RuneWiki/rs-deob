package deob;

@ObfuscatedName("gj")
public final class class193 {

    @ObfuscatedName("gj.n")
    public class204 field3061 = new class204();

    @ObfuscatedName("gj.d")
    public int field3060;

    @ObfuscatedName("gj.s")
    public int field3062;

    @ObfuscatedName("gj.q")
    public class196 field3063;

    @ObfuscatedName("gj.j")
    public class203 field3064 = new class203();

    public class193(int arg0) {
        this.field3060 = arg0;
        this.field3062 = arg0;
        int var2;
        for (var2 = 1; var2 + var2 < arg0; var2 += var2) {
        }
        this.field3063 = new class196(var2);
    }

    @ObfuscatedName("gj.n(J)Lgt;")
    public class204 method3478(long arg0) {
        class204 var3 = (class204) this.field3063.method3519(arg0);
        if (var3 != null) {
            this.field3064.method3611(var3);
        }
        return var3;
    }

    @ObfuscatedName("gj.d(J)V")
    public void method3479(long arg0) {
        class204 var3 = (class204) this.field3063.method3519(arg0);
        if (var3 != null) {
            var3.method3651();
            var3.method3627();
            this.field3062++;
        }
    }

    @ObfuscatedName("gj.s(Lgt;J)V")
    public void method3481(class204 arg0, long arg1) {
        if (this.field3062 == 0) {
            class204 var4 = this.field3064.method3620();
            var4.method3651();
            var4.method3627();
            if (this.field3061 == var4) {
                class204 var5 = this.field3064.method3620();
                var5.method3651();
                var5.method3627();
            }
        } else {
            this.field3062--;
        }
        this.field3063.method3526(arg0, arg1);
        this.field3064.method3611(arg0);
    }

    @ObfuscatedName("gj.q()V")
    public void method3480() {
        this.field3064.method3615();
        this.field3063.method3518();
        this.field3061 = new class204();
        this.field3062 = this.field3060;
    }
}
