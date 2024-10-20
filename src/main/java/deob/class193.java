package deob;

@ObfuscatedName("gm")
public final class class193 {

    @ObfuscatedName("gm.i")
    public class204 field3066 = new class204();

    @ObfuscatedName("gm.v")
    public int field3064;

    @ObfuscatedName("gm.r")
    public int field3065;

    @ObfuscatedName("gm.n")
    public class196 field3067;

    @ObfuscatedName("gm.x")
    public class203 field3063 = new class203();

    public class193(int arg0) {
        this.field3064 = arg0;
        this.field3065 = arg0;
        int var2;
        for (var2 = 1; var2 + var2 < arg0; var2 += var2) {
        }
        this.field3067 = new class196(var2);
    }

    @ObfuscatedName("gm.i(J)Lgn;")
    public class204 method3464(long arg0) {
        class204 var3 = (class204) this.field3067.method3496(arg0);
        if (var3 != null) {
            this.field3063.method3595(var3);
        }
        return var3;
    }

    @ObfuscatedName("gm.v(J)V")
    public void method3463(long arg0) {
        class204 var3 = (class204) this.field3067.method3496(arg0);
        if (var3 != null) {
            var3.method3626();
            var3.method3602();
            this.field3065++;
        }
    }

    @ObfuscatedName("gm.r(Lgn;J)V")
    public void method3466(class204 arg0, long arg1) {
        if (this.field3065 == 0) {
            class204 var4 = this.field3063.method3588();
            var4.method3626();
            var4.method3602();
            if (this.field3066 == var4) {
                class204 var5 = this.field3063.method3588();
                var5.method3626();
                var5.method3602();
            }
        } else {
            this.field3065--;
        }
        this.field3067.method3497(arg0, arg1);
        this.field3063.method3595(arg0);
    }

    @ObfuscatedName("gm.n()V")
    public void method3467() {
        this.field3063.method3590();
        this.field3067.method3498();
        this.field3066 = new class204();
        this.field3065 = this.field3064;
    }
}
