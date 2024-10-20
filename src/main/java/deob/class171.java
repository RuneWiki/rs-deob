package deob;

@ObfuscatedName("fo")
public final class class171 {

    @ObfuscatedName("fo.i")
    public class182 field2836 = new class182();

    @ObfuscatedName("fo.c")
    public int field2834;

    @ObfuscatedName("fo.h")
    public int field2835;

    @ObfuscatedName("fo.v")
    public class174 field2833;

    @ObfuscatedName("fo.q")
    public class181 field2837 = new class181();

    public class171(int arg0) {
        this.field2834 = arg0;
        this.field2835 = arg0;
        int var2;
        for (var2 = 1; var2 + var2 < arg0; var2 += var2) {
        }
        this.field2833 = new class174(var2);
    }

    @ObfuscatedName("fo.i(J)Lfq;")
    public class182 method3185(long arg0) {
        class182 var3 = (class182) this.field2833.method3218(arg0);
        if (var3 != null) {
            this.field2837.method3297(var3);
        }
        return var3;
    }

    @ObfuscatedName("fo.c(J)V")
    public void method3184(long arg0) {
        class182 var3 = (class182) this.field2833.method3218(arg0);
        if (var3 != null) {
            var3.method3334();
            var3.method3305();
            this.field2835++;
        }
    }

    @ObfuscatedName("fo.h(Lfq;J)V")
    public void method3186(class182 arg0, long arg1) {
        if (this.field2835 == 0) {
            class182 var4 = this.field2837.method3295();
            var4.method3334();
            var4.method3305();
            if (this.field2836 == var4) {
                class182 var5 = this.field2837.method3295();
                var5.method3334();
                var5.method3305();
            }
        } else {
            this.field2835--;
        }
        this.field2833.method3229(arg0, arg1);
        this.field2837.method3297(arg0);
    }

    @ObfuscatedName("fo.v()V")
    public void method3188() {
        this.field2837.method3296();
        this.field2833.method3219();
        this.field2836 = new class182();
        this.field2835 = this.field2834;
    }
}
