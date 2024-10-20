package deob;

@ObfuscatedName("fs")
public final class class168 {

    @ObfuscatedName("fs.z")
    public class172 field2733 = new class172();

    @ObfuscatedName("fs.h")
    public int field2734;

    @ObfuscatedName("fs.c")
    public int field2736;

    @ObfuscatedName("fs.p")
    public class173 field2735;

    @ObfuscatedName("fs.i")
    public class170 field2737 = new class170();

    public class168(int arg0) {
        this.field2734 = arg0;
        this.field2736 = arg0;
        int var2;
        for (var2 = 1; var2 + var2 < arg0; var2 += var2) {
        }
        this.field2735 = new class173(var2);
    }

    @ObfuscatedName("fs.z(J)Lff;")
    public class172 method3240(long arg0) {
        class172 var3 = (class172) this.field2735.method3281(arg0);
        if (var3 != null) {
            this.field2737.method3248(var3);
        }
        return var3;
    }

    @ObfuscatedName("fs.h(J)V")
    public void method3238(long arg0) {
        class172 var3 = (class172) this.field2735.method3281(arg0);
        if (var3 != null) {
            var3.method3346();
            var3.method3280();
            this.field2736++;
        }
    }

    @ObfuscatedName("fs.c(Lff;J)V")
    public void method3237(class172 arg0, long arg1) {
        if (this.field2736 == 0) {
            class172 var4 = this.field2737.method3250();
            var4.method3346();
            var4.method3280();
            if (this.field2733 == var4) {
                class172 var5 = this.field2737.method3250();
                var5.method3346();
                var5.method3280();
            }
        } else {
            this.field2736--;
        }
        this.field2735.method3283(arg0, arg1);
        this.field2737.method3248(arg0);
    }

    @ObfuscatedName("fs.p()V")
    public void method3241() {
        this.field2737.method3252();
        this.field2735.method3284();
        this.field2733 = new class172();
        this.field2736 = this.field2734;
    }
}
