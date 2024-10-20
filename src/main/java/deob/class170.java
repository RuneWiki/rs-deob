package deob;

@ObfuscatedName("fe")
public final class class170 {

    @ObfuscatedName("fe.x")
    public class174 field2793 = new class174();

    @ObfuscatedName("fe.p")
    public int field2794;

    @ObfuscatedName("fe.k")
    public int field2795;

    @ObfuscatedName("fe.a")
    public class175 field2797;

    @ObfuscatedName("fe.q")
    public class172 field2796 = new class172();

    public class170(int arg0) {
        this.field2794 = arg0;
        this.field2795 = arg0;
        int var2;
        for (var2 = 1; var2 + var2 < arg0; var2 += var2) {
        }
        this.field2797 = new class175(var2);
    }

    @ObfuscatedName("fe.x(J)Lfs;")
    public class174 method3196(long arg0) {
        class174 var3 = (class174) this.field2797.method3259(arg0);
        if (var3 != null) {
            this.field2796.method3212(var3);
        }
        return var3;
    }

    @ObfuscatedName("fe.p(J)V")
    public void method3208(long arg0) {
        class174 var3 = (class174) this.field2797.method3259(arg0);
        if (var3 != null) {
            var3.method3301();
            var3.method3239();
            this.field2795++;
        }
    }

    @ObfuscatedName("fe.k(Lfs;J)V")
    public void method3197(class174 arg0, long arg1) {
        if (this.field2795 == 0) {
            class174 var4 = this.field2796.method3221();
            var4.method3301();
            var4.method3239();
            if (this.field2793 == var4) {
                class174 var5 = this.field2796.method3221();
                var5.method3301();
                var5.method3239();
            }
        } else {
            this.field2795--;
        }
        this.field2797.method3253(arg0, arg1);
        this.field2796.method3212(arg0);
    }

    @ObfuscatedName("fe.a()V")
    public void method3198() {
        this.field2796.method3217();
        this.field2797.method3245();
        this.field2793 = new class174();
        this.field2795 = this.field2794;
    }
}
