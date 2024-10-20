package deob;

@ObfuscatedName("gw")
public final class class197 {

    @ObfuscatedName("gw.x")
    public class208 field3140 = new class208();

    @ObfuscatedName("gw.r")
    public int field3136;

    @ObfuscatedName("gw.j")
    public int field3138;

    @ObfuscatedName("gw.z")
    public class200 field3139;

    @ObfuscatedName("gw.i")
    public class207 field3137 = new class207();

    public class197(int arg0) {
        this.field3136 = arg0;
        this.field3138 = arg0;
        int var2;
        for (var2 = 1; var2 + var2 < arg0; var2 += var2) {
        }
        this.field3139 = new class200(var2);
    }

    @ObfuscatedName("gw.x(J)Lgi;")
    public class208 method3533(long arg0) {
        class208 var3 = (class208) this.field3139.method3580(arg0);
        if (var3 != null) {
            this.field3137.method3670(var3);
        }
        return var3;
    }

    @ObfuscatedName("gw.r(J)V")
    public void method3536(long arg0) {
        class208 var3 = (class208) this.field3139.method3580(arg0);
        if (var3 != null) {
            var3.method3695();
            var3.method3675();
            this.field3138++;
        }
    }

    @ObfuscatedName("gw.j(Lgi;J)V")
    public void method3535(class208 arg0, long arg1) {
        if (this.field3138 == 0) {
            class208 var4 = this.field3137.method3674();
            var4.method3695();
            var4.method3675();
            if (this.field3140 == var4) {
                class208 var5 = this.field3137.method3674();
                var5.method3695();
                var5.method3675();
            }
        } else {
            this.field3138--;
        }
        this.field3139.method3569(arg0, arg1);
        this.field3137.method3670(arg0);
    }

    @ObfuscatedName("gw.z()V")
    public void method3534() {
        this.field3137.method3656();
        this.field3139.method3570();
        this.field3140 = new class208();
        this.field3138 = this.field3136;
    }
}
