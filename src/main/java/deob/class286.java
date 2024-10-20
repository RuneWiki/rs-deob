package deob;

import java.util.Iterator;
import java.util.LinkedList;

@ObfuscatedName("ky")
public class class286 {

    @ObfuscatedName("ky.ac")
    public int field3109 = -1;

    @ObfuscatedName("ky.ae")
    public String field3100;

    @ObfuscatedName("ky.ag")
    public String field3101;

    @ObfuscatedName("ky.am")
    public int field3111 = -1;

    @ObfuscatedName("ky.ax")
    public int field3107 = -16777216;

    @ObfuscatedName("ky.aq")
    public int field3104 = -1;

    @ObfuscatedName("ky.af")
    public class352 field3105 = null;

    @ObfuscatedName("ky.at")
    public int field3106 = Integer.MAX_VALUE;

    @ObfuscatedName("ky.au")
    public int field3102 = 0;

    @ObfuscatedName("ky.ar")
    public int field3108 = Integer.MAX_VALUE;

    @ObfuscatedName("ky.al")
    public int field3112 = 0;

    @ObfuscatedName("ky.ad")
    public boolean field3110 = false;

    @ObfuscatedName("ky.ah")
    public LinkedList field3099;

    @ObfuscatedName("ky.ac(Lvf;IB)V")
    public void method5291(class551 arg0, int arg1) {
        this.field3109 = arg1;
        this.field3100 = arg0.method9166();
        this.field3101 = arg0.method9166();
        this.field3105 = new class352(arg0.method9110());
        this.field3111 = arg0.method9110();
        this.field3107 = arg0.method9110();
        arg0.method8955();
        this.field3110 = arg0.method8955() == 1;
        this.field3104 = arg0.method8955();
        int var3 = arg0.method8955();
        this.field3099 = new LinkedList();
        for (int var4 = 0; var4 < var3; var4++) {
            this.field3099.add(this.method5292(arg0));
        }
        this.method5297();
    }

    @ObfuscatedName("ky.ae(Lvf;I)Llf;")
    public class306 method5292(class551 arg0) {
        int var2 = arg0.method8955();
        class294 var3 = (class294) class405.method6719(class294.method5564(), var2);
        Object var4 = null;
        Object var5;
        switch(var3.field3187) {
            case 0:
                var5 = new class303();
                break;
            case 1:
                var5 = new class290();
                break;
            case 2:
                var5 = new class293();
                break;
            case 3:
                var5 = new class285();
                break;
            default:
                throw new IllegalStateException("");
        }
        ((class306) var5).method5271(arg0);
        return (class306) var5;
    }

    @ObfuscatedName("ky.ag(IIII)Z")
    public boolean method5293(int arg0, int arg1, int arg2) {
        Iterator var4 = this.field3099.iterator();
        class306 var5;
        do {
            if (!var4.hasNext()) {
                return false;
            }
            var5 = (class306) var4.next();
        } while (!var5.method5267(arg0, arg1, arg2));
        return true;
    }

    @ObfuscatedName("ky.am(IIB)Z")
    public boolean method5294(int arg0, int arg1) {
        int var3 = arg0 / 64;
        int var4 = arg1 / 64;
        if (var3 < this.field3106 || var3 > this.field3102) {
            return false;
        } else if (var4 >= this.field3108 && var4 <= this.field3112) {
            Iterator var5 = this.field3099.iterator();
            class306 var6;
            do {
                if (!var5.hasNext()) {
                    return false;
                }
                var6 = (class306) var5.next();
            } while (!var6.method5268(arg0, arg1));
            return true;
        } else {
            return false;
        }
    }

    @ObfuscatedName("ky.ax(IIIS)[I")
    public int[] method5301(int arg0, int arg1, int arg2) {
        Iterator var4 = this.field3099.iterator();
        class306 var5;
        do {
            if (!var4.hasNext()) {
                return null;
            }
            var5 = (class306) var4.next();
        } while (!var5.method5267(arg0, arg1, arg2));
        return var5.method5273(arg0, arg1, arg2);
    }

    @ObfuscatedName("ky.aq(III)Lnm;")
    public class352 method5296(int arg0, int arg1) {
        Iterator var3 = this.field3099.iterator();
        class306 var4;
        do {
            if (!var3.hasNext()) {
                return null;
            }
            var4 = (class306) var3.next();
        } while (!var4.method5268(arg0, arg1));
        return var4.method5270(arg0, arg1);
    }

    @ObfuscatedName("ky.af(B)V")
    public void method5297() {
        Iterator var1 = this.field3099.iterator();
        while (var1.hasNext()) {
            class306 var2 = (class306) var1.next();
            var2.method5265(this);
        }
    }

    @ObfuscatedName("ky.at(B)I")
    public int method5298() {
        return this.field3109;
    }

    @ObfuscatedName("ky.au(I)Z")
    public boolean method5299() {
        return this.field3110;
    }

    @ObfuscatedName("ky.ar(I)Ljava/lang/String;")
    public String method5304() {
        return this.field3100;
    }

    @ObfuscatedName("ky.al(I)Ljava/lang/String;")
    public String method5335() {
        return this.field3101;
    }

    @ObfuscatedName("ky.ad(I)I")
    public int method5295() {
        return this.field3111;
    }

    @ObfuscatedName("ky.ah(I)I")
    public int method5303() {
        return this.field3107;
    }

    @ObfuscatedName("ky.ap(I)I")
    public int method5348() {
        return this.field3104;
    }

    @ObfuscatedName("ky.ab(I)I")
    public int method5305() {
        return this.field3106;
    }

    @ObfuscatedName("ky.az(B)I")
    public int method5306() {
        return this.field3102;
    }

    @ObfuscatedName("ky.aa(I)I")
    public int method5309() {
        return this.field3108;
    }

    @ObfuscatedName("ky.ai(B)I")
    public int method5308() {
        return this.field3112;
    }

    @ObfuscatedName("ky.ao(I)I")
    public int method5320() {
        return this.field3105.field3754;
    }

    @ObfuscatedName("ky.as(I)I")
    public int method5310() {
        return this.field3105.field3755;
    }

    @ObfuscatedName("ky.ay(I)I")
    public int method5322() {
        return this.field3105.field3756;
    }

    @ObfuscatedName("ky.aj(I)Lnm;")
    public class352 method5312() {
        return new class352(this.field3105);
    }
}
