package deob;

@ObfuscatedName("fo")
public final class class170 {

    @ObfuscatedName("fo.c")
    public class174 field2803 = new class174();

    @ObfuscatedName("fo.q")
    public int field2804;

    @ObfuscatedName("fo.y")
    public int field2805;

    @ObfuscatedName("fo.v")
    public class175 field2806;

    @ObfuscatedName("fo.g")
    public class172 field2807 = new class172();

    public class170(int arg0) {
        this.field2804 = arg0;
        this.field2805 = arg0;
        int var2;
        for (var2 = 1; var2 + var2 < arg0; var2 += var2) {
        }
        this.field2806 = new class175(var2);
    }

    @ObfuscatedName("fo.c(J)Lfb;")
    public class174 method3097(long arg0) {
        class174 var3 = (class174) this.field2806.method3138(arg0);
        if (var3 != null) {
            this.field2807.method3106(var3);
        }
        return var3;
    }

    @ObfuscatedName("fo.q(J)V")
    public void method3091(long arg0) {
        class174 var3 = (class174) this.field2806.method3138(arg0);
        if (var3 != null) {
            var3.method3196();
            var3.method3133();
            this.field2805++;
        }
    }

    @ObfuscatedName("fo.y(Lfb;J)V")
    public void method3092(class174 arg0, long arg1) {
        if (this.field2805 == 0) {
            class174 var4 = this.field2807.method3119();
            var4.method3196();
            var4.method3133();
            if (this.field2803 == var4) {
                class174 var5 = this.field2807.method3119();
                var5.method3196();
                var5.method3133();
            }
        } else {
            this.field2805--;
        }
        this.field2806.method3136(arg0, arg1);
        this.field2807.method3106(arg0);
    }

    @ObfuscatedName("fo.v()V")
    public void method3093() {
        this.field2807.method3114();
        this.field2806.method3137();
        this.field2803 = new class174();
        this.field2805 = this.field2804;
    }
}
