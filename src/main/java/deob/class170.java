package deob;

@ObfuscatedName("fq")
public final class class170 {

    @ObfuscatedName("fq.a")
    public class174 field2796 = new class174();

    @ObfuscatedName("fq.r")
    public int field2795;

    @ObfuscatedName("fq.u")
    public int field2798;

    @ObfuscatedName("fq.t")
    public class175 field2797;

    @ObfuscatedName("fq.k")
    public class172 field2794 = new class172();

    public class170(int arg0) {
        this.field2795 = arg0;
        this.field2798 = arg0;
        int var2;
        for (var2 = 1; var2 + var2 < arg0; var2 += var2) {
        }
        this.field2797 = new class175(var2);
    }

    @ObfuscatedName("fq.a(J)Lfw;")
    public class174 method3208(long arg0) {
        class174 var3 = (class174) this.field2797.method3252(arg0);
        if (var3 != null) {
            this.field2794.method3223(var3);
        }
        return var3;
    }

    @ObfuscatedName("fq.r(J)V")
    public void method3207(long arg0) {
        class174 var3 = (class174) this.field2797.method3252(arg0);
        if (var3 != null) {
            var3.method3311();
            var3.method3248();
            this.field2798++;
        }
    }

    @ObfuscatedName("fq.u(Lfw;J)V")
    public void method3210(class174 arg0, long arg1) {
        if (this.field2798 == 0) {
            class174 var4 = this.field2794.method3225();
            var4.method3311();
            var4.method3248();
            if (this.field2796 == var4) {
                class174 var5 = this.field2794.method3225();
                var5.method3311();
                var5.method3248();
            }
        } else {
            this.field2798--;
        }
        this.field2797.method3254(arg0, arg1);
        this.field2794.method3223(arg0);
    }

    @ObfuscatedName("fq.t()V")
    public void method3216() {
        this.field2794.method3230();
        this.field2797.method3251();
        this.field2796 = new class174();
        this.field2798 = this.field2795;
    }
}
