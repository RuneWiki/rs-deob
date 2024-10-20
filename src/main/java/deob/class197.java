package deob;

@ObfuscatedName("gi")
public final class class197 {

    @ObfuscatedName("gi.m")
    public class208 field3132 = new class208();

    @ObfuscatedName("gi.w")
    public int field3130;

    @ObfuscatedName("gi.e")
    public int field3133;

    @ObfuscatedName("gi.o")
    public class200 field3131;

    @ObfuscatedName("gi.g")
    public class207 field3134 = new class207();

    public class197(int arg0) {
        this.field3130 = arg0;
        this.field3133 = arg0;
        int var2;
        for (var2 = 1; var2 + var2 < arg0; var2 += var2) {
        }
        this.field3131 = new class200(var2);
    }

    @ObfuscatedName("gi.m(J)Lgs;")
    public class208 method3556(long arg0) {
        class208 var3 = (class208) this.field3131.method3595(arg0);
        if (var3 != null) {
            this.field3134.method3685(var3);
        }
        return var3;
    }

    @ObfuscatedName("gi.w(J)V")
    public void method3552(long arg0) {
        class208 var3 = (class208) this.field3131.method3595(arg0);
        if (var3 != null) {
            var3.method3729();
            var3.method3699();
            this.field3133++;
        }
    }

    @ObfuscatedName("gi.e(Lgs;J)V")
    public void method3562(class208 arg0, long arg1) {
        if (this.field3133 == 0) {
            class208 var4 = this.field3134.method3680();
            var4.method3729();
            var4.method3699();
            if (this.field3132 == var4) {
                class208 var5 = this.field3134.method3680();
                var5.method3729();
                var5.method3699();
            }
        } else {
            this.field3133--;
        }
        this.field3131.method3588(arg0, arg1);
        this.field3134.method3685(arg0);
    }

    @ObfuscatedName("gi.o()V")
    public void method3553() {
        this.field3134.method3679();
        this.field3131.method3590();
        this.field3132 = new class208();
        this.field3133 = this.field3130;
    }
}
