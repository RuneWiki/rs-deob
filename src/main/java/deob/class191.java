package deob;

@ObfuscatedName("gq")
public final class class191 {

    @ObfuscatedName("gq.e")
    public class196 field2439 = new class196();

    @ObfuscatedName("gq.n")
    public int field2440;

    @ObfuscatedName("gq.g")
    public int field2441;

    @ObfuscatedName("gq.y")
    public class192 field2442;

    @ObfuscatedName("gq.w")
    public class186 field2443 = new class186();

    public class191(int arg0) {
        this.field2440 = arg0;
        this.field2441 = arg0;
        int var2;
        for (var2 = 1; var2 + var2 < arg0; var2 += var2) {
        }
        this.field2442 = new class192(var2);
    }

    @ObfuscatedName("gq.e(J)Lgz;")
    public class196 method3288(long arg0) {
        class196 var3 = (class196) this.field2442.method3294(arg0);
        if (var3 != null) {
            this.field2443.method3229(var3);
        }
        return var3;
    }

    @ObfuscatedName("gq.n(J)V")
    public void method3280(long arg0) {
        class196 var3 = (class196) this.field2442.method3294(arg0);
        if (var3 != null) {
            var3.method3333();
            var3.method3380();
            this.field2441++;
        }
    }

    @ObfuscatedName("gq.g(Lgz;J)V")
    public void method3278(class196 arg0, long arg1) {
        if (this.field2441 == 0) {
            class196 var4 = this.field2443.method3234();
            var4.method3333();
            var4.method3380();
            if (this.field2439 == var4) {
                class196 var5 = this.field2443.method3234();
                var5.method3333();
                var5.method3380();
            }
        } else {
            this.field2441--;
        }
        this.field2442.method3293(arg0, arg1);
        this.field2443.method3229(arg0);
    }

    @ObfuscatedName("gq.y()V")
    public void method3282() {
        this.field2443.method3233();
        this.field2442.method3296();
        this.field2439 = new class196();
        this.field2441 = this.field2440;
    }
}
