package deob;

@ObfuscatedName("lk")
public final class class299 {

    @ObfuscatedName("lk.at")
    public class481 field3111 = new class481();

    @ObfuscatedName("lk.ah")
    public int field3113;

    @ObfuscatedName("lk.ar")
    public int field3112;

    @ObfuscatedName("lk.ao")
    public class500 field3110;

    @ObfuscatedName("lk.ab")
    public class395 field3114 = new class395();

    public class299(int arg0) {
        this.field3113 = arg0;
        this.field3112 = arg0;
        int var2;
        for (var2 = 1; var2 + var2 < arg0; var2 += var2) {
        }
        this.field3110 = new class500(var2);
    }

    @ObfuscatedName("lk.at(J)Lsn;")
    public class481 method5289(long arg0) {
        class481 var3 = (class481) this.field3110.method8134(arg0);
        if (var3 != null) {
            this.field3114.method6696(var3);
        }
        return var3;
    }

    @ObfuscatedName("lk.ah(J)V")
    public void method5290(long arg0) {
        class481 var3 = (class481) this.field3110.method8134(arg0);
        if (var3 != null) {
            var3.method7828();
            var3.method7825();
            this.field3112++;
        }
    }

    @ObfuscatedName("lk.ar(Lsn;J)V")
    public void method5303(class481 arg0, long arg1) {
        if (this.field3112 == 0) {
            class481 var4 = this.field3114.method6698();
            var4.method7828();
            var4.method7825();
            if (this.field3111 == var4) {
                class481 var5 = this.field3114.method6698();
                var5.method7828();
                var5.method7825();
            }
        } else {
            this.field3112--;
        }
        this.field3110.method8135(arg0, arg1);
        this.field3114.method6696(arg0);
    }

    @ObfuscatedName("lk.ao()V")
    public void method5292() {
        this.field3114.method6706();
        this.field3110.method8136();
        this.field3111 = new class481();
        this.field3112 = this.field3113;
    }
}
