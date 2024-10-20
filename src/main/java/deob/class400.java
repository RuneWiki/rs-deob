package deob;

@ObfuscatedName("pa")
public class class400 extends class406 {

    @ObfuscatedName("pa.al")
    public final class458 field4502;

    @ObfuscatedName("pa.ac")
    public final class398 field4503;

    @ObfuscatedName("pa.ab")
    public String field4504 = null;

    @ObfuscatedName("pa.an")
    public String field4505 = null;

    @ObfuscatedName("pa.ao")
    public byte field4507;

    @ObfuscatedName("pa.av")
    public int field4501;

    @ObfuscatedName("pa.aq")
    public int field4508 = 1;

    public class400(class458 arg0, class398 arg1) {
        super(500);
        this.field4502 = arg0;
        this.field4503 = arg1;
    }

    @ObfuscatedName("pa.aj(I)Lpb;")
    public class404 method6843() {
        return new class403();
    }

    @ObfuscatedName("pa.al(IB)[Lpb;")
    public class404[] method6844(int arg0) {
        return new class403[arg0];
    }

    @ObfuscatedName("pa.ac(Ljava/lang/String;I)V")
    public final void method6869(String arg0) {
        this.field4504 = class370.method2686(arg0);
    }

    @ObfuscatedName("pa.ar(Ljava/lang/String;B)V")
    public final void method6884(String arg0) {
        this.field4505 = class370.method2686(arg0);
    }

    @ObfuscatedName("pa.ak(Lsy;II)V")
    public final void method6864(class478 arg0, int arg1) {
        this.method6884(arg0.method7950());
        long var3 = arg0.method7949();
        this.method6869(class370.method3740(var3));
        this.field4507 = arg0.method8163();
        int var5;
        short var6;
        if (arg1 == 1) {
            var5 = arg0.method7909();
            var6 = 255;
        } else if (arg1 == 2) {
            var5 = arg0.method7912();
            var6 = -1;
        } else {
            throw new IllegalArgumentException("Invalid friend chat full update version: " + arg1);
        }
        if (var5 == var6) {
            return;
        }
        int var7 = var5;
        this.method6997();
        for (int var8 = 0; var8 < var7; var8++) {
            class403 var9 = (class403) this.method7018(new class501(arg0.method7950(), this.field4502));
            int var10 = arg0.method7905();
            var9.method7024(var10, ++this.field4508 - 1);
            var9.field4532 = arg0.method8163();
            arg0.method7950();
            this.method6883(var9);
        }
    }

    @ObfuscatedName("pa.ax(Lsy;I)V")
    public final void method6865(class478 arg0) {
        class501 var2 = new class501(arg0.method7950(), this.field4502);
        int var3 = arg0.method7905();
        byte var4 = arg0.method8163();
        boolean var5 = false;
        if (var4 == -128) {
            var5 = true;
        }
        if (var5) {
            if (this.method6951() == 0) {
                return;
            }
            class403 var6 = (class403) this.method6955(var2);
            if (var6 != null && var6.method7027() == var3) {
                this.method6974(var6);
            }
            return;
        }
        arg0.method7950();
        class403 var7 = (class403) this.method6955(var2);
        if (var7 == null) {
            if (this.method6951() > this.field4528) {
                return;
            }
            var7 = (class403) this.method7018(var2);
        }
        var7.method7024(var3, ++this.field4508 - 1);
        var7.field4532 = var4;
        this.method6883(var7);
    }

    @ObfuscatedName("pa.as(B)V")
    public final void method6868() {
        for (int var1 = 0; var1 < this.method6951(); var1++) {
            ((class403) this.method6988(var1)).method6899();
        }
    }

    @ObfuscatedName("pa.ay(I)V")
    public final void method6867() {
        for (int var1 = 0; var1 < this.method6951(); var1++) {
            ((class403) this.method6988(var1)).method6902();
        }
    }

    @ObfuscatedName("pa.am(Lpo;I)V")
    public final void method6883(class403 arg0) {
        if (arg0.method6921().equals(this.field4503.method1173())) {
            this.field4501 = arg0.field4532;
        }
    }
}
