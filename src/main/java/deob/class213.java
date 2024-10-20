package deob;

@ObfuscatedName("hd")
public final class class213 {

    @ObfuscatedName("hd.o")
    public class219 field2639 = new class219();

    @ObfuscatedName("hd.k")
    public int field2636;

    @ObfuscatedName("hd.t")
    public int field2638;

    @ObfuscatedName("hd.d")
    public class215 field2637;

    @ObfuscatedName("hd.h")
    public class207 field2640 = new class207();

    public class213(int arg0) {
        this.field2636 = arg0;
        this.field2638 = arg0;
        int var2;
        for (var2 = 1; var2 + var2 < arg0; var2 += var2) {
        }
        this.field2637 = new class215(var2);
    }

    @ObfuscatedName("hd.o(J)Lht;")
    public class219 method3601(long arg0) {
        class219 var3 = (class219) this.field2637.method3637(arg0);
        if (var3 != null) {
            this.field2640.method3558(var3);
        }
        return var3;
    }

    @ObfuscatedName("hd.k(J)V")
    public void method3602(long arg0) {
        class219 var3 = (class219) this.field2637.method3637(arg0);
        if (var3 != null) {
            var3.method3681();
            var3.method3721();
            this.field2638++;
        }
    }

    @ObfuscatedName("hd.t(Lht;J)V")
    public void method3603(class219 arg0, long arg1) {
        if (this.field2638 == 0) {
            class219 var4 = this.field2640.method3542();
            var4.method3681();
            var4.method3721();
            if (this.field2639 == var4) {
                class219 var5 = this.field2640.method3542();
                var5.method3681();
                var5.method3721();
            }
        } else {
            this.field2638--;
        }
        this.field2637.method3638(arg0, arg1);
        this.field2640.method3558(arg0);
    }

    @ObfuscatedName("hd.d()V")
    public void method3604() {
        this.field2640.method3546();
        this.field2637.method3639();
        this.field2639 = new class219();
        this.field2638 = this.field2636;
    }
}
