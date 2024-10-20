package deob;

@ObfuscatedName("gp")
public final class class197 {

    @ObfuscatedName("gp.b")
    public class202 field2547 = new class202();

    @ObfuscatedName("gp.s")
    public int field2544;

    @ObfuscatedName("gp.r")
    public int field2545;

    @ObfuscatedName("gp.g")
    public class198 field2543;

    @ObfuscatedName("gp.x")
    public class192 field2546 = new class192();

    public class197(int arg0) {
        this.field2544 = arg0;
        this.field2545 = arg0;
        int var2;
        for (var2 = 1; var2 + var2 < arg0; var2 += var2) {
        }
        this.field2543 = new class198(var2);
    }

    @ObfuscatedName("gp.b(J)Lgh;")
    public class202 method3330(long arg0) {
        class202 var3 = (class202) this.field2543.method3340(arg0);
        if (var3 != null) {
            this.field2546.method3286(var3);
        }
        return var3;
    }

    @ObfuscatedName("gp.s(J)V")
    public void method3331(long arg0) {
        class202 var3 = (class202) this.field2543.method3340(arg0);
        if (var3 != null) {
            var3.method3392();
            var3.method3428();
            this.field2545++;
        }
    }

    @ObfuscatedName("gp.r(Lgh;J)V")
    public void method3332(class202 arg0, long arg1) {
        if (this.field2545 == 0) {
            class202 var4 = this.field2546.method3288();
            var4.method3392();
            var4.method3428();
            if (this.field2547 == var4) {
                class202 var5 = this.field2546.method3288();
                var5.method3392();
                var5.method3428();
            }
        } else {
            this.field2545--;
        }
        this.field2543.method3352(arg0, arg1);
        this.field2546.method3286(arg0);
    }

    @ObfuscatedName("gp.g()V")
    public void method3333() {
        this.field2546.method3294();
        this.field2543.method3342();
        this.field2547 = new class202();
        this.field2545 = this.field2544;
    }
}
