package deob;

@ObfuscatedName("fj")
public final class class170 {

    @ObfuscatedName("fj.j")
    public class174 field2788 = new class174();

    @ObfuscatedName("fj.r")
    public int field2789;

    @ObfuscatedName("fj.v")
    public int field2791;

    @ObfuscatedName("fj.p")
    public class175 field2790;

    @ObfuscatedName("fj.e")
    public class172 field2787 = new class172();

    public class170(int arg0) {
        this.field2789 = arg0;
        this.field2791 = arg0;
        int var2;
        for (var2 = 1; var2 + var2 < arg0; var2 += var2) {
        }
        this.field2790 = new class175(var2);
    }

    @ObfuscatedName("fj.j(J)Lfy;")
    public class174 method3264(long arg0) {
        class174 var3 = (class174) this.field2790.method3302(arg0);
        if (var3 != null) {
            this.field2787.method3274(var3);
        }
        return var3;
    }

    @ObfuscatedName("fj.r(J)V")
    public void method3256(long arg0) {
        class174 var3 = (class174) this.field2790.method3302(arg0);
        if (var3 != null) {
            var3.method3359();
            var3.method3299();
            this.field2791++;
        }
    }

    @ObfuscatedName("fj.v(Lfy;J)V")
    public void method3257(class174 arg0, long arg1) {
        if (this.field2791 == 0) {
            class174 var4 = this.field2787.method3272();
            var4.method3359();
            var4.method3299();
            if (this.field2788 == var4) {
                class174 var5 = this.field2787.method3272();
                var5.method3359();
                var5.method3299();
            }
        } else {
            this.field2791--;
        }
        this.field2790.method3318(arg0, arg1);
        this.field2787.method3274(arg0);
    }

    @ObfuscatedName("fj.p()V")
    public void method3258() {
        this.field2787.method3278();
        this.field2790.method3304();
        this.field2788 = new class174();
        this.field2791 = this.field2789;
    }
}
