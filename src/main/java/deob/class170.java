package deob;

@ObfuscatedName("fo")
public final class class170 {

    @ObfuscatedName("fo.p")
    public class174 field2799 = new class174();

    @ObfuscatedName("fo.i")
    public int field2798;

    @ObfuscatedName("fo.o")
    public int field2800;

    @ObfuscatedName("fo.n")
    public class175 field2801;

    @ObfuscatedName("fo.l")
    public class172 field2802 = new class172();

    public class170(int arg0) {
        this.field2798 = arg0;
        this.field2800 = arg0;
        int var2;
        for (var2 = 1; var2 + var2 < arg0; var2 += var2) {
        }
        this.field2801 = new class175(var2);
    }

    @ObfuscatedName("fo.p(J)Lfd;")
    public class174 method3264(long arg0) {
        class174 var3 = (class174) this.field2801.method3312(arg0);
        if (var3 != null) {
            this.field2802.method3281(var3);
        }
        return var3;
    }

    @ObfuscatedName("fo.i(J)V")
    public void method3279(long arg0) {
        class174 var3 = (class174) this.field2801.method3312(arg0);
        if (var3 != null) {
            var3.method3360();
            var3.method3310();
            this.field2800++;
        }
    }

    @ObfuscatedName("fo.o(Lfd;J)V")
    public void method3269(class174 arg0, long arg1) {
        if (this.field2800 == 0) {
            class174 var4 = this.field2802.method3283();
            var4.method3360();
            var4.method3310();
            if (this.field2799 == var4) {
                class174 var5 = this.field2802.method3283();
                var5.method3360();
                var5.method3310();
            }
        } else {
            this.field2800--;
        }
        this.field2801.method3313(arg0, arg1);
        this.field2802.method3281(arg0);
    }

    @ObfuscatedName("fo.n()V")
    public void method3265() {
        this.field2802.method3296();
        this.field2801.method3314();
        this.field2799 = new class174();
        this.field2800 = this.field2798;
    }
}
