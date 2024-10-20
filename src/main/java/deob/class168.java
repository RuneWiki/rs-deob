package deob;

@ObfuscatedName("fk")
public final class class168 {

    @ObfuscatedName("fk.j")
    public class172 field2739 = new class172();

    @ObfuscatedName("fk.y")
    public int field2738;

    @ObfuscatedName("fk.x")
    public int field2737;

    @ObfuscatedName("fk.z")
    public class173 field2740;

    @ObfuscatedName("fk.c")
    public class170 field2741 = new class170();

    public class168(int arg0) {
        this.field2738 = arg0;
        this.field2737 = arg0;
        int var2;
        for (var2 = 1; var2 + var2 < arg0; var2 += var2) {
        }
        this.field2740 = new class173(var2);
    }

    @ObfuscatedName("fk.j(J)Lfr;")
    public class172 method3191(long arg0) {
        class172 var3 = (class172) this.field2740.method3222(arg0);
        if (var3 != null) {
            this.field2741.method3196(var3);
        }
        return var3;
    }

    @ObfuscatedName("fk.y(J)V")
    public void method3183(long arg0) {
        class172 var3 = (class172) this.field2740.method3222(arg0);
        if (var3 != null) {
            var3.method3289();
            var3.method3219();
            this.field2737++;
        }
    }

    @ObfuscatedName("fk.x(Lfr;J)V")
    public void method3181(class172 arg0, long arg1) {
        if (this.field2737 == 0) {
            class172 var4 = this.field2741.method3198();
            var4.method3289();
            var4.method3219();
            if (this.field2739 == var4) {
                class172 var5 = this.field2741.method3198();
                var5.method3289();
                var5.method3219();
            }
        } else {
            this.field2737--;
        }
        this.field2740.method3223(arg0, arg1);
        this.field2741.method3196(arg0);
    }

    @ObfuscatedName("fk.z()V")
    public void method3185() {
        this.field2741.method3195();
        this.field2740.method3224();
        this.field2739 = new class172();
        this.field2737 = this.field2738;
    }
}
