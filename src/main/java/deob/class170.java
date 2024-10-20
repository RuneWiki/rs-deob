package deob;

@ObfuscatedName("fb")
public final class class170 {

    @ObfuscatedName("fb.g")
    public class174 field2794 = new class174();

    @ObfuscatedName("fb.m")
    public int field2793;

    @ObfuscatedName("fb.v")
    public int field2795;

    @ObfuscatedName("fb.r")
    public class175 field2792;

    @ObfuscatedName("fb.n")
    public class172 field2796 = new class172();

    public class170(int arg0) {
        this.field2793 = arg0;
        this.field2795 = arg0;
        int var2;
        for (var2 = 1; var2 + var2 < arg0; var2 += var2) {
        }
        this.field2792 = new class175(var2);
    }

    @ObfuscatedName("fb.g(J)Lfn;")
    public class174 method3245(long arg0) {
        class174 var3 = (class174) this.field2792.method3293(arg0);
        if (var3 != null) {
            this.field2796.method3256(var3);
        }
        return var3;
    }

    @ObfuscatedName("fb.m(J)V")
    public void method3242(long arg0) {
        class174 var3 = (class174) this.field2792.method3293(arg0);
        if (var3 != null) {
            var3.method3346();
            var3.method3289();
            this.field2795++;
        }
    }

    @ObfuscatedName("fb.v(Lfn;J)V")
    public void method3249(class174 arg0, long arg1) {
        if (this.field2795 == 0) {
            class174 var4 = this.field2796.method3258();
            var4.method3346();
            var4.method3289();
            if (this.field2794 == var4) {
                class174 var5 = this.field2796.method3258();
                var5.method3346();
                var5.method3289();
            }
        } else {
            this.field2795--;
        }
        this.field2792.method3303(arg0, arg1);
        this.field2796.method3256(arg0);
    }

    @ObfuscatedName("fb.r()V")
    public void method3251() {
        this.field2796.method3260();
        this.field2792.method3298();
        this.field2794 = new class174();
        this.field2795 = this.field2793;
    }
}
