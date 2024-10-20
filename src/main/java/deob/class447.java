package deob;

@ObfuscatedName("rk")
public class class447 {

    @ObfuscatedName("rk.aw")
    public int field4723;

    @ObfuscatedName("rk.ay")
    public int field4721;

    @ObfuscatedName("rk.ar")
    public int field4724;

    @ObfuscatedName("rk.am")
    public int field4722;

    public class447(int arg0, int arg1) {
        this(0, 0, arg0, arg1);
    }

    public class447(int arg0, int arg1, int arg2, int arg3) {
        this.method7422(arg0, arg1);
        this.method7423(arg2, arg3);
    }

    @ObfuscatedName("rk.aw(III)V")
    public void method7422(int arg0, int arg1) {
        this.field4723 = arg0;
        this.field4721 = arg1;
    }

    @ObfuscatedName("rk.ay(III)V")
    public void method7423(int arg0, int arg1) {
        this.field4724 = arg0;
        this.field4722 = arg1;
    }

    @ObfuscatedName("rk.ar(IIB)Z")
    public boolean method7445(int arg0, int arg1) {
        return arg0 >= this.field4723 && arg0 < this.field4724 + this.field4723 && arg1 >= this.field4721 && arg1 < this.field4722 + this.field4721;
    }

    public String toString() {
        return null;
    }

    @ObfuscatedName("rk.am(Lrk;Lrk;I)V")
    public void method7435(class447 arg0, class447 arg1) {
        this.method7439(arg0, arg1);
        this.method7426(arg0, arg1);
    }

    @ObfuscatedName("rk.as(Lrk;Lrk;B)V")
    public void method7439(class447 arg0, class447 arg1) {
        arg1.field4723 = this.field4723;
        arg1.field4724 = this.field4724;
        if (this.field4723 < arg0.field4723) {
            arg1.field4724 -= arg0.field4723 - this.field4723;
            arg1.field4723 = arg0.field4723;
        }
        if (arg1.method7427() > arg0.method7427()) {
            arg1.field4724 -= arg1.method7427() - arg0.method7427();
        }
        if (arg1.field4724 < 0) {
            arg1.field4724 = 0;
        }
    }

    @ObfuscatedName("rk.aj(Lrk;Lrk;I)V")
    public void method7426(class447 arg0, class447 arg1) {
        arg1.field4721 = this.field4721;
        arg1.field4722 = this.field4722;
        if (this.field4721 < arg0.field4721) {
            arg1.field4722 -= arg0.field4721 - this.field4721;
            arg1.field4721 = arg0.field4721;
        }
        if (arg1.method7428() > arg0.method7428()) {
            arg1.field4722 -= arg1.method7428() - arg0.method7428();
        }
        if (arg1.field4722 < 0) {
            arg1.field4722 = 0;
        }
    }

    @ObfuscatedName("rk.ag(B)I")
    public int method7427() {
        return this.field4724 + this.field4723;
    }

    @ObfuscatedName("rk.az(B)I")
    public int method7428() {
        return this.field4722 + this.field4721;
    }
}
