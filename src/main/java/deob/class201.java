package deob;

@ObfuscatedName("gj")
public final class class201 {

    @ObfuscatedName("gj.z")
    public class207 field2410 = new class207();

    @ObfuscatedName("gj.w")
    public int field2407;

    @ObfuscatedName("gj.s")
    public int field2408;

    @ObfuscatedName("gj.l")
    public class203 field2409;

    @ObfuscatedName("gj.u")
    public class195 field2406 = new class195();

    public class201(int arg0) {
        this.field2407 = arg0;
        this.field2408 = arg0;
        int var2;
        for (var2 = 1; var2 + var2 < arg0; var2 += var2) {
        }
        this.field2409 = new class203(var2);
    }

    @ObfuscatedName("gj.z(J)Lgw;")
    public class207 method3681(long arg0) {
        class207 var3 = (class207) this.field2409.method3712(arg0);
        if (var3 != null) {
            this.field2406.method3602(var3);
        }
        return var3;
    }

    @ObfuscatedName("gj.w(J)V")
    public void method3674(long arg0) {
        class207 var3 = (class207) this.field2409.method3712(arg0);
        if (var3 != null) {
            var3.method3756();
            var3.method3793();
            this.field2408++;
        }
    }

    @ObfuscatedName("gj.s(Lgw;J)V")
    public void method3675(class207 arg0, long arg1) {
        if (this.field2408 == 0) {
            class207 var4 = this.field2406.method3614();
            var4.method3756();
            var4.method3793();
            if (this.field2410 == var4) {
                class207 var5 = this.field2406.method3614();
                var5.method3756();
                var5.method3793();
            }
        } else {
            this.field2408--;
        }
        this.field2409.method3708(arg0, arg1);
        this.field2406.method3602(arg0);
    }

    @ObfuscatedName("gj.l()V")
    public void method3676() {
        this.field2406.method3604();
        this.field2409.method3709();
        this.field2410 = new class207();
        this.field2408 = this.field2407;
    }
}
