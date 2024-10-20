package deob;

@ObfuscatedName("if")
public final class class257 {

    @ObfuscatedName("if.c")
    public class407 field2923 = new class407();

    @ObfuscatedName("if.p")
    public int field2925;

    @ObfuscatedName("if.f")
    public int field2924;

    @ObfuscatedName("if.n")
    public class421 field2926;

    @ObfuscatedName("if.k")
    public class341 field2922 = new class341();

    public class257(int arg0) {
        this.field2925 = arg0;
        this.field2924 = arg0;
        int var2;
        for (var2 = 1; var2 + var2 < arg0; var2 += var2) {
        }
        this.field2926 = new class421(var2);
    }

    @ObfuscatedName("if.c(J)Loa;")
    public class407 method4789(long arg0) {
        class407 var3 = (class407) this.field2926.method6917(arg0);
        if (var3 != null) {
            this.field2922.method5789(var3);
        }
        return var3;
    }

    @ObfuscatedName("if.p(J)V")
    public void method4780(long arg0) {
        class407 var3 = (class407) this.field2926.method6917(arg0);
        if (var3 != null) {
            var3.method6657();
            var3.method6653();
            this.field2924++;
        }
    }

    @ObfuscatedName("if.f(Loa;J)V")
    public void method4781(class407 arg0, long arg1) {
        if (this.field2924 == 0) {
            class407 var4 = this.field2922.method5803();
            var4.method6657();
            var4.method6653();
            if (this.field2923 == var4) {
                class407 var5 = this.field2922.method5803();
                var5.method6657();
                var5.method6653();
            }
        } else {
            this.field2924--;
        }
        this.field2926.method6918(arg0, arg1);
        this.field2922.method5789(arg0);
    }

    @ObfuscatedName("if.n()V")
    public void method4782() {
        this.field2922.method5788();
        this.field2926.method6928();
        this.field2923 = new class407();
        this.field2924 = this.field2925;
    }
}
