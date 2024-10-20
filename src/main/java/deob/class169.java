package deob;

@ObfuscatedName("fb")
public final class class169 {

    @ObfuscatedName("fb.u")
    public class173 field2789 = new class173();

    @ObfuscatedName("fb.k")
    public int field2785;

    @ObfuscatedName("fb.x")
    public int field2787;

    @ObfuscatedName("fb.m")
    public class174 field2788;

    @ObfuscatedName("fb.n")
    public class171 field2786 = new class171();

    public class169(int arg0) {
        this.field2785 = arg0;
        this.field2787 = arg0;
        int var2;
        for (var2 = 1; var2 + var2 < arg0; var2 += var2) {
        }
        this.field2788 = new class174(var2);
    }

    @ObfuscatedName("fb.u(J)Lfs;")
    public class173 method3263(long arg0) {
        class173 var3 = (class173) this.field2788.method3311(arg0);
        if (var3 != null) {
            this.field2786.method3271(var3);
        }
        return var3;
    }

    @ObfuscatedName("fb.k(J)V")
    public void method3262(long arg0) {
        class173 var3 = (class173) this.field2788.method3311(arg0);
        if (var3 != null) {
            var3.method3357();
            var3.method3303();
            this.field2787++;
        }
    }

    @ObfuscatedName("fb.x(Lfs;J)V")
    public void method3260(class173 arg0, long arg1) {
        if (this.field2787 == 0) {
            class173 var4 = this.field2786.method3282();
            var4.method3357();
            var4.method3303();
            if (this.field2789 == var4) {
                class173 var5 = this.field2786.method3282();
                var5.method3357();
                var5.method3303();
            }
        } else {
            this.field2787--;
        }
        this.field2788.method3317(arg0, arg1);
        this.field2786.method3271(arg0);
    }

    @ObfuscatedName("fb.m()V")
    public void method3261() {
        this.field2786.method3274();
        this.field2788.method3313();
        this.field2789 = new class173();
        this.field2787 = this.field2785;
    }
}
