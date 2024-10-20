package deob;

import java.util.Iterator;
import java.util.LinkedList;

@ObfuscatedName("jw")
public class class242 {

    @ObfuscatedName("jw.aq")
    public int field2518 = -1;

    @ObfuscatedName("jw.aw")
    public String field2521;

    @ObfuscatedName("jw.al")
    public String field2517;

    @ObfuscatedName("jw.ai")
    public int field2519 = -1;

    @ObfuscatedName("jw.ar")
    public int field2520 = -16777216;

    @ObfuscatedName("jw.as")
    public int field2522 = -1;

    @ObfuscatedName("jw.aa")
    public class339 field2523 = null;

    @ObfuscatedName("jw.az")
    public int field2524 = Integer.MAX_VALUE;

    @ObfuscatedName("jw.ao")
    public int field2525 = 0;

    @ObfuscatedName("jw.au")
    public int field2526 = Integer.MAX_VALUE;

    @ObfuscatedName("jw.ak")
    public int field2527 = 0;

    @ObfuscatedName("jw.ah")
    public boolean field2528 = false;

    @ObfuscatedName("jw.aj")
    public LinkedList field2529;

    @ObfuscatedName("jw.aq(Luq;IB)V")
    public void method4257(class534 arg0, int arg1) {
        this.field2518 = arg1;
        this.field2521 = arg0.method8741();
        this.field2517 = arg0.method8741();
        this.field2523 = new class339(arg0.method8597());
        this.field2519 = arg0.method8597();
        this.field2520 = arg0.method8597();
        arg0.method8591();
        this.field2528 = arg0.method8591() == 1;
        this.field2522 = arg0.method8591();
        int var3 = arg0.method8591();
        this.field2529 = new LinkedList();
        for (int var4 = 0; var4 < var3; var4++) {
            this.field2529.add(this.method4290(arg0));
        }
        this.method4264();
    }

    @ObfuscatedName("jw.aw(Luq;I)Lkv;")
    public class262 method4290(class534 arg0) {
        int var2 = arg0.method8591();
        class250 var3 = (class250) class392.method6317(class250.method4524(), var2);
        Object var4 = null;
        Object var5;
        switch(var3.field2608) {
            case 0:
                var5 = new class259();
                break;
            case 1:
                var5 = new class241();
                break;
            case 2:
                var5 = new class246();
                break;
            case 3:
                var5 = new class249();
                break;
            default:
                throw new IllegalStateException("");
        }
        ((class262) var5).method4244(arg0);
        return (class262) var5;
    }

    @ObfuscatedName("jw.al(IIII)Z")
    public boolean method4260(int arg0, int arg1, int arg2) {
        Iterator var4 = this.field2529.iterator();
        class262 var5;
        do {
            if (!var4.hasNext()) {
                return false;
            }
            var5 = (class262) var4.next();
        } while (!var5.method4236(arg0, arg1, arg2));
        return true;
    }

    @ObfuscatedName("jw.ai(III)Z")
    public boolean method4306(int arg0, int arg1) {
        int var3 = arg0 / 64;
        int var4 = arg1 / 64;
        if (var3 < this.field2524 || var3 > this.field2525) {
            return false;
        } else if (var4 >= this.field2526 && var4 <= this.field2527) {
            Iterator var5 = this.field2529.iterator();
            class262 var6;
            do {
                if (!var5.hasNext()) {
                    return false;
                }
                var6 = (class262) var5.next();
            } while (!var6.method4237(arg0, arg1));
            return true;
        } else {
            return false;
        }
    }

    @ObfuscatedName("jw.ar(IIIB)[I")
    public int[] method4271(int arg0, int arg1, int arg2) {
        Iterator var4 = this.field2529.iterator();
        class262 var5;
        do {
            if (!var4.hasNext()) {
                return null;
            }
            var5 = (class262) var4.next();
        } while (!var5.method4236(arg0, arg1, arg2));
        return var5.method4246(arg0, arg1, arg2);
    }

    @ObfuscatedName("jw.as(III)Lns;")
    public class339 method4263(int arg0, int arg1) {
        Iterator var3 = this.field2529.iterator();
        class262 var4;
        do {
            if (!var3.hasNext()) {
                return null;
            }
            var4 = (class262) var3.next();
        } while (!var4.method4237(arg0, arg1));
        return var4.method4234(arg0, arg1);
    }

    @ObfuscatedName("jw.aa(B)V")
    public void method4264() {
        Iterator var1 = this.field2529.iterator();
        while (var1.hasNext()) {
            class262 var2 = (class262) var1.next();
            var2.method4235(this);
        }
    }

    @ObfuscatedName("jw.az(I)I")
    public int method4265() {
        return this.field2518;
    }

    @ObfuscatedName("jw.ao(I)Z")
    public boolean method4266() {
        return this.field2528;
    }

    @ObfuscatedName("jw.au(B)Ljava/lang/String;")
    public String method4267() {
        return this.field2521;
    }

    @ObfuscatedName("jw.ak(I)Ljava/lang/String;")
    public String method4268() {
        return this.field2517;
    }

    @ObfuscatedName("jw.ah(I)I")
    public int method4269() {
        return this.field2519;
    }

    @ObfuscatedName("jw.aj(B)I")
    public int method4296() {
        return this.field2520;
    }

    @ObfuscatedName("jw.af(I)I")
    public int method4321() {
        return this.field2522;
    }

    @ObfuscatedName("jw.ax(S)I")
    public int method4288() {
        return this.field2524;
    }

    @ObfuscatedName("jw.an(B)I")
    public int method4280() {
        return this.field2525;
    }

    @ObfuscatedName("jw.ag(I)I")
    public int method4283() {
        return this.field2526;
    }

    @ObfuscatedName("jw.am(B)I")
    public int method4275() {
        return this.field2527;
    }

    @ObfuscatedName("jw.ad(I)I")
    public int method4276() {
        return this.field2523.field3622;
    }

    @ObfuscatedName("jw.at(B)I")
    public int method4277() {
        return this.field2523.field3623;
    }

    @ObfuscatedName("jw.ay(B)I")
    public int method4272() {
        return this.field2523.field3624;
    }

    @ObfuscatedName("jw.ae(B)Lns;")
    public class339 method4279() {
        return new class339(this.field2523);
    }
}
