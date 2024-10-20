package deob;

@ObfuscatedName("fv")
public final class class2 {

    @ObfuscatedName("fv.b")
    public class6 field4 = new class6();

    @ObfuscatedName("fv.k")
    public int field2;

    @ObfuscatedName("fv.h")
    public int field3;

    @ObfuscatedName("fv.w")
    public class3 field5;

    @ObfuscatedName("fv.t")
    public class20 field6 = new class20();

    @ObfuscatedName("fv.b(J)Lfk;")
    public class6 method1(long arg0) {
        class6 var3 = (class6) this.field5.method20(arg0);
        if (var3 != null) {
            this.field6.method247(var3);
        }
        return var3;
    }

    @ObfuscatedName("fv.h(J)V")
    public void method3(long arg0) {
        class6 var3 = (class6) this.field5.method20(arg0);
        if (var3 != null) {
            var3.method234();
            var3.method51();
            this.field2++;
        }
    }

    @ObfuscatedName("fv.k(Lfk;J)V")
    public void method4(class6 arg0, long arg1) {
        if (this.field2 == 0) {
            class6 var4 = this.field6.method248();
            var4.method234();
            var4.method51();
            if (this.field4 == var4) {
                class6 var5 = this.field6.method248();
                var5.method234();
                var5.method51();
            }
        } else {
            this.field2--;
        }
        this.field5.method14(arg0, arg1);
        this.field6.method247(arg0);
    }

    @ObfuscatedName("fv.w()V")
    public void method5() {
        this.field6.method250();
        this.field5.method15();
        this.field4 = new class6();
        this.field2 = this.field3;
    }

    public class2(int arg0) {
        this.field3 = arg0;
        this.field2 = arg0;
        int var2;
        for (var2 = 1; var2 + var2 < arg0; var2 += var2) {
        }
        this.field5 = new class3(var2);
    }
}
