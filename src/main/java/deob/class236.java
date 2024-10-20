package deob;

@ObfuscatedName("ig")
public final class class236 {

    @ObfuscatedName("ig.i")
    public class365 field2658 = new class365();

    @ObfuscatedName("ig.w")
    public int field2659;

    @ObfuscatedName("ig.s")
    public int field2660;

    @ObfuscatedName("ig.a")
    public class379 field2661;

    @ObfuscatedName("ig.o")
    public class314 field2662 = new class314();

    public class236(int arg0) {
        this.field2659 = arg0;
        this.field2660 = arg0;
        int var2;
        for (var2 = 1; var2 + var2 < arg0; var2 += var2) {
        }
        this.field2661 = new class379(var2);
    }

    @ObfuscatedName("ig.i(J)Lnt;")
    public class365 method4205(long arg0) {
        class365 var3 = (class365) this.field2661.method6009(arg0);
        if (var3 != null) {
            this.field2662.method5124(var3);
        }
        return var3;
    }

    @ObfuscatedName("ig.w(J)V")
    public void method4208(long arg0) {
        class365 var3 = (class365) this.field2661.method6009(arg0);
        if (var3 != null) {
            var3.method5752();
            var3.method5748();
            this.field2660++;
        }
    }

    @ObfuscatedName("ig.s(Lnt;J)V")
    public void method4206(class365 arg0, long arg1) {
        if (this.field2660 == 0) {
            class365 var4 = this.field2662.method5128();
            var4.method5752();
            var4.method5748();
            if (this.field2658 == var4) {
                class365 var5 = this.field2662.method5128();
                var5.method5752();
                var5.method5748();
            }
        } else {
            this.field2660--;
        }
        this.field2661.method6010(arg0, arg1);
        this.field2662.method5124(arg0);
    }

    @ObfuscatedName("ig.a()V")
    public void method4207() {
        this.field2662.method5123();
        this.field2661.method6022();
        this.field2658 = new class365();
        this.field2660 = this.field2659;
    }
}
