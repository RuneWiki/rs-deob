package deob;

import java.util.Iterator;
import java.util.LinkedList;

@ObfuscatedName("ku")
public class class284 {

    @ObfuscatedName("ku.ab")
    public int field3057 = -1;

    @ObfuscatedName("ku.ay")
    public String field3058;

    @ObfuscatedName("ku.an")
    public String field3064;

    @ObfuscatedName("ku.au")
    public int field3059 = -1;

    @ObfuscatedName("ku.ax")
    public int field3061 = -16777216;

    @ObfuscatedName("ku.ao")
    public int field3062 = -1;

    @ObfuscatedName("ku.am")
    public class350 field3060 = null;

    @ObfuscatedName("ku.ac")
    public int field3063 = Integer.MAX_VALUE;

    @ObfuscatedName("ku.ae")
    public int field3065 = 0;

    @ObfuscatedName("ku.ad")
    public int field3066 = Integer.MAX_VALUE;

    @ObfuscatedName("ku.aq")
    public int field3067 = 0;

    @ObfuscatedName("ku.al")
    public boolean field3068 = false;

    @ObfuscatedName("ku.aj")
    public LinkedList field3069;

    @ObfuscatedName("ku.ab(Lvg;II)V")
    public void method5172(class549 arg0, int arg1) {
        this.field3057 = arg1;
        this.field3058 = arg0.method8808();
        this.field3064 = arg0.method8808();
        this.field3060 = new class350(arg0.method8803());
        this.field3059 = arg0.method8803();
        this.field3061 = arg0.method8803();
        arg0.method9025();
        this.field3068 = arg0.method9025() == 1;
        this.field3062 = arg0.method9025();
        int var3 = arg0.method9025();
        this.field3069 = new LinkedList();
        for (int var4 = 0; var4 < var3; var4++) {
            this.field3069.add(this.method5152(arg0));
        }
        this.method5142();
    }

    @ObfuscatedName("ku.ay(Lvg;I)Lls;")
    public class304 method5152(class549 arg0) {
        int var2 = arg0.method9025();
        class292 var3 = (class292) class403.method3083(class292.method5425(), var2);
        Object var4 = null;
        Object var5;
        switch(var3.field3145) {
            case 0:
                var5 = new class288();
                break;
            case 1:
                var5 = new class283();
                break;
            case 2:
                var5 = new class301();
                break;
            case 3:
                var5 = new class291();
                break;
            default:
                throw new IllegalStateException("");
        }
        ((class304) var5).method5121(arg0);
        return (class304) var5;
    }

    @ObfuscatedName("ku.an(IIII)Z")
    public boolean method5166(int arg0, int arg1, int arg2) {
        Iterator var4 = this.field3069.iterator();
        class304 var5;
        do {
            if (!var4.hasNext()) {
                return false;
            }
            var5 = (class304) var4.next();
        } while (!var5.method5117(arg0, arg1, arg2));
        return true;
    }

    @ObfuscatedName("ku.au(III)Z")
    public boolean method5138(int arg0, int arg1) {
        int var3 = arg0 / 64;
        int var4 = arg1 / 64;
        if (var3 < this.field3063 || var3 > this.field3065) {
            return false;
        } else if (var4 >= this.field3066 && var4 <= this.field3067) {
            Iterator var5 = this.field3069.iterator();
            class304 var6;
            do {
                if (!var5.hasNext()) {
                    return false;
                }
                var6 = (class304) var5.next();
            } while (!var6.method5133(arg0, arg1));
            return true;
        } else {
            return false;
        }
    }

    @ObfuscatedName("ku.ax(IIIB)[I")
    public int[] method5140(int arg0, int arg1, int arg2) {
        Iterator var4 = this.field3069.iterator();
        class304 var5;
        do {
            if (!var4.hasNext()) {
                return null;
            }
            var5 = (class304) var4.next();
        } while (!var5.method5117(arg0, arg1, arg2));
        return var5.method5120(arg0, arg1, arg2);
    }

    @ObfuscatedName("ku.ao(III)Lnv;")
    public class350 method5141(int arg0, int arg1) {
        Iterator var3 = this.field3069.iterator();
        class304 var4;
        do {
            if (!var3.hasNext()) {
                return null;
            }
            var4 = (class304) var3.next();
        } while (!var4.method5133(arg0, arg1));
        return var4.method5118(arg0, arg1);
    }

    @ObfuscatedName("ku.am(I)V")
    public void method5142() {
        Iterator var1 = this.field3069.iterator();
        while (var1.hasNext()) {
            class304 var2 = (class304) var1.next();
            var2.method5116(this);
        }
    }

    @ObfuscatedName("ku.ac(B)I")
    public int method5143() {
        return this.field3057;
    }

    @ObfuscatedName("ku.ae(I)Z")
    public boolean method5136() {
        return this.field3068;
    }

    @ObfuscatedName("ku.ad(B)Ljava/lang/String;")
    public String method5195() {
        return this.field3058;
    }

    @ObfuscatedName("ku.aq(B)Ljava/lang/String;")
    public String method5146() {
        return this.field3064;
    }

    @ObfuscatedName("ku.al(I)I")
    public int method5187() {
        return this.field3059;
    }

    @ObfuscatedName("ku.aj(I)I")
    public int method5148() {
        return this.field3061;
    }

    @ObfuscatedName("ku.as(B)I")
    public int method5149() {
        return this.field3062;
    }

    @ObfuscatedName("ku.aw(I)I")
    public int method5150() {
        return this.field3063;
    }

    @ObfuscatedName("ku.af(I)I")
    public int method5151() {
        return this.field3065;
    }

    @ObfuscatedName("ku.aa(I)I")
    public int method5184() {
        return this.field3066;
    }

    @ObfuscatedName("ku.ah(I)I")
    public int method5204() {
        return this.field3067;
    }

    @ObfuscatedName("ku.ag(I)I")
    public int method5154() {
        return this.field3060.field3705;
    }

    @ObfuscatedName("ku.av(B)I")
    public int method5178() {
        return this.field3060.field3706;
    }

    @ObfuscatedName("ku.ar(I)I")
    public int method5156() {
        return this.field3060.field3704;
    }

    @ObfuscatedName("ku.ap(I)Lnv;")
    public class350 method5145() {
        return new class350(this.field3060);
    }
}
