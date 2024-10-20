package deob;

@ObfuscatedName("ii")
public final class class236 {

    @ObfuscatedName("ii.l")
    public class365 field2656 = new class365();

    @ObfuscatedName("ii.q")
    public int field2653;

    @ObfuscatedName("ii.f")
    public int field2655;

    @ObfuscatedName("ii.j")
    public class379 field2657;

    @ObfuscatedName("ii.m")
    public class314 field2654 = new class314();

    public class236(int arg0) {
        this.field2653 = arg0;
        this.field2655 = arg0;
        int var2;
        for (var2 = 1; var2 + var2 < arg0; var2 += var2) {
        }
        this.field2657 = new class379(var2);
    }

    @ObfuscatedName("ii.l(J)Lnu;")
    public class365 method4223(long arg0) {
        class365 var3 = (class365) this.field2657.method6049(arg0);
        if (var3 != null) {
            this.field2654.method5168(var3);
        }
        return var3;
    }

    @ObfuscatedName("ii.q(J)V")
    public void method4227(long arg0) {
        class365 var3 = (class365) this.field2657.method6049(arg0);
        if (var3 != null) {
            var3.method5775();
            var3.method5771();
            this.field2655++;
        }
    }

    @ObfuscatedName("ii.f(Lnu;J)V")
    public void method4225(class365 arg0, long arg1) {
        if (this.field2655 == 0) {
            class365 var4 = this.field2654.method5163();
            var4.method5775();
            var4.method5771();
            if (this.field2656 == var4) {
                class365 var5 = this.field2654.method5163();
                var5.method5775();
                var5.method5771();
            }
        } else {
            this.field2655--;
        }
        this.field2657.method6043(arg0, arg1);
        this.field2654.method5168(arg0);
    }

    @ObfuscatedName("ii.j()V")
    public void method4226() {
        this.field2654.method5160();
        this.field2657.method6044();
        this.field2656 = new class365();
        this.field2655 = this.field2653;
    }
}
