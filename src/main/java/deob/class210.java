package deob;

@ObfuscatedName("hj")
public final class class210 {

    @ObfuscatedName("hj.b")
    public class215 field2602 = new class215();

    @ObfuscatedName("hj.q")
    public int field2600;

    @ObfuscatedName("hj.o")
    public int field2601;

    @ObfuscatedName("hj.p")
    public class211 field2599;

    @ObfuscatedName("hj.a")
    public class205 field2603 = new class205();

    public class210(int arg0) {
        this.field2600 = arg0;
        this.field2601 = arg0;
        int var2;
        for (var2 = 1; var2 + var2 < arg0; var2 += var2) {
        }
        this.field2599 = new class211(var2);
    }

    @ObfuscatedName("hj.b(J)Lht;")
    public class215 method3658(long arg0) {
        class215 var3 = (class215) this.field2599.method3674(arg0);
        if (var3 != null) {
            this.field2603.method3618(var3);
        }
        return var3;
    }

    @ObfuscatedName("hj.q(J)V")
    public void method3657(long arg0) {
        class215 var3 = (class215) this.field2599.method3674(arg0);
        if (var3 != null) {
            var3.method3726();
            var3.method3766();
            this.field2601++;
        }
    }

    @ObfuscatedName("hj.o(Lht;J)V")
    public void method3659(class215 arg0, long arg1) {
        if (this.field2601 == 0) {
            class215 var4 = this.field2603.method3622();
            var4.method3726();
            var4.method3766();
            if (this.field2602 == var4) {
                class215 var5 = this.field2603.method3622();
                var5.method3726();
                var5.method3766();
            }
        } else {
            this.field2601--;
        }
        this.field2599.method3675(arg0, arg1);
        this.field2603.method3618(arg0);
    }

    @ObfuscatedName("hj.p()V")
    public void method3661() {
        this.field2603.method3620();
        this.field2599.method3682();
        this.field2602 = new class215();
        this.field2601 = this.field2600;
    }
}
