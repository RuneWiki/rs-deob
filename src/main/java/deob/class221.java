package deob;

@ObfuscatedName("hz")
public final class class221 {

    @ObfuscatedName("hz.v")
    public class347 field2567 = new class347();

    @ObfuscatedName("hz.n")
    public int field2566;

    @ObfuscatedName("hz.f")
    public int field2568;

    @ObfuscatedName("hz.y")
    public class361 field2569;

    @ObfuscatedName("hz.p")
    public class299 field2570 = new class299();

    public class221(int arg0) {
        this.field2566 = arg0;
        this.field2568 = arg0;
        int var2;
        for (var2 = 1; var2 + var2 < arg0; var2 += var2) {
        }
        this.field2569 = new class361(var2);
    }

    @ObfuscatedName("hz.v(J)Lmf;")
    public class347 method3948(long arg0) {
        class347 var3 = (class347) this.field2569.method5752(arg0);
        if (var3 != null) {
            this.field2570.method4853(var3);
        }
        return var3;
    }

    @ObfuscatedName("hz.n(J)V")
    public void method3954(long arg0) {
        class347 var3 = (class347) this.field2569.method5752(arg0);
        if (var3 != null) {
            var3.method5496();
            var3.method5487();
            this.field2568++;
        }
    }

    @ObfuscatedName("hz.f(Lmf;J)V")
    public void method3947(class347 arg0, long arg1) {
        if (this.field2568 == 0) {
            class347 var4 = this.field2570.method4855();
            var4.method5496();
            var4.method5487();
            if (this.field2567 == var4) {
                class347 var5 = this.field2570.method4855();
                var5.method5496();
                var5.method5487();
            }
        } else {
            this.field2568--;
        }
        this.field2569.method5754(arg0, arg1);
        this.field2570.method4853(arg0);
    }

    @ObfuscatedName("hz.y()V")
    public void method3957() {
        this.field2570.method4862();
        this.field2569.method5761();
        this.field2567 = new class347();
        this.field2568 = this.field2566;
    }
}
