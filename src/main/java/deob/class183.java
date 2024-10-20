package deob;

@ObfuscatedName("gr")
public final class class183 {

    @ObfuscatedName("gr.e")
    public class194 field2929 = new class194();

    @ObfuscatedName("gr.a")
    public int field2928;

    @ObfuscatedName("gr.l")
    public int field2926;

    @ObfuscatedName("gr.c")
    public class186 field2927;

    @ObfuscatedName("gr.u")
    public class193 field2930 = new class193();

    public class183(int arg0) {
        this.field2928 = arg0;
        this.field2926 = arg0;
        int var2;
        for (var2 = 1; var2 + var2 < arg0; var2 += var2) {
        }
        this.field2927 = new class186(var2);
    }

    @ObfuscatedName("gr.e(J)Lgd;")
    public class194 method3302(long arg0) {
        class194 var3 = (class194) this.field2927.method3339(arg0);
        if (var3 != null) {
            this.field2930.method3429(var3);
        }
        return var3;
    }

    @ObfuscatedName("gr.a(J)V")
    public void method3308(long arg0) {
        class194 var3 = (class194) this.field2927.method3339(arg0);
        if (var3 != null) {
            var3.method3463();
            var3.method3440();
            this.field2926++;
        }
    }

    @ObfuscatedName("gr.l(Lgd;J)V")
    public void method3304(class194 arg0, long arg1) {
        if (this.field2926 == 0) {
            class194 var4 = this.field2930.method3424();
            var4.method3463();
            var4.method3440();
            if (this.field2929 == var4) {
                class194 var5 = this.field2930.method3424();
                var5.method3463();
                var5.method3440();
            }
        } else {
            this.field2926--;
        }
        this.field2927.method3338(arg0, arg1);
        this.field2930.method3429(arg0);
    }

    @ObfuscatedName("gr.c()V")
    public void method3303() {
        this.field2930.method3426();
        this.field2927.method3340();
        this.field2929 = new class194();
        this.field2926 = this.field2928;
    }
}
