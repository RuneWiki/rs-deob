package deob;

@ObfuscatedName("gt")
public final class class193 {

    @ObfuscatedName("gt.j")
    public class204 field3076 = new class204();

    @ObfuscatedName("gt.l")
    public int field3077;

    @ObfuscatedName("gt.a")
    public int field3079;

    @ObfuscatedName("gt.i")
    public class196 field3078;

    @ObfuscatedName("gt.f")
    public class203 field3075 = new class203();

    public class193(int arg0) {
        this.field3077 = arg0;
        this.field3079 = arg0;
        int var2;
        for (var2 = 1; var2 + var2 < arg0; var2 += var2) {
        }
        this.field3078 = new class196(var2);
    }

    @ObfuscatedName("gt.j(J)Lgj;")
    public class204 method3466(long arg0) {
        class204 var3 = (class204) this.field3078.method3499(arg0);
        if (var3 != null) {
            this.field3075.method3569(var3);
        }
        return var3;
    }

    @ObfuscatedName("gt.l(J)V")
    public void method3467(long arg0) {
        class204 var3 = (class204) this.field3078.method3499(arg0);
        if (var3 != null) {
            var3.method3608();
            var3.method3590();
            this.field3079++;
        }
    }

    @ObfuscatedName("gt.a(Lgj;J)V")
    public void method3468(class204 arg0, long arg1) {
        if (this.field3079 == 0) {
            class204 var4 = this.field3075.method3571();
            var4.method3608();
            var4.method3590();
            if (this.field3076 == var4) {
                class204 var5 = this.field3075.method3571();
                var5.method3608();
                var5.method3590();
            }
        } else {
            this.field3079--;
        }
        this.field3078.method3501(arg0, arg1);
        this.field3075.method3569(arg0);
    }

    @ObfuscatedName("gt.i()V")
    public void method3475() {
        this.field3075.method3579();
        this.field3078.method3498();
        this.field3076 = new class204();
        this.field3079 = this.field3077;
    }
}
