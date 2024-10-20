package deob;

@ObfuscatedName("hi")
public final class class213 {

    @ObfuscatedName("hi.g")
    public class219 field2642 = new class219();

    @ObfuscatedName("hi.e")
    public int field2643;

    @ObfuscatedName("hi.b")
    public int field2645;

    @ObfuscatedName("hi.z")
    public class215 field2644;

    @ObfuscatedName("hi.n")
    public class207 field2646 = new class207();

    public class213(int arg0) {
        this.field2643 = arg0;
        this.field2645 = arg0;
        int var2;
        for (var2 = 1; var2 + var2 < arg0; var2 += var2) {
        }
        this.field2644 = new class215(var2);
    }

    @ObfuscatedName("hi.g(J)Lhf;")
    public class219 method3706(long arg0) {
        class219 var3 = (class219) this.field2644.method3740(arg0);
        if (var3 != null) {
            this.field2646.method3653(var3);
        }
        return var3;
    }

    @ObfuscatedName("hi.e(J)V")
    public void method3705(long arg0) {
        class219 var3 = (class219) this.field2644.method3740(arg0);
        if (var3 != null) {
            var3.method3796();
            var3.method3840();
            this.field2645++;
        }
    }

    @ObfuscatedName("hi.b(Lhf;J)V")
    public void method3712(class219 arg0, long arg1) {
        if (this.field2645 == 0) {
            class219 var4 = this.field2646.method3656();
            var4.method3796();
            var4.method3840();
            if (this.field2642 == var4) {
                class219 var5 = this.field2646.method3656();
                var5.method3796();
                var5.method3840();
            }
        } else {
            this.field2645--;
        }
        this.field2644.method3741(arg0, arg1);
        this.field2646.method3653(arg0);
    }

    @ObfuscatedName("hi.z()V")
    public void method3709() {
        this.field2646.method3658();
        this.field2644.method3742();
        this.field2642 = new class219();
        this.field2645 = this.field2643;
    }
}
