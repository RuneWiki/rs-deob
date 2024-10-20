package deob;

@ObfuscatedName("fk")
public final class class176 {

    @ObfuscatedName("fk.p")
    public class187 field2866 = new class187();

    @ObfuscatedName("fk.y")
    public int field2869;

    @ObfuscatedName("fk.d")
    public int field2867;

    @ObfuscatedName("fk.c")
    public class179 field2868;

    @ObfuscatedName("fk.r")
    public class186 field2865 = new class186();

    public class176(int arg0) {
        this.field2869 = arg0;
        this.field2867 = arg0;
        int var2;
        for (var2 = 1; var2 + var2 < arg0; var2 += var2) {
        }
        this.field2868 = new class179(var2);
    }

    @ObfuscatedName("fk.p(J)Lgo;")
    public class187 method3198(long arg0) {
        class187 var3 = (class187) this.field2868.method3224(arg0);
        if (var3 != null) {
            this.field2865.method3315(var3);
        }
        return var3;
    }

    @ObfuscatedName("fk.y(J)V")
    public void method3192(long arg0) {
        class187 var3 = (class187) this.field2868.method3224(arg0);
        if (var3 != null) {
            var3.method3358();
            var3.method3331();
            this.field2867++;
        }
    }

    @ObfuscatedName("fk.d(Lgo;J)V")
    public void method3193(class187 arg0, long arg1) {
        if (this.field2867 == 0) {
            class187 var4 = this.field2865.method3317();
            var4.method3358();
            var4.method3331();
            if (this.field2866 == var4) {
                class187 var5 = this.field2865.method3317();
                var5.method3358();
                var5.method3331();
            }
        } else {
            this.field2867--;
        }
        this.field2868.method3225(arg0, arg1);
        this.field2865.method3315(arg0);
    }

    @ObfuscatedName("fk.c()V")
    public void method3190() {
        this.field2865.method3318();
        this.field2868.method3240();
        this.field2866 = new class187();
        this.field2867 = this.field2869;
    }
}
