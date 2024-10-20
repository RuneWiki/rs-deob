package deob;

@ObfuscatedName("fq")
public final class class170 {

    @ObfuscatedName("fq.p")
    public class174 field2801 = new class174();

    @ObfuscatedName("fq.l")
    public int field2799;

    @ObfuscatedName("fq.d")
    public int field2800;

    @ObfuscatedName("fq.x")
    public class175 field2798;

    @ObfuscatedName("fq.o")
    public class172 field2802 = new class172();

    public class170(int arg0) {
        this.field2799 = arg0;
        this.field2800 = arg0;
        int var2;
        for (var2 = 1; var2 + var2 < arg0; var2 += var2) {
        }
        this.field2798 = new class175(var2);
    }

    @ObfuscatedName("fq.p(J)Lfe;")
    public class174 method3357(long arg0) {
        class174 var3 = (class174) this.field2798.method3405(arg0);
        if (var3 != null) {
            this.field2802.method3373(var3);
        }
        return var3;
    }

    @ObfuscatedName("fq.l(J)V")
    public void method3358(long arg0) {
        class174 var3 = (class174) this.field2798.method3405(arg0);
        if (var3 != null) {
            var3.method3455();
            var3.method3401();
            this.field2800++;
        }
    }

    @ObfuscatedName("fq.d(Lfe;J)V")
    public void method3364(class174 arg0, long arg1) {
        if (this.field2800 == 0) {
            class174 var4 = this.field2802.method3375();
            var4.method3455();
            var4.method3401();
            if (this.field2801 == var4) {
                class174 var5 = this.field2802.method3375();
                var5.method3455();
                var5.method3401();
            }
        } else {
            this.field2800--;
        }
        this.field2798.method3406(arg0, arg1);
        this.field2802.method3373(arg0);
    }

    @ObfuscatedName("fq.x()V")
    public void method3360() {
        this.field2802.method3377();
        this.field2798.method3407();
        this.field2801 = new class174();
        this.field2800 = this.field2799;
    }
}
