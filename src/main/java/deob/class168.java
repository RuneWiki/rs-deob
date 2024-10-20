package deob;

@ObfuscatedName("fo")
public final class class168 {

    @ObfuscatedName("fo.g")
    public class172 field2739 = new class172();

    @ObfuscatedName("fo.e")
    public int field2740;

    @ObfuscatedName("fo.n")
    public int field2741;

    @ObfuscatedName("fo.j")
    public class173 field2742;

    @ObfuscatedName("fo.i")
    public class170 field2743 = new class170();

    public class168(int arg0) {
        this.field2740 = arg0;
        this.field2741 = arg0;
        int var2;
        for (var2 = 1; var2 + var2 < arg0; var2 += var2) {
        }
        this.field2742 = new class173(var2);
    }

    @ObfuscatedName("fo.g(J)Lfl;")
    public class172 method3311(long arg0) {
        class172 var3 = (class172) this.field2742.method3354(arg0);
        if (var3 != null) {
            this.field2743.method3331(var3);
        }
        return var3;
    }

    @ObfuscatedName("fo.e(J)V")
    public void method3313(long arg0) {
        class172 var3 = (class172) this.field2742.method3354(arg0);
        if (var3 != null) {
            var3.method3415();
            var3.method3351();
            this.field2741++;
        }
    }

    @ObfuscatedName("fo.n(Lfl;J)V")
    public void method3314(class172 arg0, long arg1) {
        if (this.field2741 == 0) {
            class172 var4 = this.field2743.method3327();
            var4.method3415();
            var4.method3351();
            if (this.field2739 == var4) {
                class172 var5 = this.field2743.method3327();
                var5.method3415();
                var5.method3351();
            }
        } else {
            this.field2741--;
        }
        this.field2742.method3353(arg0, arg1);
        this.field2743.method3331(arg0);
    }

    @ObfuscatedName("fo.j()V")
    public void method3315() {
        this.field2743.method3329();
        this.field2742.method3356();
        this.field2739 = new class172();
        this.field2741 = this.field2740;
    }
}
