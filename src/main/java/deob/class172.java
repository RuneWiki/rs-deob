package deob;

@ObfuscatedName("fs")
public final class class172 {

    @ObfuscatedName("fs.e")
    public class176 field2819 = new class176();

    @ObfuscatedName("fs.i")
    public int field2818;

    @ObfuscatedName("fs.k")
    public int field2820;

    @ObfuscatedName("fs.q")
    public class177 field2821;

    @ObfuscatedName("fs.j")
    public class174 field2822 = new class174();

    public class172(int arg0) {
        this.field2818 = arg0;
        this.field2820 = arg0;
        int var2;
        for (var2 = 1; var2 + var2 < arg0; var2 += var2) {
        }
        this.field2821 = new class177(var2);
    }

    @ObfuscatedName("fs.e(J)Lfn;")
    public class176 method3262(long arg0) {
        class176 var3 = (class176) this.field2821.method3314(arg0);
        if (var3 != null) {
            this.field2822.method3275(var3);
        }
        return var3;
    }

    @ObfuscatedName("fs.i(J)V")
    public void method3263(long arg0) {
        class176 var3 = (class176) this.field2821.method3314(arg0);
        if (var3 != null) {
            var3.method3366();
            var3.method3306();
            this.field2820++;
        }
    }

    @ObfuscatedName("fs.k(Lfn;J)V")
    public void method3264(class176 arg0, long arg1) {
        if (this.field2820 == 0) {
            class176 var4 = this.field2822.method3290();
            var4.method3366();
            var4.method3306();
            if (this.field2819 == var4) {
                class176 var5 = this.field2822.method3290();
                var5.method3366();
                var5.method3306();
            }
        } else {
            this.field2820--;
        }
        this.field2821.method3311(arg0, arg1);
        this.field2822.method3275(arg0);
    }

    @ObfuscatedName("fs.q()V")
    public void method3265() {
        this.field2822.method3274();
        this.field2821.method3312();
        this.field2819 = new class176();
        this.field2820 = this.field2818;
    }
}
