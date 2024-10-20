package deob;

@ObfuscatedName("gh")
public final class class193 {

    @ObfuscatedName("gh.g")
    public class204 field3066 = new class204();

    @ObfuscatedName("gh.b")
    public int field3063;

    @ObfuscatedName("gh.w")
    public int field3062;

    @ObfuscatedName("gh.d")
    public class196 field3065;

    @ObfuscatedName("gh.z")
    public class203 field3064 = new class203();

    public class193(int arg0) {
        this.field3063 = arg0;
        this.field3062 = arg0;
        int var2;
        for (var2 = 1; var2 + var2 < arg0; var2 += var2) {
        }
        this.field3065 = new class196(var2);
    }

    @ObfuscatedName("gh.g(J)Lgm;")
    public class204 method3529(long arg0) {
        class204 var3 = (class204) this.field3065.method3573(arg0);
        if (var3 != null) {
            this.field3064.method3653(var3);
        }
        return var3;
    }

    @ObfuscatedName("gh.b(J)V")
    public void method3534(long arg0) {
        class204 var3 = (class204) this.field3065.method3573(arg0);
        if (var3 != null) {
            var3.method3693();
            var3.method3671();
            this.field3062++;
        }
    }

    @ObfuscatedName("gh.w(Lgm;J)V")
    public void method3528(class204 arg0, long arg1) {
        if (this.field3062 == 0) {
            class204 var4 = this.field3064.method3655();
            var4.method3693();
            var4.method3671();
            if (this.field3066 == var4) {
                class204 var5 = this.field3064.method3655();
                var5.method3693();
                var5.method3671();
            }
        } else {
            this.field3062--;
        }
        this.field3065.method3569(arg0, arg1);
        this.field3064.method3653(arg0);
    }

    @ObfuscatedName("gh.d()V")
    public void method3532() {
        this.field3064.method3657();
        this.field3065.method3570();
        this.field3066 = new class204();
        this.field3062 = this.field3063;
    }
}
